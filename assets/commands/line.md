# TAGLINE

reads a single line from standard input and writes it to standard output

# TLDR

**Read** a single line of input

```line```

# SYNOPSIS

**line**

# DESCRIPTION

**line** reads a single line from standard input and writes it to standard output. It is a simple utility for reading exactly one line in shell scripts.

# CAVEATS

Deprecated on many systems. Consider using `read` shell builtin or `head -n 1` instead for portable scripts.

# INSTALL

```dnf: sudo dnf install mesa-demos```

```pacman: sudo pacman -S mesa-demos```

```apk: sudo apk add mesa-demos```

```nix: nix profile install nixpkgs#mesa-demos```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[read](/man/read)(1), [head](/man/head)(1)
