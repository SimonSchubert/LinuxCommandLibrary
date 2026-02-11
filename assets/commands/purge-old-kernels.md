# TAGLINE

Safely remove outdated kernel packages

# TLDR

**Remove old kernels**

```purge-old-kernels```

**Keep specific number**

```purge-old-kernels --keep [2]```

**Dry run**

```purge-old-kernels --dry-run```

# SYNOPSIS

**purge-old-kernels** [_options_]

# PARAMETERS

**--keep** _N_
> Number of kernels to keep.

**--dry-run**
> Show what would be removed.

**-y**
> Assume yes.

# DESCRIPTION

**purge-old-kernels** removes old Linux kernel packages from Ubuntu and Debian systems to reclaim disk space, particularly in the **/boot** partition. Over time, kernel upgrades accumulate previous versions that are no longer needed, and this utility automates their safe removal.

By default the tool keeps the currently running kernel and one or two previous versions as fallback, configurable with the **--keep** option. The **--dry-run** flag previews which packages would be removed without making changes. The command is part of the **byobu** package on Ubuntu systems and requires root privileges to uninstall kernel packages through the system package manager.

# CAVEATS

Ubuntu/Debian specific. Requires root. Keep at least 2 kernels.

# HISTORY

purge-old-kernels was created for **Ubuntu** kernel package cleanup.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [uname](/man/uname)(1)

