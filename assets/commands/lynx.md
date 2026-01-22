# TLDR

**Browse website**

```lynx [https://example.com]```

**Browse local file**

```lynx [file.html]```

**Dump page as text**

```lynx -dump [url]```

**Accept cookies**

```lynx -accept_all_cookies [url]```

**Download file**

```lynx -source [url] > [file]```

**Use specific config**

```lynx -cfg=[config.cfg] [url]```

# SYNOPSIS

**lynx** [_options_] [_url_]

# PARAMETERS

_URL_
> URL or file to browse.

**-dump**
> Output page as text.

**-source**
> Output page source.

**-accept_all_cookies**
> Accept all cookies.

**-cfg** _FILE_
> Configuration file.

**-nolist**
> Dump without link list.

**--help**
> Display help information.

# DESCRIPTION

**lynx** is a text-based web browser. It renders HTML in the terminal without graphics.

The tool is useful for scripting, accessibility, and browsing on servers. Supports links and forms.

lynx is a terminal web browser.

# CAVEATS

No JavaScript support. No images. Keyboard navigation. Limited CSS support.

# HISTORY

Lynx was created at the **University of Kansas** in 1992, becoming one of the oldest web browsers still maintained.

# SEE ALSO

[w3m](/man/w3m)(1), [links](/man/links)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)

