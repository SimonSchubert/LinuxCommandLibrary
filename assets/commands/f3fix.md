# TAGLINE

partition table fix for counterfeit flash drives

# TLDR

**Fix fake flash** capacity

```f3fix --last-sec [size] [/dev/sdb]```

**Calculate correct size**

```f3fix --last-sec $(f3probe --destructive [/dev/sdb] | grep 'last usable sector')```

**Fix with specific** sector

```f3fix --last-sec [1953125] [/dev/sdb]```

# SYNOPSIS

**f3fix** [_options_] _device_

# PARAMETERS

_DEVICE_
> Block device to fix (e.g., /dev/sdb).

**--last-sec** _SECTOR_
> Set last usable sector number.

**--help**
> Display help information.

# DESCRIPTION

**f3fix** creates a partition that matches the real capacity of a fake flash drive. It's part of the F3 (Fight Flash Fraud) toolkit and is used after f3probe identifies a counterfeit drive's actual size.

Fake flash drives report larger capacities than they actually have, causing data loss. f3fix creates a partition limited to the real usable space, preventing writes beyond the actual storage capacity.

The tool modifies the partition table to reflect true capacity, making the device safely usable at its real size.

# CAVEATS

Requires root privileges. Destroys existing partition table. Use only after f3probe identifies real capacity. Device must be unmounted.

# HISTORY

f3fix is part of the **F3** (Fight Flash Fraud) project created to combat counterfeit flash storage. The toolkit helps identify and safely use fake capacity drives that are common in online marketplaces.

# SEE ALSO

[f3probe](/man/f3probe)(1), [f3read](/man/f3read)(1), [fdisk](/man/fdisk)(1)
