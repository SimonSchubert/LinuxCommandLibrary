# TAGLINE

ext4 filesystem defragmentation tool

# TLDR

**Defragment** a whole mounted filesystem

```sudo e4defrag [/dev/sdXN]```

Defragment a **single file**

```sudo e4defrag [path/to/file]```

Defragment a **directory** and everything below it

```sudo e4defrag [path/to/directory]```

Check the **fragmentation level** without defragmenting

```sudo e4defrag -c [path/to/file_or_device]```

Print **verbose** per-file information

```sudo e4defrag -v [/dev/sdXN]```

# SYNOPSIS

**e4defrag** [**-c**] [**-v**] _target_...

# DESCRIPTION

**e4defrag** defragments an ext4 filesystem. It can operate on entire filesystems, directories, or individual files.

Unlike offline defragmenters, e4defrag can run while the filesystem is mounted and in use.

# PARAMETERS

**-c**
> Check the current fragmentation state and print a fragmentation score without defragmenting. No root privileges are needed for files you own.

**-v**
> Verbose output, printing the result for each file

_target_
> Device, directory, or file to defragment. A device must be mounted.

# CAVEATS

ext4 only: the kernel's EXT4_IOC_MOVE_EXT ioctl is what does the work, so ext2/ext3 filesystems are rejected. The target filesystem must be mounted, since e4defrag operates online. Defragmentation needs free contiguous space, so it is largely ineffective on nearly full filesystems. Files with a fragmentation score under 30 are already considered fine and are left alone.

# SEE ALSO

[e2freefrag](/man/e2freefrag)(8), [e2fsck](/man/e2fsck)(8), [filefrag](/man/filefrag)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/fs/ext2/e2fsprogs.git)```

```[Homepage](https://e2fsprogs.sourceforge.net/)```

<!-- verified: 2026-07-14 -->
