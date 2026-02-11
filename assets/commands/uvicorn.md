# TAGLINE

Lightning-fast Python ASGI web server

# TLDR

**Run ASGI application**

```uvicorn [main:app]```

**Run with auto-reload**

```uvicorn [main:app] --reload```

**Bind to specific host and port**

```uvicorn [main:app] --host [0.0.0.0] --port [8000]```

**Run with multiple workers**

```uvicorn [main:app] --workers [4]```

**Run with SSL**

```uvicorn [main:app] --ssl-keyfile [key.pem] --ssl-certfile [cert.pem]```

**Use specific loop** (uvloop for performance)

```uvicorn [main:app] --loop uvloop```

**Run with Unix socket**

```uvicorn [main:app] --uds [/tmp/uvicorn.sock]```

**Specify log level**

```uvicorn [main:app] --log-level [debug]```

# SYNOPSIS

**uvicorn** _app_ [_--host host_] [_--port port_] [_--reload_] [_--workers num_] [_options_]

# PARAMETERS

**--host** _HOST_
> Bind socket to host (default: 127.0.0.1).

**--port** _PORT_
> Bind socket to port (default: 8000).

**--uds** _PATH_
> Bind to Unix domain socket.

**--fd** _NUM_
> Bind to socket from file descriptor.

**--reload**
> Enable auto-reload on code changes.

**--reload-dir** _PATH_
> Directories to watch for reload.

**--reload-include** _PATTERN_
> Include patterns for reload.

**--reload-exclude** _PATTERN_
> Exclude patterns from reload.

**--workers** _NUM_
> Number of worker processes.

**--loop** _IMPL_
> Event loop: auto, uvloop, asyncio.

**--http** _IMPL_
> HTTP implementation: auto, h11, httptools.

**--ws** _IMPL_
> WebSocket implementation: auto, websockets, wsproto.

**--interface** _TYPE_
> Interface: auto, asgi3, asgi2, wsgi.

**--log-level** _LEVEL_
> Log level: critical, error, warning, info, debug, trace.

**--access-log** / **--no-access-log**
> Enable/disable access log.

**--ssl-keyfile** _PATH_
> SSL key file.

**--ssl-certfile** _PATH_
> SSL certificate file.

# DESCRIPTION

**uvicorn** is a lightning-fast ASGI server for Python. It serves async web frameworks like FastAPI, Starlette, and others that implement the ASGI specification.

ASGI (Asynchronous Server Gateway Interface) enables async/await handling of HTTP, WebSocket, and other protocols. Uvicorn implements the server side, connecting to async application code.

Development mode (--reload) watches files and restarts on changes. This enables rapid iteration without manual server restarts.

Production deployments use multiple workers (--workers) to utilize CPU cores. Each worker is a separate process handling requests independently. Process management handles worker crashes.

Performance comes from optional uvloop (libuv-based event loop) and httptools (HTTP parsing). These C-based libraries significantly outperform pure Python implementations.

WebSocket support enables real-time bidirectional communication. The server handles connection upgrades and message routing to application code.

# CAVEATS

Workers share nothing - state must use external storage. Reload mode shouldn't be used in production. uvloop not available on Windows. SSL termination often better at reverse proxy. File uploads limited by memory.

# HISTORY

**uvicorn** was created by **Tom Christie** (creator of Django REST framework and Starlette) around **2017**. It implements the ASGI spec that enables async Python web frameworks. The name references UV (high-energy light) and the suffix -corn common in Python web servers.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [hypercorn](/man/hypercorn)(1), [daphne](/man/daphne)(1)
