# TLDR

**Add audio track to video**

```mp4box -add [audio.m4a] [video.mp4]```

**Merge multiple MP4 files**

```mp4box -cat [file1.mp4] -cat [file2.mp4] -new [output.mp4]```

**Extract specific track**

```mp4box -raw [1] [input.mp4]```

**Add subtitles to video**

```mp4box -add [subtitles.srt] [video.mp4]```

**Show file information**

```mp4box -info [file.mp4]```

**Split file at intervals**

```mp4box -split [60] [input.mp4]```

**Fragment for DASH streaming**

```mp4box -dash [4000] [input.mp4]```

**Remove specific track**

```mp4box -rem [2] [input.mp4]```

# SYNOPSIS

**mp4box** [_-add file_] [_-cat file_] [_-info_] [_-dash duration_] [_options_] _file_

# PARAMETERS

**-add** _file_[:_opts_]
> Add media to file (import track).

**-cat** _file_
> Concatenate file.

**-rem** _trackID_
> Remove track by ID.

**-raw** _trackID_
> Extract raw track data.

**-info** [_trackID_]
> Display file or track information.

**-new** _file_
> Create new output file.

**-out** _file_
> Specify output file name.

**-split** _seconds_
> Split file at time intervals.

**-split-size** _KB_
> Split file by size.

**-dash** _ms_
> Create DASH segments with duration in ms.

**-frag** _ms_
> Fragment file with duration in ms.

**-rap**
> Split only at random access points (keyframes).

**-flat**
> Store in flat mode (non-interleaved).

**-inter** _ms_
> Interleave with duration in ms.

**-tmp** _dir_
> Use alternate temp directory.

**-nosys**
> Remove system track info.

**-fps** _rate_
> Force frame rate for raw imports.

**-lang** _code_
> Set track language.

# DESCRIPTION

**MP4Box** is a multimedia packager from the GPAC framework. It manipulates MP4/ISO base media files - adding, removing, and editing tracks without re-encoding.

The tool handles muxing (combining audio, video, subtitles into one container), demuxing (extracting tracks), and file manipulation (splitting, concatenating, fragmenting). It supports numerous formats for import including H.264, H.265, AAC, MP3, SRT, and WebVTT.

DASH (Dynamic Adaptive Streaming over HTTP) support creates segmented files for adaptive streaming. This fragments content into small chunks with a manifest file, enabling players to switch quality based on bandwidth.

For streaming preparation, MP4Box can fragment files for HTTP progressive download, add hint tracks for RTSP streaming, and create initialization segments for live streaming workflows.

Metadata editing covers MP4 tags, chapter markers, and track properties. The tool can also encrypt content with various DRM schemes.

# CAVEATS

Does not transcode - only repackages streams. Some operations modify files in place. Complex command syntax for advanced operations. DASH output requires proper web server configuration. Large files may need significant temporary storage. Some format combinations require specific codec compatibility.

# HISTORY

**MP4Box** is part of **GPAC**, an open-source multimedia framework started by **Jean Le Feuvre** at **ENST Paris** around **2000**. Originally focused on MPEG-4 research, GPAC expanded to support modern streaming formats. MP4Box became widely used for DASH content preparation and is relied upon by streaming services and content creators for media packaging.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mkvmerge](/man/mkvmerge)(1), [mediainfo](/man/mediainfo)(1), [handbrake](/man/handbrake)(1)
