# TLDR

**Rip a CD** to the default format (usually Ogg Vorbis)

```abcde```

**Rip a CD** to MP3 format

```abcde -o mp3```

**Rip a CD** to FLAC format

```abcde -o flac```

**Rip to multiple formats** simultaneously

```abcde -o flac,mp3,ogg```

**Rip using multiple CPU cores** for faster encoding

```abcde -j [4]```

**Rip in non-interactive mode** (no prompts)

```abcde -N```

**Rip specific tracks** from a CD

```abcde [1] [3] [5]```

**Rip from a specific CD device**

```abcde -d [/dev/sr0]```

# SYNOPSIS

**abcde** [_options_] [_tracks_]

# PARAMETERS

**-o** _format_
> Output format: mp3, ogg, flac, opus, m4a, wav, spx, mpc, mka, wv, ape, mp2, tta, aiff

**-d** _device_
> Specify CD device (default: /dev/cdrom)

**-j** _n_
> Run n encoding processes simultaneously (for multi-core systems)

**-a** _actions_
> Specify actions: cddb, read, normalize, encode, tag, move, replaygain, playlist, clean

**-N**
> Non-interactive mode; never prompt for input

**-n**
> Skip CDDB lookup; use generic track names

**-1**
> Encode entire CD as a single track

**-c** _file_
> Use specified configuration file

**-C** _discid_
> Use specified CDDB disc ID for lookup

**-p**
> Pad track numbers with leading zeros

**-P**
> Use Unix pipes for encoding (reduces disk usage)

**-r** _host_
> Remote ripping from specified host

**-S** _speed_
> Set CD drive read speed

**-t** _n_
> Start numbering tracks from n

**-T** _n_
> Same as -t but also modifies playlist

**-x**
> Eject CD after ripping completes

**-w** _comment_
> Add comment to encoded files

**-W** _n_
> Set disc number for multi-disc albums

**-k**
> Keep wav files after encoding

**-l**
> Use low disk space mode

**-V**
> Show version information

**-h**
> Display help message

# DESCRIPTION

**abcde** (A Better CD Encoder) is a shell script that automates the process of ripping audio CDs and encoding them to various compressed formats. It handles the entire workflow from reading the disc to tagging the final files.

The tool queries online databases (CDDB, MusicBrainz) to automatically retrieve track names, artist information, and album details. It uses backend programs like **cdparanoia** for secure ripping and encoders like **lame**, **oggenc**, **flac**, and **opusenc** for compression.

Multiple output formats can be generated in a single pass, and the encoding can be parallelized across multiple CPU cores using the **-j** option. Configuration is managed through **/etc/abcde.conf** or **~/.abcde.conf**, allowing customization of encoder settings, output paths, and naming conventions.

# CAVEATS

Requires backend programs for ripping (cdparanoia or cdda2wav) and encoding (lame for MP3, oggenc for Ogg, flac for FLAC, etc.) to be installed separately. CDDB lookups require network connectivity. Some encoders like lame may need to be installed from non-free repositories due to patent considerations.

# HISTORY

**abcde** was created by **Robert Woodcock** in **1998** as a simple way to automate CD ripping on Linux systems. The name stands for "A Better CD Encoder," reflecting its goal of simplifying what was previously a multi-step manual process. It has been actively maintained and expanded to support modern formats like Opus and AAC while remaining a pure shell script.

# SEE ALSO

[cdparanoia](/man/cdparanoia)(1), [lame](/man/lame)(1), [flac](/man/flac)(1), [oggenc](/man/oggenc)(1), [opusenc](/man/opusenc)(1), [cd-discid](/man/cd-discid)(1)
