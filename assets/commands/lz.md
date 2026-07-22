# TAGLINE

lists the contents of

# TLDR

List **archive contents**

```lz [path/to/file.tar.gz]```

# SYNOPSIS

**lz** _file.tar.gz_

# DESCRIPTION

**lz** lists the contents of a .tar.gz compressed archive without extracting it. It is a simple wrapper that provides quick access to archive contents.

# CAVEATS

Specifically for .tar.gz files. Use tar -tzf directly for more options and control.

# INSTALL

```apt: sudo apt install mtools```

```dnf: sudo dnf install mtools```

```pacman: sudo pacman -S mtools```

```apk: sudo apk add mtools```

```zypper: sudo zypper install mtools```

```brew: brew install mtools```

```nix: nix profile install nixpkgs#mtools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tar](/man/tar)(1), [gzip](/man/gzip)(1), [zcat](/man/zcat)(1)
