// Checks LclCore against the behaviour of the Kotlin MarkdownParser it was ported from.
// The parser cases mirror common/src/commonTest/kotlin/CommonTests.kt.
// Usage: lcl-core-test <assets dir>

#include "LclCore.h"

#include <algorithm>
#include <cstdio>
#include <string>

using namespace lcl;

namespace {

int failures = 0;

void check(bool ok, const char* expression, int line)
{
    if (ok)
        return;
    ++failures;
    fprintf(stderr, "line %d: %s\n", line, expression);
}

#define CHECK(expression) check((expression), #expression, __LINE__)

/** "kind:text" of every block, joined with " / ", so a case reads as one comparison. */
std::string parsed(const std::string& content)
{
    std::string out;
    for (const Block& block : parseContent(content)) {
        if (!out.empty())
            out += " / ";
        out.append(block.kind).append(":").append(block.text);
    }
    return out;
}

void parserCases()
{
    // Links in code lines: external URLs stay links, man pages become man: links,
    // anything else falls back to its label.
    CHECK(parsed("```Source [github.com/x/y](https://github.com/x/y)```") == "code:Source [github.com/x/y](https://github.com/x/y)");
    CHECK(parsed("```see [tar](/man/tar)```") == "code:see [tar](man:tar)");
    CHECK(parsed("```[label](other)```") == "code:label");
    CHECK(parseContent("```see [tar](/man/tar)```")[0].weight == 7);

    // Hidden metadata comments never render.
    CHECK(parsed("```[Homepage](https://example.org)```\n<!-- verified: 2026-06-09 -->") == "code:[Homepage](https://example.org)");
    CHECK(parsed("a\n<!-- one\ntwo -->\nb") == "text:a / text:b");

    // Fenced blocks keep their line breaks; an unclosed fence runs to the end.
    CHECK(parsed("```\nls -l\n  cd /\n```\nafter") == "code:ls -l\n  cd / / text:after");
    CHECK(parsed("```\nls") == "code:ls");

    CHECK(parsed("> **Note** this") == "quote:> **Note** this");
    CHECK(parsed(">") == "");

    // Bold and italic markers are not counted as visible characters.
    CHECK(parseContent("**ab** _c_ d")[0].weight == 6);
    CHECK(parseContent("\xC3\xA4\xF0\x9F\x98\x80")[0].weight == 3);

    // Tables: inline code loses its backticks, escaped pipes stay in the cell, stray
    // divider rows are dropped.
    CHECK(parsed("| A | B |\n|---|---|\n| `x [ls](/man/ls)` | a \\| b |\n| --- | --- |\n| **c** | d |")
          == "table:| A | B |\n| --- | --- |\n| x [ls](man:ls) | a | b |\n| **c** | d |");
    CHECK(parsed("| lonely |") == "");
}

void headerCases()
{
    const auto sections = splitByHeaders("intro\n# ONE\nbody\n```\n# not a header\n```\n# TWO\n```# inline```\n", "# ");
    CHECK(sections.size() == 2);
    CHECK(sections[0].first == "ONE");
    CHECK(sections[0].second == "body\n```\n# not a header\n```");
    CHECK(sections[1].second == "```# inline```");

    CHECK(sectionSortPriority("tldr") == 0);
    CHECK(sectionSortPriority("INSTALL") < sectionSortPriority("SEE ALSO"));
    CHECK(sectionSortPriority("INSTALL") < sectionSortPriority("RESOURCES"));
    CHECK(sectionSortPriority("INSTALL") < sectionSortPriority("HISTORY"));
    CHECK(sectionSortPriority("ANYTHING ELSE") == 50);
}

void assetCases(const std::string& assetsDir)
{
    Library library(assetsDir);

    const auto& commands = library.commands();
    CHECK(commands.size() > 1000);
    CHECK(std::is_sorted(commands.begin(), commands.end()));

    // Exact match first, then prefix matches, then the rest. Case does not matter.
    const auto results = library.search("TAR");
    CHECK(results.size() > 2);
    CHECK(results[0] == "tar");
    CHECK(results[1].rfind("tar", 0) == 0);
    CHECK(results.back().rfind("tar", 0) != 0);
    CHECK(library.search("  ").size() == commands.size());
    CHECK(library.search("no-such-command-xyz").empty());

    const auto sections = library.sections("tar");
    CHECK(!sections.empty());
    CHECK(sections.front().title == "TLDR");
    CHECK(std::none_of(sections.begin(), sections.end(), [](const Titled& s) { return s.title == "TAGLINE"; }));
    CHECK(library.sections("no-such-command-xyz").empty());

    const auto& categories = library.categories();
    CHECK(categories.size() > 10);
    CHECK(categories.front().title == "One-liners");
    for (const Category& category : categories)
        CHECK(!library.groups(category.id).empty());

    const auto& tips = library.tips();
    CHECK(!tips.empty());
    CHECK(weight(tips.front()) > 0);
}

} // namespace

int main(int argc, char* argv[])
{
    if (argc != 2) {
        fprintf(stderr, "usage: %s <assets dir>\n", argv[0]);
        return 2;
    }
    parserCases();
    headerCases();
    assetCases(argv[1]);
    if (failures == 0)
        puts("ok");
    return failures == 0 ? 0 : 1;
}
