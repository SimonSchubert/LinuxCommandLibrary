# TAGLINE

simple static file server

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

**-C** _FILE_
> SSL certificate file (default: cert.pem).

**-K** _FILE_
> SSL key file (default: key.pem).

**-o**
> Open browser after starting.

**-P**, **--proxy** _URL_
> Proxy unresolvable requests to this URL.

**--no-dotfiles**
> Do not serve dotfiles.

# DESCRIPTION

**http-server** is a simple, zero-configuration static file server for Node.js. It serves files from a directory over HTTP, making it ideal for quickly testing frontend builds, sharing files on a local network, or previewing static sites.

Install via `npm install -g http-server`. Serves the current directory by default on port 8080.

# CAVEATS

Requires Node.js and npm. Not suitable for production use — provides no authentication, rate limiting, or hardened security. For production static file serving, use nginx or a CDN.

# HISTORY

http-server is a popular **npm** package for quickly serving static files during development.

# SEE ALSO

[serve](/man/serve)(1), [python](/man/python)(1), [live-server](/man/live-server)(1)
