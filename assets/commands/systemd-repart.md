# TAGLINE

Declarative disk partition management

# TLDR

**Grow** partitions automatically

```systemd-repart```

**Dry run** (view changes only)

```systemd-repart --dry-run yes```

Grow root to **specific size**

```systemd-repart --size 10G --root /```

# SYNOPSIS

**systemd-repart** [_OPTIONS_] [_DEVICE_]

# PARAMETERS

**--dry-run=** _BOOL_
> Show what would be done without applying changes

**--size=** _SIZE_
> Target size for operations

**--root=** _PATH_
> Operate on specified root directory

**--definitions=** _PATH_
> Use configuration from specified directory

# DESCRIPTION

**systemd-repart** automatically grows and adds partitions based on configuration files in `/usr/lib/repart.d/` and `/etc/repart.d/`. It reads declarative partition definitions and applies them to the disk.

This tool modifies partition tables but does not resize filesystems. Use `systemd-growfs` to extend filesystems after growing partitions.

# CAVEATS

Only modifies partition tables, not filesystems. Configuration files define desired partition layout declaratively. Use dry-run mode to preview changes before applying. Primarily designed for image-based systems.

# HISTORY

**systemd-repart** supports image-based OS deployment by enabling declarative partition management, allowing systems to automatically configure disk layout on first boot.

# SEE ALSO

[systemd-growfs](/man/systemd-growfs)(8), [repart.d](/man/repart.d)(5), [fdisk](/man/fdisk)(8)
