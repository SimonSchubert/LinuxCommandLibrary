# TLDR

**Download a video**

```youtube-dl "[url]"```

**Download audio only** in best quality

```youtube-dl -x --audio-format mp3 "[url]"```

**List available formats** for a video

```youtube-dl -F "[url]"```

**Download a specific format**

```youtube-dl -f [format_code] "[url]"```

**Download a playlist**

```youtube-dl "[playlist_url]"```

**Download with custom filename** template

```youtube-dl -o "%(title)s.%(ext)s" "[url]"```

**Download subtitles**

```youtube-dl --write-sub --sub-lang [en] "[url]"```

**Resume a partial download**

```youtube-dl -c "[url]"```

# SYNOPSIS

**youtube-dl** [_options_] _url_ [_url ..._]

# PARAMETERS

**-f**, **--format** _format_
> Video format code. Use **-F** to list available formats.

**-F**, **--list-formats**
> List all available formats for the video.

**-o**, **--output** _template_
> Output filename template with variables like %(title)s, %(ext)s.

**-x**, **--extract-audio**
> Extract audio track only.

**--audio-format** _format_
> Audio format for extraction: mp3, aac, flac, wav, etc.

**--audio-quality** _quality_
> Audio quality: 0 (best) to 9 (worst), or specific bitrate.

**-a**, **--batch-file** _file_
> Read URLs from a file (one per line).

**-c**, **--continue**
> Resume partially downloaded files.

**-i**, **--ignore-errors**
> Continue on errors (useful for playlists).

**--playlist-start** _num_
> Start playlist at video number.

**--playlist-end** _num_
> End playlist at video number.

**--write-sub**
> Download subtitles.

**--sub-lang** _langs_
> Subtitle languages to download.

**-j**, **--dump-json**
> Print video info as JSON without downloading.

**-v**, **--verbose**
> Print debug information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**youtube-dl** is a command-line program to download videos from YouTube and hundreds of other video platforms. It supports playlists, channels, and individual videos, with options for format selection, audio extraction, and subtitle downloading.

The output filename can be customized using templates with metadata variables. Configuration options can be stored in **~/.config/youtube-dl/config** or **/etc/youtube-dl.conf** for persistent settings.

The tool requires Python 2.6+ or 3.2+ and works on Linux, macOS, and Windows.

# CAVEATS

youtube-dl development has slowed significantly. Consider using **yt-dlp**, an actively maintained fork with more features, better performance, and support for more sites. Some sites may block youtube-dl or require cookies/authentication for access.

# HISTORY

youtube-dl was created in **2006** by Ricardo Garcia and has since become one of the most popular command-line video downloaders. The project moved to GitHub and gained widespread adoption. Due to a DMCA takedown in **October 2020** (later reversed), and slow development pace, the community fork **yt-dlp** emerged in **2021** and has become the recommended alternative.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [streamlink](/man/streamlink)(1)
