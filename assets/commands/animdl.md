# TLDR

**Search** for anime

```animdl search "[anime name]"```

**Stream** anime

```animdl stream "[anime name]"```

**Download** anime

```animdl download "[anime name]" -d [./downloads]```

Stream specific **episode range**

```animdl stream "[anime name]" -r [1-10]```

Use specific **provider**

```animdl stream "[anime name]" --provider [gogoanime]```

# SYNOPSIS

**animdl** _command_ [_options_] _query_

# DESCRIPTION

**animdl** is a highly efficient command-line anime downloader and streamer. It scrapes multiple anime sources, providing fast access to a wide catalog of content with support for various qualities and subtitles.

The tool emphasizes speed and reliability, with parallel downloading capabilities and automatic source fallback.

# PARAMETERS

**search** _query_
> Search for anime

**stream** _query_
> Stream anime episodes

**download** _query_
> Download anime episodes

**-r** _range_, **--range** _range_
> Episode range (e.g., 1-10, 5, 1-5,7,9)

**-d** _dir_, **--directory** _dir_
> Download directory

**-q** _quality_, **--quality** _quality_
> Preferred quality (best, 720, 1080)

**--provider** _name_
> Specific provider to use

**--index** _n_
> Select search result by index

**-a**, **--auto**
> Auto-select first result

# CAVEATS

Depends on third-party streaming sites that may become unavailable. Download speeds vary by source. Some providers may be region-restricted.

# HISTORY

**animdl** was developed as a Python-based alternative to other anime CLI tools, focusing on speed, multiple provider support, and batch downloading capabilities.

# SEE ALSO

[ani-cli](/man/ani-cli)(1), [youtube-dl](/man/youtube-dl)(1), [mpv](/man/mpv)(1)
