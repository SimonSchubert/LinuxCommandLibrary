# TAGLINE

neovim, a modern Vim fork

# TLDR

**Open file**

```nvim [file]```

**Open multiple files**

```nvim [file1] [file2]```

**Open at line number**

```nvim +[line] [file]```

**Open in diff mode**

```nvim -d [file1] [file2]```

**Open read-only**

```nvim -R [file]```

**Execute command on startup**

```nvim -c "[command]" [file]```

# SYNOPSIS

**nvim** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File(s) to edit.

**+**_LINE_
> Start at line number.

**-c** _COMMAND_
> Execute command after loading.

**-d**
> Diff mode.

**-R**
> Read-only mode.

**-u** _FILE_
> Use alternate config.

**--headless**
> Run without UI.

**--help**
> Display help information.

# DESCRIPTION

**nvim** is Neovim, a modern Vim fork. Extensible text editor with Lua support.

The editor provides improved architecture over Vim. Better plugin system and async support.

# CAVEATS

Learning curve from Vim differences. Lua config preferred. Plugin ecosystem differs.

# HISTORY

Neovim was forked from **Vim in 2014** to modernize the codebase with better architecture.

# SEE ALSO

[vim](/man/vim)(1), [vi](/man/vi)(1), [emacs](/man/emacs)(1)

