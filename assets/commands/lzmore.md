# TAGLINE

displays contents of lzip-compressed files using more

# TLDR

**View lzip-compressed file**

```lzmore [file.lz]```

**View multiple files**

```lzmore [file1.lz] [file2.lz]```

# SYNOPSIS

**lzmore** [_options_] [_file_...]

# DESCRIPTION

**lzmore** displays contents of lzip-compressed files using more. Automatically decompresses for viewing. Press space to page, q to quit. For better navigation, use lzless instead.

# INSTALL

```dnf: sudo dnf install xz```

```pacman: sudo pacman -S xz```

```apk: sudo apk add xz```

```zypper: sudo zypper install xz```

```brew: brew install xz```

```nix: nix profile install nixpkgs#xz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lzip](/man/lzip)(1), [more](/man/more)(1), [lzless](/man/lzless)(1)

