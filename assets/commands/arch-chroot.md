# TAGLINE

Enhanced chroot with automatic filesystem mounting

# TLDR

Start an **interactive shell** in a new root directory

```arch-chroot [path/to/new_root]```

Specify the **user** to run the shell as

```arch-chroot -u [user] [path/to/new_root]```

Run a **custom command** in the new root directory

```arch-chroot [path/to/new_root] [command] [arguments]```

Specify a different **shell**

```arch-chroot [path/to/new_root] zsh```

# SYNOPSIS

**arch-chroot** [_-u user_] _new_root_ [_command_]

# DESCRIPTION

**arch-chroot** is an enhanced chroot wrapper designed to simplify the Arch Linux installation and recovery process. Unlike plain chroot, it automatically mounts essential API filesystems (/proc, /sys, /dev, /dev/pts, and /run) before entering the chroot environment, and cleanly unmounts them upon exit.

This makes it significantly easier to perform system administration tasks on a mounted root filesystem, such as installing packages, configuring bootloaders, or repairing a broken system from a live environment. It can also run a single command and exit, or start an interactive shell as a specified user.

# PARAMETERS

**new_root**
> Path to the directory to use as the new root filesystem

**-u, --userspec user**
> Specify the user to run the shell or command as

**command**
> Optional command to run instead of the default shell (Bash)

# CAVEATS

Part of the **arch-install-scripts** package. Automatically mounts /proc, /sys, /dev, /dev/pts, and /run. The target directory must have a valid Linux root filesystem.

# HISTORY

Part of the **arch-install-scripts** package developed for **Arch Linux** to simplify the installation process and system recovery tasks.

# SEE ALSO

[chroot](/man/chroot)(1), [systemd-nspawn](/man/systemd-nspawn)(1), [pacstrap](/man/pacstrap)(8)
