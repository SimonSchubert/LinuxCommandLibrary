# TAGLINE

Web browser with both text and graphics mode support

# TLDR

**Browse in graphics mode**

```links2 -g [https://example.com]```

**Browse in text mode**

```links2 [https://example.com]```

**Dump rendered page to stdout**

```links2 -dump [https://example.com]```

**Dump with specific text width**

```links2 -dump -width [120] [https://example.com]```

**Dump page source**

```links2 -source [https://example.com]```

**Start in graphics mode with specific resolution**

```links2 -g -mode [1024x768x24] [https://example.com]```

# SYNOPSIS

**links2** [_options_] [_url_]

# PARAMETERS

**-g**
> Start in graphics mode.

**-t**
> Force text mode.

**-driver** _driver_
> Select graphics driver (x, svgalib, fb, directfb).

**-mode** _WxHxD_
> Graphics mode resolution and color depth (e.g., 1024x768x24).

**-depth** _N_
> Color depth in graphics mode.

**-anonymous**
> Anonymous browsing mode (disables local file access and bookmarks).

**-dump**
> Dump rendered page text to stdout and exit.

**-width** _N_
> Text width in characters for -dump mode.

**-source**
> Dump raw HTML page source to stdout and exit.

**-version**
> Print version and exit.

# DESCRIPTION

**links2** is a web browser with both text and graphics mode support. In graphics mode, it can display images and render pages more visually while still being lightweight. It is an enhanced version of the original links browser.

In text mode, it works similarly to lynx or w3m. In graphics mode (-g), it provides a full visual browsing experience using X11, framebuffer, or SVGAlib.

The **-dump** option is useful for scripting, converting web pages to plain text output.

# CAVEATS

Graphics mode requires X11 or framebuffer support. Not all graphics drivers are available on all systems. JavaScript is not supported.

# SEE ALSO

[links](/man/links)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
