# TLDR

**Create new note**

```notes new "[note title]"```

**List all notes**

```notes ls```

**Search notes**

```notes search "[query]"```

**Edit note**

```notes edit "[note title]"```

**Delete note**

```notes rm "[note title]"```

**Sync notes**

```notes sync```

# SYNOPSIS

**notes** _command_ [_options_]

# PARAMETERS

**new** _title_
> Create new note.

**ls**
> List notes.

**search** _query_
> Search notes.

**edit** _title_
> Edit note.

**rm** _title_
> Delete note.

**sync**
> Sync with remote.

**cat** _title_
> Display note.

# DESCRIPTION

**notes** is a simple command-line note-taking application. It stores notes as plain text files, making them easy to manage, search, and sync.

Notes are typically stored in ~/.notes or a configured directory.

# EXAMPLE WORKFLOW

```bash
# Create a note
notes new "meeting-notes"
# Opens editor, save and exit

# List notes
notes ls

# Find notes
notes search "project"

# View note
notes cat "meeting-notes"
```

# CAVEATS

Implementation varies (several tools named "notes"). Plain text storage. Editor configured via $EDITOR.

# HISTORY

Various command-line note tools exist; implementations include those by **Nick Nisi** and others, following Unix philosophy of simple text file management.

# SEE ALSO

[nb](/man/nb)(1), [jrnl](/man/jrnl)(1), [zk](/man/zk)(1), [vim](/man/vim)(1)
