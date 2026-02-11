# TAGLINE

Pipe live streams to media players

# TLDR

**Open stream in default player**

```streamlink [URL] [best]```

**Open stream in specific player**

```streamlink --player [mpv] [URL] [best]```

**List available qualities**

```streamlink [URL]```

**Record stream to file**

```streamlink -o [output.ts] [URL] [best]```

**Open with specific quality**

```streamlink [URL] [720p]```

**Open Twitch stream**

```streamlink [twitch.tv/streamername] [best]```

**Pass player arguments**

```streamlink --player [mpv] --player-args "[--no-border]" [URL] [best]```

# SYNOPSIS

**streamlink** [_--player player_] [_-o file_] [_options_] _URL_ [_quality_]

# PARAMETERS

**-p** _PLAYER_, **--player** _PLAYER_
> Player to use.

**-a** _ARGS_, **--player-args** _ARGS_
> Arguments for player.

**-o** _FILE_, **--output** _FILE_
> Record to file.

**-r** _FILE_, **--record** _FILE_
> Record while also playing.

**-f**, **--force**
> Overwrite output file.

**--default-stream** _QUALITY_
> Default stream quality.

**--stream-url**
> Print stream URL only.

**--json**
> Output as JSON.

**--retry-streams** _SEC_
> Retry if stream offline.

**--retry-max** _NUM_
> Maximum retry attempts.

**--retry-open** _NUM_
> Retry opening stream.

**--hls-live-edge** _SEG_
> Segments from live edge.

**--twitch-disable-ads**
> Disable Twitch ads.

**--twitch-low-latency**
> Enable low latency mode.

**--http-header** _HEADER_
> Add HTTP header.

**--http-cookie** _COOKIE_
> Add HTTP cookie.

# DESCRIPTION

**streamlink** extracts streams from websites and pipes them to media players. It bypasses browser-based players, enabling use of lightweight, efficient players like mpv or VLC.

Quality selection uses identifiers like best, worst, or specific resolutions (720p, 1080p60). Listing qualities shows available options for a stream. Fallback selection (720p,480p,best) tries multiple qualities.

Recording saves streams to files. Combined with a player, streams can be both watched and archived. Output format depends on stream type (usually TS or MP4).

Platform support includes Twitch, YouTube, and hundreds of other sites. Plugin architecture enables community-contributed support for additional platforms.

Twitch-specific features include ad skipping, low-latency mode, and OAuth authentication for subscriber streams. Configuration can be saved in ~/.config/streamlink/config.

HTTP options enable accessing streams behind authentication or with custom headers, handling various DRM and geo-restriction scenarios.

# CONFIGURATION

**~/.config/streamlink/config**
> Main configuration file for default options, player settings, and plugin parameters.

**~/.config/streamlink/plugins/**
> Directory for custom or third-party stream extraction plugins.

# CAVEATS

Site support depends on plugins and may break with site changes. Some sites block third-party access. DRM content usually not supported. Quality options vary by platform. Ad blocking may violate ToS.

# HISTORY

**streamlink** is a fork of **livestreamer**, which was created around **2012**. After livestreamer's development stalled, streamlink forked in **2016** with active maintenance. The project supports an extensive list of streaming sites and continues community-driven development.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1), [mpv](/man/mpv)(1), [vlc](/man/vlc)(1)
