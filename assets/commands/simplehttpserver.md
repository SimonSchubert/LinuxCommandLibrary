# TAGLINE

Serve files via Python HTTP server

# TLDR

**Serve current directory**

```python -m SimpleHTTPServer```

**Serve on port**

```python -m SimpleHTTPServer [8080]```

**Python 3 version**

```python3 -m http.server```

**Python 3 with port**

```python3 -m http.server [8080]```

**Bind to address**

```python3 -m http.server --bind [127.0.0.1] [8080]```

# SYNOPSIS

**python -m SimpleHTTPServer** [_port_]

**python3 -m http.server** [_--bind address_] [_port_]

# PARAMETERS

_port_
> Port number (default 8000).

**--bind** _ADDRESS_
> Bind address (Python 3).

**--directory** _DIR_
> Serve directory (Python 3.7+).

# DESCRIPTION

**SimpleHTTPServer** is a Python standard library module that launches a basic HTTP server for serving static files from the current directory. It requires no installation or configuration, making it ideal for quick file sharing, local development, and testing.

In Python 2, the module is invoked as **python -m SimpleHTTPServer**, while Python 3 renamed it to **python3 -m http.server**. The server provides directory listings in a web browser and handles GET requests for file downloads. It binds to all interfaces on port 8000 by default, but the port and bind address can be customized.

# CAVEATS

Not for production. No security features. Python 2 deprecated.

# HISTORY

**SimpleHTTPServer** is a Python 2 standard library module. Python 3 renamed it to **http.server**.

# SEE ALSO

[python](/man/python)(1), [serve](/man/serve)(1), [http-server](/man/http-server)(1)
