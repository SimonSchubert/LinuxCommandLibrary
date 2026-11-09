# TAGLINE

localhost tunneling service for public URL access

# TLDR

**Log in** to the Expose network

```expose login```

**Share the current directory's site** (assumes folder.test)

```expose```

**Expose local server**

```expose share [http://localhost:8000]```

**Expose with custom subdomain**

```expose share [http://localhost:3000] --subdomain [myapp]```

**Expose with basic authentication**

```expose share [http://localhost:8000] --basicAuth="[user:password]"```

**Set authentication token**

```expose token [your_auth_token]```

**Expose with a custom domain**

```expose share [http://localhost:8000] --domain [example.com]```

# SYNOPSIS

**expose** _command_ [_options_]

# PARAMETERS

**share** _URL_
> Create tunnel to local server.

**share-port** _PORT_
> Share a local port.

**login**
> Log in via the browser and store the authentication token.

**token** _TOKEN_
> Set the authentication token manually.

**--subdomain** _NAME_
> Use a custom subdomain.

**--basicAuth** _USER:PASS_
> Add basic HTTP authentication to the tunnel.

**--auth** _TOKEN_
> Use this authentication token instead of the stored one.

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

**--no-vite-detection**
> Disable automatic Vite development server detection.

**--qr-code**, **--qr**
> Show a QR code for the shared URL.

# DESCRIPTION

**Expose** is a tunneling service written in PHP that creates secure HTTPS tunnels to expose local servers to the internet. It provides public URLs for development, testing, and demos without deploying.

Custom subdomains and domains allow memorable URLs for presentations or client demos. The tool is an open-source alternative to ngrok, built by BeyondCode.

# CAVEATS

The free plan is limited to one server in Germany, uses a random subdomain on every connection and has a connection time limit. Custom subdomains and domains require Expose Pro or a self-hosted server. Not intended for production use. The hosted service requires an account, set up with **expose login**.

# HISTORY

Expose is one of several localhost tunneling services, providing developers a way to share local development servers without deployment or firewall configuration.

# SEE ALSO

[ngrok](/man/ngrok)(1), [localtunnel](/man/localtunnel)(1)

# RESOURCES

```[Source code](https://github.com/exposedev/expose)```

```[Homepage](https://expose.dev/)```

```[Documentation](https://expose.dev/docs/introduction)```

<!-- verified: 2026-11-09 -->
