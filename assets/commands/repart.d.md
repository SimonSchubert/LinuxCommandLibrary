# TAGLINE

Declarative disk partition definitions

# TLDR

**Apply partition definitions**

```sudo systemd-repart --dry-run```

**Run repart**

```sudo systemd-repart```

**Show changes without applying**

```systemd-repart --dry-run --no-pager```

# SYNOPSIS

**/etc/repart.d/*.conf** configuration files

# DESCRIPTION

**repart.d** contains configuration files for systemd-repart, which declaratively manages GPT partition tables. It can grow, create, or modify partitions on disk.

# CONFIGURATION

```ini
# /etc/repart.d/50-root.conf
[Partition]
Type=root
Format=ext4
Label=root
SizeMinBytes=10G
SizeMaxBytes=50G
```

# PARTITION TYPES

```
root          - Root partition
home          - Home partition
srv           - Server data
var           - Variable data
tmp           - Temporary files
swap          - Swap space
esp           - EFI System Partition
```

# EXAMPLES

```bash
# Dry run
systemd-repart --dry-run

# Apply changes
systemd-repart

# Create partition config
cat > /etc/repart.d/50-home.conf << EOF
[Partition]
Type=home
Format=ext4
Label=home
SizeMinBytes=20G
EOF
```

# OPTIONS

```ini
[Partition]
Type=home
Format=ext4
Label=home
SizeMinBytes=1G
SizeMaxBytes=50G
Weight=1000
CopyFiles=/source:/dest
MakeDirectories=/home
Verity=off
FactoryReset=no
Flags=
```

**Type=**
> GPT partition type (root, home, srv, var, tmp, swap, esp, etc.).

**Format=**
> Filesystem to create (ext4, btrfs, xfs, vfat, swap, etc.).

**SizeMinBytes=**, **SizeMaxBytes=**
> Minimum and maximum partition size constraints.

**Weight=**
> Relative weight for distributing remaining free space (default 1000).

**CopyFiles=**
> Copy files from the host into the partition, in source:destination format.

**MakeDirectories=**
> Create directories within the new filesystem with mode 0755.

**Verity=**
> dm-verity mode: off, data, hash, or signature.

**FactoryReset=**
> Mark the partition for removal during factory reset.

# CAVEATS

Requires systemd 245+. Requires careful planning. Always use --dry-run first. Primarily designed for image-based deployments and A/B update schemes.

# HISTORY

systemd-repart was introduced in **systemd 245** for declarative partition management in image-based Linux systems.

# SEE ALSO

[systemd-repart](/man/systemd-repart)(8), [parted](/man/parted)(8), [gdisk](/man/gdisk)(8), [fdisk](/man/fdisk)(8), [lsblk](/man/lsblk)(8)
