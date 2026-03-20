# TAGLINE

Search and stream anime from the terminal

# TLDR

**Search** and watch anime

```ani-cli [anime_name]```

**Continue** watching from history

```ani-cli -c```

**Download** instead of streaming

```ani-cli -d [anime_name]```

Select specific **quality**

```ani-cli -q [720] [anime_name]```

Use **VLC** player

```ani-cli -v [anime_name]```

Watch **dubbed** version

```ani-cli --dub [anime_name]```

Watch specific **episode** range

```ani-cli -e [1-5] [anime_name]```

# SYNOPSIS

**ani-cli** [_-cdevN_] [_-q quality_] [_-e episodes_] [_--dub_] [_search_query_]

# DESCRIPTION

**ani-cli** is a command-line tool for searching and streaming anime from various sources. It provides a terminal-based interface for selecting anime, choosing episodes, and playing them in your preferred video player.

The tool scrapes anime streaming sites to find available content, presenting options in an interactive menu format.

# PARAMETERS

**-c**, **--continue**
> Continue watching from history

**-d**, **--download**
> Download instead of stream

**-e**, **--episode** _range_
> Specify episode number or range (e.g., 1-5)

**-q** _quality_
> Specify video quality (best, worst, 360, 480, 720, 1080). Default is best.

**-v**, **--vlc**
> Use VLC player instead of mpv

**-D**, **--delete**
> Delete watch history

**-s**, **--syncplay**
> Watch together with friends using Syncplay (mpv only)

**-N**, **--non-interactive**
> Disable the interactive menu

**-S** _index_, **--select-nth** _index_
> Select nth search result without prompting

**--dub**
> Play the dubbed version instead of subbed

**--skip**
> Use ani-skip to skip episode intros (mpv only)

**--no-detach**
> Don't detach the player (useful for in-terminal playback)

**--rofi**
> Use rofi instead of fzf for the interactive menu

**-U**, **--update**
> Update ani-cli

**-h**, **--help**
> Show help information

# CONFIGURATION

**ANI_CLI_MODE**
> Controls media mode: sub or dub. Default is sub.

**ANI_CLI_QUALITY**
> Controls video quality (best, worst, 360, 480, 720, 1080). Default is best.

**ANI_CLI_DOWNLOAD_DIR**
> Download directory. Default is the current directory.

**ANI_CLI_EXTERNAL_MENU**
> Set to 1 to use rofi dmenu instead of fzf. Default is 0.

**ANI_CLI_SKIP_INTRO**
> Set to 1 to use ani-skip for intro skipping (mpv only). Default is 0.

# CAVEATS

Depends on external streaming sources that may change or become unavailable. Quality and availability vary by title. Requires mpv or vlc for playback. May not work in all regions. Requires curl, sed, grep, and fzf as dependencies.

# HISTORY

**ani-cli** was created as a community project for anime fans who prefer command-line tools. It has been actively maintained with updates to support changing streaming sources.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [yt-dlp](/man/yt-dlp)(1), [fzf](/man/fzf)(1)
