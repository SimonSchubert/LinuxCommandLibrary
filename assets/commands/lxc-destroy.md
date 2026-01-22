# TLDR

**Delete** container

```sudo lxc-destroy [container_name]```

Display **help**

```lxc-destroy --help```

# SYNOPSIS

**lxc-destroy** **-n** _name_ [_options_]

# DESCRIPTION

**lxc-destroy** deletes a Linux container and its configuration. The container must be stopped before destruction.

# PARAMETERS

**-n, --name NAME**
> Container name to destroy

**-P, --lxcpath PATH**
> Container storage directory

**-f, --force**
> Force destruction even if running

**-s, --snapshots**
> Also destroy all snapshots

**-?, --help**
> Display help information

# CAVEATS

Requires root privileges. Permanently deletes container and its root filesystem. Stop container first unless using --force.

# SEE ALSO

[lxc-create](/man/lxc-create)(1), [lxc-stop](/man/lxc-stop)(1), [lxc-ls](/man/lxc-ls)(1)
