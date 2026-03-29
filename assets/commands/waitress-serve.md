# TAGLINE

Pure-Python WSGI production server

# TLDR

**Serve a WSGI app on the default port 8080**

```waitress-serve [myapp:app]```

**Bind to a specific host and port**

```waitress-serve --host=[127.0.0.1] --port=[8080] [myapp:app]```

**Listen on multiple addresses**

```waitress-serve --listen=[127.0.0.1:8080] --listen=[127.0.0.1:8443] [myapp:app]```

**Use an application factory function**

```waitress-serve --call [myapp:create_app]```

**Listen on a Unix socket**

```waitress-serve --unix-socket=[/tmp/app.sock] [myapp:app]```

**Set number of worker threads**

```waitress-serve --threads=[8] [myapp:app]```

**Serve under a URL prefix (behind a reverse proxy)**

```waitress-serve --url-prefix=[/api] [myapp:app]```

# SYNOPSIS

**waitress-serve** [_--host addr_] [_--port port_] [_options_] _module:app_

# PARAMETERS

**--host** _ADDR_
> Hostname or IP address to listen on. Default: `0.0.0.0`.

**--port** _PORT_
> TCP port to listen on. Default: `8080`.

**--listen** _HOST:PORT_
> Bind to a specific host:port pair. May be repeated for multiple listeners. Supports `*` as a wildcard host.

**--threads** _N_
> Number of worker threads to handle requests. Default: `4`.

**--unix-socket** _PATH_
> Path to a Unix domain socket (not available on Windows).

**--unix-socket-perms** _OCTAL_
> Octal permissions for the Unix socket. Default: `600`.

**--url-scheme** _SCHEME_
> Value for `wsgi.url_scheme`. Default: `http`.

**--url-prefix** _PREFIX_
> Value for `SCRIPT_NAME` (for apps mounted at a sub-path). Default: empty.

**--ident** _STRING_
> Server identity sent in the `Server` response header. Default: `waitress`.

**--call**
> Treat the positional argument as a callable factory that returns the WSGI app, rather than using it directly as the app.

**--connection-limit** _N_
> Maximum number of simultaneous connections. Default: `100`.

**--channel-timeout** _SECONDS_
> Timeout for inactive connections. Default: `120`.

**--trusted-proxy** _IP_
> IP address of a trusted reverse proxy that may supply forwarding headers.

# DESCRIPTION

**waitress-serve** is a production-quality WSGI server for Python web applications, implemented entirely in pure Python with no C extension dependencies. It serves frameworks like Flask, Django, and Pyramid and runs on any platform including Windows, Linux, and macOS.

The server uses a multi-threaded architecture with a configurable number of worker threads to handle concurrent requests. It accepts connections on a TCP port or Unix socket and supports URL prefix configuration for applications mounted at sub-paths behind a reverse proxy.

Waitress is designed to be simple and reliable for production deployments, requiring minimal configuration while providing solid performance. It is commonly used behind a reverse proxy like Nginx for static file serving and SSL termination.

# CAVEATS

WSGI only. No ASGI support. Configure behind proxy.

# HISTORY

**Waitress** was created by the **Pylons Project** as a production-quality pure-Python WSGI server.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [uwsgi](/man/uwsgi)(1), [uvicorn](/man/uvicorn)(1), [hypercorn](/man/hypercorn)(1), [flask](/man/flask)(1)
