# TAGLINE

Command-line note-taking, bookmarking, and knowledge base

# TLDR

**Create a note** in the editor

```nb add```

**Create a note** with content

```nb add "[Note content here]"```

**List notes** in the current notebook

```nb ls```

**Search notes** by query

```nb search "[query]"```

**Edit a note** by ID

```nb edit [1]```

**Delete a note** by ID

```nb delete [1]```

**Save a bookmark** with auto-fetched title

```nb bookmark "[https://example.com]"```

**Show a note**

```nb show [1]```

**Sync notes** with a remote git repo

```nb sync```

**Switch notebooks**

```nb use [notebook_name]```

# SYNOPSIS

**nb** [_subcommand_] [_options_] [_arguments_]

# PARAMETERS

**add** [_text_]
> Create a new note. Without arguments opens the configured editor.

**ls**
> List notes, optionally filtered by query.

**search** _query_
> Full-text search across notes.

**edit** _id_
> Open an existing note in the editor.

**delete** _id_
> Remove a note. **--force** skips the confirmation.

**show** _id_
> Print the contents of a note.

**bookmark** _url_
> Save a bookmark, fetching title and content automatically.

**todo** _action_
> Manage to-do items.

**notebooks**
> Manage notebooks (groups of notes backed by separate git repositories).

**sync**
> Pull and push changes to the configured remote git repository.

**use** _notebook_
> Switch the active notebook.

**--help**
> Display help for nb or a subcommand.

# DESCRIPTION

**nb** is a command-line note-taking, bookmarking, archiving, and knowledge-base application. Notes are stored as plain Markdown (or any text format) on the local filesystem, and each notebook is a git repository, providing version history, conflict resolution, and remote sync.

Beyond plain notes, **nb** supports tagged to-do lists, encrypted notes (via OpenSSL or GPG), bookmarks (with cached page snapshots), pinned notes, search with **rg**/**ag**/**grep**, and import/export to multiple formats. It runs as a single Bash script with optional plugins.

# CONFIGURATION

**~/.nb/**
> Default directory containing notebooks (each a git repo) and configuration.

**~/.nbrc**
> User configuration file: editor, default notebook, color theme, sync remotes, etc.

# CAVEATS

Implemented as a Bash script — works on macOS and Linux but Windows requires WSL or Git Bash. Sync depends on a configured git remote per notebook. Encrypted notes require OpenSSL or GPG to be installed.

# HISTORY

**nb** was created by **xwmx** as a single-file Bash CLI for note-taking with a strong emphasis on plain text and git-backed sync.

# INSTALL

```brew: brew install nb```

```nix: nix profile install nixpkgs#nb```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jrnl](/man/jrnl)(1), [notes](/man/notes)(1), [taskwarrior](/man/taskwarrior)(1), [git](/man/git)(1)
