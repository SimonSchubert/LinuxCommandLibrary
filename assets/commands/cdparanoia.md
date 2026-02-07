# TAGLINE

CD audio ripper with error correction

# TLDR

**Rip entire CD to WAV files**

```cdparanoia -B```

**Rip specific track**

```cdparanoia [5] [track05.wav]```

**Rip track range**

```cdparanoia [1-5]```

**Query CD table of contents**

```cdparanoia -Q```

**Output raw PCM data**

```cdparanoia -r [1] [track.raw]```

**Verbose output**

```cdparanoia -v [1]```

# SYNOPSIS

**cdparanoia** [_options_] _span_ [_outfile_]

# DESCRIPTION

**cdparanoia** is a CD digital audio extraction tool with advanced error correction and jitter handling. It reads audio tracks from CDDA-capable drives and performs verification, synchronization, and scratch reconstruction to produce bit-perfect rips whenever possible.

Unlike simple CD rippers, cdparanoia uses multiple read passes and cross-correlates data to detect and correct errors caused by scratches, smudges, or drive imperfections. The progress display shows smiley faces indicating read quality, from normal operation to scratch detection and correction failures.

Output formats include WAV (default), AIFF, AIFF-C, and raw 16-bit PCM. Batch mode (`-B`) splits output into one file per track automatically.

# PARAMETERS

**-B**, **--batch**
> Batch mode, split output at track boundaries

**-Q**, **--query**
> Query and print CD table of contents

**-d** _device_, **--force-cdrom-device** _device_
> Specify CD-ROM device

**-v**, **--verbose**
> Verbose output for debugging

**-q**, **--quiet**
> Quiet operation

**-w**, **--output-wav**
> Output WAV format (default)

**-a**, **--output-aiff**
> Output AIFF format

**-r**, **--output-raw**
> Output raw 16-bit PCM

**-R**, **--output-raw-big-endian**
> Output raw big-endian PCM

**-A**, **--analyze-drive**
> Analyze drive behavior

**-z**, **--never-skip**
> Never skip failed reads

# SPAN FORMAT

**N**: Track N

**N-M**: Tracks N through M

**N-**: Track N to end

**-M**: Beginning to track M

# PROGRESS SYMBOLS

**:-)** Normal operation, low jitter

**:-|** Considerable jitter

**:-(** Scratch detected

**;-(** Gave up correction

**:^D** Finished

# CAVEATS

Requires CDDA-capable drive. Works best with Accurate Stream drives that don't cache audio. Scratched discs may cause long read times.

# SEE ALSO

[abcde](/man/abcde)(1), [lame](/man/lame)(1), [flac](/man/flac)(1)
