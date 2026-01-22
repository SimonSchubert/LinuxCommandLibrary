# TLDR

**Start** web server

```caddy run```

**Serve** current directory

```caddy file-server```

**Reverse** proxy

```caddy reverse-proxy --from [example.com] --to [localhost:8080]```

**Validate** Caddyfile

```caddy validate```

**Reload** configuration

```caddy reload```

# SYNOPSIS

**caddy** _command_ [_options_]

# DESCRIPTION

**caddy** is a modern web server with automatic HTTPS. It obtains and renews TLS certificates automatically via Let's Encrypt, provides HTTP/2 and HTTP/3 support, and uses a simple configuration format.

The server is designed for ease of use while maintaining high performance and security.

# PARAMETERS

**run**
> Start Caddy server

**start**
> Start Caddy in background

**stop**
> Stop Caddy server

**reload**
> Reload configuration

**validate**
> Validate Caddyfile

**file-server**
> Quick file server mode

**reverse-proxy**
> Quick reverse proxy mode

**--config** _file_
> Configuration file (default: Caddyfile)

**--adapter** _name_
> Config adapter (caddyfile, json)

# CADDYFILE

Simple configuration:
```
example.com {
    root * /var/www/html
    file_server
}
```

Reverse proxy:
```
example.com {
    reverse_proxy localhost:8080
}
```

# FEATURES

- Automatic HTTPS (Let's Encrypt)
- HTTP/2 and HTTP/3 support
- Reverse proxy
- Load balancing
- File server
- Template engine
- Dynamic configuration via API
- Plugin system

# QUICK COMMANDS

```bash
# Serve current directory
caddy file-server

# Serve on specific port
caddy file-server --listen :8080

# Reverse proxy
caddy reverse-proxy --from :80 --to :8080

# Start with Caddyfile
caddy run

# Validate config
caddy validate --config Caddyfile
```

# CAVEATS

Automatic HTTPS requires port 80/443 access. Let's Encrypt rate limits apply. Certificate storage needs disk space. Memory usage higher than nginx. Plugin ecosystem smaller than alternatives. Version 2.x not compatible with v1 configs.

# HISTORY

**Caddy** was created by Matt Holt in **2015** as a web server prioritizing ease of use with automatic HTTPS, with version 2.0 rewritten in **2019**.

# SEE ALSO

[nginx](/man/nginx)(8), [apache2](/man/apache2)(8), [traefik](/man/traefik)(1)
