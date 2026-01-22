# TLDR

Change root to **new directory**

```sudo pivot_root [/new_root] [/new_root/old_root]```

Display **help**

```pivot_root -h```

# SYNOPSIS

**pivot_root** [**-h**|**--help**] _new_root_ _put_old_

# PARAMETERS

**new_root**
> Directory that becomes the new root filesystem

**put_old**
> Directory under new_root where old root will be mounted

**-h, --help**
> Display help information

# DESCRIPTION

**pivot_root** changes the root filesystem to a new directory and moves the current root to a subdirectory of the new root. This is commonly used during system boot in initramfs to switch from the initial RAM filesystem to the real root filesystem.

The operation is atomic and affects the entire system. After pivot_root, the old root remains accessible at the specified put_old location until it's unmounted.

# CAVEATS

Requires root privileges. The new_root must be a mount point. The current working directory of the process calling pivot_root is not changed. Used primarily in system initialization scripts.

# HISTORY

**pivot_root** was added to the Linux kernel to provide a clean way to switch root filesystems during boot. It replaced older methods that used chroot with various mount manipulations.

# SEE ALSO

[chroot](/man/chroot)(8), [mount](/man/mount)(8), [switch_root](/man/switch_root)(8)
