# TAGLINE

Midnight Commander, a visual file manager

# TLDR

**Start Midnight Commander**

```mc```

**Start with two directories in panels**

```mc [dir1] [dir2]```

**Black and white mode**

```mc -b```

**View a file using the internal viewer**

```mc -v [file]```

**Edit a file using the internal editor**

```mc -e [file]```

**Disable mouse support**

```mc -d```

# SYNOPSIS

**mc** [_options_] [_path1_] [_path2_]

# PARAMETERS

_PATH1_ _PATH2_
> Directories for left and right panels.

**-a**, **--stickchars**
> Disable graphic characters for line drawing.

**-b**, **--nocolor**
> Force black and white display.

**-c**, **--color**
> Force color mode.

**-C** _arg_, **--colors=**_arg_
> Specify a different color set.

**-d**, **--nomouse**
> Disable mouse support.

**-e** _FILE_
> Start the internal editor on the specified file.

**-v** _FILE_
> Start the internal viewer on the specified file.

**-s**, **--slow**
> Slow terminal mode.

**-u**, **--nosubshell**
> Disable concurrent subshell.

**-S** _arg_, **--skin=**_arg_
> Specify skin name.

**--help**
> Display help information.

# KEYBOARD COMMANDS

**F1**
> Help.

**F3**
> View file.

**F4**
> Edit file.

**F5**
> Copy file or directory.

**F6**
> Move/rename file or directory.

**F7**
> Create directory.

**F8**
> Delete file or directory.

**F9**
> Access top menu bar.

**F10**
> Quit.

**Tab**
> Switch between panels.

**Ctrl+O**
> Toggle between panels and shell.

**Alt+Enter**
> Copy selected filename to command line.

# DESCRIPTION

**mc** (Midnight Commander) is a visual file manager with a dual-pane interface. It provides file operations like copying, moving, renaming, and deleting through function keys and menus.

Supports browsing archives (tar, zip, rpm, etc.) as virtual filesystems, remote connections via FTP, SFTP, and SMB, and a built-in text editor and file viewer.

The subshell integration (Ctrl+O) allows switching between the file manager and a full command line without leaving mc.

# CAVEATS

Function keys are used extensively and may conflict with terminal emulator shortcuts. Some terminals may need key remapping. The subshell requires a compatible shell (bash, zsh, or fish).

# HISTORY

Midnight Commander was created in **1994** by **Miguel de Icaza** as a Unix clone of Norton Commander.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1)

