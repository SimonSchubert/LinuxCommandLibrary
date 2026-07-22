# TAGLINE

Switch to new root filesystem during boot

# TLDR

**Switch** to a new root filesystem and start init

```switch_root [new_root] [/sbin/init]```

# SYNOPSIS

**switch_root** [_options_] _newroot_ _init_ [_arguments_]

# PARAMETERS

**newroot**
> Path to the new root filesystem

**init**
> Path to the init program to execute (relative to new root)

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**switch_root** moves special filesystems (**/proc**, **/dev**, **/sys**, **/run**) to a new root directory and makes it the new root of the mount tree. It then executes the specified init program.

This command is primarily used in initramfs to transition from the initial RAM filesystem to the real root filesystem. The old root is deleted to free memory before the switch occurs.

# CAVEATS

The new root must be the root of a mount; the command will fail otherwise. Use bind-mounting as a workaround if needed. Must be run as root. Should only be used during early boot from initramfs. Part of the util-linux package.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[chroot](/man/chroot)(1), [pivot_root](/man/pivot_root)(8), [mount](/man/mount)(8), [init](/man/init)(8)
