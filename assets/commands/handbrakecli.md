# TLDR

**Convert a video** using a preset

```HandBrakeCLI -i [input.mkv] -o [output.mp4] --preset="[Fast 1080p30]"```

**List available presets**

```HandBrakeCLI --preset-list```

**Convert with specific video codec**

```HandBrakeCLI -i [input.mkv] -o [output.mp4] -e [x264]```

**Set video quality** (lower = better, 18-28 typical)

```HandBrakeCLI -i [input.mkv] -o [output.mp4] -q [22]```

**Convert a DVD** or Blu-ray directory

```HandBrakeCLI -i [/path/to/VIDEO_TS] -o [output.mp4] --preset="[Fast 1080p30]"```

**Extract a specific title** from disc

```HandBrakeCLI -i [/dev/dvd] -t [1] -o [output.mp4]```

**Convert with audio and subtitle** selection

```HandBrakeCLI -i [input.mkv] -o [output.mp4] -a [1,2] -s [1]```

**Scan input** to see titles and tracks

```HandBrakeCLI -i [input.mkv] --scan```

# SYNOPSIS

**HandBrakeCLI** [_-i input_] [_-o output_] [_--preset name_] [_-e encoder_] [_-q quality_] [_options_]

# PARAMETERS

**-i**, **--input** _source_
> Input file, directory, or device.

**-o**, **--output** _file_
> Output file path.

**--preset** _name_
> Use named preset (see --preset-list).

**--preset-list**
> List available presets.

**-t**, **--title** _number_
> Select title number (for DVDs/Blu-rays).

**--scan**
> Scan input without encoding.

**-e**, **--encoder** _codec_
> Video encoder: x264, x265, nvenc_h264, nvenc_h265, vce_h264, vce_h265, svt_av1.

**-q**, **--quality** _RF_
> Constant quality (RF value, lower = better).

**-b**, **--vb** _kbps_
> Video bitrate in kbps.

**-r**, **--rate** _fps_
> Frame rate.

**-a**, **--audio** _tracks_
> Audio track(s) to include (comma-separated).

**-E**, **--aencoder** _codec_
> Audio encoder: copy, aac, ac3, mp3, opus, flac.

**-s**, **--subtitle** _tracks_
> Subtitle track(s) to include.

**--crop** _top:bottom:left:right_
> Crop values.

**-w**, **--width** _pixels_
> Output width.

**-l**, **--height** _pixels_
> Output height.

**--two-pass**
> Enable two-pass encoding.

# DESCRIPTION

**HandBrakeCLI** is the command-line interface for HandBrake, a powerful open-source video transcoder. It converts videos between formats, rips DVDs and Blu-rays, and can significantly reduce file sizes while maintaining quality.

The tool uses presets to simplify common encoding scenarios. Built-in presets target specific devices (Apple TV, Android, Roku) or quality levels (Fast 1080p30, HQ 1080p30 Surround). Custom presets can be exported from the GUI and imported into CLI workflows.

For quality-based encoding, the RF (Rate Factor) value controls the quality-to-size tradeoff. For x264/x265, values of 18-22 provide high quality, 23-28 provide smaller files with acceptable quality. Lower numbers mean higher quality and larger files.

HandBrake supports hardware acceleration on supported systems: NVIDIA NVENC, AMD VCE/VCN, Intel QuickSync, and Apple VideoToolbox. Hardware encoders are faster but may produce larger files at equivalent quality.

Audio and subtitle tracks can be selected, converted, or passed through. Multiple audio tracks can be included with different encodings. Subtitles can be burned in or kept as soft subs.

# CAVEATS

Cannot output to some patent-encumbered formats. DVD/Blu-ray decryption requires libdvdcss. Quality settings don't translate directly between encoders. Hardware encoding availability depends on GPU and drivers. Two-pass encoding doubles processing time.

# HISTORY

**HandBrake** was originally created by Eric Petit (titer) in **2003** as "MediaFork" for BeOS, then renamed and continued on other platforms. The project was revived by the open-source community after a period of inactivity. It has become one of the most popular open-source video transcoders, known for its balance of features and usability.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [mkvmerge](/man/mkvmerge)(1), [mediainfo](/man/mediainfo)(1)
