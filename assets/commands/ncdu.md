# TLDR

**Analyze disk usage** of current directory

```ncdu```

**Analyze specific directory**

```ncdu [/path/to/directory]```

**Analyze and exclude pattern**

```ncdu --exclude [*.log]```

**Scan in quiet mode** (for slow disks)

```ncdu -q [/path/to/directory]```

**Export scan results** to file

```ncdu -o [scan.json] [/path/to/directory]```

**Load scan results** from file

```ncdu -f [scan.json]```

**Enable file deletion**

```ncdu [/path] && ncdu```

**Scan as root** (for full filesystem)

```sudo ncdu /```

# SYNOPSIS

**ncdu** [_options_] [_path_]

# DESCRIPTION

**ncdu** (NCurses Disk Usage) is an interactive disk usage analyzer with an ncurses interface. It scans a directory tree, then presents the results sorted by size, allowing navigation through directories to find space-consuming files.

The interface shows directory contents sorted by size with graphical bars indicating relative sizes. Users can navigate using arrow keys, enter directories, and optionally delete files or directories directly.

ncdu is particularly useful for identifying large files on servers, cleaning up disk space, and understanding storage usage patterns.

# PARAMETERS

**-q**
> Quiet mode, no scanning progress.

**-x**
> Stay on one filesystem.

**--exclude** _pattern_
> Exclude files matching pattern.

**-X** _file_, **--exclude-from** _file_
> Read exclude patterns from file.

**-o** _file_
> Export scan results to JSON file.

**-f** _file_
> Load scan results from file.

**-e**
> Enable shell extension (for exports).

**-r**
> Read-only mode (disable deletion).

**--si**
> Use base 10 (SI) units.

**--color** _scheme_
> Color scheme (dark, off).

# KEYBOARD CONTROLS

**Up/Down**: Navigate
**Enter**: Enter directory
**d**: Delete selected item
**n**: Sort by name
**s**: Sort by size
**C**: Sort by count
**g**: Show percentage/graph
**i**: Show item info
**r**: Refresh/recalculate
**q**: Quit

# CAVEATS

Deletion is permanent and bypasses trash. Scanning large filesystems takes time. File counts may differ from other tools due to hard links. Running without root may skip inaccessible directories.

# HISTORY

**ncdu** was created by **Yoran Heling** in **2007** as an ncurses-based alternative to du for interactive disk usage analysis. It was designed to address the difficulty of identifying large files using traditional tools. ncdu became a staple system administration tool, and version 2.0 (rewritten in Zig) was released in **2022**.

# SEE ALSO

[du](/man/du)(1), [df](/man/df)(1), [dust](/man/dust)(1), [duf](/man/duf)(1)
