# TAGLINE

Midnight Commander's file manager mode

# TLDR

**Start file manager**

```mc```

Open a **specific directory** in the left panel

```mc [/path/to/dir]```

**Open two directories**, one per panel

```mc [left_dir] [right_dir]```

**View** a file in the internal viewer

```mc -v [file]```

**Edit** a file with the internal editor

```mc -e [file]```

Browse a **remote host** over SFTP

```mc sftp://[user]@[host]/[path]```

Start **without a subshell** (faster startup)

```mc -u```

Start in **black and white** without mouse support

```mc -b -d```

Use a specific **skin**

```mc -S [modarin256]```

# SYNOPSIS

**mc** [_options_] [_path1_ [_path2_]]

# PARAMETERS

_PATH1_ _PATH2_
> Directories (or VFS URLs) for the left and right panels.

**-v**, **--view** _FILE_
> Launch the internal file viewer on a file.

**-e**, **--edit** _FILE_...
> Launch the internal editor on files.

**-b**, **--nocolor**
> Run in black and white.

**-c**, **--color**
> Force color mode.

**-S**, **--skin** _NAME_
> Use the specified skin.

**-d**, **--nomouse**
> Disable mouse support.

**-a**, **--stickchars**
> Use plain ASCII characters to draw lines.

**-u**, **--nosubshell**
> Disable the concurrent subshell.

**-U**, **--subshell**
> Enable the concurrent subshell (default).

**-P**, **--printwd** _FILE_
> Write the last working directory to _FILE_ on exit (used by the mc-wrapper to cd on exit).

**-x**, **--xterm**
> Force xterm features.

**-X**, **--no-x11**
> Disable X11 support.

**-K**, **--keymap** _FILE_
> Load key bindings from _FILE_.

**-l**, **--ftplog** _FILE_
> Log the FTP dialog to _FILE_.

**-F**, **--datadir-info**
> Print information about the directories mc uses.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**mc** is Midnight Commander's file manager mode. It provides a dual-pane, keyboard-driven text-mode file manager in the style of Norton Commander.

Function keys drive the main operations: **F3** view, **F4** edit, **F5** copy, **F6** move/rename, **F7** make directory, **F8** delete, **F9** menu, **F10** quit. The virtual filesystem (VFS) lets you browse archives (tar, zip, rpm, deb and others) and remote systems over SFTP, FTP and the shell protocol (**sh://**) as if they were local directories.

# CAVEATS

Terminal-based; some terminals intercept function keys, in which case **Esc** followed by a digit works instead. Same program as **mc**; this page covers its file manager usage. Not to be confused with the MinIO client, which also installs a binary named mc.

# HISTORY

Midnight Commander was started in **1994** by **Miguel de Icaza** as a Norton Commander clone for Unix. It became part of the GNU project and is still actively maintained, with 4.8.x releases.

# SEE ALSO

[mc](/man/mc)(1), [ranger](/man/ranger)(1), [nnn](/man/nnn)(1)

# RESOURCES

```[Source code](https://github.com/MidnightCommander/mc)```

```[Homepage](https://midnight-commander.org)```

<!-- verified: 2026-09-29 -->
