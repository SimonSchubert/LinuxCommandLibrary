# TAGLINE

Query and interact with D-Bus services

# TLDR

**List D-Bus services**

```qdbus```

**List service objects**

```qdbus [org.freedesktop.DBus]```

**Call method**

```qdbus [service] [object] [method]```

**Get property**

```qdbus [service] [object] [property]```

# SYNOPSIS

**qdbus** [_options_] [_service_] [_object_] [_method_]

# PARAMETERS

_SERVICE_
> D-Bus service name.

_OBJECT_
> Object path.

_METHOD_
> Method or property.

**--system**
> Use system bus.

**--session**
> Use session bus.

**--literal**
> Print literal reply.

# DESCRIPTION

**qdbus** is a Qt-based command-line tool for interacting with D-Bus services on Linux desktops. It can list available services, browse their object hierarchies, read and write properties, and call methods, making it useful for debugging, scripting, and integrating with desktop applications.

When invoked without arguments, it lists all services on the session bus. Adding a service name shows its object paths, and adding an object path shows its interfaces and methods. The **--system** flag switches to the system bus for interacting with system-level services like NetworkManager or systemd.

# CAVEATS

Qt dependency. For D-Bus interaction.

# HISTORY

qdbus is part of **Qt** for D-Bus interaction.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [gdbus](/man/gdbus)(1)

