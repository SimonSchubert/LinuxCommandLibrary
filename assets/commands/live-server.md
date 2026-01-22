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

**live-server** is a development server with live reload. It automatically refreshes browsers on file changes.

The tool is useful for front-end development. It serves static files and injects reload script.

live-server provides live reload.

# CAVEATS

Node.js required. Development use only. Not for production.

# HISTORY

live-server was created to simplify front-end development with automatic browser refresh on file changes.

# SEE ALSO

[http-server](/man/http-server)(1), [serve](/man/serve)(1), [python](/man/python)(1)

