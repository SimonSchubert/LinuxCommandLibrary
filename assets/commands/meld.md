# TAGLINE

visual diff and merge tool

# TLDR

**Compare two files**

```meld [file1] [file2]```

**Compare three files**

```meld [file1] [file2] [file3]```

**Compare directories**

```meld [dir1] [dir2]```

**Compare with version control**

```meld [file.txt]```

**Start new comparison**

```meld --newtab [file1] [file2]```

**Output diff**

```meld --output=[merged.txt] [file1] [file2]```

# SYNOPSIS

**meld** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files or directories to compare.

**--newtab**
> Open in new tab.

**--output** _FILE_
> Write merged result.

**--diff** _FILES_
> Start in diff mode.

**--help**
> Display help information.

# DESCRIPTION

**meld** is a visual diff and merge tool. It highlights differences between files or directories.

The tool provides three-way comparison and merging. Integrates with version control systems.

# CAVEATS

GUI application. GTK-based. May be slow with large files.

# HISTORY

Meld was created as a visual **diff and merge** tool for GNOME, supporting file and directory comparison.

# SEE ALSO

[diff](/man/diff)(1), [kdiff3](/man/kdiff3)(1), [vimdiff](/man/vimdiff)(1)

