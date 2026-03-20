# TAGLINE

BBC iPlayer TV and radio downloader

# TLDR

**Search for programs**

```get_iplayer "[search term]"```

**Download a program**

```get_iplayer --get [index_number]```

**Download by PID**

```get_iplayer --pid [pid]```

**List TV programs**

```get_iplayer --type=tv "[search]"```

**List radio programs**

```get_iplayer --type=radio "[search]"```

**Set output directory**

```get_iplayer --output [/path/to/dir] --get [index]```

**Download in specific quality**

```get_iplayer --tvmode=best --get [index]```

# SYNOPSIS

**get_iplayer** [_options_] [_search_...]

# PARAMETERS

**--get** _index_
> Download by index number.

**--pid** _pid_
> Download by program PID.

**--type** _type_
> Media type (tv, radio, podcast).

**--output** _dir_
> Output directory.

**--tvmode** _mode_
> TV quality preference (fhd, hd, sd, web, mobile), comma-delimited in descending preference.

**--radiomode** _mode_
> Radio quality preference (high, std, med, low).

**--pvr**
> Run PVR scheduler.

**--refresh**
> Refresh program cache.

**--url** _URL_
> Record the PIDs from the specified iPlayer episode URLs.

**--subtitles**
> Download subtitles when available.

**--audio-only**
> Only download the audio stream for TV programmes (produces .m4a file).

**--file-prefix** _TEMPLATE_
> Filename prefix template (excluding directory and extension).

**--attempts** _N_
> Number of attempts to make or resume a failed connection.

# CONFIGURATION

**~/.get_iplayer/options**
> User preferences file for default options and settings.

**~/.get_iplayer/presets**
> Custom quality and recording presets.

# DESCRIPTION

**get_iplayer** downloads BBC iPlayer TV and radio programs from the BBC's streaming service. It provides search functionality across the iPlayer catalog, quality selection, and automated PVR-style scheduling for recording programs.

The tool can download both on-demand and live content, with support for subtitles and metadata. It maintains a local cache of available programs for faster searching and supports batch downloads.

Programs on iPlayer are typically available for 30 days after broadcast, though some content may have different availability windows based on BBC rights agreements.

# CAVEATS

Only works with BBC content and typically requires a UK IP address. Programs expire after 30 days on iPlayer (some content has different availability windows). Requires ffmpeg for downloading and converting streams.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1)

