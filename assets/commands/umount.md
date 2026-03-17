# TAGLINE

Detach filesystems from mount points

# TLDR

**Unmount** a filesystem by device path

```sudo umount [path/to/device]```

**Unmount** a filesystem by mount point

```sudo umount [path/to/mounted_directory]```

**Remount** read-only when unmount fails

```sudo umount -r [path/to/mounted_directory]```

**Recursively** unmount each directory

```sudo umount -R [path/to/mounted_directory]```

**Lazy unmount** (detach now, clean up when not busy)

```sudo umount -l [path/to/mounted_directory]```

**Force unmount** an unreachable NFS filesystem

```sudo umount -f [path/to/mounted_directory]```

**Unmount** all mounted filesystems (except proc)

```sudo umount -a```

# SYNOPSIS

**umount** [_options_] _target_...

# PARAMETERS

**-a**, **--all**
> Unmount all filesystems described in /etc/mtab (except proc).

**-A**, **--all-targets**
> Unmount all mountpoints in the current namespace for the specified filesystem.

**-r**, **--read-only**
> If unmount fails, try to remount read-only.

**-R**, **--recursive**
> Recursively unmount each specified directory.

**-l**, **--lazy**
> Lazy unmount: detach from the file hierarchy now, clean up references when no longer busy.

**-f**, **--force**
> Force unmount (for unreachable NFS mounts).

**-d**, **--detach-loop**
> Free the loop device if the unmounted device was a loop device.

**-n**, **--no-mtab**
> Don't write to /etc/mtab.

**-t**, **--types** _type_
> Unmount only filesystems of the specified type.

**-O**, **--test-opts** _opts_
> Unmount only filesystems with the specified options in /etc/fstab.

**-v**, **--verbose**
> Verbose mode.

# DESCRIPTION

**umount** detaches a filesystem from its mount point, making it no longer accessible. The filesystem can be specified by its source device or mount point directory.

A filesystem cannot be unmounted while it is "busy" - that is, while files on it are open or processes have their working directory there. Use **lsof** or **fuser** to find processes using the filesystem.

# CAVEATS

Requires root privileges unless the **user** option was specified in fstab. Busy filesystems cannot be unmounted normally. Lazy unmount (**-l**) can leave filesystem in inconsistent state. Force unmount (**-f**) only works for NFS. Part of the util-linux package.

# HISTORY

**umount** has been a standard Unix command since the earliest versions, part of the **util-linux** package on Linux. The lazy unmount option (**-l**) was added in Linux 2.4.11.

# SEE ALSO

[mount](/man/mount)(8), [fuser](/man/fuser)(1), [lsof](/man/lsof)(8), [findmnt](/man/findmnt)(8)
