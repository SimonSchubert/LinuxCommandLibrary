# TAGLINE

Highly parallelized, fast directory tree disk usage analyzer

# TLDR

**Show disk usage of the current directory**

```pdu```

**Show disk usage of a specific directory**

```pdu [path/to/directory]```

**Compare multiple directories**

```pdu [dir1] [dir2]```

**Output as JSON**

```pdu --json [path/to/directory]```

# SYNOPSIS

**pdu** [_options_] [_files_...]

# DESCRIPTION

**pdu** (Parallel Disk Usage) is a highly parallelized, fast directory tree analyzer that renders graphical bar charts of disk usage in the terminal. It serves as an alternative to dust and dutree, with support for JSON output and comparison of multiple directories.

# HISTORY

**pdu** was created by **Hoang Van Khai** (KSXGitHub) and is written in **Rust**.

# SEE ALSO

[du](/man/du)(1), [dust](/man/dust)(1), [ncdu](/man/ncdu)(1), [gdu](/man/gdu)(1)
