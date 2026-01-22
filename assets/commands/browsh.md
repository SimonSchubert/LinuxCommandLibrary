# TLDR

**Start browsh**

```browsh```

**Open specific URL**

```browsh [https://example.com]```

**Run in Docker container**

```docker run --rm -it browsh/browsh```

**Take screenshot**

```ALT+SHIFT+p```

**Toggle monochrome mode**

```ALT+m```

**Toggle mobile user agent**

```ALT+u```

# SYNOPSIS

**browsh** [_options_] [_url_]

# DESCRIPTION

**browsh** is a fully modern text-based browser that renders to TTY terminals. It uses a headless Mozilla Firefox to fetch and render web pages, then converts the output into ANSI or Unicode characters for terminal display.

The browser supports HTML5, CSS3, JavaScript, images, WebGL content, and video playback within the terminal.

# PARAMETERS

**--firefox.path** _path_
> Path to Firefox binary

**--http-server-mode**
> Run as HTTP server for browser access

**--startup-url** _url_
> URL to open on startup

**--time-limit** _seconds_
> Limit session duration

# KEY BINDINGS

**ALT+SHIFT+p**
> Take screenshot

**ALT+m**
> Toggle monochrome mode (helps with rendering issues)

**ALT+u**
> Toggle user agent between desktop and mobile

**CTRL+q**
> Quit browsh

**F1**
> Display help

# REQUIREMENTS

Requires Firefox 57 or newer installed on the system. The browser runs Firefox in headless mode with a webextension that captures and converts rendered output.

# CAVEATS

Resource intensive due to running a full Firefox instance. Best used for bandwidth reduction over SSH connections. Sessions on the public demo server (ssh brow.sh) are limited to 5 minutes and logged.

# HISTORY

Browsh was created as a modern replacement for text browsers like Lynx, capable of rendering modern websites that rely heavily on JavaScript and CSS.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [links](/man/links)(1), [firefox](/man/firefox)(1)
