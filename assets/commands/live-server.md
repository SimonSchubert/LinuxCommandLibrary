# TAGLINE

development server with live reload

# TLDR

**Start server in current directory**

```live-server```

**Serve specific directory**

```live-server [public/]```

**Custom port**

```live-server --port=[8080]```

**Open specific file**

```live-server --open=[index.html]```

**Watch specific paths**

```live-server --watch=[src/,public/]```

**Disable browser open**

```live-server --no-browser```

**Serve SPA** (fallback to index.html)

```live-server --entry-file=[index.html]```

**Enable HTTPS and CORS**

```live-server --https=[https-config.js] --cors```

# SYNOPSIS

**live-server** [_options_] [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory to serve (defaults to current).

**--port=**_PORT_
> Server port (default: 8080, or PORT env var).

**--host=**_HOST_
> Host address to bind (default: 0.0.0.0, or IP env var).

**--open=**_PATH_
> Path to open in browser on start.

**--watch=**_PATHS_
> Comma-separated paths to watch for changes.

**--ignore=**_PATHS_
> Comma-separated paths to exclude from watching.

**--no-browser**
> Don't auto-launch browser.

**--browser=**_BROWSER_
> Specify which browser to open.

**--no-css-inject**
> Reload full page on CSS changes instead of live-injecting.

**--entry-file=**_PATH_
> Fallback file for missing requests (useful for SPAs).

**--mount=**_ROUTE:PATH_
> Map a URL route to a directory.

**--proxy=**_ROUTE:URL_
> Proxy requests matching route to URL.

**--https=**_PATH_
> Path to HTTPS configuration module.

**--cors**
> Enable CORS for all requests.

**--wait=**_MS_
> Delay (ms) before reloading (default: 100).

**-q**, **--quiet**
> Suppress log output.

**-V**, **--verbose**
> Verbose logging.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**live-server** is a lightweight Node.js-based HTTP server designed for front-end development that automatically reloads the browser whenever files in the served directory change. It works by injecting a small script into HTML pages that opens a WebSocket connection back to the server, which triggers a page refresh when filesystem modifications are detected.

The server requires no configuration to get started and will serve the current directory by default, automatically opening your browser to the root page. You can customize the port, host binding, watched directories, and the initial page to open. Because it is intended strictly for development, it should not be used in production environments.

# CAVEATS

Node.js required. Development use only. Not for production.

# HISTORY

live-server was created to simplify front-end development with automatic browser refresh on file changes.

# SEE ALSO

[http-server](/man/http-server)(1), [serve](/man/serve)(1), [browser-sync](/man/browser-sync)(1), [nodemon](/man/nodemon)(1), [python](/man/python)(1)

