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

```deemix -b [FLAC] [url]```

**Download from file** with URLs

```deemix [urls.txt]```

# SYNOPSIS

**deemix** [_options_] _url-or-file_

# PARAMETERS

_URL_
> Deezer URL for track, album, playlist, or artist.

_FILE_
> Text file containing URLs to download.

**-p**, **--path** _DIR_
> Output directory for downloads.

**-b**, **--bitrate** _QUALITY_
> Audio quality: 128, 320, FLAC.

**-t**, **--tracknum**
> Prefix files with track number.

**-a**, **--album**
> Create album folder structure.

**--arl** _TOKEN_
> Deezer ARL token for authentication.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/deemix/.arl**
> Stores the Deezer ARL authentication token.

**~/.config/deemix/config.json**
> Configuration file for download quality, folder structure, and other settings.

# DESCRIPTION

**deemix** is a download tool for Deezer music streaming service. It downloads tracks, albums, playlists, and artist discographies from Deezer with options for audio quality up to FLAC lossless format.

The tool requires authentication via an ARL (Access Request License) token from a Deezer account. Downloaded files include metadata and album artwork. Output can be organized in configurable folder structures.

deemix supports batch downloading through URL files and can be configured for automated music library management.

# CAVEATS

Requires valid Deezer ARL token from active subscription. FLAC quality requires Deezer HiFi subscription. Downloading copyrighted content may violate terms of service. ARL tokens expire periodically.

# HISTORY

deemix was developed as a continuation of earlier Deezer download tools. It emerged in the late **2010s** as part of the music downloading ecosystem, providing command-line access to Deezer's streaming library.

# SEE ALSO

[spotdl](/man/spotdl)(1), [youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1)
