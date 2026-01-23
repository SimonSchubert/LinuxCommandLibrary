# TLDR

**Burn an ISO image** to CD/DVD

```cdrecord -v dev=[/dev/sr0] [image.iso]```

**Burn with specific speed**

```cdrecord -v speed=[16] dev=[/dev/sr0] [image.iso]```

**Burn audio CD** from WAV files

```cdrecord -v -audio dev=[/dev/sr0] [track1.wav] [track2.wav]```

**Scan for available devices**

```cdrecord -scanbus```

**Erase a CD-RW**

```cdrecord -v blank=fast dev=[/dev/sr0]```

**Burn multi-session disc**

```cdrecord -v -multi dev=[/dev/sr0] [image.iso]```

**Test burn** without writing (simulation)

```cdrecord -v -dummy dev=[/dev/sr0] [image.iso]```

**Burn with buffer underrun protection**

```cdrecord -v driveropts=burnfree dev=[/dev/sr0] [image.iso]```

# SYNOPSIS

**cdrecord** [_options_] _dev=device_ [_track-options_] _track_...

# DESCRIPTION

**cdrecord** is a command-line tool for burning data to CD, DVD, and Blu-ray discs. It supports various disc formats including CD-R, CD-RW, DVD-R, DVD+R, DVD-RW, DVD+RW, and dual-layer variants.

The tool can write ISO images, audio CDs from WAV files, and multi-session discs. It includes features like burn-free (buffer underrun protection), FIFO buffering, and SCSI/ATAPI device support.

Note that on many Linux systems, cdrecord has been replaced or supplemented by wodim from the cdrkit project, which provides compatible functionality.

# PARAMETERS

**dev=** _device_
> Recording device (e.g., /dev/sr0 or SCSI address).

**speed=** _n_
> Recording speed multiplier.

**-v**
> Verbose output.

**-audio**
> Write audio CD from WAV files.

**-data**
> Write data track (default).

**-multi**
> Enable multi-session recording.

**-dummy**
> Simulation mode, don't actually write.

**-eject**
> Eject disc after recording.

**blank=** _type_
> Blank a CD-RW (fast, all, session).

**-scanbus**
> Scan for available SCSI devices.

**-toc**
> Show table of contents.

**-checkdrive**
> Check drive capabilities.

**driveropts=** _opts_
> Driver-specific options (burnfree).

**fs=** _size_
> FIFO buffer size.

**gracetime=** _secs_
> Wait before starting burn.

# CAVEATS

Requires write access to the optical device (usually root or cdrom group membership). Buffer underruns can ruin discs without burnfree support. CD-R discs cannot be erased. Audio CDs require specific WAV format (44.1kHz, 16-bit, stereo). Device naming varies by system.

# HISTORY

**cdrecord** was developed by **J\u00f6rg Schilling** starting in **1995**. It became the standard Unix CD burning tool. In **2006**, licensing disputes led to the creation of **cdrkit**, a fork that includes **wodim** as a cdrecord replacement. Most Linux distributions switched to cdrkit/wodim, though some still include original cdrecord. The tools remain largely command-compatible.

# SEE ALSO

[wodim](/man/wodim)(1), [genisoimage](/man/genisoimage)(1), [mkisofs](/man/mkisofs)(1), [growisofs](/man/growisofs)(1)
