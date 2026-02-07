# TAGLINE

localhost tunneling service for public URL access

# TLDR

**Expose local server**

```expose share [http://localhost:8000]```

**Expose with custom** subdomain

```expose share [http://localhost:3000] --subdomain [myapp]```

**List active tunnels**

```expose list```

**Stop sharing**

```expose close [tunnel_id]```

**Authenticate**

```expose auth [token]```

# SYNOPSIS

**expose** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: share, list, close, auth.

**share** _URL_
> Create tunnel to local server.

**--subdomain** _NAME_
> Custom subdomain.

**list**
> Show active tunnels.

**close** _ID_
> Close tunnel.

**auth** _TOKEN_
> Set authentication token.

**--help**
> Display help information.

# DESCRIPTION

**Expose** creates secure tunnels to expose local servers to the internet. It provides public URLs for development, testing, and demos without deploying.

The tool handles HTTPS automatically, providing secure access to local services. Custom subdomains allow memorable URLs for presentations or client demos.

Expose is similar to ngrok, providing localhost tunneling for development workflows.

# CAVEATS

Free tier has limitations. Tunnel URLs may change on reconnect. Not for production use. Requires account for custom domains.

# HISTORY

Expose is one of several localhost tunneling services, providing developers a way to share local development servers without deployment or firewall configuration.

# SEE ALSO

[ngrok](/man/ngrok)(1), [localtunnel](/man/localtunnel)(1)
