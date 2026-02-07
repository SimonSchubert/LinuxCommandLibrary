# TAGLINE

FUSE filesystem mount manager

# TLDR

**Unmount FUSE filesystem**

```fusermount -u [mountpoint]```

**Force unmount** (lazy)

```fusermount -uz [mountpoint]```

**Show version**

```fusermount -V```

**List all FUSE mounts**

```mount -t fuse```

**Unmount with options**

```fusermount -u -o [option] [mountpoint]```

# SYNOPSIS

**fusermount** [_options_] _mountpoint_

# DESCRIPTION

**fusermount** is a utility for mounting and unmounting FUSE (Filesystem in Userspace) filesystems. It's primarily used for unmounting, as mounting is typically done by the filesystem program itself.

The tool enables non-root users to mount and unmount filesystems, subject to proper permissions and configuration.

# PARAMETERS

**-u**
> Unmount filesystem.

**-z**
> Lazy unmount (like umount -l).

**-q**
> Quiet mode.

**-o** _options_
> Mount options.

**-V**
> Display version.

**-h**
> Display help.

# CONFIGURATION

**/etc/fuse.conf**
> Controls system-wide FUSE settings including user_allow_other and mount_max.

# CAVEATS

Lazy unmount may leave filesystem in use. Regular users need proper permissions. Some options require root. Mount must be from fusermount or user_allow_other.

# HISTORY

**fusermount** is part of the **FUSE** (Filesystem in Userspace) project, originally created by **Miklos Szeredi** around **2001**. FUSE enables userspace programs to export filesystems to the kernel, revolutionizing filesystem development on Linux.

# SEE ALSO

[mount](/man/mount)(1), [umount](/man/umount)(1), [sshfs](/man/sshfs)(1), [encfs](/man/encfs)(1)
