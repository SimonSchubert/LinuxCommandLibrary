# TLDR

**Show media information**

```dvd+rw-mediainfo [/dev/dvd]```

**Show drive** capabilities

```dvd+rw-mediainfo -d [/dev/dvd]```

# SYNOPSIS

**dvd+rw-mediainfo** [_options_] _device_

# PARAMETERS

_DEVICE_
> DVD drive device path.

**-d**
> Show drive capabilities.

# DESCRIPTION

**dvd+rw-mediainfo** displays detailed information about DVD media currently in the drive. It reports disc type, capacity, booktype, write speed, and current usage status.

The output includes manufacturer information, disc state (empty, appendable, complete), and layer information for dual-layer media. This helps verify disc compatibility and available capacity before burning.

Drive capability query shows supported formats, speeds, and features of the optical drive.

# CAVEATS

Requires media in drive for most info. Some information depends on drive capabilities. May need root permissions for device access.

# HISTORY

dvd+rw-mediainfo is part of **dvd+rw-tools**, providing disc analysis capabilities essential for DVD authoring and burning on Linux systems.

# SEE ALSO

[dvd+rw-booktype](/man/dvd+rw-booktype)(1), [growisofs](/man/growisofs)(1), [cdrecord](/man/cdrecord)(1)
