# TLDR

**Create new note**

```nb add```

**Create note with content**

```nb add "[Note content here]"```

**List notes**

```nb ls```

**Search notes**

```nb search "[query]"```

**Edit note**

```nb edit [1]```

**Delete note**

```nb delete [1]```

**Create bookmark**

```nb bookmark "[https://example.com]"```

**Show note**

```nb show [1]```

# SYNOPSIS

**nb** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Action to perform.

**add**
> Create new note.

**ls**
> List notes.

**search** _QUERY_
> Search notes.

**edit** _ID_
> Edit note.

**delete** _ID_
> Delete note.

**bookmark** _URL_
> Save bookmark.

**--help**
> Display help information.

# DESCRIPTION

**nb** is a note-taking and knowledge base CLI. It manages notes, bookmarks, and tasks.

The tool uses plain text files. Git-backed with encryption support.

nb is CLI note-taking app.

# CAVEATS

Shell script based. Git for sync. Markdown format default.

# HISTORY

nb was created as a comprehensive **command-line note-taking** and bookmarking application.

# SEE ALSO

[jrnl](/man/jrnl)(1), [notes](/man/notes)(1), [taskwarrior](/man/taskwarrior)(1)

