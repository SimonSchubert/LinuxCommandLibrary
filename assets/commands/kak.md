# TAGLINE

modal text editor inspired by Vim

# TLDR

**Open file**

```kak [file.txt]```

**Open multiple files**

```kak [file1] [file2]```

**Open at line**

```kak +[50] [file.txt]```

**Execute command**

```kak -e "[command]" [file.txt]```

**Client-server mode**

```kak -c [session-name]```

**Start as server**

```kak -d -s [session-name]```

# SYNOPSIS

**kak** [_options_] [_file_...]

# PARAMETERS

_FILE_
> Files to edit.

**+**_LINE_
> Go to line number.

**-e** _CMD_
> Execute command after startup.

**-c** _SESSION_
> Connect to session.

**-d**
> Daemon mode.

**-s** _NAME_
> Session name.

**--help**
> Display help information.

# DESCRIPTION

**Kakoune** is a modal text editor inspired by Vim. It uses selection-first editing with multiple cursors.

The editor provides instant visual feedback. It separates selection from action for intuitive editing.

# CAVEATS

Different from Vim paradigm. Learning curve. Client-server architecture.

# HISTORY

Kakoune was created by **Maxime Coste** as a Vim-inspired editor with a focus on interactivity and orthogonality.

# SEE ALSO

[vim](/man/vim)(1), [nvim](/man/nvim)(1), [helix](/man/helix)(1)
