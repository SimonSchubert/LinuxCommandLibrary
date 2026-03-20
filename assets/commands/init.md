# TAGLINE

parent of all processes on the system, responsible for starting and stopping

# TLDR

Set system to **graphical** environment (runlevel 5)

```sudo init 5```

Set system to **multiuser terminal** (runlevel 3)

```sudo init 3```

Set system to **single user** mode (runlevel 1)

```sudo init 1```

**Shut down** the system

```init 0```

**Reboot** the system

```init 6```

# SYNOPSIS

**init** [_runlevel_]

# PARAMETERS

**0**
> Halt the system

**1** or **S**
> Single user mode (maintenance)

**2**
> Multi-user mode without NFS (Debian default multi-user with GUI)

**3**
> Multi-user mode with networking, text console only

**4**
> Unused/custom (available for user-defined purposes)

**5**
> Multi-user mode with networking and graphical desktop (Red Hat default GUI)

**6**
> Reboot the system

# DESCRIPTION

**init** is the parent of all processes on the system, responsible for starting and stopping services at different runlevels. It is the traditional System V init daemon that manages the system state.

Runlevels define different system states, from single-user maintenance mode to full graphical desktop. Changing runlevels causes init to start or stop services as defined in /etc/rc.d or /etc/init.d scripts.

On modern systemd-based systems, init may be a compatibility wrapper that translates runlevel commands to systemd targets.

# CAVEATS

Behavior varies between distributions. On systemd-based systems, **init** is a symlink to systemd and runlevel commands are translated to systemd targets (e.g., runlevel 3 maps to multi-user.target, runlevel 5 to graphical.target). Direct runlevel changes can disrupt running services. Use **systemctl** on modern systems.

# HISTORY

System V init originated in AT&T UNIX System V in **1983**. It was the standard init system on most Linux distributions until systemd began replacing it around **2011**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [telinit](/man/telinit)(8), [runlevel](/man/runlevel)(8), [halt](/man/halt)(8), [reboot](/man/reboot)(8), [shutdown](/man/shutdown)(8), [service](/man/service)(8)
