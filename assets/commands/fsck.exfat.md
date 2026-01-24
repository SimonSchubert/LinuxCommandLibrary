# TLDR

**Check** an exFAT filesystem for errors

```fsck.exfat [/dev/sdXN]```

**Repair automatically** and answer yes to all questions

```fsck.exfat -y [/dev/sdXN]```

**Repair interactively** with prompts

```fsck.exfat -r [/dev/sdXN]```

**Repair automatically** and create files in /LOST+FOUND for orphaned clusters

```fsck.exfat -p -s [/dev/sdXN]```

**Check without repairing** (read-only mode)

```fsck.exfat -n [/dev/sdXN]```

**Show verbose output** during check

```fsck.exfat -v [/dev/sdXN]```

# SYNOPSIS

**fsck.exfat** [_-rynpavVh_] [_-s_] _device_

# PARAMETERS

**-r**, **--repair**
> Repair the filesystem interactively, prompting before each fix.

**-y**, **--repair-yes**
> Repair the filesystem automatically, answering yes to all questions.

**-n**, **--repair-no**
> Check the filesystem without making any repairs (read-only mode).

**-p**, **--repair-auto**
> Repair the filesystem automatically without prompts (same as **-a**).

**-a**
> Repair automatically (alias for **-p**).

**-s**
> Create files in /LOST+FOUND directory for orphaned clusters.

**-v**, **--verbose**
> Print debug information during the check.

**-V**, **--version**
> Show version information and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**fsck.exfat** checks and repairs exFAT filesystems on Linux. It is part of the **exfatprogs** package, the official userspace utilities for the exFAT filesystem that was merged into the Linux kernel starting with version 5.7.

The tool can detect and repair various filesystem corruptions including invalid boot sector parameters, incorrect cluster bitmap entries, invalid cluster chains, loops in cluster chains, and files sharing the same clusters. When the boot sector is corrupted but the backup boot sector is valid, it can restore the primary boot sector.

Before running fsck.exfat, unmount the filesystem first. Use **lsblk -f** to identify the correct device name.

# CAVEATS

The filesystem must be unmounted before running fsck.exfat. Running on a mounted filesystem can cause data corruption. Some earlier versions (notably 1.1.3) had bugs that could cause repair failures; ensure you have version 1.2.0 or later for reliable operation.

# HISTORY

The **exfatprogs** package was created in **2019** as the official Linux userspace utilities for exFAT after Samsung contributed their exFAT driver to the Linux kernel. The driver was merged into Linux **5.7** in **2020**, replacing the older FUSE-based exfat-utils implementation. Microsoft's decision to publish the exFAT specification in **2019** enabled this native kernel support.

# SEE ALSO

[fsck](/man/fsck)(8), [mkfs.exfat](/man/mkfs.exfat)(8), [lsblk](/man/lsblk)(8), [mount](/man/mount)(8)
