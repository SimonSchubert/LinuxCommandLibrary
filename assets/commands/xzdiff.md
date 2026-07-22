# TAGLINE

Show differences in xz compressed files

# TLDR

**Show differences in xz files**

```xzdiff [file1.xz] [file2.xz]```

**Compare compressed with original**

```xzdiff [file.xz] [file]```

# SYNOPSIS

**xzdiff** [_diff_options_] _file1_ [_file2_]

# DESCRIPTION

**xzdiff** shows differences between xz compressed files. Decompresses and runs diff on the contents. Supports all diff options. Wrapper around diff for xz files.

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

[xz](/man/xz)(1), [xzcmp](/man/xzcmp)(1), [diff](/man/diff)(1)

