# TLDR

**Remove an empty directory**

```rmdir [path/to/directory]```

**Remove multiple empty directories**

```rmdir [dir1] [dir2] [dir3]```

**Remove directory and empty parents**

```rmdir -p [path/to/directory]```

**Remove with verbose output**

```rmdir -v [path/to/directory]```

**Ignore errors** for non-empty directories

```rmdir --ignore-fail-on-non-empty [path/to/directory]```

**Remove nested empty directories**

```rmdir -p [parent/child/grandchild]```

# SYNOPSIS

**rmdir** [_OPTION_]... _DIRECTORY_...

# PARAMETERS

**-p**, **--parents**
> Remove directory and its empty ancestor directories.

**-v**, **--verbose**
> Print a message for each removed directory.

**--ignore-fail-on-non-empty**
> Ignore failures caused solely by non-empty directories.

**--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**rmdir** removes empty directories. Unlike **rm -r**, it will not remove directories that contain files or subdirectories, providing a safety check against accidental data loss.

With the **-p** option, rmdir removes the specified directory and then attempts to remove each parent directory in the path, stopping when a non-empty directory is encountered or removal fails.

rmdir is useful in scripts where you want to clean up empty directories without risking removal of directories with content.

# CAVEATS

rmdir only removes empty directories. For directories with content, use **rm -r** (with caution). The directory must be empty of all files and subdirectories, including hidden files (those starting with .). The -p option removes parent directories only if they become empty after child removal.

# HISTORY

rmdir is part of GNU coreutils and has been a standard Unix command since the earliest versions of Unix. It follows the POSIX specification for directory removal. The separation between rmdir (empty directories only) and rm -r (recursive removal) is a deliberate safety feature in Unix design.

# SEE ALSO

[rm](/man/rm)(1), [mkdir](/man/mkdir)(1), [find](/man/find)(1)
