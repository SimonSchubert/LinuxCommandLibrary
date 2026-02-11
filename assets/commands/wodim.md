# TAGLINE

Record data to CDs and DVDs

# TLDR

**Display** optical drives available

```wodim --devices```

**Record** an audio-only disc

```wodim dev=[/dev/optical_drive] -audio [track*.cdaudio]```

**Burn** a file to a disc and eject when done

```wodim -eject dev=[/dev/optical_drive] -data [file.iso]```

**Burn** a file using track-at-once mode

```wodim -tao dev=[/dev/optical_drive] -data [file.iso]```

# SYNOPSIS

**wodim** [_options_] _track_...

# PARAMETERS

**dev=_device_**
> Specify the recording device

**--devices**
> Scan for available drives

**-data**
> Write data track

**-audio**
> Write audio track(s)

**-eject**
> Eject disc after recording

**-tao**
> Use track-at-once write mode

**-dao**
> Use disc-at-once write mode

**speed=_n_**
> Set recording speed

**-v**
> Verbose output

**-dummy**
> Simulate recording (dry run)

**blank=_type_**
> Blank a rewritable disc (fast, all)

# DESCRIPTION

**wodim** (Write Optical DIsk Media) records data to CDs and DVDs. It is a fork of cdrecord and is aliased as **cdrecord** on many systems.

The tool supports burning ISO images, audio CDs, and multi-session discs. It can also blank rewritable media and provides various write modes for different disc types.

# CAVEATS

Burning at high speeds may produce errors on some media. Some operations like blanking can cause data loss. Requires appropriate permissions for device access. Originally forked due to licensing issues with cdrecord.

# SEE ALSO

[genisoimage](/man/genisoimage)(1), [cdrdao](/man/cdrdao)(1), [growisofs](/man/growisofs)(1)
