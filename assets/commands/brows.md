# TAGLINE

Text-based web browser using headless Firefox

# TLDR

**Launch browsh**

```browsh```

**Open a specific URL**

```browsh --startup-url [https://example.com]```

**Run in HTTP server mode**

```browsh --http-server-mode --port [4333]```

**Use a specific Firefox binary**

```browsh --firefox.path [/path/to/firefox]```

# SYNOPSIS

**browsh** [_options_]

# PARAMETERS

**--startup-url** _URL_
> Open a specific URL on launch.

**--http-server-mode**
> Run as an HTTP server that renders pages as text.

**--port** _PORT_
> Set the port for HTTP server mode (default: 4333).

**--firefox.path** _PATH_
> Path to the Firefox binary.

**--time-limit** _SECONDS_
> Limit session duration.

# DESCRIPTION

**browsh** is a fully modern text-based web browser. It renders web pages by running a headless **Firefox** instance in the background and translating the visual output into text and ANSI art for display in a terminal. This means it supports JavaScript, CSS, video, and virtually all modern web standards.

The browser provides both interactive terminal mode and an HTTP server mode that can serve text-rendered versions of web pages to any client. It supports tabs, scrolling, link navigation, and text input.

# CAVEATS

Requires a full **Firefox** installation (version 57+) as a backend, making it resource-intensive compared to traditional text browsers. Rendering quality depends on terminal capabilities and font support. Startup time is slower due to Firefox initialization.

# HISTORY

**browsh** was created by **Thomas Sherwood** and released in **2018**. It gained significant attention for its novel approach of using a real browser engine to power a terminal interface, enabling full web compatibility that traditional text browsers like Lynx cannot achieve.

# SEE ALSO

[browsh](/man/browsh)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [links](/man/links)(1), [elinks](/man/elinks)(1)
