# TAGLINE

Introspect and monitor the D-Bus message bus

# TLDR

Show all **peers on the bus**

```busctl list```

Show **process information** for a service or PID

```busctl status [service|pid]```

**Monitor** messages on the bus

```busctl monitor [service1] [service2] ...```

Show **object tree** of services

```busctl tree [service1] [service2] ...```

**Introspect** an object's interfaces

```busctl introspect [service] [path/to/object]```

**Get property** value from an object

```busctl get-property [service] [path/to/object] [interface_name] [property_name]```

**Call a method** on an object

```busctl call [service] [path/to/object] [interface_name] [method_name]```

# SYNOPSIS

**busctl** [_command_] [_options_] [_arguments_]

# DESCRIPTION

**busctl** introspects and monitors the D-Bus message bus. D-Bus is an inter-process communication system used extensively in Linux for communication between system services and desktop applications.

The tool can list services, monitor message traffic, inspect object hierarchies, and invoke methods on D-Bus objects.

# SUBCOMMANDS

**list**
> List all peers on the bus

**status**
> Show process info for a service

**monitor**
> Watch message traffic

**tree**
> Show object hierarchy

**introspect**
> Examine object interfaces

**get-property**
> Read a property value

**set-property**
> Set a property value

**call**
> Invoke a method

# PARAMETERS

**--system**
> Connect to system bus (default)

**--user**
> Connect to user session bus

**-j, --json**
> Output in JSON format

**--no-pager**
> Disable pager

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [gdbus](/man/gdbus)(1), [systemctl](/man/systemctl)(1)
