# TAGLINE

localhost tunneling service for public URL access

# TLDR

**Expose local server**

```expose share [http://localhost:8000]```

**Expose with custom subdomain**

```expose share [http://localhost:3000] --subdomain [myapp]```

**Expose with basic authentication**

```expose share [http://localhost:8000] --auth [user:password]```

**Set authentication token**

```expose token [your_auth_token]```

**Expose with a custom domain**

```expose share [http://localhost:8000] --domain [example.com]```

# SYNOPSIS

**expose** _command_ [_options_]

# PARAMETERS

**share** _URL_
> Create tunnel to local server.

**token** _TOKEN_
> Set the authentication token.

**--subdomain** _NAME_
> Use a custom subdomain.

**--auth** _USER:PASS_
> Add basic HTTP authentication to the tunnel.

**--domain** _DOMAIN_
> Use a custom domain.

**--server** _SERVER_
> Connect to a specific Expose server.

**--server-host** _HOST_
> Specify the server host.

**--server-port** _PORT_
> Specify the server port.

**--dns** _DNS_
> Specify a DNS server.

# DESCRIPTION

**Expose** is a tunneling service written in PHP that creates secure HTTPS tunnels to expose local servers to the internet. It provides public URLs for development, testing, and demos without deploying.

Custom subdomains and domains allow memorable URLs for presentations or client demos. The tool is an open-source alternative to ngrok, built by BeyondCode.

# CAVEATS

Free tier has limitations on tunnel duration and custom subdomains. Tunnel URLs may change on reconnect. Not intended for production use. Requires an authentication token for the hosted service.

# HISTORY

Expose is one of several localhost tunneling services, providing developers a way to share local development servers without deployment or firewall configuration.

# SEE ALSO

[ngrok](/man/ngrok)(1), [localtunnel](/man/localtunnel)(1)
