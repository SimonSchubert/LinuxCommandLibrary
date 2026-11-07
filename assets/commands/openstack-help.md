# TAGLINE

displays help information for OpenStack CLI commands

# TLDR

**Show general help**

```openstack help```

**Show help for a command**

```openstack help [server create]```

**Show help** using the --help flag

```openstack [server create] --help```

**List all available commands**

```openstack command list```

**List commands** of one group

```openstack command list --group [compute]```

# SYNOPSIS

**openstack help** [_command_...]

# PARAMETERS

_command_
> Command (one or more words) to get help for. Without it, general usage and all commands are listed.

# DESCRIPTION

**openstack help** displays help information for OpenStack CLI commands. It shows usage, positional arguments and options for a given command, or the global options and full command list when called without arguments. It is equivalent to running a command with **--help**.

**openstack command list** complements it by listing commands grouped by the plugin (compute, network, image, volume, ...) that provides them.

# CAVEATS

Available commands depend on installed client plugins (for example **python-heatclient** for **openstack stack**). Some help output requires valid credentials because the client discovers API versions from the cloud.

# SEE ALSO

[openstack](/man/openstack)(1), [openstack-server](/man/openstack-server)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/)```

<!-- verified: 2026-11-07 -->
