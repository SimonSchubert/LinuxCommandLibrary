# TLDR

**List servers**

```hcloud server list```

**Create server**

```hcloud server create --name [myserver] --type [cx11] --image [ubuntu-22.04]```

**SSH to server**

```hcloud server ssh [myserver]```

**Delete server**

```hcloud server delete [myserver]```

**List images**

```hcloud image list```

**Create snapshot**

```hcloud server create-image [myserver] --type snapshot```

# SYNOPSIS

**hcloud** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**server**
> Server operations.

**image**
> Image operations.

**volume**
> Volume operations.

**network**
> Network operations.

**context**
> Context management.

**--help**
> Display help information.

# DESCRIPTION

**hcloud** is the command-line interface for Hetzner Cloud. It manages cloud servers, images, volumes, and networks.

The tool provides complete control over Hetzner Cloud infrastructure. It supports automation and scripting for cloud resource management.

hcloud manages Hetzner Cloud resources.

# CAVEATS

Requires API token. Hetzner Cloud specific. Some operations incur costs.

# HISTORY

hcloud was developed by **Hetzner** as the official CLI for their cloud platform.

# SEE ALSO

[doctl](/man/doctl)(1), [aws](/man/aws)(1), [gcloud](/man/gcloud)(1)
