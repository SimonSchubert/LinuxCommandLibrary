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

**purge-old-kernels** removes old kernel packages. Disk cleanup utility.

The tool frees /boot space. Ubuntu/Debian utility.

purge-old-kernels cleans kernels.

# CAVEATS

Ubuntu/Debian specific. Requires root. Keep at least 2 kernels.

# HISTORY

purge-old-kernels was created for **Ubuntu** kernel package cleanup.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [uname](/man/uname)(1)

