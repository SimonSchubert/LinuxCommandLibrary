# TAGLINE

SSD TRIM command issuer

# TLDR

Trim **all** mounted partitions

```sudo fstrim -a```

Trim **specific** partition

```sudo fstrim /```

Trim with **verbose** output

```sudo fstrim -v /```

# SYNOPSIS

**fstrim** [_OPTIONS_] _mountpoint_

# DESCRIPTION

**fstrim** discards unused blocks on a mounted filesystem, sending TRIM commands to the underlying storage device. This is primarily useful for SSDs and flash storage to maintain performance and extend device lifespan.

# PARAMETERS

**-a, --all**
> Trim all mounted filesystems that support discard

**-v, --verbose**
> Display number of bytes trimmed

**-n, --dry-run**
> Print what would be done without actually trimming

**-o, --offset** _offset_
> Byte offset in filesystem to start trimming

**-l, --length** _length_
> Number of bytes to trim after offset

**-m, --minimum** _size_
> Minimum contiguous free range to trim

# CAVEATS

Only works on filesystems mounted with discard support. Running too frequently may reduce SSD lifespan. A weekly or monthly schedule via systemd timer is typically sufficient.

# HISTORY

**fstrim** is part of the **util-linux** package, providing TRIM support for SSD optimization on Linux systems.

# SEE ALSO

[blkdiscard](/man/blkdiscard)(8), [mount](/man/mount)(8)
