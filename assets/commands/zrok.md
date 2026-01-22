# TLDR

**Share local HTTP service publicly**

```zrok share public localhost:[port]```

**Share with reserved subdomain**

```zrok reserve public localhost:[port] --unique-name [subdomain]```

**Share privately (requires zrok access)**

```zrok share private localhost:[port]```

**Access private share**

```zrok access private [share_token]```

**Copy files to share**

```zrok copy [file] [share_token]:[remote_path]```

# SYNOPSIS

**zrok** _command_ [_options_]

# SUBCOMMANDS

**enable**
> Enable zrok environment

**share** _mode_ _target_
> Share local resource

**reserve** _mode_ _target_
> Create reserved share

**release** _share_
> Release reserved share

**access** _mode_ _share_
> Access shared resource

**copy**
> Copy files to/from shares

**status**
> Show environment status

**disable**
> Disable zrok environment

# PARAMETERS (share)

**public**
> Publicly accessible share

**private**
> Share accessible only with token

**--backend-mode** _mode_
> Backend type (proxy, web, files)

**--unique-name** _name_
> Reserve specific subdomain

**--headless**
> Run without terminal UI

# DESCRIPTION

**zrok** is a next-generation sharing platform built on OpenZiti, providing secure tunneling for HTTP services, files, and arbitrary TCP/UDP traffic.

Public shares create internet-accessible URLs pointing to local services. Private shares require an access token and go through encrypted Ziti network overlay, providing zero-trust security.

zrok can share:
- HTTP/HTTPS services (web apps, APIs)
- Static files (file server mode)
- Raw TCP/UDP endpoints

Unlike simple tunnels, zrok's private shares never expose traffic to the public internet - all traffic stays within the zero-trust overlay network.

# CAVEATS

Public shares expose your local service to the internet. Ensure appropriate authentication/security.

Free tier has usage limits. Heavy usage may require a paid account or self-hosted infrastructure.

Reserved names persist but shares don't - you must re-run share commands after restart.

zrok account required. Run **zrok invite** to get started.

# SEE ALSO

[ngrok](/man/ngrok)(1), [cloudflared](/man/cloudflared)(1), [tailscale](/man/tailscale)(8)
