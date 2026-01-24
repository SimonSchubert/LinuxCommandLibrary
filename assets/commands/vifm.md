# TLDR

**Start vifm**

```vifm```

**Start in directory**

```vifm [/path/to/dir]```

**Start with two panes**

```vifm [/left/path] [/right/path]```

**Execute command**

```vifm -c "[command]"```

**Choose file** (output selection)

```vifm --choose-files [output_file]```

# SYNOPSIS

**vifm** [_-c command_] [_--choose-files file_] [_options_] [_paths_]

# PARAMETERS

**-c** _CMD_
> Run command on start.

**--choose-files** _FILE_
> Write selection to file.

**--choose-dir** _FILE_
> Write directory to file.

**--select** _PATH_
> Select file on start.

**--on-choose** _CMD_
> Run on file choose.

**-h**, **--help**
> Show help.

**--version**
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
> Toggle hidden.

# DESCRIPTION

**vifm** is a file manager with vim-like keybindings. It provides dual-pane navigation with familiar modal editing.

Vi keybindings make navigation fast. j/k moves, h goes up, l enters directories. Marks, registers, and macros work similarly.

Dual pane layout enables easy file operations between directories. Tab switches focus. Operations can target the other pane.

File operations use familiar patterns. yy yanks, p pastes, dd deletes. Visual mode selects multiple files.

Customization through vifmrc configures keybindings, colors, and behavior. Previews, icons, and scripts extend functionality.

Integration with shell enables cd-on-exit. The chosen directory changes the shell's working directory.

# CAVEATS

Learning curve for non-vim users. Some operations differ from vim. Configuration needed for optimal experience.

# HISTORY

**vifm** was created around **2001** as a curses-based file manager with vim-style keybindings. It continues active development with modern features.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [mc](/man/mc)(1), [lf](/man/lf)(1)
