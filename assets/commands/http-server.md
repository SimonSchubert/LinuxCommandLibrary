# TLDR

**Start server**

```http-server```

**Specify port**

```http-server -p [8080]```

**Specify directory**

```http-server [./public]```

**Enable CORS**

```http-server --cors```

**Enable gzip**

```http-server -g```

**SSL server**

```http-server -S -C [cert.pem] -K [key.pem]```

# SYNOPSIS

**http-server** [_options_] [_path_]

# PARAMETERS

_PATH_
> Directory to serve.

**-p**, **--port** _PORT_
> Port number (default 8080).

**-a** _ADDRESS_
> Listen address.

**-c** _SECONDS_
> Cache time.

**--cors**
> Enable CORS headers.

**-g**, **--gzip**
> Enable gzip.

**-S**, **--ssl**
> Enable SSL.

**--help**
> Display help information.

# DESCRIPTION

**http-server** is a simple static file server. It serves files from a directory over HTTP with no configuration required.

The tool is useful for development, testing, and quick file sharing. It supports SSL, CORS, and basic caching.

http-server serves static files locally.

# CAVEATS

Node.js package. Not for production. No authentication.

# HISTORY

http-server is a popular **npm** package for quickly serving static files during development.

# SEE ALSO

[serve](/man/serve)(1), [python](/man/python)(1), [live-server](/man/live-server)(1)
