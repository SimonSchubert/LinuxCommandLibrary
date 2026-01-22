# TLDR

**Convert** a binary CD image to ISO

```bchunk [path/to/image.bin] [path/to/image.cue] [path/to/output]```

Convert with **verbose mode**

```bchunk -v [path/to/image.bin] [path/to/image.cue] [path/to/output]```

Output audio files in **WAV format**

```bchunk -w [path/to/image.bin] [path/to/image.cue] [path/to/output]```

# SYNOPSIS

**bchunk** [_options_] _image.bin_ _image.cue_ _output_

# DESCRIPTION

**bchunk** converts CD images in BIN/CUE format to standard ISO 9660 images and audio tracks. It reads the CUE sheet to determine track layout and extracts each track to a separate file.

Data tracks are converted to ISO format, while audio tracks can be output as raw CDR audio or WAV files. The output files are named with the specified prefix and numbered sequentially.

# PARAMETERS

**-v**
> Verbose mode; display detailed progress information

**-w**
> Output audio tracks as WAV files instead of raw CDR

**-r**
> Raw mode; do not convert data tracks to ISO format

**-p**
> Use PSX (PlayStation) mode for certain disc types

**-s**
> Swap byte order in audio tracks

# CAVEATS

BIN files must match the layout described in the CUE sheet exactly. Multi-session discs may not convert correctly. Some protected or non-standard disc images may fail to convert.

# HISTORY

**bchunk** (BIN/CUE CHunK) was developed as a tool to convert proprietary CD image formats to standard formats usable by CD burning software and emulators.

# SEE ALSO

[cdrdao](/man/cdrdao)(1), [cue2toc](/man/cue2toc)(1), [wodim](/man/wodim)(1)
