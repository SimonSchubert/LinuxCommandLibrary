# TAGLINE

Markdown-based knowledge base and note-taking app

# TLDR

**Launch Obsidian**

```obsidian```

**Open a specific vault** by name

```obsidian "obsidian://open?vault=[vault_name]"```

**Open a specific file** in a vault

```obsidian "obsidian://open?vault=[vault_name]&file=[path/to/note]"```

**Create a new note** in a vault

```obsidian "obsidian://new?vault=[vault_name]&name=[note_name]"```

**Create a new note with content**

```obsidian "obsidian://new?vault=[vault_name]&name=[note_name]&content=[Hello world]"```

**Search within a vault**

```obsidian "obsidian://search?vault=[vault_name]&query=[search_term]"```

# SYNOPSIS

**obsidian** [_options_] [_URI_]

# PARAMETERS

**--version**
> Print version information and exit.

**--help**
> Display help information.

**--disable-gpu**
> Disable GPU hardware acceleration.

**--enable-logging**
> Enable logging to the console.

# URI ACTIONS

**obsidian://open**
> Open a vault or file. Parameters: **vault** (name or ID), **file** (path relative to vault root), **path** (absolute filesystem path).

**obsidian://new**
> Create a new note. Parameters: **vault**, **name** (note name), **content** (note body), **overwrite** (true to overwrite existing), **append** (true to append if exists).

**obsidian://search**
> Open the search pane with a query. Parameters: **vault**, **query** (search string).

**obsidian://hook-get-address**
> Retrieve the current note's name and URI for use with link-based automation tools.

# DESCRIPTION

**Obsidian** is a knowledge management and note-taking application that operates on a local folder of plain Markdown files. It emphasizes linking between notes to build a personal knowledge graph, displayed as an interactive graph view. All data is stored locally in plaintext, making notes future-proof and accessible with any text editor.

The application supports a rich plugin ecosystem, with core plugins for backlinks, tags, templates, daily notes, and canvas boards, as well as a community plugin marketplace. Vaults are the fundamental unit of organization, each corresponding to a directory on the filesystem.

Obsidian uses a URI scheme (**obsidian://**) for inter-application communication and automation, allowing external scripts and tools to open vaults, create notes, and perform searches.

# CAVEATS

Obsidian is **proprietary software** with a free tier for personal use; commercial use requires a paid license. The application is built on Electron, resulting in higher memory usage than native alternatives. Community plugins run with full local filesystem access and should be reviewed before installation. Syncing between devices requires either Obsidian Sync (paid) or third-party solutions like Git or Syncthing.

# HISTORY

Obsidian was created by **Shida Li** and **Erica Xu**, who previously worked on Dynalist (an outliner app). The first public release came in **March 2020**. The application quickly gained a large community due to its local-first approach and extensible plugin system. Obsidian **1.0** was released in **October 2022**, adding significant features including the Canvas view. A mobile version for iOS and Android was released in **July 2021**.

# SEE ALSO

[vim](/man/vim)(1), [logseq](/man/logseq)(1), [zettlr](/man/zettlr)(1), [joplin](/man/joplin)(1)
