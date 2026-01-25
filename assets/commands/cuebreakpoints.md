# TLDR

**Extract breakpoints from a CUE sheet**

```cuebreakpoints [file.cue]```

**Output in samples format**

```cuebreakpoints --input-format samples [file.cue]```

**Prepend 2-second gaps**

```cuebreakpoints --prepend-gaps [file.cue]```

**Append gaps to previous track**

```cuebreakpoints --append-gaps [file.cue]```

**Output for use with shnsplit**

```cuebreakpoints [file.cue] | shnsplit -o flac [file.wav]```

# SYNOPSIS

**cuebreakpoints** [_options_] _file.cue_

# PARAMETERS

**--input-format** _format_
> Input time format: cue (default) or samples.

**--prepend-gaps**
> Prepend track gaps to each track.

**--append-gaps**
> Append gaps to previous track (except track 1 pregap).

**--split-gaps**
> Split gaps between tracks.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**cuebreakpoints** reads a CUE sheet file and outputs the track split points in a format suitable for audio splitting tools like **shnsplit**. CUE sheets describe how an audio CD is divided into tracks, including exact frame positions.

The output is a list of timestamps in mm:ss.ff format (minutes:seconds.frames at 75 fps) representing where each track begins. This information is piped to splitting tools to divide a single audio file into individual tracks.

Gap handling options control how the silence between tracks is distributed. Different ripping/encoding workflows may require gaps prepended, appended, or split between adjacent tracks.

# EXAMPLE WORKFLOW

```bash
# Extract breakpoints and split FLAC file
cuebreakpoints album.cue | shnsplit -o flac album.flac

# Tag the resulting files
cuetag album.cue split-track*.flac
```

# CAVEATS

CUE sheet must match the audio file exactly (sample-accurate). Incorrect CUE files produce wrong splits. Only works with single-file images; multi-file CUEs don't need splitting. The cuetools package must be installed.

# HISTORY

cuebreakpoints is part of **cuetools**, a set of utilities for working with CUE sheets created by **Svend Sorensen**. The tools were developed in the **mid-2000s** to help process CD images, particularly for converting single-file rips (common with Exact Audio Copy) into individual tracks while preserving accurate metadata.

# SEE ALSO

[cuetag](/man/cuetag)(1), [cueprint](/man/cueprint)(1), [shnsplit](/man/shnsplit)(1), [flac](/man/flac)(1)
