# TLDR

**Start ranger** in the current directory

```ranger```

**Start ranger** in a specific directory

```ranger [path/to/directory]```

**Show hidden files** on startup

```ranger --show-hidden```

**Generate default configuration files**

```ranger --copy-config=all```

**Print the selected files** on exit (for shell integration)

```ranger --choosefile=[target_file]```

# SYNOPSIS

**ranger** [**--version**] [**--help**] [**--copy-config**=_which_] [**--choosefile**=_target_] [_path_]

# PARAMETERS

**--copy-config**=_which_
> Copy default configuration files to ~/.config/ranger (rc, scope, rifle, commands, or all)

**--choosefile**=_target_
> Write selected file path to target file on exit (for shell integration)

**--choosedir**=_target_
> Write last visited directory to target file on exit

**--show-hidden**
> Show hidden files by default

**--cmd**=_command_
> Execute ranger command after startup

**--version**
> Display version information

**--help**
> Display help information

# DESCRIPTION

**ranger** is a console-based file manager with Vi-style keybindings. It features a three-column layout showing the parent directory, current directory, and file preview simultaneously.

The interface provides instant navigation using hjkl keys (or arrow keys): **h** moves to the parent directory, **j/k** moves up/down in the file list, and **l** opens directories or files. Additional Vim-like commands include **gg** for top of list, **G** for bottom, and **/** for search.

File operations follow Vim patterns: **yy** yanks (copies), **dd** cuts, **pp** pastes, **dD** deletes. Rename with **cw**, create directories with **:mkdir**, and open files with **r** to select an application.

Ranger includes **rifle**, a file opener that automatically selects appropriate applications based on file type. It supports image previews (with appropriate terminal support), syntax-highlighted text previews, and archive content viewing.

# KEY BINDINGS

**h/j/k/l** or arrows: Navigate directories and files
**gg/G**: Jump to top/bottom of list
**zh**: Toggle hidden files
**yy**: Copy (yank) file
**dd**: Cut file
**pp**: Paste file
**dD**: Delete file
**cw**: Rename file
**Space**: Select file
**:**: Enter command mode
**q** or **ZZ**: Quit ranger
**m**_x_: Set bookmark x
**\`**_x_: Jump to bookmark x
**S**: Open shell in current directory

# CAVEATS

Image previews require a terminal with image support (kitty, iTerm2, w3m) and appropriate configuration. Text previews may require additional tools like **highlight** for syntax coloring.

Ranger is written in Python and may be slower than native file managers for directories with many files. Consider using **lf** or **nnn** for faster performance.

Configuration is stored in **~/.config/ranger/**. Run **ranger --copy-config=all** to generate editable configuration files.

# HISTORY

Ranger was created by **Roman Zimbelmann** with the first release in **2009**. It was designed to bring Vim's efficient keybinding philosophy to file management. The project is open source and continues to be actively maintained on GitHub.

# SEE ALSO

[mc](/man/mc)(1), [vifm](/man/vifm)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1)
