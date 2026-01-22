# TLDR

**Search** with thumbnails

```ytfzf -t [search_pattern]```

Play **audio** in loop

```ytfzf -m -a -l [search_pattern]```

**Download** from history

```ytfzf -d --choose-from-history```

Play **all** audio results

```ytfzf -m -A [search_pattern]```

Show **trending** videos

```ytfzf --trending --ext-menu [search_pattern]```

Search **PeerTube**

```ytfzf --peertube [search_pattern]```

# SYNOPSIS

**ytfzf** [_OPTIONS_] [_SEARCH_]

# PARAMETERS

**-t, --show-thumbnails**
> Show thumbnail previews

**-m, --audio-only**
> Play only audio

**-a, --auto-select**
> Auto-select first result

**-l, --loop**
> Loop playback

**-d, --download**
> Download instead of play

**-A, --select-all**
> Select all results

**--trending**
> Show trending videos

**--peertube**
> Search PeerTube instead of YouTube

**--ext-menu**
> Use external menu program

# DESCRIPTION

**ytfzf** is a POSIX shell script for finding and playing videos from YouTube and other platforms. It uses fzf for selection and mpv for playback.

The tool supports searching, streaming, and downloading videos with thumbnail previews.

# CAVEATS

Requires fzf, mpv, and yt-dlp or youtube-dl. Thumbnail preview requires ueberzug or similar.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [youtube-dl](/man/youtube-dl)(1), [mpv](/man/mpv)(1)
