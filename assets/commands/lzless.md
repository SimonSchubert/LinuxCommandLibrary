# TAGLINE

displays contents of lzip-compressed files using less

# TLDR

**View lzip-compressed file**

```lzless [file.lz]```

# SYNOPSIS

**lzless** [_options_] [_file_...]

# DESCRIPTION

**lzless** displays contents of lzip-compressed files using less. Automatically decompresses for viewing. All less navigation commands work. Press q to quit.

# INSTALL

```dnf: sudo dnf install xz```

```pacman: sudo pacman -S xz```

```apk: sudo apk add xz```

```zypper: sudo zypper install xz```

```brew: brew install xz```

```nix: nix profile install nixpkgs#xz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lzip](/man/lzip)(1), [less](/man/less)(1), [lzmore](/man/lzmore)(1)

