# TLDR

**Run a Django Channels application**

```daphne [myproject.asgi]:application```

**Run on specific host and port**

```daphne -b [0.0.0.0] -p [8000] [myproject.asgi]:application```

**Run with Unix socket**

```daphne -u [/tmp/daphne.sock] [myproject.asgi]:application```

**Run with multiple worker threads**

```daphne --threads [4] [myproject.asgi]:application```

**Run with SSL**

```daphne -e ssl:443:privateKey=[key.pem]:certKey=[cert.pem] [myproject.asgi]:application```

**Enable verbose logging**

```daphne -v 2 [myproject.asgi]:application```

# SYNOPSIS

**daphne** [_options_] _application_

# PARAMETERS

**-b**, **--bind** _address_
> IP address to bind (default: 127.0.0.1).

**-p**, **--port** _port_
> Port to listen on (default: 8000).

**-u**, **--unix-socket** _path_
> Unix socket path (alternative to TCP).

**--fd** _fd_
> File descriptor to listen on.

**-e**, **--endpoint** _spec_
> Twisted endpoint specification.

**--threads** _n_
> Number of worker threads.

**-v**, **--verbosity** _level_
> Logging verbosity (0-2).

**--access-log** _path_
> Access log file path.

**--proxy-headers**
> Enable X-Forwarded-For handling.

**--proxy-headers-host** _header_
> Header for host detection behind proxy.

# DESCRIPTION

**Daphne** is an HTTP, HTTP2, and WebSocket protocol server for ASGI (Asynchronous Server Gateway Interface) applications, particularly Django Channels. It enables Django applications to handle WebSocket connections and other asynchronous protocols.

Unlike WSGI servers (Gunicorn, uWSGI) that handle synchronous HTTP requests, Daphne supports long-lived connections required for real-time features: WebSockets, Server-Sent Events, and HTTP long polling.

Daphne is built on Twisted's networking engine. It's typically used with Django Channels for chat applications, live notifications, and other real-time features. In production, it's often run behind a reverse proxy like nginx.

# CAVEATS

Not suitable for serving static files; use nginx or whitenoise. Production deployments should use multiple workers (via process manager). WebSocket connections consume resources while idle. SSL termination is better handled by a reverse proxy in most deployments.

# HISTORY

Daphne was created by **Andrew Godwin** as part of the **Django Channels** project, first released around **2016**. It was developed to bring WebSocket support to Django, enabling the framework to handle real-time applications. Django Channels became an official Django project, with Daphne as its reference ASGI server.

# SEE ALSO

[uvicorn](/man/uvicorn)(1), [hypercorn](/man/hypercorn)(1), [gunicorn](/man/gunicorn)(1), [django](/man/django)(1)
