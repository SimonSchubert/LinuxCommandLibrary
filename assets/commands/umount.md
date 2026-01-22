# TLDR

**Unmount** a filesystem by device path

```sudo umount [path/to/device]```

**Unmount** a filesystem by mount point

```sudo umount [path/to/mounted_directory]```

**Remount** read-only when unmount fails

```sudo umount -r [path/to/mounted_directory]```

**Recursively** unmount each directory

```sudo umount -R [path/to/mounted_directory]```

**Unmount** all mounted filesystems (except proc)

```sudo umount -a```

# SYNOPSIS

**umount** [_options_] _target_...

# PARAMETERS

**-a, --all**
> Unmount all filesystems (except proc)

**-r, --read-only**
> If unmount fails, try to remount read-only

**-R, --recursive**
> Recursively unmount directories

**-l, --lazy**
> Lazy unmount (detach now, cleanup later)

**-f, --force**
> Force unmount (for unreachable NFS)

**-n, --no-mtab**
> Don't write to /etc/mtab

**-t, --types _type_**
> Unmount only filesystems of specified type

**-v, --verbose**
> Verbose mode

# DESCRIPTION

**umount** detaches a filesystem from its mount point, making it no longer accessible. The filesystem can be specified by its source device or mount point directory.

A filesystem cannot be unmounted while it is "busy" - that is, while files on it are open or processes have their working directory there. Use **lsof** or **fuser** to find processes using the filesystem.

# CAVEATS

Requires root privileges unless the **user** option was specified in fstab. Busy filesystems cannot be unmounted normally. Lazy unmount (**-l**) can leave filesystem in inconsistent state. Force unmount (**-f**) only works for NFS. Part of the util-linux package.

# SEE ALSO

[mount](/man/mount)(8), [fuser](/man/fuser)(1), [lsof](/man/lsof)(8), [findmnt](/man/findmnt)(8)
