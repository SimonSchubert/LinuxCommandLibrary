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

**SimpleHTTPServer** serves static files. It's built into Python.

Quick file sharing. No installation needed.

Python 2 module name. Python 3 is http.server.

Directory listing. Browse files in browser.

GET requests only. Basic functionality.

# CAVEATS

Not for production. No security features. Python 2 deprecated.

# HISTORY

**SimpleHTTPServer** is a Python 2 standard library module. Python 3 renamed it to **http.server**.

# SEE ALSO

[python](/man/python)(1), [serve](/man/serve)(1), [http-server](/man/http-server)(1)
