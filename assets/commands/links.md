# TAGLINE

text-mode web browser for the terminal

# TLDR

**Visit** a website

```links https://example.com```

**Dump** rendered page as plain text to stdout

```links -dump https://example.com```

**Dump** with a specific screen **width**

```links -width 80 -dump https://example.com```

Browse in **anonymous** mode

```links -anonymous https://example.com```

View page **source** code

```links -source https://example.com```

# SYNOPSIS

**links** [_options_] [_url_]

# DESCRIPTION

**links** is a text-mode web browser for the terminal. It supports tables, frames, and basic forms rendering, making it useful for browsing documentation or using the web from servers without a graphical environment.

# PARAMETERS

**-anonymous**
> Apply restrictions for anonymous browsing (no local file access or downloads)

**-dump**
> Write rendered page as plain text to stdout

**-source**
> Write page source to stdout

**-width** _number_
> Set screen width for dump output

**-codepage** _codepage_
> Convert dump output to specified character set

**-enable-cookies** _0|1_
> Enable (1) or disable (0) cookies

**-force-html**
> Treat files with unknown type as HTML rather than text

**-html-numbered-links** _0|1_
> Number links in text mode for quick selection

**-html-margin** _spaces_
> Set margin width in text mode

**-no-connect**
> Run as a separate instance instead of connecting to an existing one

**-download-dir** _path_
> Set default download directory

**-max-connections** _max_
> Maximum concurrent connections (default: 10)

**-receive-timeout** _sec_
> Timeout on receive in seconds (default: 120)

# NAVIGATION KEYS

**Up/Down**
> Scroll page

**Tab/Shift+Tab**
> Navigate between links

**Left/Right**
> Go back/forward in history

**Enter**
> Follow selected link

**g**
> Go to URL

**/**
> Search text on page

**Esc**
> Open menu

**d**
> Download current link

**q**
> Quit browser

# SEE ALSO

[links2](/man/links2)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1)
