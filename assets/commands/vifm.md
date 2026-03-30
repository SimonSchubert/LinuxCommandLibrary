# TAGLINE

Vim-like dual-pane file manager

# TLDR

**Start vifm**

```vifm```

**Start in a specific directory**

```vifm [/path/to/dir]```

**Start with two panes in different directories**

```vifm [/left/path] [/right/path]```

**Execute a command on startup**

```vifm -c "[command]"```

**Choose files and write selection to a file**

```vifm --choose-files [output_file]```

**Open and highlight a specific file**

```vifm --select [/path/to/file]```

**Read file list from stdin for a custom view**

```find . -name "[*.txt]" | vifm -```

# SYNOPSIS

**vifm** [_options_] [_lwinpath_] [_rwinpath_]

# PARAMETERS

**-c** _CMD_
> Execute command-line mode command on startup.

**+**_CMD_
> Execute command-line mode command on startup (alternate syntax).

**--choose-files** _FILE_
> Write selected file paths to FILE on exit (use **-** for stdout).

**--choose-dir** _FILE_
> Write last visited directory to FILE on exit (use **-** for stdout).

**--delimiter** _DELIM_
> Set separator for file path lists (default: newline).

**--select** _PATH_
> Open parent directory and highlight the specified file.

**--on-choose** _CMD_
> Execute command on chosen files instead of opening them.

**-f**
> Write selection to $VIFM/vimfiles (used by vifm.vim plugin).

**--remote**
> Send remaining arguments to an already running vifm instance.

**--remote-expr** _EXPR_
> Pass expression to vifm server and print result.

**--server-name** _NAME_
> Set or target a named vifm server instance.

**--server-list**
> List available vifm server names and exit.

**--plugins-dir** _PATH_
> Add plugin directory (can be specified multiple times).

**--no-configs**
> Skip reading vifmrc and vifminfo files.

**--logging**[=_PATH_]
> Enable logging to $VIFM/log or specified path.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# KEY BINDINGS

**j/k**
> Move down/up.

**h/l**
> Parent/enter directory.

**yy**
> Yank (copy).

**dd**
> Delete.

**p**
> Paste.

**cw**
> Rename.

**/**
> Search.

**:q**
> Quit.

**Tab**
> Switch pane.

**Space**
> Select file.

**za**
> Toggle hidden files.

# DESCRIPTION

**vifm** is a curses-based file manager with vim-like keybindings. It provides dual-pane navigation with familiar modal editing.

Vi keybindings make navigation fast. j/k moves, h goes up, l enters directories. Marks, registers, and macros work similarly to vim.

Dual pane layout enables easy file operations between directories. Tab switches focus. Operations can target the other pane.

File operations use familiar patterns. yy yanks, p pastes, dd deletes. Visual mode selects multiple files.

Customization through **vifmrc** configures keybindings, colors, and behavior. File previews, icons, and scripts extend functionality. The **--choose-dir** and **--choose-files** options enable integration with shell scripts and other programs.

The **--remote** option allows sending commands to a running instance, and **--server-name** supports managing multiple named instances.

# CAVEATS

Learning curve for non-vim users. Some operations differ from vim. Configuration needed for optimal experience.

# HISTORY

**vifm** was created around **2001** as a curses-based file manager with vim-style keybindings. It continues active development with modern features, including plugin support added in recent versions.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [mc](/man/mc)(1), [lf](/man/lf)(1), [vim](/man/vim)(1)
