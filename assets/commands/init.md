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
> Multi-user mode without networking (Debian) or with networking (Red Hat)

**3**
> Multi-user mode with networking and text console

**5**
> Multi-user mode with networking and graphical desktop

**6**
> Reboot the system

# DESCRIPTION

**init** is the parent of all processes on the system, responsible for starting and stopping services at different runlevels. It is the traditional System V init daemon that manages the system state.

Runlevels define different system states, from single-user maintenance mode to full graphical desktop. Changing runlevels causes init to start or stop services as defined in /etc/rc.d or /etc/init.d scripts.

On modern systemd-based systems, init may be a compatibility wrapper that translates runlevel commands to systemd targets.

# CAVEATS

Behavior varies between distributions. On systemd systems, requires SYSVINIT compatibility. Direct runlevel changes can disrupt running services.

# HISTORY

System V init originated in AT&T UNIX System V in **1983**. It was the standard init system on most Linux distributions until systemd began replacing it around **2011**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [runlevel](/man/runlevel)(8), [telinit](/man/telinit)(8)
