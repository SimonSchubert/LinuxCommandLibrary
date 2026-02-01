# TLDR

**Run development server**

```fastapi dev [main.py]```

**Run with specific host and port**

```fastapi dev [main.py] --host [0.0.0.0] --port [8080]```

**Run production server**

```fastapi run [main.py]```

**Run with auto-reload disabled**

```fastapi dev [main.py] --no-reload```

**Specify the app location**

```fastapi dev [main.py:app]```

# SYNOPSIS

**fastapi** _command_ [_options_] _path_

# COMMANDS

**dev** _path_
> Start development server with auto-reload.

**run** _path_
> Start production server.

# PARAMETERS

**--host** _address_
> Bind address. Default: 127.0.0.1 (dev), 0.0.0.0 (run).

**--port** _port_
> Server port. Default: 8000.

**--reload**
> Enable auto-reload (dev default).

**--no-reload**
> Disable auto-reload.

**--workers** _count_
> Number of worker processes.

**--root-path** _path_
> ASGI root path for proxied setups.

**--app** _name_
> Application variable name. Default: app.

**--proxy-headers**
> Trust X-Forwarded headers.

**--help**
> Display help information.

# DESCRIPTION

**fastapi** is the CLI for FastAPI, a modern Python web framework for building APIs. It wraps Uvicorn ASGI server for convenient development and deployment.

**fastapi dev** starts a development server with auto-reload—code changes trigger automatic restart. Use for local development with **--host 0.0.0.0** to allow external access.

**fastapi run** starts a production-oriented server without auto-reload and binding to all interfaces. For actual production, consider Uvicorn or Gunicorn directly with more configuration options.

The path argument points to a Python file containing a FastAPI instance. Use **path:variable** syntax to specify a non-default app variable name.

FastAPI generates automatic API documentation at **/docs** (Swagger UI) and **/redoc** endpoints based on your route definitions and type hints.

# CAVEATS

The CLI is a convenience wrapper; production deployments often use Uvicorn/Gunicorn directly for more control. Auto-reload may miss some file changes. Debug mode exposes detailed error pages.

# HISTORY

FastAPI was created by **Sebastián Ramírez** and first released in **December 2018**. Built on Starlette and Pydantic, it emphasizes type hints for validation, serialization, and documentation. The framework quickly became one of the most popular Python web frameworks for APIs. The **fastapi** CLI was added later to simplify the development experience. FastAPI is used in production by Microsoft, Netflix, Uber, and many others.

# SEE ALSO

[uvicorn](/man/uvicorn)(1), [gunicorn](/man/gunicorn)(1), [flask](/man/flask)(1), [django](/man/django)(1)
