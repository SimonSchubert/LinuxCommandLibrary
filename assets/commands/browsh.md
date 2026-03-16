# TAGLINE

Modern text-based web browser for terminals

# TLDR

**Start browsh**

```browsh```

**Open a specific** URL

```browsh [https://example.com]```

**Run with a visible** Firefox **GUI** window instead of headless mode

```browsh --firefox.with-gui```

**Use a custom** Firefox **binary** path

```browsh --firefox.path [/path/to/firefox]```

**Run in HTTP server** mode for browser-based access

```browsh --http-server-mode```

**Connect to an already running** Firefox instance

```browsh --firefox.use-existing```

# SYNOPSIS

**browsh** [_options_] [_url_]

# DESCRIPTION

**browsh** is a fully modern text-based browser that renders to TTY terminals. It uses a headless Mozilla Firefox to fetch and render web pages, then converts the output into ANSI or Unicode characters for terminal display.

The browser supports HTML5, CSS3, JavaScript, images, WebGL content, and video playback within the terminal.

# PARAMETERS

**--firefox.path** _path_
> Path to Firefox executable. Default is "firefox".

**--firefox.use-existing**
> Connect to an already running Firefox instance instead of launching a new one. Firefox must have been started with the --marionette flag.

**--firefox.with-gui**
> Run Firefox with a visible GUI window instead of headless mode.

**--http-server-mode**
> Run as an HTTP server for browser access.

**--startup-url** _url_
> URL to open on startup. Default is "https://google.com".

**--time-limit** _seconds_
> Kill browsh after the specified number of seconds.

**--debug**
> Enable debug logging to ./debug.log.

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

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [links](/man/links)(1), [elinks](/man/elinks)(1), [firefox](/man/firefox)(1)
