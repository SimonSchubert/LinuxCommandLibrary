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
CopyFiles=/source:/dest
MakeDirectories=/home
```

# CAVEATS

systemd 245+. Requires careful planning. Dry-run first. Used in image-based deployments.

# HISTORY

systemd-repart was introduced in **systemd 245** for declarative partition management in image-based Linux systems.

# SEE ALSO

[systemd-repart](/man/systemd-repart)(8), [parted](/man/parted)(8), [gdisk](/man/gdisk)(8)
