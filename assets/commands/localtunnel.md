# TLDR

**Expose local port**

```lt --port [3000]```

**Use custom subdomain**

```lt --port [3000] --subdomain [myapp]```

**Specify local host**

```lt --port [3000] --local-host [192.168.1.10]```

**Use custom server**

```lt --port [3000] --host [https://tunnel.example.com]```

**Print only URL**

```lt --port [3000] --print-requests```

# SYNOPSIS

**lt** [_options_]

# PARAMETERS

**--port** _port_
> Local port to expose.

**--subdomain** _name_
> Request specific subdomain.

**--local-host** _host_
> Local host to expose.

**--host** _url_
> Tunnel server URL.

**--print-requests**
> Print request info.

**--open**
> Open URL in browser.

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

[ngrok](/man/ngrok)(1), [cloudflared](/man/cloudflared)(1), [serveo](/man/serveo)(1), [ssh](/man/ssh)(1)
