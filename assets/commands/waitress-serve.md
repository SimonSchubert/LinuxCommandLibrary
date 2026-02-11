# TAGLINE

Pure-Python WSGI production server

# TLDR

**Serve WSGI app**

```waitress-serve --port=[8080] [myapp:app]```

**With host binding**

```waitress-serve --host=[0.0.0.0] --port=[8080] [myapp:app]```

**Unix socket**

```waitress-serve --unix-socket=[/tmp/app.sock] [myapp:app]```

**With threads**

```waitress-serve --threads=[4] [myapp:app]```

**URL prefix**

```waitress-serve --url-prefix=[/api] [myapp:app]```

# SYNOPSIS

**waitress-serve** [_--host addr_] [_--port port_] [_options_] _module:app_

# PARAMETERS

**--host** _ADDR_
> Bind address.

**--port** _PORT_
> Listen port.

**--threads** _N_
> Worker threads.

**--unix-socket** _PATH_
> Unix socket.

**--url-prefix** _PREFIX_
> URL prefix.

# DESCRIPTION

**waitress-serve** is a production-quality WSGI server for Python web applications, implemented entirely in pure Python with no C extension dependencies. It serves frameworks like Flask, Django, and Pyramid and runs on any platform including Windows, Linux, and macOS.

The server uses a multi-threaded architecture with a configurable number of worker threads to handle concurrent requests. It accepts connections on a TCP port or Unix socket and supports URL prefix configuration for applications mounted at sub-paths behind a reverse proxy.

Waitress is designed to be simple and reliable for production deployments, requiring minimal configuration while providing solid performance. It is commonly used behind a reverse proxy like Nginx for static file serving and SSL termination.

# CAVEATS

WSGI only. No ASGI support. Configure behind proxy.

# HISTORY

**Waitress** was created by the **Pylons Project** as a production-quality pure-Python WSGI server.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [uwsgi](/man/uwsgi)(1), [flask](/man/flask)(1)
