# TAGLINE

Terminal YouTube search and playback client

# TLDR

**Search videos**

```youtube-viewer [search query]```

**Play video URL**

```youtube-viewer [https://youtube.com/watch?v=...]```

**Audio only** (no video)

```youtube-viewer -n [query]```

**Download video**

```youtube-viewer -d [query]```

**Play with specific player**

```youtube-viewer --player=[vlc] [query]```

**Search for channels**

```youtube-viewer -sc [channel_name]```

**Show trending** videos

```youtube-viewer --trending```

**List uploads** from a channel

```youtube-viewer -u [channel_name]```

**Search playlists**

```youtube-viewer -sp [query]```

# SYNOPSIS

**youtube-viewer** [_options_] [_query_|_URL_]

# PARAMETERS

**-n**, **--novideo**
> Audio-only playback (no video).

**-d**, **--download**
> Download video instead of streaming.

**--player** _PLAYER_
> Specify video player (e.g., mpv, vlc, mplayer).

**-sv**, **--search-videos**
> Search for YouTube videos (default mode).

**-sc**, **--search-channels**
> Search for YouTube channels.

**-sp**, **--search-playlists**
> Search for playlists.

**-u**, **--uploads** _NAME_
> List videos uploaded by a channel/user.

**--trending**
> Show trending videos.

**-r**, **--resolution** _RES_
> Set video resolution (e.g., best, 1080p, 720p).

**-f**, **--fullscreen**
> Enable fullscreen playback.

**-i**, **--info**
> Display video information.

**-S**, **--subscriptions**
> Show subscribed channels.

# DESCRIPTION

**youtube-viewer** is a command-line client for searching, streaming, and downloading YouTube videos directly from the terminal. It queries the YouTube API, presents numbered search results, and launches your chosen media player for playback.

Multiple video players are supported including mpv, VLC, and MPlayer, configurable with the **--player** option. Audio-only mode (**-n** / **--novideo**) streams just the audio track, reducing bandwidth usage. The **-d** flag downloads videos locally instead of streaming them.

Channel browsing (**-u**) lists uploads from specific creators, **-sc** searches for channels, and **--trending** shows currently trending videos. Resolution can be controlled with **-r** and fullscreen playback enabled with **-f**. Playlist support is available with **-sp** for searching and **--pid** for playing by playlist ID.

# CAVEATS

Requires a valid YouTube Data API v3 key. May break with YouTube API changes. A supported video player (mpv, vlc, or mplayer) must be installed. The alternative **pipe-viewer** fork works without an API key by using Invidious instances.

# HISTORY

**youtube-viewer** was created by **trizen** as a lightweight command-line YouTube client written in Perl. It provides terminal-based search, streaming, and downloading of YouTube content using the YouTube Data API v3.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1)
