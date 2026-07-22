# TAGLINE

multi-device CLI notebook for commands, snippets, and notes

# TLDR

**Add** a note to a book (opens the configured editor)

```dnote add [book_name]```

Add a note with **inline content**

```dnote add [book_name] -c "[note content]"```

**List** all books, or notes in a book

```dnote view
dnote view [book_name]```

**Search** notes with full-text search

```dnote find "[keywords]"```

**Edit** a note by ID

```dnote edit [note_id]```

**Remove** a note or an entire book

```dnote remove [note_id|book_name]```

**Sync** notes with a Dnote server

```dnote sync```

# SYNOPSIS

**dnote** _command_ [_options_] [_args_]

# PARAMETERS

**add** _book_ [**-c** _content_]
> Add a note to _book_ (aliases: **a**, **n**, **new**). Opens the editor if content is omitted; accepts stdin.

**view** [_book_ [_index_]]
> List books, notes in a book, or a specific note (alias: **v**)

**edit** _note-id_|_book_
> Edit a note or rename a book (alias: **e**). **--book** moves a note; **--name** renames a book

**remove** _note-id_|_book_
> Delete a note or book (aliases: **rm**, **d**, **delete**). **-y** skips confirmation

**find** _keywords_
> Full-text search; **-b** _book_ limits scope (alias: **f**)

**sync**
> Synchronize with a configured Dnote server (**--full** for a full sync)

**login** / **logout**
> Authenticate with or leave a Dnote server

**--dbPath** _path_
> Use a custom SQLite database path instead of the default under XDG data

# DESCRIPTION

**dnote** is a command-line notebook for capturing short notes, commands, and snippets organized into **books**. Notes are stored locally in SQLite and can optionally sync to a self-hosted or hosted Dnote server for multi-device access.

Content can be entered via the system editor, **-c**, or stdin (handy for piping command output into a book). Search is full-text across notes. The default database path is typically under **~/.local/share/dnote/** on Linux.

# CONFIGURATION

Editor and API endpoint settings live in the Dnote config used by the CLI. Override the database location with **--dbPath**. Use **dnote login** with **--apiEndpoint** to target a self-hosted server before **dnote sync**.

# SEE ALSO

[nb](/man/nb)(1), [zk](/man/zk)(1)

# RESOURCES

```[Homepage](https://www.getdnote.com)```

```[Documentation](https://www.getdnote.com/docs/cli/commands/)```

```[Source code](https://github.com/dnote/dnote)```

<!-- verified: 2026-07-14 -->

# INSTALL

```brew: brew install dnote```

```nix: nix profile install nixpkgs#dnote```

<!-- packages: 2026-07-22 -->
