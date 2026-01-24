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

**waitress-serve** runs WSGI applications. It's a production server.

Pure Python. No dependencies.

Windows compatible. Cross-platform.

Production ready. Stable and tested.

Thread-based. Multiple workers.

# CAVEATS

WSGI only. No ASGI support. Configure behind proxy.

# HISTORY

**Waitress** was created by the **Pylons Project** as a production-quality pure-Python WSGI server.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [uwsgi](/man/uwsgi)(1), [flask](/man/flask)(1)
