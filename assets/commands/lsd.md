# TAGLINE

Modern ls replacement with colors and icons

# TLDR

**List files** in the current directory

```lsd```

**List with long format** details

```lsd -l```

**List all** files including hidden

```lsd -la```

**Display as a tree** with depth limit

```lsd --tree --depth [3]```

**Sort by file size** in reverse order

```lsd -lS --reverse```

**List with git status** indicators

```lsd -l --git```

**Group directories first** in long format

```lsd -l --group-directories-first```

**List with total directory sizes**

```lsd -l --total-size```

# SYNOPSIS

**lsd** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories to list. Defaults to current directory.

**-a**, **--all**
> Include hidden files (starting with `.`).

**-A**, **--almost-all**
> Include hidden files but exclude `.` and `..`.

**-l**, **--long**
> Display extended file metadata in long format.

**-1**, **--oneline**
> Display one entry per line.

**-R**, **--recursive**
> Recurse into directories.

**--tree**
> Display directory contents as a tree structure.

**--depth** _num_
> Limit the depth of recursion (used with `--tree` or `-R`).

**-t**, **--timesort**
> Sort by modification time.

**-S**, **--sizesort**
> Sort by file size.

**-X**, **--extensionsort**
> Sort by file extension.

**-v**, **--versionsort**
> Natural sort of version numbers within filenames.

**--sort** _WORD_
> Sort by: size, time, version, extension, or git.

**-r**, **--reverse**
> Reverse the sort order.

**-U**, **--no-sort**
> Do not sort; list entries in directory order.

**--git**
> Show git status for listed files and directories.

**--color** _WHEN_
> Control color output: always, auto, or never (default: auto).

**--icon** _WHEN_
> Control icon display: always, auto, or never (default: auto).

**--icon-theme** _THEME_
> Icon theme: fancy or unicode (default: fancy).

**--group-dirs** _VALUE_
> Group directories: none, first, or last.

**--group-directories-first**
> List directories before files (shorthand for `--group-dirs=first`).

**--date** _FORMAT_
> Date display format: date, locale, relative, or a custom format string.

**--size** _FORMAT_
> Size display format: default, short, or bytes.

**--permission** _FORMAT_
> Permission display format: rwx, octal, attributes, or disable.

**--total-size**
> Display total size of directories, not just immediate entry count.

**--blocks** _BLOCKS_
> Choose displayed columns: permission, user, group, size, date, name, inode, git.

**--header**
> Display column headers.

**-d**, **--directory-only**
> List directories themselves, not their contents.

**-i**, **--inode**
> Show the inode number for each file.

**-L**, **--dereference**
> Show information for the target of symlinks.

**--no-symlink**
> Do not display symlink target information.

**-F**, **--classify**
> Append indicator characters to entries (`*/=>@|`).

**--hyperlink** _WHEN_
> Attach hyperlinks to filenames: always, auto, or never.

**-I**, **--ignore-glob** _PATTERN_
> Hide entries matching a glob pattern.

**--classic**
> Enable classic mode (no colors or icons, like plain ls).

**--config-file** _PATH_
> Use a custom configuration file.

**--ignore-config**
> Ignore the configuration file and use defaults.

**-N**, **--literal**
> Print entry names without quoting.

**-Z**, **--context**
> Display SELinux or SMACK security context.

# CONFIGURATION

**~/.config/lsd/config.yaml**
> User configuration file in YAML format for setting default options, colors, icons, and display preferences.

# DESCRIPTION

**lsd** (LSDeluxe) is a modern replacement for the `ls` command written in Rust. It adds colors, file-type icons, and tree view to directory listings while remaining compatible with standard `ls` flags.

The tool supports Nerd Font icons for visual file-type identification, git integration to display repository status alongside files, and extensive customization through a YAML configuration file.

# CAVEATS

A Nerd Font must be installed and configured in the terminal for icons to render correctly. Without it, icons may appear as empty boxes or question marks. The `--classic` flag disables icons and colors for compatibility. Terminal must support 256 colors or truecolor for full color output.

# HISTORY

**lsd** (LSDeluxe) was created as a modern, colorful Rust-based replacement for the traditional `ls` command. It draws inspiration from similar tools like `exa` and `eza`.

# SEE ALSO

[ls](/man/ls)(1), [exa](/man/exa)(1), [eza](/man/eza)(1), [tree](/man/tree)(1)

