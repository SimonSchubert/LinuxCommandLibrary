# TAGLINE

python WSGI HTTP server for Unix

# TLDR

**Run a WSGI application**

```gunicorn [myapp:app]```

**Run on a specific host and port**

```gunicorn --bind [0.0.0.0:8000] [myapp:app]```

**Run with multiple workers**

```gunicorn --workers [4] [myapp:app]```

**Run with automatic worker restart**

```gunicorn --reload [myapp:app]```

**Run with access logging**

```gunicorn --access-logfile [access.log] [myapp:app]```

**Run as a daemon** (background)

```gunicorn --daemon --pid [gunicorn.pid] [myapp:app]```

**Run with Unix socket**

```gunicorn --bind unix:[/tmp/gunicorn.sock] [myapp:app]```

**Use async workers** (gevent)

```gunicorn --worker-class [gevent] --workers [4] [myapp:app]```

# SYNOPSIS

**gunicorn** [_options_] _APP_MODULE_

# PARAMETERS

**-b**, **--bind** _ADDRESS_
> Socket to bind (HOST:PORT, unix:PATH, or fd://FD).

**-w**, **--workers** _INT_
> Number of worker processes (default: 1).

**-k**, **--worker-class** _STRING_
> Worker type: sync, gevent, eventlet, tornado, gthread.

**--threads** _INT_
> Threads per worker (for gthread worker).

**-t**, **--timeout** _INT_
> Worker timeout in seconds (default: 30).

**--graceful-timeout** _INT_
> Timeout for graceful worker restart.

**--reload**
> Restart workers when code changes (development only).

**-D**, **--daemon**
> Daemonize the process.

**-p**, **--pid** _FILE_
> PID file path.

**--access-logfile** _FILE_
> Access log file (- for stdout).

**--error-logfile** _FILE_
> Error log file (- for stderr).

**--log-level** _LEVEL_
> Logging level: debug, info, warning, error, critical.

**-c**, **--config** _FILE_
> Configuration file path.

**--preload**
> Load application code before forking workers.

**-n**, **--name** _STRING_
> Process name for ps output.

**-u**, **--user** _USER_
> Switch worker processes to run as this user.

**-g**, **--group** _GROUP_
> Switch worker process to run as this group.

# DESCRIPTION

**Gunicorn** (Green Unicorn) is a Python WSGI HTTP server for Unix systems, designed to serve web applications in production using a pre-fork worker model. A master process manages a pool of worker processes, each of which independently handles incoming requests. The application is specified as **module:variable** (e.g., `myapp:app` for Flask or `myproject.wsgi:application` for Django), and the recommended worker count is **(2 x CPU cores) + 1** to balance concurrency against memory usage.

The default synchronous worker handles one request at a time per process, which is suitable for CPU-bound applications. For I/O-bound workloads with many concurrent connections, async worker classes such as `gevent` or `eventlet` use cooperative multithreading to multiplex thousands of connections within fewer processes, while the `gthread` worker uses OS threads. Workers that exceed the configurable timeout are automatically killed and restarted by the master process, providing resilience against hung requests.

In production, Gunicorn typically runs behind a reverse proxy like Nginx, which handles SSL termination, static file serving, and request buffering. Communication between the proxy and Gunicorn occurs over HTTP or a Unix domain socket.

# CAVEATS

Not designed for Windows. Sync workers block on slow clients without buffering proxy. --reload is for development only. Preload can cause issues with some frameworks. Workers are killed after timeout regardless of what they're doing.

# HISTORY

**Gunicorn** was created by Benoît Chesneau, with the first release around **2010**. The name is a portmanteau of "Green Unicorn." It was designed as a Python port of Ruby's Unicorn server, bringing its pre-fork architecture to Python. Gunicorn has become one of the most popular WSGI servers for Python web applications.

# SEE ALSO

[uvicorn](/man/uvicorn)(1), [uwsgi](/man/uwsgi)(1), [nginx](/man/nginx)(8), [flask](/man/flask)(1), [django-admin](/man/django-admin)(1)
