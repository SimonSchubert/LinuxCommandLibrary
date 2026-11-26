#pragma once

#include <string>
#include <utility>
#include <vector>

/*
 * The content layer of the Qt app: reads the Markdown assets and turns them into the
 * rows the UI shows. Plain standard C++ with UTF-8 strings and no Qt, so it builds and
 * tests on its own.
 *
 * This is a port of the Kotlin MarkdownParser and repositories in :common and
 * :viewmodels, which the mobile and desktop apps still use. The two must agree on what
 * a page parses to, so a change to the Markdown dialect has to land in both.
 */
namespace lcl {

/** One rendered block of a section, group or tip. */
struct Block {
    /** "text", "quote", "code" or "table", so the UI can style them differently. */
    const char* kind;
    /** Markdown for Qt's Text.MarkdownText. Man pages are linked as `man:<name>`. */
    std::string text;
    /** Visible characters (UTF-16 units), for sizing without rendering. */
    int weight;
};

/** A command section, a basics group or a tip: a title over a list of blocks. */
struct Titled {
    std::string title;
    std::vector<Block> blocks;
};

struct Category {
    std::string id;
    std::string title;
};

/** Splits on lines starting with `prefix` ("# " or "## "), ignoring fenced code. */
std::vector<std::pair<std::string, std::string>> splitByHeaders(const std::string& content, const std::string& prefix);

/** Parses the body under a header into blocks. */
std::vector<Block> parseContent(const std::string& content);

/** Where a command section sorts: TLDR first, SEE ALSO and RESOURCES last. */
int sectionSortPriority(const std::string& title);

/** Visible size of a tip card: its title plus all of its blocks. */
int weight(const Titled& item);

class Library {
public:
    /** `assetsDir` holds commands/, basics/ and tips.md. */
    explicit Library(std::string assetsDir);

    /** Every command name, sorted. */
    const std::vector<std::string>& commands();
    /** Names containing `query`: exact match first, then prefix matches, then the rest. */
    std::vector<std::string> search(const std::string& query);
    std::vector<Titled> sections(const std::string& command) const;

    /** Basics categories in display order. */
    const std::vector<Category>& categories();
    std::vector<Titled> groups(const std::string& categoryId) const;

    const std::vector<Titled>& tips();

private:
    bool read(const std::string& path, std::string& out) const;
    std::vector<std::string> list(const std::string& dir) const;

    std::string m_dir;
    std::vector<std::string> m_commands;
    std::vector<std::string> m_lowerCommands;
    std::vector<Category> m_categories;
    std::vector<Titled> m_tips;
    bool m_commandsLoaded = false;
    bool m_categoriesLoaded = false;
    bool m_tipsLoaded = false;
};

} // namespace lcl
