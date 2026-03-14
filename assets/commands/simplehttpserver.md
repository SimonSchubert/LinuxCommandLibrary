# TAGLINE

Serve files via Python HTTP server

# TLDR

**Serve current directory** on port 8000

```python3 -m http.server```

**Serve on a specific port**

```python3 -m http.server [8080]```

**Bind to localhost** only

```python3 -m http.server --bind [127.0.0.1]```

**Serve a specific directory** (Python 3.7+)

```python3 -m http.server --directory [path/to/dir]```

**Enable CGI** script execution

```python3 -m http.server --cgi```

**Python 2 equivalent** (deprecated)

```python -m SimpleHTTPServer [8080]```

# SYNOPSIS

**python3 -m http.server** [**-b** _address_] [**-d** _directory_] [**--cgi**] [**--protocol** _version_] [_port_]

**python -m SimpleHTTPServer** [_port_]

# PARAMETERS

_port_
> Port number (default: 8000).

**-b**, **--bind** _ADDRESS_
> Bind to address (default: all interfaces). Python 3 only.

**-d**, **--directory** _DIR_
> Serve specified directory instead of current directory (Python 3.7+).

**--cgi**
> Enable CGI script execution from /cgi-bin.

**--protocol** _VERSION_
> HTTP protocol version (default: HTTP/1.0).

# DESCRIPTION

**http.server** (Python 3) and **SimpleHTTPServer** (Python 2) are Python standard library modules that launch a basic HTTP server for serving static files. They require no installation or configuration, making them ideal for quick file sharing, local development, and testing.

In Python 2, the module is invoked as **python -m SimpleHTTPServer**, while Python 3 renamed it to **python3 -m http.server**. The server provides directory listings in a web browser and handles GET and HEAD requests. It binds to all interfaces on port 8000 by default, but the port and bind address can be customized.

# CAVEATS

Not suitable for production use. No authentication, encryption, or access control. Python 2 and SimpleHTTPServer are deprecated; use Python 3 http.server instead. The **--cgi** option is deprecated since Python 3.13.

# HISTORY

**SimpleHTTPServer** has been part of the Python standard library since Python 2. Python 3 reorganized the module as **http.server** with added options for binding, directory selection, and CGI support.

# SEE ALSO

[python](/man/python)(1), [serve](/man/serve)(1), [http-server](/man/http-server)(1)
