# TAGLINE

command-line interface for Hetzner Cloud

# TLDR

**List servers**

```hcloud server list```

**Create server**

```hcloud server create --name [myserver] --type [cx22] --image [ubuntu-24.04]```

**SSH to server**

```hcloud server ssh [myserver]```

**Delete server**

```hcloud server delete [myserver]```

**List images**

```hcloud image list```

**Create snapshot**

```hcloud server create-image [myserver] --type snapshot```

# SYNOPSIS

**hcloud** [_global-options_] _command_ _subcommand_ [_options_]

# PARAMETERS

_COMMAND_
> Resource or subcommand to execute.

**server**
> Manage cloud servers.

**image**
> Manage server images and snapshots.

**volume**
> Manage block storage volumes.

**network**
> Manage private networks.

**firewall**
> Manage firewalls and rules.

**load-balancer**
> Manage load balancers.

**ssh-key**
> Manage SSH keys.

**certificate**
> Manage TLS certificates.

**context**
> Manage CLI contexts (project/API token profiles).

**config**
> Manage local CLI configuration.

**--context** _name_
> Use a specific context instead of the active one.

**-o**, **--output** _format_
> Output format: table, json, or yaml.

**--debug**
> Enable debug output.

**--help**
> Display help information.

# DESCRIPTION

**hcloud** is the command-line interface for Hetzner Cloud. It manages cloud servers, images, volumes, and networks.

The tool provides complete control over Hetzner Cloud infrastructure. It supports automation and scripting for cloud resource management.

# CAVEATS

Requires API token. Hetzner Cloud specific. Some operations incur costs.

# HISTORY

hcloud was developed by **Hetzner** as the official CLI for their cloud platform.

# SEE ALSO

[doctl](/man/doctl)(1), [aws](/man/aws)(1), [gcloud](/man/gcloud)(1)

# RESOURCES

```[Source code](https://github.com/hetznercloud/cli)```
```[Documentation](https://github.com/hetznercloud/cli/blob/main/docs/reference/manual/hcloud.md)```
```[Homepage](https://www.hetzner.com/cloud)```

<!-- verified: 2026-07-17 -->
