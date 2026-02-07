# TAGLINE

manage DVD-RAM media settings

# TLDR

**Show DVD-RAM status**

```dvd-ram-control [/dev/dvd]```

**Enable write** protection

```dvd-ram-control -p 1 [/dev/dvd]```

**Disable write** protection

```dvd-ram-control -p 0 [/dev/dvd]```

**Format DVD-RAM**

```dvd-ram-control -f [/dev/dvd]```

# SYNOPSIS

**dvd-ram-control** [_options_] _device_

# PARAMETERS

_DEVICE_
> DVD-RAM drive device.

**-p** _0|1_
> Set write protection (0=off, 1=on).

**-f**
> Format the disc.

**-v**
> Verbose output.

# DESCRIPTION

**dvd-ram-control** manages DVD-RAM media settings including write protection and formatting. DVD-RAM discs can be written like hard drives without special burning software.

Write protection prevents accidental modification of disc contents. Formatting prepares new discs or erases existing content for reuse.

DVD-RAM was designed for random access similar to hard drives, making these controls analogous to disk management operations.

# CAVEATS

Only works with DVD-RAM media. Formatting erases all data. Write protection is disc-level. Requires compatible drive.

# HISTORY

dvd-ram-control provides management for **DVD-RAM** media, a rewritable format designed for data storage with direct file system access, popular for backup and archival use.

# SEE ALSO

[dvd+rw-mediainfo](/man/dvd+rw-mediainfo)(1), [mkudffs](/man/mkudffs)(8)
