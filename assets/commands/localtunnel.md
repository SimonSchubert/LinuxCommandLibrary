# TAGLINE

exposes your localhost to the world through a public URL

# TLDR

**Expose local port**

```lt --port [3000]```

**Use custom subdomain**

```lt --port [3000] --subdomain [myapp]```

**Specify local host**

```lt --port [3000] --local-host [192.168.1.10]```

**Use custom server**

```lt --port [3000] --host [https://tunnel.example.com]```

**Print incoming request info**

```lt --port [3000] --print-requests```

**Tunnel to local HTTPS server**

```lt --port [443] --local-https```

# SYNOPSIS

**lt** [_options_]

# PARAMETERS

**--port** _port_
> Local port to expose.

**-s**, **--subdomain** _name_
> Request specific subdomain. Default is random characters.

**-l**, **--local-host** _host_
> Proxy to a hostname other than localhost. Also overrides the Host header.

**--host** _url_
> Tunnel server URL.

**--local-https**
> Enable tunneling to a local HTTPS server.

**--local-cert** _path_
> Path to certificate PEM file for local HTTPS server.

**--local-key** _path_
> Path to certificate key file for local HTTPS server.

**--local-ca** _path_
> Path to certificate authority file for self-signed certificates.

**--allow-invalid-cert**
> Disable certificate checks for local HTTPS server.

**--print-requests**
> Print basic request info (method and path) for each incoming request.

**-o**, **--open**
> Open tunnel URL in default browser.

# DESCRIPTION

**localtunnel** exposes your localhost to the world through a public URL. It creates a tunnel from a public server to your local machine, useful for testing webhooks, sharing work in progress, or mobile testing.

No account required; tunnels are ephemeral and close when the client disconnects.

# PROGRAMMATIC USE

```javascript
const localtunnel = require('localtunnel');
const tunnel = await localtunnel({ port: 3000 });
console.log(tunnel.url);
```

# CAVEATS

URLs are temporary. Subdomains not guaranteed. Free tier has rate limits. Not for production use. Requires Node.js.

# HISTORY

localtunnel was created by **Roman Shtylman** as a simple alternative to ngrok, providing free tunneling without signup.

# SEE ALSO

[ngrok](/man/ngrok)(1), [cloudflared](/man/cloudflared)(1), [ssh](/man/ssh)(1)
