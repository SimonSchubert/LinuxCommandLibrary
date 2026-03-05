# TAGLINE

Text-based audio player and music visualizer

# TLDR

**Play a music file**

```ocp [path/to/file]```

**Play a directory of files**

```ocp [path/to/directory]```

# SYNOPSIS

**ocp** [_options_] [_files_...]

# DESCRIPTION

**opencubicplayer** (command: **ocp**) is a text-based audio player and music visualizer supporting tracked music formats (MOD, XM, S3M, IT), chiptunes, SID, MP3, OGG, FLAC, and more. It features FFT analyzer, oscilloscope, phase viewer, and channel viewer visualizations.

Originally from the demoscene era on DOS, the Unix/Linux fork maintains the classic text-mode interface with modern codec support.

# CAVEATS

Some visualization modes require a terminal with color support. Tracked format playback quality depends on available decoder libraries.

# HISTORY

The Unix fork of **Open Cubic Player** is maintained by **Stian Sebastian Skjelstad** (mywave82) and is written in **C**.

# SEE ALSO

[cmus](/man/cmus)(1), [mpv](/man/mpv)(1), [musikcube](/man/musikcube)(1)
