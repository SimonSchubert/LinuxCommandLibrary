# TAGLINE

message bus daemon for inter-process communication

# TLDR

Run with a **configuration file**

```dbus-daemon --config-file [path/to/file]```

Run **session** message bus

```dbus-daemon --session```

Run **system** message bus

```dbus-daemon --system```

Set **address** to listen on

```dbus-daemon --address [address]```

Output **PID** to stdout

```dbus-daemon --print-pid```

Force **syslog** logging

```dbus-daemon --syslog```

# SYNOPSIS

**dbus-daemon** [_options_]

# DESCRIPTION

**dbus-daemon** is the D-Bus message bus daemon that enables inter-process communication (IPC) between applications on Linux and Unix systems. It acts as a message router, receiving messages from one application and delivering them to the appropriate destination based on bus names and object paths.

Two main bus types exist: the **session bus** (per-user) for desktop applications and user services, and the **system bus** (system-wide) for system services and hardware events. The session bus is created when a user logs in and exists for the duration of their session. The system bus is started at boot and runs with elevated privileges.

D-Bus is fundamental to modern Linux desktop environments and system services. Applications use it for everything from notification delivery to hardware management. For example, NetworkManager, systemd, PulseAudio, and most desktop applications communicate through D-Bus.

The daemon enforces security policies defined in its configuration files, controlling which applications can own bus names, send messages to specific services, and receive broadcasts. This prevents unauthorized access to sensitive system functionality.

# PARAMETERS

**--config-file** _file_
> Use specified configuration file

**--session**
> Use session bus configuration

**--system**
> Use system bus configuration

**--address** _address_
> Listen address override

**--print-pid**
> Print PID to stdout

**--print-address**
> Print address to stdout

**--syslog**
> Force syslog logging

**--fork**
> Fork into background

# CONFIGURATION

**/etc/dbus-1/system.conf**
> System bus configuration file controlling security policies and allowed services.

**/etc/dbus-1/session.conf**
> Session bus configuration template defining per-user session settings.

# CAVEATS

Usually started automatically by systemd or session managers. Direct invocation is rarely needed. System bus requires root privileges. Configuration affects security and available services.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [dbus-monitor](/man/dbus-monitor)(1), [busctl](/man/busctl)(1)
