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

**serve** runs a static file server. It's quick local hosting.

Zero configuration. Just run and serve.

SPA mode supported. Redirect to index.html.

CORS enabled easily. Cross-origin requests.

HTTPS support. With certificate files.

# CAVEATS

Development use only. Not production server. Node.js required.

# HISTORY

**serve** is developed by **Vercel** (formerly ZEIT) as a simple static file server for local development.

# SEE ALSO

[http-server](/man/http-server)(1), [python](/man/python)(1), [nginx](/man/nginx)(1)
