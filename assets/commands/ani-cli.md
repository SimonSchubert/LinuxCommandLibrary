# TLDR

**Search** and watch anime

```ani-cli [anime_name]```

**Continue** watching last anime

```ani-cli -c```

Download instead of **streaming**

```ani-cli -d [anime_name]```

Select specific **quality**

```ani-cli -q [720p] [anime_name]```

Use **VLC** player

```ani-cli -v [anime_name]```

# SYNOPSIS

**ani-cli** [_-c_] [_-d_] [_-q quality_] [_-v_] [_search_query_]

# DESCRIPTION

**ani-cli** is a command-line tool for searching and streaming anime from various sources. It provides a terminal-based interface for selecting anime, choosing episodes, and playing them in your preferred video player.

The tool scrapes anime streaming sites to find available content, presenting options in an interactive menu format.

# PARAMETERS

**-c**, **--continue**
> Continue watching from history

**-d**, **--download**
> Download instead of stream

**-q** _quality_
> Specify video quality (360p, 480p, 720p, 1080p)

**-v**, **--vlc**
> Use VLC player instead of mpv

**-H**, **--history**
> Show watch history

**-s** _source_
> Select source site

**-U**, **--update**
> Update ani-cli

**-h**, **--help**
> Show help information

# CAVEATS

Depends on external streaming sources that may change or become unavailable. Quality and availability vary by title. Requires mpv or vlc for playback. May not work in all regions.

# HISTORY

**ani-cli** was created as a community project for anime fans who prefer command-line tools. It has been actively maintained with updates to support changing streaming sources.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [youtube-dl](/man/youtube-dl)(1)
