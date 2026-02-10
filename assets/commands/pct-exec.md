# TAGLINE

launches a command inside a specified Proxmox LXC container

# TLDR

**Execute** command in container

```pct exec 100 command```

Open **bash** shell

```pct exec 100 bash```

Pass **arguments**

```pct exec 100 -- command arguments```

# SYNOPSIS

**pct exec** _vmid_ [--] _command_ [_arguments_...]

# DESCRIPTION

**pct exec** launches a command inside a specified Proxmox LXC container. It provides direct command execution without needing to enter the container interactively.

# PARAMETERS

**vmid**
> The numeric ID of the container

**command**
> The command to execute inside the container

**--**
> Separator to pass arguments to the command

# CAVEATS

The container must be running to execute commands. The command runs as root inside the container. For interactive sessions, use **pct enter** instead.

# HISTORY

**pct exec** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1)
