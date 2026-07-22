# TAGLINE

Add missing .gz extension to gzip files

# TLDR

Add **.gz** extension

```zforce [path/to/file1 path/to/file2 ...]```

# SYNOPSIS

**zforce** [_FILE..._]

# DESCRIPTION

**zforce** adds a .gz extension to files compressed with gzip that are missing the extension. It examines files and renames only those that are valid gzip files.

Files that already have the .gz extension or are not gzip-compressed are ignored.

# CAVEATS

Only processes gzip files without .gz extension. Does not compress files, only renames them.

# INSTALL

```apt: sudo apt install gzip```

```dnf: sudo dnf install gzip```

```pacman: sudo pacman -S gzip```

```apk: sudo apk add gzip```

```zypper: sudo zypper install gzip```

```brew: brew install gzip```

```nix: nix profile install nixpkgs#gzip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gzip](/man/gzip)(1), [gunzip](/man/gunzip)(1), [zcat](/man/zcat)(1)
