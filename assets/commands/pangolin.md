# TAGLINE

command-line client for the Pangolin tunneled reverse proxy and VPN platform

# TLDR

**Log in** to Pangolin Cloud or a self-hosted instance

```pangolin login```

**Connect** as the logged-in user

```pangolin up```

**Connect a machine client** in the foreground

```pangolin up --id [client_id] --secret [client_secret] --endpoint [https://pangolin.example.com] --attach```

**Connect with debug logging**

```pangolin up --log-level debug --attach```

**Install a persistent client service**

```sudo pangolin service install client --id [client_id] --secret [client_secret] --endpoint [https://pangolin.example.com]```

**Stop the connection**

```pangolin down```

**Display help**

```pangolin --help```

# SYNOPSIS

**pangolin** _command_ [_options_]

**pangolin** **up** [**client**|**site**] [_options_]

# PARAMETERS

**login**
> Log in to Pangolin.

**logout**
> Log out from Pangolin.

**up**
> Start a connection. Runs **up client** when no subcommand is given.

**up site**
> Start a site connection (replaces the standalone Newt client).

**down**
> Stop a connection.

**status**
> Show connection status.

**logs**
> View client logs.

**select**
> Select the account information to use, such as an organization or exit node.

**list**
> List resources and other items from the server.

**service**
> Manage background services that keep a site or client running.

**ssh**
> Run an interactive SSH session using just-in-time SSH certificates.

**scp**
> Run scp using just-in-time SSH certificates.

**update**
> Update Pangolin CLI to the latest version.

**version**
> Print the version number.

**--id** _ID_
> Client ID for machine clients.

**--secret** _SECRET_
> Client secret for machine clients.

**--endpoint** _URL_
> Pangolin server URL, required if not logged in.

**--org** _ID_
> Organization ID (default: selected organization if logged in).

**--attach**
> Run in the foreground instead of as a background process.

**--silent**
> Disable the TUI and run silently when detached.

**--log-level** _LEVEL_
> Set logging level (default: info).

**--mtu** _N_
> Maximum transmission unit (default: 1280).

**--interface-name** _NAME_
> Name of the tunnel interface (default: pangolin).

**--disable-relay**
> Disable relay connections.

**--exit-node** _NICE-ID_
> Route all traffic through this exit node for the connection. Requires being logged in.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Pangolin** is a self-hosted or cloud networking platform combining tunneled reverse proxying, identity-aware access control and private resource access over WireGuard. The **pangolin** command is its official CLI client, and it connects a user device or a machine client to a Pangolin server. It serves as an alternative to Cloudflare Tunnels and Ngrok setups.

Machine clients authenticate with an ID and secret and need no login, which suits servers and automation.

# CAVEATS

Requires a Pangolin server (self-hosted or Pangolin Cloud), and machine client credentials must be created on it first. Passing **--secret** on the command line exposes it in shell history and process listings. VPN functionality is not supported on Windows.

The older standalone clients are being retired: **olm** is deprecated and **newt** is being phased out in favor of **pangolin up site**.

# HISTORY

Pangolin is developed by **Fossorial** (fosrl) and dual licensed under AGPL-3 and the Fossorial Commercial License.

# SEE ALSO

[ssh](/man/ssh)(1), [ngrok](/man/ngrok)(1), [cloudflared](/man/cloudflared)(1), [frp](/man/frp)(1), [wg](/man/wg)(8)

# RESOURCES

```[Source code](https://github.com/fosrl/cli)```

```[Homepage](https://pangolin.net)```

```[Documentation](https://docs.pangolin.net/manage/clients/platforms/cli)```

<!-- verified: 2026-11-09 -->
