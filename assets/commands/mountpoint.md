# TAGLINE

checks whether a given directory or file is a filesystem mountpoint

# TLDR

**Check** if a directory is a mountpoint

```mountpoint [path/to/directory]```

Check **quietly** (no output, exit code only)

```mountpoint -q [path/to/directory]```

Show **major/minor numbers** of filesystem

```mountpoint -d [path/to/directory]```

Show major/minor numbers for a **block device**

```mountpoint -x [/dev/sda1]```

# SYNOPSIS

**mountpoint** [**-d**|**-q**] _directory_|_file_
**mountpoint** **-x** _device_

# PARAMETERS

**-d, --fs-devno**
> Display major/minor device numbers for the mounted filesystem

**-q, --quiet**
> Suppress all output; use exit code only

**--nofollow**
> Do not follow symbolic links at final path component

**-x, --devno**
> Output major/minor numbers for a block device

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# DESCRIPTION

**mountpoint** checks whether a given directory or file is a filesystem mountpoint by examining /proc/self/mountinfo. It is commonly used in shell scripts to verify mount status before performing operations.

The command returns exit code 0 if the path is a mountpoint, and exit code 32 if it is not. Exit code 1 indicates usage errors or system failures.

# CAVEATS

The command checks /proc/self/mountinfo, so results depend on the mount namespace of the calling process. Bind mounts may produce different results than expected. Setting LIBMOUNT_DEBUG=all enables debugging output.

# HISTORY

**mountpoint** was originally part of **sysvinit** and is now maintained as part of **util-linux** by Karel Zak. It provides a reliable method for scripts to check mount status without parsing mount output.

# SEE ALSO

[mount](/man/mount)(8), [umount](/man/umount)(8), [findmnt](/man/findmnt)(8)
