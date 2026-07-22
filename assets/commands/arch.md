# TAGLINE

Print the machine hardware architecture

# TLDR

**Print** machine architecture

```arch```

# SYNOPSIS

**arch**

# DESCRIPTION

**arch** prints the machine hardware architecture. On Linux this is the GNU coreutils command, equivalent to **uname -m**. There are no options other than **--help** and **--version**.

Common outputs include:
- **x86_64**: 64-bit Intel/AMD
- **aarch64** or **arm64**: 64-bit ARM
- **i686** or **i386**: 32-bit Intel
- **armv7l**: 32-bit ARM
- **ppc64le**: 64-bit PowerPC little-endian
- **riscv64**: 64-bit RISC-V

# CAVEATS

The reported value depends on the kernel personality, not the silicon — running under **setarch** or in a 32-bit chroot can make a 64-bit machine report **i686**. On macOS the system **arch** binary is unrelated; it _switches_ a process to a different architecture instead of printing one.

# HISTORY

**arch** has been available on Unix systems since BSD. On Linux, it's part of coreutils and provides a simple wrapper around uname.

# INSTALL

```apt: sudo apt install coreutils```

```dnf: sudo dnf install coreutils```

```pacman: sudo pacman -S coreutils```

```apk: sudo apk add uutils-coreutils```

```zypper: sudo zypper install coreutils```

```brew: brew install coreutils```

```nix: nix profile install nixpkgs#coreutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[uname](/man/uname)(1), [setarch](/man/setarch)(8), [hostnamectl](/man/hostnamectl)(1)
