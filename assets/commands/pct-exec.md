# TAGLINE

launches a command inside a specified Proxmox LXC container

# TLDR

**Execute** a command in a container

```pct exec [100] [command]```

**Pass arguments** to the command (use -- so pct does not parse them)

```pct exec [100] -- [ls] [-la] [/root]```

**Run a shell pipeline** inside the container

```pct exec [100] -- bash -c "[apt update && apt -y upgrade]"```

**Run with a clean environment** instead of inheriting the host's

```pct exec [100] --keep-env 0 -- [env]```

Open a **bash** shell

```pct exec [100] bash```

# SYNOPSIS

**pct exec** _vmid_ [_extra-args_] [_OPTIONS_]

# PARAMETERS

_vmid_
> The numeric ID of the LXC container (100 - 999999999).

_extra-args_
> The command and any arguments to execute inside the container.

**--keep-env** _boolean_
> Keep the current environment (default 1). Upstream announced this default will be disabled with Proxmox VE 9; set it explicitly if you rely on it.

**--**
> Separator that stops **pct** from interpreting subsequent flags, so they are passed through to the command.

# DESCRIPTION

**pct exec** launches a command inside a specified Proxmox LXC container. It provides direct command execution without needing to enter the container interactively, which makes it suitable for scripting and automation from the Proxmox host.

# CAVEATS

The container must be running. The command runs as **root** inside the container, regardless of the host user invoking **pct exec**. For an interactive login shell use **pct enter** instead. The command's exit status is returned to the caller, but pre-execution failures (container not running, etc.) yield Proxmox-specific error codes. Quote compound commands with **bash -c**, otherwise pipes and **&&** are interpreted by the host shell.

# HISTORY

**pct exec** is part of the **pve-container** package of the **Proxmox VE** virtualization platform, which replaced OpenVZ with LXC containers in **Proxmox VE 4.0** (2015).

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [lxc-attach](/man/lxc-attach)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-23 -->
