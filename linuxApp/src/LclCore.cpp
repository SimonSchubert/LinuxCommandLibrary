#include "LclCore.h"

#include <algorithm>
#include <fstream>
#include <iterator>
#include <string_view>

namespace lcl {

namespace {

using std::string_view;
constexpr auto npos = string_view::npos;

bool isSpace(char c)
{
    return c == ' ' || (c >= '\t' && c <= '\r') || (c >= 0x1C && c <= 0x1F);
}

string_view trim(string_view s)
{
    while (!s.empty() && isSpace(s.front()))
        s.remove_prefix(1);
    while (!s.empty() && isSpace(s.back()))
        s.remove_suffix(1);
    return s;
}

bool startsWith(string_view s, string_view prefix)
{
    return s.substr(0, prefix.size()) == prefix;
}

bool endsWith(string_view s, string_view suffix)
{
    return s.size() >= suffix.size() && s.substr(s.size() - suffix.size()) == suffix;
}

/** Splits on \n, \r\n and \r. Always returns at least one line. */
std::vector<string_view> lines(string_view s)
{
    std::vector<string_view> out;
    size_t start = 0;
    for (size_t i = 0; i < s.size(); ++i) {
        if (s[i] != '\n' && s[i] != '\r')
            continue;
        out.push_back(s.substr(start, i - start));
        if (s[i] == '\r' && i + 1 < s.size() && s[i + 1] == '\n')
            ++i;
        start = i + 1;
    }
    out.push_back(s.substr(start));
    return out;
}

/** Length in UTF-16 units, which is what the UI's own string lengths are measured in. */
int utf16Length(string_view s)
{
    int n = 0;
    for (unsigned char c : s) {
        if ((c & 0xC0) != 0x80)
            ++n;
        if (c >= 0xF0)
            ++n;
    }
    return n;
}

std::string asciiCase(string_view s, bool upper)
{
    std::string out(s);
    for (char& c : out) {
        if (upper && c >= 'a' && c <= 'z')
            c -= 32;
        else if (!upper && c >= 'A' && c <= 'Z')
            c += 32;
    }
    return out;
}

void replaceAll(std::string& s, string_view from, string_view to)
{
    for (size_t at = s.find(from); at != std::string::npos; at = s.find(from, at + to.size()))
        s.replace(at, from.size(), to);
}

/**
 * Matches `delim`, one or more characters other than `stop`, then `delim` again,
 * starting exactly at `at`. Returns the index past the match, or npos.
 */
size_t matchDelimited(string_view s, size_t at, string_view delim, char stop, string_view& content)
{
    if (s.substr(at, delim.size()) != delim)
        return npos;
    const size_t from = at + delim.size();
    size_t to = from;
    while (to < s.size() && s[to] != stop)
        ++to;
    if (to == from || s.substr(to, delim.size()) != delim)
        return npos;
    content = s.substr(from, to - from);
    return to + delim.size();
}

/** Matches `[label](target)` starting exactly at `at`. Returns the index past it, or npos. */
size_t matchLink(string_view s, size_t at, string_view& label, string_view& target)
{
    if (at >= s.size() || s[at] != '[')
        return npos;
    const size_t close = s.find(']', at + 1);
    if (close == npos || close == at + 1 || close + 1 >= s.size() || s[close + 1] != '(')
        return npos;
    const size_t end = s.find(')', close + 2);
    if (end == npos || end == close + 2)
        return npos;
    label = s.substr(at + 1, close - at - 1);
    target = s.substr(close + 2, end - close - 2);
    return end + 1;
}

struct Inline {
    std::string text;
    int weight = 0;

    void plain(string_view piece)
    {
        text += piece;
        weight += utf16Length(piece);
    }

    void man(string_view name)
    {
        text.append("[").append(name).append("](man:").append(name).append(")");
        weight += utf16Length(name);
    }
};

/** Inline code inside a table cell: shown as plain text, except for man page links. */
void appendInlineCode(string_view code, Inline& out)
{
    size_t plainFrom = 0;
    for (size_t i = 0; i < code.size();) {
        string_view label, target;
        const size_t end = matchLink(code, i, label, target);
        if (end == npos || !startsWith(target, "/man/") || target.size() == 5) {
            ++i;
            continue;
        }
        out.plain(code.substr(plainFrom, i - plainFrom));
        out.man(target.substr(5));
        i = plainFrom = end;
    }
    out.plain(code.substr(plainFrom));
}

/** **bold**, _italic_ and, in table cells, `code`. Whichever starts first wins. */
Inline parseInline(string_view text, bool withCode)
{
    Inline out;
    size_t plainFrom = 0;
    for (size_t i = 0; i < text.size();) {
        const char c = text[i];
        string_view content;
        size_t end = npos;
        if (c == '*')
            end = matchDelimited(text, i, "**", '*', content);
        else if (c == '_')
            end = matchDelimited(text, i, "_", '_', content);
        else if (c == '`' && withCode)
            end = matchDelimited(text, i, "`", '`', content);
        if (end == npos) {
            ++i;
            continue;
        }
        out.plain(text.substr(plainFrom, i - plainFrom));
        if (c == '`') {
            appendInlineCode(content, out);
        } else {
            const string_view mark = c == '*' ? "**" : "_";
            out.text.append(mark).append(content).append(mark);
            out.weight += utf16Length(content);
        }
        i = plainFrom = end;
    }
    out.plain(text.substr(plainFrom));
    return out;
}

/**
 * A code line. Links inside it are the only Markdown: man page cross references become
 * `man:` links, http(s) targets stay links, anything else falls back to its label.
 */
Block codeBlock(string_view code)
{
    std::string command;
    std::string text;
    size_t plainFrom = 0;
    for (size_t i = 0; i < code.size();) {
        string_view label, target;
        const size_t end = matchLink(code, i, label, target);
        if (end == npos) {
            ++i;
            continue;
        }
        const string_view before = code.substr(plainFrom, i - plainFrom);
        command.append(before).append(label);
        text += before;
        if (startsWith(target, "/man/")) {
            const string_view name = target.substr(5);
            text.append("[").append(name).append("](man:").append(name).append(")");
        } else if (startsWith(target, "http://") || startsWith(target, "https://")) {
            text.append("[").append(label).append("](").append(target).append(")");
        } else {
            text += label;
        }
        i = plainFrom = end;
    }
    command += code.substr(plainFrom);
    text += code.substr(plainFrom);

    text = std::string(trim(text));
    if (text.empty())
        text = "`" + command + "`";
    return { "code", std::move(text), utf16Length(command) };
}

std::vector<std::string> splitTableRow(string_view line)
{
    // A placeholder keeps escaped pipes (\|) out of the way of the split.
    static const std::string placeholder("\0PIPE\0", 6);
    std::string row(trim(line));
    replaceAll(row, "\\|", placeholder);
    string_view rest = row;
    if (rest.size() >= 2 && rest.front() == '|' && rest.back() == '|')
        rest = rest.substr(1, rest.size() - 2);

    std::vector<std::string> cells;
    for (;;) {
        const size_t bar = rest.find('|');
        std::string cell(rest.substr(0, bar));
        replaceAll(cell, placeholder, "|");
        cells.emplace_back(trim(cell));
        if (bar == npos)
            return cells;
        rest.remove_prefix(bar + 1);
    }
}

bool isTableLine(string_view trimmed)
{
    return startsWith(trimmed, "|") && endsWith(trimmed, "|");
}

void appendTableRow(string_view line, Block& table)
{
    if (!table.text.empty())
        table.text += '\n';
    table.text += '|';
    for (const std::string& cell : splitTableRow(line)) {
        const Inline parsed = parseInline(cell, true);
        table.text.append(" ").append(parsed.text).append(" |");
        table.weight += parsed.weight;
    }
}

/** `rows` is the header row, the divider, then the body. Fewer than two is not a table. */
bool tableBlock(const std::vector<string_view>& rows, Block& table)
{
    if (rows.size() < 2)
        return false;
    table = { "table", {}, 0 };
    appendTableRow(rows[0], table);
    table.text += "\n|";
    for (size_t i = splitTableRow(rows[0]).size(); i > 0; --i)
        table.text += " --- |";
    for (size_t i = 2; i < rows.size(); ++i) {
        // Stray divider rows: nothing but pipes, dashes and spaces.
        const string_view row = trim(rows[i]);
        const bool divider = std::all_of(row.begin(), row.end(), [](char c) { return c == '|' || c == '-' || isSpace(c); });
        if (!divider)
            appendTableRow(rows[i], table);
    }
    return true;
}

} // namespace

std::vector<std::pair<std::string, std::string>> splitByHeaders(const std::string& content, const std::string& prefix)
{
    std::vector<std::pair<std::string, std::string>> sections;
    bool insideCode = false;
    bool open = false;
    std::string title;
    std::string body;
    const auto flush = [&] {
        if (open)
            sections.emplace_back(title, std::string(trim(body)));
    };

    for (const string_view line : lines(content)) {
        const string_view trimmed = trim(line);
        // Only a fence on its own toggles a block: ```code``` opens and closes on one line.
        if (startsWith(trimmed, "```") && trimmed.find("```", 3) == npos)
            insideCode = !insideCode;

        if (!insideCode && startsWith(line, prefix)) {
            flush();
            open = true;
            title = std::string(trim(line.substr(prefix.size())));
            body.clear();
        } else if (open) {
            body.append(line).append("\n");
        }
    }
    flush();
    return sections;
}

std::vector<Block> parseContent(const std::string& content)
{
    std::vector<Block> blocks;
    const std::vector<string_view> all = lines(content);
    size_t i = 0;
    while (i < all.size()) {
        const string_view line = trim(all[i]);

        if (startsWith(line, "<!--")) {
            // Hidden metadata such as <!-- verified: 2026-06-09 -->, possibly multi-line.
            if (!endsWith(line, "-->")) {
                ++i;
                while (i < all.size() && !endsWith(trim(all[i]), "-->"))
                    ++i;
            }
            ++i;
        } else if (startsWith(line, "```") && endsWith(line, "```") && line.size() > 6) {
            blocks.push_back(codeBlock(line.substr(3, line.size() - 6)));
            ++i;
        } else if (startsWith(line, "```")) {
            std::string code;
            bool first = true;
            for (++i; i < all.size() && !startsWith(trim(all[i]), "```"); ++i) {
                if (!first)
                    code += '\n';
                code += all[i];
                first = false;
            }
            if (i < all.size())
                ++i;
            blocks.push_back(codeBlock(code));
        } else if (startsWith(line, ">")) {
            const string_view quote = trim(line.substr(1));
            if (!quote.empty()) {
                Inline parsed = parseInline(quote, false);
                blocks.push_back({ "quote", "> " + parsed.text, parsed.weight });
            }
            ++i;
        } else if (isTableLine(line)) {
            std::vector<string_view> rows;
            for (; i < all.size() && isTableLine(trim(all[i])); ++i)
                rows.push_back(all[i]);
            Block table;
            if (tableBlock(rows, table))
                blocks.push_back(std::move(table));
        } else if (!line.empty()) {
            Inline parsed = parseInline(line, false);
            blocks.push_back({ "text", std::move(parsed.text), parsed.weight });
            ++i;
        } else {
            ++i;
        }
    }
    return blocks;
}

int sectionSortPriority(const std::string& title)
{
    static const std::pair<const char*, int> priorities[] = {
        { "TLDR", 0 }, { "NAME", 1 }, { "SYNOPSIS", 2 }, { "DESCRIPTION", 3 },
        { "PARAMETERS", 4 }, { "OPTIONS", 5 }, { "EXAMPLES", 6 }, { "CONFIGURATION", 7 },
        { "INSTALL", 89 }, { "CAVEATS", 90 }, { "HISTORY", 91 }, { "AUTHOR", 92 },
        { "SEE ALSO", 93 }, { "RESOURCES", 94 },
    };
    const std::string upper = asciiCase(title, true);
    for (const auto& [name, priority] : priorities) {
        if (upper == name)
            return priority;
    }
    return 50;
}

int weight(const Titled& item)
{
    int total = utf16Length(item.title);
    for (const Block& block : item.blocks)
        total += block.weight;
    return total;
}

namespace {

std::vector<Titled> parseTitled(const std::string& content, const std::string& prefix)
{
    std::vector<Titled> items;
    for (auto& [title, body] : splitByHeaders(content, prefix))
        items.push_back({ std::move(title), parseContent(body) });
    return items;
}

// Display order of the basics categories, by title. Unknown titles sort first.
const char* const basicsOrder[] = {
    "One-liners", "AI tools", "System information", "System control", "System Recovery",
    "Users & Groups", "Files & Folders", "Input", "Printing", "JSON", "Network",
    "Search & Find", "Git", "SSH", "Video & Audio", "Package manager", "Text Processing",
    "Compression & Archiving", "Backup & Imaging", "Hacking tools", "Terminal games",
    "Cryptocurrencies", "Shell Scripting", "Tmux", "Regular Expressions", "VIM Text Editor",
    "Emacs Text Editor", "Nano Text Editor", "Pico Text Editor", "Micro Text Editor",
};

int basicsRank(const std::string& title)
{
    const auto found = std::find(std::begin(basicsOrder), std::end(basicsOrder), title);
    return found == std::end(basicsOrder) ? -1 : int(found - std::begin(basicsOrder));
}

} // namespace

Library::Library(std::string assetsDir)
    : m_dir(std::move(assetsDir))
{
}

bool Library::read(const std::string& path, std::string& out) const
{
    std::ifstream file(m_dir + "/" + path, std::ios::binary);
    if (!file)
        return false;
    out.assign(std::istreambuf_iterator<char>(file), std::istreambuf_iterator<char>());
    return true;
}

/** Names of the .md files in `dir`, without the extension, from its index.txt. */
std::vector<std::string> Library::list(const std::string& dir) const
{
    std::vector<std::string> names;
    std::string index;
    if (!read(dir + "/index.txt", index))
        return names;
    for (const string_view line : lines(index)) {
        const string_view name = trim(line);
        if (endsWith(name, ".md"))
            names.emplace_back(name.substr(0, name.size() - 3));
    }
    return names;
}

const std::vector<std::string>& Library::commands()
{
    if (!m_commandsLoaded) {
        m_commandsLoaded = true;
        m_commands = list("commands");
        std::sort(m_commands.begin(), m_commands.end());
        for (const std::string& name : m_commands)
            m_lowerCommands.push_back(asciiCase(name, false));
    }
    return m_commands;
}

std::vector<std::string> Library::search(const std::string& query)
{
    const std::vector<std::string>& all = commands();
    if (trim(query).empty())
        return all;

    // Buckets rather than a sort: the names are already alphabetical, so each bucket
    // stays that way.
    const std::string lower = asciiCase(query, false);
    std::vector<std::string> exact, prefixed, contained;
    for (size_t i = 0; i < all.size(); ++i) {
        const std::string& name = m_lowerCommands[i];
        if (name.find(lower) == std::string::npos)
            continue;
        if (name == lower)
            exact.push_back(all[i]);
        else if (startsWith(name, lower))
            prefixed.push_back(all[i]);
        else
            contained.push_back(all[i]);
    }
    exact.insert(exact.end(), prefixed.begin(), prefixed.end());
    exact.insert(exact.end(), contained.begin(), contained.end());
    return exact;
}

std::vector<Titled> Library::sections(const std::string& command) const
{
    std::string content;
    if (command.empty() || !read("commands/" + command + ".md", content))
        return {};
    std::vector<Titled> sections = parseTitled(content, "# ");
    // The tagline is the list subtitle on other platforms, not a section of the page.
    sections.erase(std::remove_if(sections.begin(), sections.end(),
                                  [](const Titled& s) { return asciiCase(s.title, true) == "TAGLINE"; }),
                   sections.end());
    std::stable_sort(sections.begin(), sections.end(), [](const Titled& a, const Titled& b) {
        return sectionSortPriority(a.title) < sectionSortPriority(b.title);
    });
    return sections;
}

const std::vector<Category>& Library::categories()
{
    if (!m_categoriesLoaded) {
        m_categoriesLoaded = true;
        for (const std::string& id : list("basics")) {
            // The title is the file's first "# " line; a file without one is not a category.
            std::string content;
            if (!read("basics/" + id + ".md", content))
                continue;
            for (const string_view line : lines(content)) {
                if (startsWith(line, "# ")) {
                    m_categories.push_back({ id, std::string(trim(line.substr(2))) });
                    break;
                }
            }
        }
        std::stable_sort(m_categories.begin(), m_categories.end(), [](const Category& a, const Category& b) {
            return basicsRank(a.title) < basicsRank(b.title);
        });
    }
    return m_categories;
}

std::vector<Titled> Library::groups(const std::string& categoryId) const
{
    std::string content;
    if (categoryId.empty() || !read("basics/" + categoryId + ".md", content))
        return {};
    return parseTitled(content, "## ");
}

const std::vector<Titled>& Library::tips()
{
    if (!m_tipsLoaded) {
        m_tipsLoaded = true;
        std::string content;
        if (read("tips.md", content))
            m_tips = parseTitled(content, "## ");
    }
    return m_tips;
}

} // namespace lcl
