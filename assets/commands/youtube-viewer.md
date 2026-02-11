# TAGLINE

Terminal YouTube search and playback client

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

**youtube-viewer** is a command-line client for searching, streaming, and downloading YouTube videos directly from the terminal. It queries the YouTube API, presents numbered search results, and launches your chosen media player for playback.

Multiple video players are supported including mpv, VLC, and MPlayer, configurable with the **--player** option. Audio-only mode (**-n**) streams just the audio track, reducing bandwidth usage. The **-d** flag downloads videos locally instead of streaming them.

Channel browsing (**-c**) lists uploads from specific creators, and **-t** shows currently trending videos. Resolution can be controlled with **-r** and fullscreen playback enabled with **-f**.

# CAVEATS

Requires working YouTube API. May break with YouTube changes. Player must be installed.

# HISTORY

**youtube-viewer** was created as a command-line YouTube client. It provides terminal access to YouTube content.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1)
