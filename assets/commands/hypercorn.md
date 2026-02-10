# TAGLINE

ASGI server supporting HTTP/1

# TLDR

**Run ASGI application**

```hypercorn [app:app]```

**Specify host and port**

```hypercorn [app:app] --bind [0.0.0.0:8000]```

**Run with multiple workers**

```hypercorn [app:app] --workers [4]```

**Enable reload for development**

```hypercorn [app:app] --reload```

**Use HTTPS**

```hypercorn [app:app] --certfile [cert.pem] --keyfile [key.pem]```

**HTTP/2 support**

```hypercorn [app:app] --certfile [cert.pem] --keyfile [key.pem]```

# SYNOPSIS

**hypercorn** [_options_] _module:application_

# PARAMETERS

_module:application_
> Python module and ASGI app variable.

**--bind**, **-b** _address_
> Address to bind (host:port).

**--workers**, **-w** _n_
> Number of worker processes.

**--reload**
> Auto-reload on code changes.

**--access-log** _file_
> Access log file.

**--error-log** _file_
> Error log file.

**--certfile** _file_
> SSL certificate.

**--keyfile** _file_
> SSL key file.

**--worker-class** _class_
> Worker type: asyncio, uvloop, trio.

**--graceful-timeout** _seconds_
> Graceful shutdown timeout.

# DESCRIPTION

**Hypercorn** is an ASGI server supporting HTTP/1.1, HTTP/2, and WebSockets. It runs ASGI applications like FastAPI, Starlette, and Quart with optional HTTP/2 and HTTPS support.

Hypercorn supports multiple async frameworks (asyncio, uvloop, trio) and provides production-ready features including worker processes and graceful shutdown.

# CAVEATS

HTTP/2 requires HTTPS. uvloop gives better performance. Reload mode for development only. Reverse proxy recommended for production.

# HISTORY

Hypercorn was created by **Philip Jones** (pgjones), who also created Quart. It was designed as an ASGI-native server supporting modern HTTP protocols.

# SEE ALSO

[uvicorn](/man/uvicorn)(1), [gunicorn](/man/gunicorn)(1), [daphne](/man/daphne)(1)
