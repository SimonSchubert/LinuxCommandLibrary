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

Run in **foreground** without forking

```dbus-daemon --session --nofork```

Print **version**

```dbus-daemon --version```

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

**--print-pid**[=_DESCRIPTOR_]
> Print PID to stdout, or to the given file descriptor

**--print-address**[=_DESCRIPTOR_]
> Print bus address to stdout, or to the given file descriptor

**--syslog**
> Enable syslog logging in addition to stderr

**--nofork**
> Do not fork into background, even if configured to do so

**--fork**
> Fork into background, even if not configured to do so

**--nopidfile**
> Do not write a PID file even if configured to do so

**--nosyslog**
> Force output to stderr only, do not use syslog

**--syslog-only**
> Force syslog logging only, do not duplicate messages to stderr

**--introspect**
> Print introspection information for all D-Bus internal interfaces and exit

**--systemd-activation**
> Enable systemd-style service activation

**--version**
> Print daemon version and exit

# CONFIGURATION

**/etc/dbus-1/system.conf**
> System bus configuration file controlling security policies and allowed services.

**/etc/dbus-1/session.conf**
> Session bus configuration template defining per-user session settings.

# CAVEATS

Usually started automatically by systemd or session managers. Direct invocation is rarely needed. System bus requires root privileges. Configuration affects security and available services.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [dbus-monitor](/man/dbus-monitor)(1), [dbus-launch](/man/dbus-launch)(1), [busctl](/man/busctl)(1)
