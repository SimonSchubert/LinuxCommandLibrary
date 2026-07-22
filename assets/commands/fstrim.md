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

Only works on filesystems whose underlying storage supports discard (most SSDs, NVMe, thin-provisioned devices). Running too frequently provides no benefit; a weekly schedule via the **fstrim.timer** systemd unit is typical. Continuous **discard** mount option is an alternative but generally less efficient than periodic **fstrim**.

# HISTORY

**fstrim** is part of the **util-linux** package, providing TRIM support for SSD optimization on Linux systems.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add fstrim```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[blkdiscard](/man/blkdiscard)(8), [mount](/man/mount)(8)
