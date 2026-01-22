# TLDR

Display **all filesystems** and their disk usage

```df```

Display filesystems in **human-readable** form

```df -h```

Display the filesystem for a **specific path**

```df [path/to/file_or_directory]```

Include statistics on **free inodes**

```df -i```

Display filesystems excluding **specific types**

```df -x squashfs -x tmpfs```

Display **filesystem types**

```df -T```

# SYNOPSIS

**df** [_-h_] [_-i_] [_-T_] [_-x type_] [_file_...]

# DESCRIPTION

**df** (disk free) displays the amount of disk space available on filesystems. By default, it shows all mounted filesystems with their total size, used space, available space, and usage percentage.

# PARAMETERS

**-h, --human-readable**
> Print sizes in human-readable format (K, M, G)

**-H, --si**
> Print sizes using powers of 1000 (not 1024)

**-i, --inodes**
> Show inode information instead of block usage

**-T, --print-type**
> Print filesystem type

**-t, --type type**
> Limit listing to filesystems of specified type

**-x, --exclude-type type**
> Exclude filesystems of specified type

**-a, --all**
> Include dummy filesystems

**-l, --local**
> Limit listing to local filesystems

**--total**
> Print a total line

**-P, --portability**
> Use POSIX output format

# CAVEATS

Sizes shown may differ from actual file sizes due to filesystem overhead and reserved space. Some filesystems reserve space for root that won't show as available to regular users.

# HISTORY

Part of **GNU Coreutils**. The df command originated in **Version 1 AT&T UNIX** in **1971**.

# SEE ALSO

[du](/man/du)(1), [lsblk](/man/lsblk)(8), [mount](/man/mount)(8)
