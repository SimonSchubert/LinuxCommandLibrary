# TAGLINE

Cloudflare Tunnel client for secure connections

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

**cloudflared** is the Cloudflare Tunnel client that creates secure, outbound-only connections from your origin server to Cloudflare's global network. This eliminates the need to expose public IP addresses or open inbound firewall ports, as all traffic is routed through Cloudflare's edge.

The tool supports tunneling HTTP, SSH, RDP, and arbitrary TCP protocols. Named tunnels provide persistent configurations, while quick tunnels offer temporary public URLs for development and testing. Tunnels can be configured to route traffic based on hostname and path rules defined in a YAML configuration file.

cloudflared also provides Cloudflare Access integration for authenticating users before they reach your origin, and can run as a system service for production deployments.

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

**~/.cloudflared/config.yml**
> Main tunnel configuration defining tunnel ID, credentials path, and ingress routing rules.

**~/.cloudflared/cert.pem**
> Origin certificate obtained during `cloudflared tunnel login`, used to authenticate tunnel creation.

# CAVEATS

Tunnel credentials are per-tunnel. Quick tunnels are temporary. Free tier available. Previously called Argo Tunnel.

# SEE ALSO

[ngrok](/man/ngrok)(1), [ssh](/man/ssh)(1)
