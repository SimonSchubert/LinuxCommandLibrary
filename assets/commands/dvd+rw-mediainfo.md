# TAGLINE

display DVD media information

# TLDR

**Show media information**

```dvd+rw-mediainfo [/dev/dvd]```

# SYNOPSIS

**dvd+rw-mediainfo** _device_

# PARAMETERS

_DEVICE_
> DVD/BD drive device path (e.g., /dev/dvd, /dev/sr0).

# DESCRIPTION

**dvd+rw-mediainfo** displays detailed information about optical media (DVD/BD) currently in the drive and the drive itself. It reports disc type, capacity, booktype, write speed, and current usage status.

The output includes manufacturer information, disc state (empty, appendable, complete), and layer information for dual-layer media. This helps verify disc compatibility and available capacity before burning. It is especially useful for debugging, and its output should be included when reporting bugs in dvd+rw-tools.

This program does not accept any command-line options beyond the device path.

# CAVEATS

Requires media in drive for most info. Some information depends on drive capabilities. May need root permissions for device access.

# HISTORY

dvd+rw-mediainfo is part of **dvd+rw-tools**, providing disc analysis capabilities essential for DVD authoring and burning on Linux systems.

# SEE ALSO

[dvd+rw-booktype](/man/dvd+rw-booktype)(1), [growisofs](/man/growisofs)(1), [cdrecord](/man/cdrecord)(1)
