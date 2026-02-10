# TAGLINE

manages Linode cloud infrastructure

# TLDR

**List Linodes**

```linode-cli linodes list```

**Create Linode**

```linode-cli linodes create --type [g6-nanode-1] --region [us-east] --image [linode/ubuntu22.04]```

**View Linode**

```linode-cli linodes view [linode_id]```

**Reboot Linode**

```linode-cli linodes reboot [linode_id]```

**Delete Linode**

```linode-cli linodes delete [linode_id]```

**Configure CLI**

```linode-cli configure```

# SYNOPSIS

**linode-cli** _command_ [_subcommand_] [_options_]

# PARAMETERS

_COMMAND_
> Resource type (linodes, volumes, domains, etc.).

**linodes**
> Manage Linode instances.

**volumes**
> Manage block storage volumes.

**domains**
> Manage DNS domains.

**configure**
> Set up authentication.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli** manages Linode cloud infrastructure. It provides access to all Linode API features.

The tool controls virtual machines, storage, networking, and DNS from the command line.

# CAVEATS

Requires API token. Operations may incur charges. Token stored in ~/.config/linode-cli.

# HISTORY

linode-cli is the official **Linode** command-line interface for managing their cloud infrastructure services.

# SEE ALSO

[linode-cli-linodes](/man/linode-cli-linodes)(1), [linode-cli-volumes](/man/linode-cli-volumes)(1), [aws](/man/aws)(1)

