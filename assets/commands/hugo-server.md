# TAGLINE

starts a local development server with live reload

# TLDR

**Start development server**

```hugo server```

**Include draft content**

```hugo server -D```

**Start on a custom port**

```hugo server -p [8080]```

**Bind to all interfaces** (accessible from other devices on the network)

```hugo server --bind 0.0.0.0```

**Disable live reload**

```hugo server --disableLiveReload```

**Navigate to changes** automatically in the browser

```hugo server --navigateToChanged```

**Build and serve with a specific base URL**

```hugo server --baseURL [http://example.com]```

# SYNOPSIS

**hugo server** [_options_]

# PARAMETERS

**-D**, **--buildDrafts**
> Include draft content.

**-E**, **--buildExpired**
> Include expired content.

**-F**, **--buildFuture**
> Include content with future publish dates.

**-p**, **--port** _PORT_
> Server port (default: 1313).

**--bind** _ADDR_
> Listen address (default: 127.0.0.1).

**-b**, **--baseURL** _URL_
> Hostname and path to the root.

**--disableLiveReload**
> Disable automatic live reloading of browser.

**--navigateToChanged**
> Navigate to changed content file on live reload.

**--poll** _DURATION_
> Use polling with this period for file change detection (e.g., 700ms).

**-w**, **--watch**
> Watch for changes and rebuild (default: true).

**--noHTTPCache**
> Prevent HTTP caching.

**--renderStaticToDisk**
> Serve static files from disk and dynamic files from memory.

**--help**
> Display help information.

# DESCRIPTION

**hugo server** starts a local development server with live reload. It watches for file changes and automatically rebuilds the site, then signals connected browsers to refresh via injected JavaScript.

The server renders content to memory by default for speed. It defaults to **localhost:1313** and enables watching/live reload automatically.

# CAVEATS

Intended for development only, not production use. The **--bind 0.0.0.0** option exposes the server on all network interfaces. Memory usage can be significant with large sites since content is rendered to memory. Use **--poll** in environments where filesystem events are unreliable (e.g., Docker, network mounts).

# HISTORY

hugo server is the built-in development server for **Hugo**, the open-source static site generator written in Go.

# SEE ALSO

[hugo](/man/hugo)(1), [live-server](/man/live-server)(1)
