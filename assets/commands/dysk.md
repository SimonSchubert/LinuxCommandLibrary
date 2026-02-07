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

**-s, --sort** _field_
> Sort by field (free, size, used, filesystem, etc.)

**-f, --filter** _expr_
> Filter expression

**--json**
> Output as JSON

**--csv**
> Output as CSV

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

Written in Rust. Disk type detection depends on system information availability.

# SEE ALSO

[df](/man/df)(1), [lsblk](/man/lsblk)(8)
