# TAGLINE

self-hosted implementation of the Tailscale control server

# TLDR

**Start the server**

```headscale serve```

**Create a user**

```headscale users create [username]```

**List users**

```headscale users list```

**Create auth key**

```headscale authkeys create --user [username]```

**List nodes**

```headscale nodes list```

**Register a node**

```headscale nodes register --user [username] --key [nodekey:abc123]```

**Delete a node**

```headscale nodes delete --id [1]```

**Enable routes for a node**

```headscale routes enable --route [10.0.0.0/24]```

# SYNOPSIS

**headscale** _command_ [_subcommand_] [_options_]

# COMMANDS

**serve**
> Start Headscale server.

**users** create|list|rename|destroy
> Manage users (namespaces).

**nodes** list|register|delete|expire|rename|move|tag
> Manage nodes.

**authkeys** create|list|expire
> Manage pre-authentication keys.

**routes** list|enable|disable
> Manage subnet routes.

**preauthkeys** create|list|expire
> Alias for authkeys.

**apikeys** create|list|expire
> Manage API keys.

**debug**
> Debug commands.

**completion**
> Generate shell completions.

# PARAMETERS

**--user**, **-u** _name_
> User (namespace) name.

**--key** _nodekey_
> Node key for registration.

**--id** _id_
> Node or route ID.

**--expiration** _duration_
> Key expiration time.

**--reusable**
> Create reusable auth key.

**--ephemeral**
> Create ephemeral auth key.

**--tags** _list_
> ACL tags for auth key.

**--output** _format_
> Output format: human, json, yaml.

# DESCRIPTION

**headscale** is a self-hosted implementation of the Tailscale control server. It coordinates WireGuard connections between Tailscale clients.

**serve** starts the coordination server. Clients connect to exchange keys and discover peers. Configuration is in **/etc/headscale/config.yaml**.

Users (namespaces) organize nodes. Each user has isolated nodes unless ACL policies allow cross-user communication. Create users before registering nodes.

**authkeys** create pre-authentication keys for unattended registration. Clients use these instead of interactive login. Keys can be reusable or single-use.

Subnet routes advertised by nodes require explicit enabling with **routes enable**. This controls which networks are accessible through the mesh.

ACL policies defined in config control traffic between nodes based on users, groups, and tags.

# CAVEATS

Requires TLS certificate for production. DERP servers needed for NAT traversal. Not all Tailscale features are supported. Tailscale clients need HEADSCALE_URL configuration.

# HISTORY

Headscale was created by **Juan Font** and first released in **2020**. It provides self-hosted alternative to Tailscale's coordination service while using the same WireGuard-based clients. The project grew from desire for self-hosted mesh VPN without vendor control. Headscale is popular for organizations wanting Tailscale compatibility with full infrastructure ownership.

# SEE ALSO

[tailscale](/man/tailscale)(1), [wireguard](/man/wireguard)(1), [nebula](/man/nebula)(1)
