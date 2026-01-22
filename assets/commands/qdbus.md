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

**qdbus** interacts with D-Bus services. Qt D-Bus tool.

The tool calls methods and properties. Introspects services.

qdbus queries D-Bus.

# CAVEATS

Qt dependency. For D-Bus interaction.

# HISTORY

qdbus is part of **Qt** for D-Bus interaction.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [gdbus](/man/gdbus)(1)

