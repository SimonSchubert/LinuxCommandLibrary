# TAGLINE

Display btrfs-progs version information

# TLDR

Display the **btrfs-progs version**

```btrfs version```

Display **help** for the subcommand

```btrfs version --help```

Equivalent **global flag**

```btrfs --version```

# SYNOPSIS

**btrfs** **version**

# DESCRIPTION

**btrfs version** prints the version of the userspace **btrfs-progs** package providing the `btrfs` command. The kernel module version is independent and can be inspected via `/sys/module/btrfs/version` or `modinfo btrfs`.

The output is useful when reporting bugs, comparing features against the documented changelog, or scripting feature detection. Recent releases (6.x) also expose built-in features through `mkfs.btrfs --version`, `btrfs-convert --version`, and similar per-tool flags.

# CAVEATS

Reports the userspace tools version only, not the running kernel's btrfs implementation. Mismatched userspace and kernel versions are supported but some on-disk features may be unavailable.

# INSTALL

```apt: sudo apt install btrfs-progs```

```dnf: sudo dnf install btrfs-progs```

```pacman: sudo pacman -S btrfs-progs```

```apk: sudo apk add btrfs-progs```

```brew: brew install btrfs-progs```

```nix: nix profile install nixpkgs#btrfs-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[btrfs](/man/btrfs)(8)
