# TLDR

Enable **autostart** on boot

```pct set 100 --onboot```

Set **static IP**

```pct set 100 --net0 name=eth0,bridge=vmbr0,ip=10.0.0.100/24,gw=10.0.0.1```

Set **memory** and CPU limit

```pct set 100 --memory 8192 --cpulimit 4```

**Mount** host directory

```pct set 100 --mp0 /host/path,mp=/guest/mount```

Set **tags**

```pct set 100 --tags tag1,tag2```

**Delete** options

```pct set 100 --delete net0,mp0```

# SYNOPSIS

**pct set** _vmid_ [_OPTIONS_]

# DESCRIPTION

**pct set** modifies the configuration of a Proxmox LXC container. Changes may require a container restart to take effect. This command can configure networking, resources, mount points, and other container properties.

# PARAMETERS

**vmid**
> The numeric ID of the container

**--onboot** _boolean_
> Start container on host boot

**--memory** _megabytes_
> Memory limit in MB

**--cpulimit** _number_
> CPU time limit (e.g., 4 for 4 cores worth)

**--net**_N_ _config_
> Network interface configuration

**--mp**_N_ _config_
> Mount point configuration for bind mounts

**--tags** _list_
> Comma-separated list of tags

**--delete** _list_
> Remove specified options

# CAVEATS

Some changes require stopping the container first. Network changes may disconnect running sessions. Mount points must exist on the host system.

# HISTORY

**pct set** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-config](/man/pct-config)(1)
