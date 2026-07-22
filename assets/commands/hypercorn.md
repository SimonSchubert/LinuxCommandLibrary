# TAGLINE

Python ASGI web server supporting HTTP/1, HTTP/2, and WebSockets

# TLDR

**Run ASGI application**

```hypercorn [app:app]```

**Specify host and port**

```hypercorn [app:app] --bind [0.0.0.0:8000]```

**Run with multiple workers**

```hypercorn [app:app] --workers [4]```

**Enable reload for development**

```hypercorn [app:app] --reload```

**Use HTTPS (also enables HTTP/2)**

```hypercorn [app:app] --certfile [cert.pem] --keyfile [key.pem]```

**Load configuration from a TOML file**

```hypercorn [app:app] --config [hypercorn.toml]```

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
> Auto-reload on code changes (development only).

**-c**, **--config** _FILE_
> Load config from a TOML file, or `python:module` / `file:path.py` for a Python source.

**--access-logfile** _FILE_
> Target for the access log; use `-` for stdout. (`--access-log` still works but is deprecated.)

**--access-logformat** _FORMAT_
> Access log line format string.

**--error-logfile**, **--log-file** _FILE_
> Target for the error log; use `-` for stderr. (`--error-log` still works but is deprecated.)

**--log-level** _LEVEL_
> Error log verbosity (defaults to info).

**--certfile** _FILE_
> Path to the SSL certificate file.

**--keyfile** _FILE_
> Path to the SSL key file.

**--ca-certs** _FILE_
> Path to the SSL CA certificate file.

**--worker-class**, **-k** _CLASS_
> Worker type: `asyncio` (default), `uvloop`, or `trio`.

**--graceful-timeout** _SECONDS_
> Time to wait after SIGTERM/Ctrl-C for in-flight requests to finish.

**--keep-alive** _SECONDS_
> How long to keep idle connections open.

**--max-requests** _N_
> Restart a worker after it has served this many requests.

**-p**, **--pid** _FILE_
> Write the PID to a file.

**-D**, **--daemon**
> Run the workers as daemons.

**--quic-bind** _ADDRESS_
> UDP/QUIC host:port to bind for HTTP/3 support (experimental).

**--insecure-bind** _ADDRESS_
> Extra TCP host:port to bind without SSL (e.g. for HTTP-to-HTTPS redirection).

# DESCRIPTION

**Hypercorn** is an ASGI server supporting HTTP/1, HTTP/2, and WebSockets (over both HTTP/1 and HTTP/2), plus experimental HTTP/3 via **--quic-bind**. It runs ASGI applications like FastAPI, Starlette, and Quart, and can also serve WSGI apps.

It's built on sans-I/O libraries from the `hyper` family (h11, h2, wsproto) and can run its event loop on asyncio, uvloop, or trio via **--worker-class**, providing production-ready features including multiple worker processes, graceful shutdown, and TOML/Python-based configuration in addition to CLI flags.

# CAVEATS

Serving HTTP/2 to browsers requires TLS (**--certfile**/**--keyfile**); cleartext HTTP/2 (h2c) is possible for non-browser clients. **--reload** is meant for development only. As with other ASGI servers, running behind a reverse proxy (nginx, Caddy) is recommended in production for TLS termination and static file serving.

# HISTORY

Hypercorn was created by **Philip Jones** (pgjones), who also created the **Quart** framework; Hypercorn began as Quart's built-in server before being split out as a standalone, framework-agnostic ASGI server.

# INSTALL

```pacman: sudo pacman -S hypercorn```

```apk: sudo apk add py3-hypercorn```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[uvicorn](/man/uvicorn)(1), [gunicorn](/man/gunicorn)(1), [daphne](/man/daphne)(1)

# RESOURCES

```[Source code](https://github.com/pgjones/hypercorn)```

```[Documentation](https://hypercorn.readthedocs.io/en/latest/)```

<!-- verified: 2026-07-19 -->
