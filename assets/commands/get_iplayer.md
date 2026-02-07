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
> Quality mode (best, good, worst).

**--radiomode** _mode_
> Radio quality mode.

**--pvr**
> Run PVR scheduler.

**--refresh**
> Refresh program cache.

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

Only works with BBC content and requires UK access. Programs expire after 30 days on iPlayer.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1)

