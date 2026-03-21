# TAGLINE

Interactively find and recover deleted or overwritten files from your terminal

# TLDR

**Launch the recovery TUI**

```sudo recoverpy```

**Install via pip**

```pip install recoverpy```

**Run via pipx without installing**

```sudo pipx run recoverpy```

# SYNOPSIS

**recoverpy** [_options_]

# DESCRIPTION

**recoverpy** is a TUI (Text User Interface) tool for interactively recovering deleted or overwritten files. It scans raw partition data directly, searching for byte patterns across the entire block device. Unlike other recovery tools, it can recover both deleted files and overwritten data by scanning every block on the selected partition.

On launch, recoverpy presents a partition selector, then prompts for a search string. It scans each block on the device and displays matching results interactively, allowing you to navigate through adjacent blocks and save recovered content.

# CAVEATS

Requires **sudo** or root privileges for block device access. Does not reconstruct files automatically or infer file boundaries — results may be partial or fragmented. If blocks have already been overwritten, recovery is not possible. Works best on ext4 and other Linux-native filesystems. The search is performed on raw blocks, so scanning large partitions can take significant time.

# HISTORY

**recoverpy** was created by **PabloLec** and is written in **Python** using the **Textual** TUI framework.

# SEE ALSO

[testdisk](/man/testdisk)(1), [photorec](/man/photorec)(1), [ddrescue](/man/ddrescue)(1), [foremost](/man/foremost)(1), [extundelete](/man/extundelete)(1)
