# TAGLINE

Feature-rich terminal pager alternative to less

# TLDR

**View a file**

```ov [path/to/file]```

**View compressed files**

```ov [file.gz]```

**View multiple files**

```ov [file1] [file2]```

**Use as a system pager**

```export PAGER=ov```

# SYNOPSIS

**ov** [_options_] [_files_...]

# DESCRIPTION

**ov** is a feature-rich terminal pager that serves as an alternative to less and more. It supports compressed files (gzip, bzip2, zstd, lz4, xz), multicolor highlighting, fast opening of large files, and simultaneous viewing of multiple files.

It can be used as a system-wide **PAGER** replacement.

# CAVEATS

Some keybindings differ from less. May require adjustment for users accustomed to less navigation.

# HISTORY

**ov** was created by **Noboru Saito** (noborus) and is written in **Go**.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [bat](/man/bat)(1)
