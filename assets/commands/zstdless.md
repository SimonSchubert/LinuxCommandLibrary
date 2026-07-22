# TAGLINE

View zstd compressed files with pager

# TLDR

**View zstd compressed file**

```zstdless [file.zst]```

# SYNOPSIS

**zstdless** [_files_...]

# DESCRIPTION

**zstdless** allows viewing of Zstandard (.zst) compressed files using the **less** pager. It decompresses the file on the fly and pipes the output to less, providing the full interactive navigation experience including forward and backward scrolling, searching, and line jumping.

This is particularly useful for browsing compressed log files and data without needing to decompress them to disk first. It is part of the zstd suite of compression utilities.

# INSTALL

```apt: sudo apt install zstd```

```dnf: sudo dnf install zstd```

```pacman: sudo pacman -S zstd```

```apk: sudo apk add zstd```

```zypper: sudo zypper install zstd```

```brew: brew install zstd```

```nix: nix profile install nixpkgs#zstd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[zstd](/man/zstd)(1), [zstdcat](/man/zstdcat)(1), [less](/man/less)(1)

