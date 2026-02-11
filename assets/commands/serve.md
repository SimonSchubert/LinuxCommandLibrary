# TAGLINE

Static file server for local development

# TLDR

**Serve current directory**

```serve```

**Serve specific directory**

```serve [path/to/directory]```

**Custom port**

```serve -p [8080]```

**Listen on all interfaces**

```serve -l [0.0.0.0]```

**Single page app mode**

```serve -s [path/to/spa]```

**Enable CORS**

```serve -C```

# SYNOPSIS

**serve** [_-p port_] [_-l address_] [_-s_] [_options_] [_path_]

# PARAMETERS

**-p** _PORT_
> Port number.

**-l** _ADDRESS_
> Listen address.

**-s**
> Single page app mode.

**-C**
> Enable CORS.

**-n**
> Disable clipboard copy.

**-d**
> Debug mode.

**--ssl-cert** _FILE_
> SSL certificate.

# DESCRIPTION

**serve** is a zero-configuration static file server for local development, created by Vercel. It serves the contents of a directory over HTTP with no setup required — just run **serve** in any directory to start hosting files.

Single-page application (SPA) mode redirects all routes to **index.html**, making it suitable for testing client-side routing. CORS can be enabled with a single flag for cross-origin API testing. HTTPS is supported through SSL certificate and key files for testing secure connections locally.

# CAVEATS

Development use only. Not production server. Node.js required.

# HISTORY

**serve** is developed by **Vercel** (formerly ZEIT) as a simple static file server for local development.

# SEE ALSO

[http-server](/man/http-server)(1), [python](/man/python)(1), [nginx](/man/nginx)(1)
