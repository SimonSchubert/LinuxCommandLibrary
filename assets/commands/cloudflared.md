# TLDR

**Login to Cloudflare**

```cloudflared tunnel login```

**Create tunnel**

```cloudflared tunnel create [tunnel-name]```

**List tunnels**

```cloudflared tunnel list```

**Run tunnel**

```cloudflared tunnel run [tunnel-name]```

**Route DNS to tunnel**

```cloudflared tunnel route dns [tunnel-name] [hostname]```

**Quick tunnel (temporary)**

```cloudflared tunnel --url http://localhost:[8080]```

**Delete tunnel**

```cloudflared tunnel delete [tunnel-name]```

# SYNOPSIS

**cloudflared** tunnel _command_ [_options_]
**cloudflared** access _command_ [_options_]

# DESCRIPTION

**cloudflared** is the Cloudflare Tunnel client. Creates secure outbound-only connections from your origin to Cloudflare's network without exposing public IPs. Supports HTTP, SSH, RDP, and other protocols.

# TUNNEL COMMANDS

**login**
> Authenticate with Cloudflare

**create** _name_
> Create new tunnel

**run** _name_
> Start tunnel

**list**
> List all tunnels

**delete** _name_
> Remove tunnel

**route** dns/ip
> Configure routing

**info** _name_
> Show tunnel details

**cleanup**
> Delete stale connections

# PARAMETERS

**--url** _url_
> Local service URL

**--hostname** _host_
> Public hostname

**--config** _file_
> Configuration file path

**--credentials-file** _file_
> Tunnel credentials

**--origincert** _file_
> Origin certificate path

**--no-autoupdate**
> Disable auto-updates

# CONFIGURATION

~/.cloudflared/config.yml:
```yaml
tunnel: <tunnel-id>
credentials-file: /path/to/creds.json
ingress:
  - hostname: app.example.com
    service: http://localhost:8080
  - service: http_status:404
```

# CAVEATS

Tunnel credentials are per-tunnel. Quick tunnels are temporary. Free tier available. Previously called Argo Tunnel.

# SEE ALSO

[ngrok](/man/ngrok)(1), [ssh](/man/ssh)(1)
