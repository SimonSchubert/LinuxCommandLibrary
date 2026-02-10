# TAGLINE

LXC container management tool for Proxmox VE

# TLDR

**List** containers

```pct list```

**Start/Stop** container

```pct start 100```

**Enter** container shell

```pct enter 100```

**Create** container

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4```

**Resize** disk

```pct resize 100 rootfs 20G```

**Show** configuration

```pct config 100```

**Snapshot** container

```pct snapshot 100 my-snapshot --description "description"```

**Destroy** container

```pct destroy 100 --purge```

# SYNOPSIS

**pct** _command_ [_OPTIONS_] [_vmid_]

# DESCRIPTION

**pct** is the LXC container management tool for Proxmox VE. It provides a complete command-line interface for creating, configuring, starting, stopping, and managing Linux containers.

# PARAMETERS

**list**
> List all containers

**create** _vmid_ _template_
> Create a new container from template

**config** _vmid_
> Display container configuration

**set** _vmid_
> Modify container configuration

**start** _vmid_
> Start a container

**stop** _vmid_
> Stop a container

**enter** _vmid_
> Access container shell

**exec** _vmid_ _command_
> Execute command in container

**snapshot** _vmid_ _name_
> Create a snapshot

**destroy** _vmid_
> Remove a container

**resize** _vmid_ _disk_ _size_
> Resize container disk

**--purge**
> Remove all related resources when destroying

# CAVEATS

Container IDs must be unique across the Proxmox cluster. Some operations require the container to be stopped. Nesting must be enabled for containers running Docker or LXC inside.

# HISTORY

**pct** is part of the **Proxmox VE** virtualization platform, providing lightweight containerization using LXC technology.

# SEE ALSO

[pct-create](/man/pct-create)(1), [pct-exec](/man/pct-exec)(1), [qm](/man/qm)(1)
