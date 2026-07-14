# TAGLINE

filesystem information in formatted tables

# TLDR

Get **standard overview** of disks

```dysk```

**Sort** by free size

```dysk -s free```

Include only **HDD** disks

```dysk -f 'disk = HDD'```

**Exclude** SSD disks

```dysk -f 'disk <> SSD'```

Display disks with **high utilization or low free space**

```dysk -f 'use > 65% | free < 50G'```

# SYNOPSIS

**dysk** [_options_]

# DESCRIPTION

**dysk** displays filesystem information in a formatted table. It shows mount points, disk types, sizes, usage, and filesystem types with color-coded output.

Provides filtering and sorting capabilities for focused analysis.

# PARAMETERS

**-a, --all**
> Show all mount points, including pseudo, removable and remote ones

**-s, --sort** _field_
> Sort by field (free, size, used, filesystem, etc.)

**-f, --filter** _expr_
> Filter expression

**-c, --csv**
> Output as CSV

**-j, --json**
> Output as JSON

**--cols** _cols_
> Choose which columns are shown

**-l, --list-cols**
> List the available columns

**--units** _si|binary_
> Size units: SI (1M = 1,000,000 B) or binary (1M = 1,048,576 B)

**--color** _auto|yes|no_
> Control colored output

# FILTER EXPRESSIONS

**disk = HDD**
> Only HDDs

**disk = SSD**
> Only SSDs

**use > 65%**
> Usage over 65%

**free < 50G**
> Less than 50GB free

# CAVEATS

Linux only: dysk reads /proc/mounts and sysfs, so it does not run on macOS or BSD. Disk type detection (SSD vs HDD) depends on what the kernel exposes and can be blank for virtual or remote filesystems. The project was previously named **lfs**.

# SEE ALSO

[df](/man/df)(1), [lsblk](/man/lsblk)(8), [duf](/man/duf)(1)

# RESOURCES

```[Source code](https://github.com/Canop/dysk)```

```[Homepage](https://dystroy.org/dysk/)```

<!-- verified: 2026-07-14 -->
