# TAGLINE

moves and renames files and directories

# TLDR

**Move a file to a directory**

```mv [source] [directory/]```

**Rename a file**

```mv [oldname.txt] [newname.txt]```

**Move multiple files to a directory**

```mv [file1] [file2] [directory/]```

**Move with confirmation before overwrite**

```mv -i [source] [destination]```

**Don't overwrite existing files**

```mv -n [source] [destination]```

**Move and show what's being done**

```mv -v [source] [destination]```

**Move with backup of existing destination**

```mv --backup=numbered [source] [destination]```

# SYNOPSIS

**mv** [_options_] _source_... _destination_

# PARAMETERS

**-i**, **--interactive**
> Prompt before overwriting an existing file.

**-f**, **--force**
> Do not prompt before overwriting. Overrides **-i** and **-n**.

**-n**, **--no-clobber**
> Do not overwrite an existing file. Overrides **-i** and **-f**.

**-v**, **--verbose**
> Print the name of each file being moved.

**-u**, **--update**
> Move only when the source is newer than the destination or the destination does not exist.

**--backup**[=_CONTROL_]
> Make a backup of each existing destination file. CONTROL can be numbered, existing, simple, or none.

**-S**, **--suffix** _SUFFIX_
> Override the usual backup suffix (default ~).

**-t**, **--target-directory** _DIRECTORY_
> Move all sources into the specified directory.

**-T**, **--no-target-directory**
> Treat destination as a normal file, not a directory.

# DESCRIPTION

**mv** moves and renames files and directories. When the source and destination are on the same filesystem, it performs an atomic rename. When moving across filesystems, it copies the data and then removes the original.

Renaming is simply moving a file within the same directory. Moving a file into a directory places it inside that directory with the same basename.

If multiple sources are given, the last argument must be a directory and all sources are moved into it.

# CAVEATS

**mv** overwrites existing destination files by default without warning. Use **-i** or **-n** to prevent accidental data loss. When moving across filesystems, the operation is not atomic: the file is copied first, then the original is deleted.

# HISTORY

**mv** is one of the original Unix commands, present since Version 1 AT&T Unix in 1971.

# SEE ALSO

[cp](/man/cp)(1), [rm](/man/rm)(1), [rename](/man/rename)(1), [rsync](/man/rsync)(1), [install](/man/install)(1)

