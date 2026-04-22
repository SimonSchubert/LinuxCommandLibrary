# TAGLINE

check or set features of DVD-RAM discs

# TLDR

**Show current settings** of a DVD-RAM disc

```dvd-ram-control [/dev/dvd]```

**Make the disc read-only** (persistent write protection)

```dvd-ram-control -rdonly [/dev/dvd]```

**Re-enable read/write** access

```dvd-ram-control -rdwr [/dev/dvd]```

**Enable automatic write relocation** (AWRE)

```dvd-ram-control -awre [/dev/dvd]```

**Enable automatic read relocation** (ARRE)

```dvd-ram-control -arre [/dev/dvd]```

# SYNOPSIS

**dvd-ram-control** [**-arre**] [**-awre**] [**-rdonly**|**-rdwr**] _/dev/dvd_

# PARAMETERS

_/dev/dvd_
> The DVD-RAM drive device to operate on.

**-rdonly**
> Turn on persistent write protection (read-only).

**-rdwr**
> Turn off persistent write protection (read-write).

**-awre**
> Toggle Automatic Write Relocation Enable.

**-arre**
> Toggle Automatic Read Relocation Enable.

# DESCRIPTION

**dvd-ram-control** is part of the **dvd+rw-tools** suite and lets you inspect or change low-level features of a DVD-RAM disc. Running it with no option flags prints the current state of the disc's Persistent Write Protection and AWRE/ARRE flags. Adding a flag toggles or sets the corresponding feature in the drive's defect management data.

Persistent Write Protection (**-rdonly** / **-rdwr**) turns the whole disc into a read-only or read-write medium; AWRE and ARRE control automatic sector reallocation on write or read errors.

# CAVEATS

Only works with DVD-RAM media (not DVD±R, DVD±RW, or Blu-ray). Needs access to the raw device (usually as root or as a member of the `cdrom`/`disk` group). Persistent Write Protection can outlive the current session — re-enable read/write explicitly before attempting to burn.

# HISTORY

**dvd-ram-control** ships with **dvd+rw-tools** by **Andy Polyakov**, a suite of utilities for working with DVD±RW, DVD±R, and DVD-RAM media on Unix.

# SEE ALSO

[dvd+rw-mediainfo](/man/dvd+rw-mediainfo)(1), [growisofs](/man/growisofs)(1)
