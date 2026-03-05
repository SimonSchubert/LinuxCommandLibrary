# TAGLINE

Interactively find and recover deleted or overwritten files from your terminal

# TLDR

**Launch the recovery TUI**

```sudo recoverpy```

**Run via pipx without installing**

```sudo pipx run recoverpy```

# SYNOPSIS

**recoverpy** [_options_]

# DESCRIPTION

**recoverpy** is a terminal tool for interactively recovering deleted or overwritten files. It scans raw partition data directly, searching for byte patterns across the entire block device. Unlike other recovery tools, it can recover both deleted files and overwritten data by scanning every block on the selected partition.

# CAVEATS

Requires **sudo** for block device access. Does not reconstruct files automatically or infer file boundaries — results may be partial or fragmented. If blocks have already been overwritten, recovery is not possible.

# HISTORY

**recoverpy** was created by **PabloLec** and is written in **Python**.

# SEE ALSO

[testdisk](/man/testdisk)(1), [photorec](/man/photorec)(1), [ddrescue](/man/ddrescue)(1)
