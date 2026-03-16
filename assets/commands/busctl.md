# TAGLINE

Introspect and monitor the D-Bus message bus

# TLDR

Show all **peers on the bus**

```busctl list```

Show all peers on the **user session bus**

```busctl --user list```

Show **process information** for a service or PID

```busctl status [service|pid]```

**Monitor** messages on the bus

```busctl monitor [service1] [service2] ...```

**Capture** bus traffic in pcap format

```busctl capture [service] > [bus-traffic.pcap]```

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
> Show process info for a service or PID

**monitor**
> Watch message traffic

**capture**
> Capture bus traffic in pcap format

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

**emit**
> Emit a signal

**wait-signal**
> Wait for a specific signal

# PARAMETERS

**--system**
> Connect to system bus (default).

**--user**
> Connect to user session bus.

**--address** _ADDRESS_
> Connect to the bus specified by ADDRESS.

**-j**, **--json**=_MODE_
> Output in JSON format. MODE is short, pretty, or off.

**--verbose**
> Show verbose output for call or get-property commands.

**--expect-reply**=_BOOL_
> Whether to wait for method call completion. Defaults to yes.

**--auto-start**=_BOOL_
> Whether method calls should auto-start the target service. Defaults to yes.

**--list**
> Show a flat list instead of a tree with the tree command.

**--unique**
> Show only unique bus names (e.g., :1.42).

**--acquired**
> Show only well-known bus names.

**--activatable**
> Show only activatable services not yet started.

**--no-pager**
> Disable pager.

**--no-legend**
> Do not print column headers and footers.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [dbus-monitor](/man/dbus-monitor)(1), [gdbus](/man/gdbus)(1), [systemctl](/man/systemctl)(1)
