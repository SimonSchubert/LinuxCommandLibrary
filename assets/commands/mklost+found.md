# TLDR

Create a **lost+found directory** in the current directory

```mklost+found```

# SYNOPSIS

**mklost+found**

# DESCRIPTION

**mklost+found** creates a lost+found directory in the current working directory on ext2, ext3, and ext4 filesystems. The tool pre-allocates disk blocks for the directory to support filesystem recovery operations.

When e2fsck performs filesystem recovery, it stores recovered file fragments in the lost+found directory. Pre-allocating blocks prevents the recovery tool from needing to allocate space during the recovery process, which could fail if the filesystem is severely damaged.

# PARAMETERS

This command takes no options or arguments. It creates the directory in the current working directory.

# CAVEATS

The lost+found directory typically already exists at the root of each ext filesystem created by mke2fs. This utility creates additional instances in other locations when needed. Must be run on an ext2/ext3/ext4 filesystem. Requires appropriate permissions to create directories.

# HISTORY

**mklost+found** was created by **Remy Card** and is currently maintained by **Theodore Ts'o**. It is part of the **e2fsprogs** package, the standard utilities for managing ext filesystems on Linux.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [mke2fs](/man/mke2fs)(8), [fsck](/man/fsck)(8)
