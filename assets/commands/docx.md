# TAGLINE

Read, edit, and comment on .docx files from the command line with full format fidelity

# TLDR

**Read a document** as Markdown with structural locators

```docx read document.docx```

**Create a new document** from Markdown

```docx create report.docx --from content.md --title "Q3 Report"```

**Replace text** while preserving formatting and tabs

```docx replace invoice.docx "Amount Due" "$1,250.00"```

**Find text and add a comment** at the match

```docx comments add contract.docx --at "$(docx find contract.docx 'liability' | head -1)" --text "Review this clause with legal."```

**Turn on tracked changes** and make a redlined edit

```docx track-changes contract.docx on
docx replace contract.docx "reasonable efforts" "best efforts" --track```

**Render pages visually** for layout verification

```docx render proposal.docx --out pages/```

**Install standalone** (verified binary)

```curl -fsSL https://raw.githubusercontent.com/kklimuk/docx-cli/main/install.sh | sh```

# SYNOPSIS

**docx** _<command>_ [options]

# DESCRIPTION

**docx** is a command-line tool for AI agents and humans to read, edit, comment on, and review Microsoft Word (.docx) documents without losing formatting or breaking files that Word can open.

It works by mutating the underlying OOXML directly instead of round-tripping through lossy models or re-serializing the document. Agents receive a stable locator system (e.g. `p3:5-20`, `t1:r0c2:p0`) plus an annotated Markdown view, allowing precise, safe edits.

Key capabilities include:

- Read as Markdown or lossless JSON AST
- Create, insert, edit, delete, replace content
- Add and manage comments, footnotes, endnotes, headers/footers, images, hyperlinks, tables
- Full tracked-changes (redline) support with accept/reject
- Style management and page geometry
- Visual page rendering via Word or LibreOffice

The tool is designed so that `docx <command> --help` is always authoritative. It ships with an optional Agent Skill for Claude Code, Codex, and similar harnesses.

# LOCATORS

Locators address paragraphs (`pN`), tables (`tN`), sections (`sN`), cell paragraphs, character spans (`pN:S-E`), and entity IDs (`cN` for comments, `imgN`, etc.). Use `docx info locators` for the full grammar.

# COMMON COMMANDS

**create** FILE [--from PATH.md | --text "..."] [--title T] [--author A]

> Create a new .docx. `--from` accepts the same Markdown dialect used by insert/edit.

**read** FILE [--from LOC] [--to LOC] [--ast] [--comments] [--accepted|--current|--baseline]

> Render body as Markdown (with locator annotations) or JSON AST. Supports tracked-change views.

**edit** / **insert** / **delete** / **replace** FILE ...

> Mutate content at locators or via batch JSONL. Replace keeps existing run formatting.

**find** FILE QUERY [--regex] [--all]

> Return locators for text or formatting matches (for feeding to --at).

**track-changes** on|off|list|accept|reject FILE

> Control and review revisions.

**comments** / **images** / **tables** / **styles** / **sections** ...

> Manage the corresponding document parts.

**render** FILE [--out DIR]

> Produce page images for visual verification of layout.

**wc** / **outline** / **info**

> Word counts, heading trees, and reference material (schema, locators).

# CAVEATS

There is no undo inside the CLI — use git or copies. Edits that would corrupt the file (e.g. deleting a referenced relationship) are refused. Rendering requires Microsoft Word (macOS/Windows) or LibreOffice. Batch operations address the document snapshot at read time.

The Markdown dialect preserves most formatting but literal text channels (`--text-file`) exist for content that GFM would alter.

# SEE ALSO

[pandoc](/man/pandoc)(1), [libreoffice](/man/libreoffice)(1)

# RESOURCES

```[Source code](https://github.com/kklimuk/docx-cli)```

```[Homepage](https://kklimuk.github.io/docx-cli/)```

```[Documentation](https://kklimuk.github.io/docx-cli/)```

<!-- verified: 2026-07-11 -->
