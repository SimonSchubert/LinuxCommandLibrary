# TAGLINE

sets the architecture execution domain to 32-bit and runs the specified program

# TLDR

This command is an **alias** of setarch

```tldr setarch```

# SYNOPSIS

**linux32** [_options_] [_program_ [_arguments_]]

# DESCRIPTION

**linux32** sets the architecture execution domain to 32-bit and runs the specified program. It is equivalent to `setarch linux32` and is used to run 32-bit programs on 64-bit systems with modified personality flags.

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

[setarch](/man/setarch)(8), [linux64](/man/linux64)(8)
