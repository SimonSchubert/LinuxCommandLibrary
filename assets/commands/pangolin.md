# TAGLINE

self-hosted tunneled reverse proxy with built-in authentication

# TLDR

**Connect to a Pangolin server with ID and secret**

```pangolin --id [client_id] --secret [client_secret] --endpoint [https://pangolin.example.com]```

**Connect with debug logging**

```pangolin --id [client_id] --secret [client_secret] --endpoint [https://pangolin.example.com] --log-level DEBUG```

**Display help**

```pangolin --help```

# SYNOPSIS

**pangolin** [_options_]

# PARAMETERS

**--id** _ID_
> Client identifier for authentication.

**--secret** _SECRET_
> Client secret for authentication.

**--endpoint** _URL_
> Pangolin server endpoint URL.

**--log-level** _LEVEL_
> Set logging level (e.g., DEBUG).

**--help**
> Display help information.

# DESCRIPTION

**Pangolin** is a self-hosted tunneled reverse proxy server with built-in identity and access management. It uses WireGuard tunnels via its companion client **Newt** to securely expose private resources without complex network configurations. Pangolin serves as an alternative to Cloudflare Tunnels and Ngrok.

# CAVEATS

Requires a running Pangolin server component. Client ID and secret must be provisioned on the server first. The companion tunnel client is called Newt.

# SEE ALSO

[ssh](/man/ssh)(1), [ngrok](/man/ngrok)(1)

