# TAGLINE

download tool for Deezer music streaming service

# TLDR

**Download a track** by URL

```deemix [https://www.deezer.com/track/12345]```

**Download an album**

```deemix [https://www.deezer.com/album/12345]```

**Download a playlist**

```deemix [https://www.deezer.com/playlist/12345]```

**Specify output directory**

```deemix -p [/path/to/music] [url]```

**Download in specific** quality

```deemix -b [flac] [url]```

**Download multiple URLs** at once

```deemix [url1] [url2]```

**Use a portable config folder** in the current directory

```deemix --portable [url]```

# SYNOPSIS

**deemix** [_options_] _url_...

# PARAMETERS

_URL_
> Deezer URL for track, album, playlist, or artist. Multiple URLs can be given.

**-p**, **--path** _DIR_
> Output directory for downloads.

**-b**, **--bitrate** _QUALITY_
> Audio quality: 128, 320, flac.

**--portable**
> Create the config folder in the current directory instead of the user config directory.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/deemix/.arl**
> Stores the Deezer ARL authentication token.

**~/.config/deemix/config.json**
> Configuration file for download quality, folder structure, and other settings.

# DESCRIPTION

**deemix** is a download tool for Deezer music streaming service. It downloads tracks, albums, playlists, and artist discographies from Deezer with options for audio quality up to FLAC lossless format.

The tool requires authentication via an ARL token from a Deezer account; on first run it prompts for the token and stores it in the config folder. Downloaded files include metadata and album artwork. Output can be organized in configurable folder structures via config.json.

With the optional Spotify plugin configured, deemix can also resolve Spotify links to their Deezer equivalents.

# CAVEATS

Requires valid Deezer ARL token from active subscription. FLAC quality requires Deezer HiFi subscription. Downloading copyrighted content may violate terms of service. ARL tokens expire periodically.

# HISTORY

deemix was developed by **RemixDev** as a continuation of earlier Deezer download tools like deezloader. The original author stopped development in **2022**; community forks continue to maintain the codebase.

# SEE ALSO

[spotdl](/man/spotdl)(1), [youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1)

# RESOURCES

```[Source code](https://gitlab.com/RemixDev/deemix-py)```

<!-- verified: 2026-07-11 -->
