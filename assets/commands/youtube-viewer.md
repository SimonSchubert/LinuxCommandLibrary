# TLDR

**Search videos**

```youtube-viewer [search query]```

**Play video URL**

```youtube-viewer [https://youtube.com/watch?v=...]```

**Audio only**

```youtube-viewer -n [query]```

**Download video**

```youtube-viewer -d [query]```

**Play with specific player**

```youtube-viewer --player=[vlc] [query]```

**Search channels**

```youtube-viewer -c [channel_name]```

**Show trending**

```youtube-viewer -t```

# SYNOPSIS

**youtube-viewer** [_-n_] [_-d_] [_--player player_] [_options_] _query_

# PARAMETERS

**-n**, **--non-interactive**
> Audio only.

**-d**, **--download**
> Download video.

**--player** _PLAYER_
> Video player.

**-c**, **--channel** _NAME_
> Search channel.

**-t**, **--trending**
> Trending videos.

**-r**, **--resolution** _RES_
> Video resolution.

**-f**, **--fullscreen**
> Fullscreen playback.

# DESCRIPTION

**youtube-viewer** searches and plays YouTube videos. It's a terminal-based YouTube client.

Search returns numbered results. Select to play.

Multiple players supported. MPV, VLC, MPlayer.

Download saves videos locally. Various formats.

Audio mode skips video. Lower bandwidth.

Channel browsing shows uploads. Explore creators.

# CAVEATS

Requires working YouTube API. May break with YouTube changes. Player must be installed.

# HISTORY

**youtube-viewer** was created as a command-line YouTube client. It provides terminal access to YouTube content.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1)
