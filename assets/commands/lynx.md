# TAGLINE

text-based web browser

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

**Dump without link list**

```lynx -dump -nolist [url]```

**Send a POST request**

```lynx -post_data [url] < [data_file]```

**Set a custom user agent**

```lynx -useragent="[MyAgent/1.0]" [url]```

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
> Dump without list of references at end of document.

**-post_data**
> Send form data via POST from stdin.

**-useragent** _STRING_
> Set custom User-Agent header.

**-auth** _USER:PASS_
> HTTP basic authentication credentials.

**-head**
> Send a HEAD request and show headers.

**-width** _N_
> Screen width for formatting (default 80).

**-traversal**
> Crawl links starting from the URL.

**--help**
> Display help information.

# DESCRIPTION

**lynx** is a text-based web browser. It renders HTML in the terminal without graphics.

The tool is useful for scripting, accessibility, and browsing on servers. Supports links and forms.

# CAVEATS

No JavaScript support. No images. Keyboard navigation. Limited CSS support.

# HISTORY

Lynx was created at the **University of Kansas** in 1992, becoming one of the oldest web browsers still maintained.

# SEE ALSO

[w3m](/man/w3m)(1), [links](/man/links)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)

