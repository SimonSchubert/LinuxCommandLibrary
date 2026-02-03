# TLDR

**Initialize Incus**

```incus admin init```

**Launch a container**

```incus launch images:ubuntu/22.04 [container-name]```

**Launch a VM**

```incus launch images:ubuntu/22.04 [vm-name] --vm```

**List instances**

```incus list```

**Execute command in instance**

```incus exec [name] -- [command]```

**Open shell in instance**

```incus exec [name] -- bash```

**Stop an instance**

```incus stop [name]```

**Delete an instance**

```incus delete [name]```

# SYNOPSIS

**incus** _command_ [_options_]

# SUBCOMMANDS

**admin init**
> Initialize Incus.

**launch** _image_ _name_
> Create and start instance.

**start** _name_
> Start instance.

**stop** _name_
> Stop instance.

**delete** _name_
> Delete instance.

**exec** _name_ **--** _cmd_
> Run command in instance.

**list**
> List all instances.

**image list**
> List available images.

**copy**
> Copy instances.

**move**
> Move instances.

**snapshot**
> Manage snapshots.

# DESCRIPTION

**incus** is a system container and virtual machine manager. Community fork of LXD, maintained by the Linux Containers project. Manages containers via LXC and VMs via QEMU through a unified CLI and REST API. Supports local and remote access, profiles, storage pools, and networking.

# SEE ALSO

[lxc](/man/lxc)(1), [docker](/man/docker)(1)

