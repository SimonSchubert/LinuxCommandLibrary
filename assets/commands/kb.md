# TAGLINE

Minimalist command line knowledge base manager

# TLDR

**Add a new note** to the knowledge base

```kb add "[title]" -c "[category]"```

**List all notes**

```kb list```

**List notes filtered by category**

```kb list -c "[category]"```

**Search notes** by title or content

```kb grep "[pattern]"```

**View a specific note**

```kb view "[title]"```

**Edit a note**

```kb edit "[title]"```

**Delete a note**

```kb delete "[title]"```

**Export the knowledge base**

```kb export```

# SYNOPSIS

**kb** _command_ [_options_] [_arguments_]

# SUBCOMMANDS

**add**
> Add a new note (from a file with `-t`, or open `$EDITOR`).

**list**
> List notes; filter with `-c` (category), `-t` (tags), or `-v` (verbose).

**view**
> Show a note's contents.

**edit**
> Open a note in `$EDITOR`.

**grep**
> Full-text search across notes.

**delete**
> Remove a note (use `--id` to target by numeric ID).

**update**
> Modify metadata (title, category, tags) of an existing note.

**import** / **export**
> Move notes in or out of the knowledge base as a `.kb.tar.gz` archive.

**erase**
> Wipe the entire knowledge base after confirmation.

# COMMON OPTIONS

**-c** _CATEGORY_
> Category for the note.

**-t** _TAGS_
> Semicolon-separated tag list (e.g., `linux;networking`).

**-g** _PATTERN_
> Glob pattern (used with list).

**--no-color**
> Disable ANSI colors in output.

# DESCRIPTION

**kb** is a text-oriented minimalist command-line knowledge base manager designed for software developers, penetration testers, students, and anyone who needs to collect and organize notes efficiently. It supports categorization, tagging, and full-text search of notes.

Although primarily targeted at text-based note collection, kb also supports non-text files such as images, PDFs, and videos. Notes can be filtered by title, category, tags, and other metadata.

# CAVEATS

Requires Python 3.6 or above. Knowledge base data is stored locally. No built-in sync across devices.

# HISTORY

**kb** was created by **gnebbia** and is written in **Python**. It was designed as a quick note collection and access tool with a focus on simplicity and efficiency.

# INSTALL

```nix: nix profile install nixpkgs#kb```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [nb](/man/nb)(1)
