# TAGLINE

Linux video stream processing tool

# TLDR

**Transcode a video file with a specific export module**

```transcode -i [input.avi] -y [xvid] -o [output.avi]```

**Transcode with explicit import and export modules**

```transcode -i [input.vob] -x [vob] -y [xvid,lame] -o [output.avi]```

**Extract audio to a separate file**

```transcode -i [video.avi] -y null,tcaud -m [audio.mp3]```

**Resize video using filtered zoom**

```transcode -i [input.avi] -Z [640x480] -y [xvid] -o [output.avi]```

**Set video bitrate and encode a specific frame range**

```transcode -i [input.avi] -w [1500] -c [0-5000] -y [xvid] -o [output.avi]```

**Crop 16 pixels from top and bottom of the video**

```transcode -i [input.avi] -j [16,0] -y [xvid] -o [output.avi]```

# SYNOPSIS

**transcode** **-i** _input_ [**-o** _output_] [**-y** _export_module_] [_options_]

# PARAMETERS

**-i** _FILE_
> Input file (required). The only mandatory option.

**-o** _FILE_
> Output file.

**-x** _MODULE_
> Import module (e.g., vob, dvd, raw). Determines how input is decoded.

**-y** _MODULE_[,_AMODULE_]
> Export module for video, optionally with a separate audio export module (e.g., xvid,lame).

**-Z** _WxH_[,_MODE_]
> Resize video using zoom. Append "fast" for fast zoom mode (e.g., 640x480,fast).

**-j** _TOP_,_LEFT_[,_BOTTOM_,_RIGHT_]
> Crop pixels from the image borders. Two values are expanded symmetrically.

**-w** _BITRATE_
> Video encoder bitrate in kbps.

**-b** _BITRATE_
> Audio encoder bitrate in kbps.

**-m** _FILE_
> Write audio output to a separate file.

**-p** _FILE_
> Read audio from an external file instead of the main input.

**-c** _RANGE_
> Encode only the specified frame range (e.g., 0-5000 or 0:05:00-0:10:00).

**-s** _FACTOR_
> Adjust audio volume by the given factor (e.g., 4.47 to increase).

**-R** _N_[,_FILE_]
> Multi-pass encoding. Use -R 1 for first pass and -R 2 for second pass.

**-T** _TITLE_
> Select a DVD title to process.

**--multi_input**
> Enable batch processing of multiple input files.

# DESCRIPTION

**transcode** is a Linux video stream processing tool for converting between video and audio formats. It uses a modular architecture with separate import and export modules for different codecs and containers.

The tool supports filtering operations including resizing, cropping, deinterlacing, and volume adjustment. It can extract audio tracks separately and perform multi-pass encoding for better quality. Transcode has been largely superseded by **FFmpeg**, which offers broader format support and more active development.

# CAVEATS

Legacy tool no longer actively developed. FFmpeg is generally preferred for new projects. The modular architecture means available codecs depend on which modules are installed. The only mandatory option is **-i**; all others are discretionary.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mencoder](/man/mencoder)(1), [mplayer](/man/mplayer)(1)
