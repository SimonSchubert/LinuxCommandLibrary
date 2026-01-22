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

**dbus-daemon** is the D-Bus message bus daemon that enables inter-process communication between applications. It routes messages between connected programs using the D-Bus protocol.

Two main bus types exist: the session bus (per-user) for desktop applications, and the system bus (systemwide) for system services.

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

# CAVEATS

Usually started automatically by systemd or session managers. Direct invocation is rarely needed. System bus requires root privileges. Configuration affects security and available services.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [dbus-monitor](/man/dbus-monitor)(1), [busctl](/man/busctl)(1)
