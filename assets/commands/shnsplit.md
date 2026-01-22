# TLDR

Split a **WAV file** using a CUE sheet

```shnsplit -f [path/to/file.cue] [path/to/file.wav]```

Split and output as **FLAC**

```shnsplit -f [path/to/file.cue] -o flac [path/to/file.flac]```

Split with **custom filename format**

```shnsplit -f [path/to/file.cue] -t "%n - %a - %t" [path/to/file.wav]```

Show **supported formats**

```shnsplit -a```

Split to a **specific directory**

```shnsplit -f [path/to/file.cue] -d [output_directory] [path/to/file.wav]```

**Dry run** to preview split points

```shnsplit -f [path/to/file.cue] -n [path/to/file.wav]```

# SYNOPSIS

**shnsplit** [_OPTIONS_] [_file_]

**shntool split** [_OPTIONS_] [_file_]

# PARAMETERS

**-f** _file_
> Read split points from CUE sheet or split point file

**-o** _format_
> Output format (wav, flac, ape, shn, wv)

**-d** _dirname_
> Output directory for split files

**-t** _fmt_
> Name files using CUE fields (%n=track, %a=album, %t=title, %p=performer)

**-a** _prefix_
> Set custom filename prefix (default: split-track)

**-c** _num_
> Start track numbering from specified value (default: 1)

**-n** _fmt_
> Customize track number format (default: %02d)

**-x** _list_
> Extract specific tracks only (e.g., "2-6,9,11-13")

**-e** _len_
> Add lead-in from previous track

**-u** _len_
> Add lead-out from next track

**-h**
> Display help information

# DESCRIPTION

**shnsplit** splits a single large audio file into multiple individual track files using split points defined in a CUE sheet. It is part of the **shntool** suite and supports various lossless audio formats including WAV, FLAC, APE, and Shorten.

Split points can be specified in several formats: bytes, m:ss (minutes:seconds), m:ss.ff (CD frames, 75 per second), or m:ss.nnn (milliseconds). The tool is commonly used to split CD rips, live recordings, or continuous mixes into individual tracks.

# CAVEATS

Requires appropriate encoders/decoders (flac, wavpack, mac) installed for non-WAV formats. Split accuracy depends entirely on CUE sheet correctness. Does not transfer metadata to output files; use **cuetag.sh** for tagging after splitting. Output files are created in current directory unless **-d** specifies otherwise.

# HISTORY

**shntool** and **shnsplit** were developed by **Jason Jordan** as part of the shntool audio processing suite. The project began in the early **2000s** to provide Unix/Linux users with tools for handling Shorten (.shn) files, which were popular for lossless audio distribution. The suite expanded to support multiple formats and remains a standard tool for audio file manipulation.

# SEE ALSO

[cuebreakpoints](/man/cuebreakpoints)(1), [cuetag](/man/cuetag)(1), [flac](/man/flac)(1), [sox](/man/sox)(1)
