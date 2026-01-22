# TLDR

**Start file manager**

```lf```

**Open specific directory**

```lf [/path/to/dir]```

**Start with command**

```lf -command "[set hidden]"```

**Print selected files**

```lf -print-selection```

**Use specific config**

```lf -config [config.lf]```

# SYNOPSIS

**lf** [_options_] [_path_]

# PARAMETERS

_PATH_
> Starting directory.

**-command** _CMD_
> Execute command on start.

**-config** _FILE_
> Config file path.

**-print-selection**
> Print selection on exit.

**--help**
> Display help information.

# DESCRIPTION

**lf** is a terminal file manager. It provides fast navigation with vim-like keybindings.

The tool is written in Go for portability. It supports preview, bulk operations, and scripting.

lf is terminal file manager.

# CAVEATS

Terminal-based. Vim keybindings. Configuration via lfrc.

# HISTORY

lf was created as a **ranger**-inspired file manager written in Go for better performance and simplicity.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [mc](/man/mc)(1)
