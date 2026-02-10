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

**Watch specific files**

```live-server --watch=[src/,public/]```

**Disable browser open**

```live-server --no-browser```

# SYNOPSIS

**live-server** [_options_] [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory to serve.

**--port** _PORT_
> Server port number.

**--host** _HOST_
> Host address to bind.

**--open** _PATH_
> Path to open in browser.

**--watch** _PATHS_
> Directories to watch for changes.

**--no-browser**
> Don't open browser.

**--help**
> Display help information.

# DESCRIPTION

**live-server** is a lightweight Node.js-based HTTP server designed for front-end development that automatically reloads the browser whenever files in the served directory change. It works by injecting a small script into HTML pages that opens a WebSocket connection back to the server, which triggers a page refresh when filesystem modifications are detected.

The server requires no configuration to get started and will serve the current directory by default, automatically opening your browser to the root page. You can customize the port, host binding, watched directories, and the initial page to open. Because it is intended strictly for development, it should not be used in production environments.

# CAVEATS

Node.js required. Development use only. Not for production.

# HISTORY

live-server was created to simplify front-end development with automatic browser refresh on file changes.

# SEE ALSO

[http-server](/man/http-server)(1), [serve](/man/serve)(1), [python](/man/python)(1)

