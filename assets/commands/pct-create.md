# TLDR

**Create** container with disk size

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4```

Create with **memory** limit

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --memory 8192```

Create with **hostname** and password

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --hostname name --password pass```

Create with **network**

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --net0 name=eth0,bridge=vmbr0,ip=dhcp```

Create and **start** immediately

```pct create 100 local:vztmpl/distro.tar.zst --rootfs local-lvm:4 --start```

# SYNOPSIS

**pct create** _vmid_ _template_ [_OPTIONS_]

# DESCRIPTION

**pct create** creates a new LXC container in Proxmox VE from a template image. It configures storage, networking, resources, and other container properties during creation.

# PARAMETERS

**vmid**
> The numeric ID for the new container

**template**
> Path to the container template (e.g., local:vztmpl/distro.tar.zst)

**--rootfs** _storage:size_
> Root filesystem storage and size in GB

**--memory** _megabytes_
> Memory limit in MB

**--hostname** _name_
> Container hostname

**--password** _password_
> Root password for the container

**--net**_N_ _config_
> Network interface configuration

**--features** _list_
> Enable features like nesting

**--start**
> Start container after creation

# CAVEATS

Templates must be downloaded or uploaded to Proxmox storage first. The container ID must be unique across the cluster. Enable nesting for containers that run Docker or other containers inside.

# HISTORY

**pct create** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-clone](/man/pct-clone)(1), [pct-destroy](/man/pct-destroy)(1)
