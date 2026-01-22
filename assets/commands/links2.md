# TLDR

Browse in **graphics mode**

```links2 -g https://example.com```

Browse in **text mode**

```links2 https://example.com```

# SYNOPSIS

**links2** [_options_] [_url_]

# DESCRIPTION

**links2** is a web browser with both text and graphics mode support. In graphics mode, it can display images and render pages more visually while still being lightweight. It is an enhanced version of the links browser.

# PARAMETERS

**-g**
> Start in graphics mode

**-driver DRIVER**
> Select graphics driver (x, svgalib, fb, directfb)

**-depth N**
> Color depth in graphics mode

**-anonymous**
> Anonymous browsing mode

**-dump**
> Dump rendered page to stdout

**-source**
> Dump page source

# CAVEATS

Graphics mode requires X11 or framebuffer support. Not all graphics drivers are available on all systems.

# SEE ALSO

[links](/man/links)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1)
