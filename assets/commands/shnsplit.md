# TAGLINE

Split audio files using CUE sheets

# TLDR

Split a **WAV file** using a CUE sheet

```shnsplit -f [path/to/file.cue] [path/to/file.wav]```

Split and output as **FLAC**

```shnsplit -f [path/to/file.cue] -o flac [path/to/file.flac]```

Split with **custom filename format**

```shnsplit -f [path/to/file.cue] -t "%n - %a - %t" [path/to/file.wav]```

Split input file into **equal-length segments**

```shnsplit -l [5:00] [path/to/file.wav]```

Split to a **specific directory**

```shnsplit -f [path/to/file.cue] -d [output_directory] [path/to/file.wav]```

Extract only **specific tracks** from a CUE sheet

```shnsplit -f [path/to/file.cue] -x [1-3,5] [path/to/file.wav]```

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

**-a** _str_
> Prefix output filenames with str (default: split-track)

**-z** _str_
> Postfix output filenames with str

**-c** _num_
> Start counting from num when naming output files (default: 0)

**-l** _len_
> Split input file into segments of length len

**-m** _str_
> Character manipulation string for filenames from CUE sheets (alternating from/to pairs)

**-n** _fmt_
> Specify file count output format (default: %02d)

**-x** _list_
> Extract specific tracks only (e.g., "2-6,9,11-13")

**-e** _len_
> Add lead-in from previous track

**-u** _len_
> Add lead-out from next track

**-i** _fmt_
> Specify input file format decoder and/or arguments

**-O** _val_
> Overwrite existing files: ask, always, or never

**-q**
> Suppress non-critical output (quiet mode)

**-w**
> Suppress warnings

**-D**
> Print debugging information

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

[cuebreakpoints](/man/cuebreakpoints)(1), [cuetag](/man/cuetag)(1), [flac](/man/flac)(1), [sox](/man/sox)(1), [ffmpeg](/man/ffmpeg)(1)
