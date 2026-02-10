# TAGLINE

creates a hard link between files

# TLDR

**Create hard link**

```link [target] [linkname]```

**Link file to directory**

```link [file.txt] [dir/file.txt]```

# SYNOPSIS

**link** _file1_ _file2_

# PARAMETERS

_FILE1_
> Target file (source).

_FILE2_
> Link name (destination).

# DESCRIPTION

**link** creates a hard link between files. Unlike ln, it only creates hard links and takes exactly two arguments.

The tool creates an additional directory entry pointing to the same inode. Both names reference the same file data.

# CAVEATS

Cannot create symbolic links. Cannot link directories. Target must exist. Same filesystem only.

# HISTORY

link is a **POSIX** utility providing a simple interface to the link() system call for creating hard links.

# SEE ALSO

[ln](/man/ln)(1), [unlink](/man/unlink)(1), [readlink](/man/readlink)(1)

