# TLDR

**Download from URL**

```gallery-dl [https://example.com/gallery]```

**Set output directory**

```gallery-dl -d [/path/to/downloads] [url]```

**List supported sites**

```gallery-dl --list-extractors```

**Download with metadata**

```gallery-dl --write-metadata [url]```

**Authentication**

```gallery-dl -u [username] -p [password] [url]```

# SYNOPSIS

**gallery-dl** [_options_] _urls_...

# PARAMETERS

_URLS_
> Gallery or image URLs.

**-d** _PATH_, **--dest** _PATH_
> Destination directory.

**-u** _USER_, **--username** _USER_
> Site username.

**-p** _PASS_, **--password** _PASS_
> Site password.

**--write-metadata**
> Save metadata as JSON.

**--list-extractors**
> List supported sites.

**-o** _KEY=VALUE_
> Set config option.

**--help**
> Display help information.

# DESCRIPTION

**gallery-dl** downloads image galleries from websites. It supports hundreds of image hosting sites, social media, and art communities through site-specific extractors.

The tool handles pagination, authentication, rate limiting, and metadata extraction automatically. Downloads can be organized with customizable directory and filename patterns.

gallery-dl is commonly used for archiving content from image boards, artist portfolios, and social media.

# CAVEATS

Site support may break with updates. Respect site terms of service. Large downloads may be throttled.

# HISTORY

gallery-dl was created as a counterpart to youtube-dl for images. It provides comprehensive image downloading with support for hundreds of sites through Python-based extractors.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
