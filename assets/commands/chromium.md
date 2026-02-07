# TAGLINE

open-source web browser

# TLDR

**Open Chromium browser**

```chromium```

**Open a URL in a new window**

```chromium --new-window [https://example.com]```

**Open in incognito mode**

```chromium --incognito```

**Open URL in application mode (minimal UI)**

```chromium --app=[https://example.com]```

**Use a specific user data directory**

```chromium --user-data-dir=[path/to/directory]```

**Use a specific proxy server**

```chromium --proxy-server=[host:port]```

**Run in headless mode**

```chromium --headless --dump-dom [https://example.com]```

**Open in kiosk mode (fullscreen)**

```chromium --kiosk [https://example.com]```

# SYNOPSIS

**chromium** [_options_] [_URL..._]

# DESCRIPTION

**Chromium** is the open-source web browser project that forms the basis for Google Chrome. It provides a fast, secure browsing experience with support for modern web standards.

The browser supports hundreds of command-line flags for customization, debugging, and automation. Most flags are undocumented and experimental; the commonly used ones are relatively stable.

Configuration data is stored in **~/.config/chromium** and cache in **~/.cache/chromium** by default on Linux.

# PARAMETERS

**--user-data-dir=**_DIR_
> Use specified directory for user data (profile). Required for running multiple instances

**--incognito**
> Open in incognito (private browsing) mode

**--new-window**
> Open URLs in a new window

**--app=**_URL_
> Run URL in application mode with minimal browser UI

**--proxy-server=**_host:port_
> Specify HTTP/SOCKS proxy server

**--headless**
> Run without graphical user interface

**--disable-gpu**
> Disable GPU hardware acceleration

**--no-first-run**
> Skip first-run welcome dialogs

**--kiosk**
> Run in full-screen kiosk mode

**--remote-debugging-port=**_port_
> Enable remote debugging on specified port

# CONFIGURATION

**~/.config/chromium/**
> User profile directory containing preferences, bookmarks, extensions, cookies, and browsing history.

**~/.config/chromium/Default/Preferences**
> JSON file with browser settings. Can be edited directly but changes may be overwritten when the browser is running.

# CAVEATS

The **--no-sandbox** flag disables security sandboxing and should only be used when necessary (e.g., in containers). Most command-line flags are experimental and may change between versions.

Visit **about:version** in the browser to see which flags are currently active.

# HISTORY

**Chromium** was first released by Google in **September 2008** as the open-source foundation for Google Chrome. The project uses the Blink rendering engine (forked from WebKit in 2013) and the V8 JavaScript engine.

# SEE ALSO

[google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1)
