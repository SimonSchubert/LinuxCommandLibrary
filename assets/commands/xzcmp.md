# TAGLINE

Compare xz compressed files

# TLDR

**Compare xz compressed files**

```xzcmp [file1.xz] [file2.xz]```

**Compare compressed with uncompressed**

```xzcmp [file.xz] [file]```

# SYNOPSIS

**xzcmp** [_options_] _file1_ [_file2_]

# DESCRIPTION

**xzcmp** compares xz compressed files. Decompresses and compares files using cmp. If only one file given, compares with stdin or uncompressed version. Wrapper around cmp for xz files.

# INSTALL

```apt: sudo apt install xz-utils```

```dnf: sudo dnf install xz```

```pacman: sudo pacman -S xz```

```apk: sudo apk add xz```

```zypper: sudo zypper install xz```

```brew: brew install xz```

```nix: nix profile install nixpkgs#xz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xz](/man/xz)(1), [xzdiff](/man/xzdiff)(1), [cmp](/man/cmp)(1)

