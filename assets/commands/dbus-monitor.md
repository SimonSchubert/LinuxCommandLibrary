# TAGLINE

D-Bus message bus monitoring and debugging tool

# TLDR

**Monitor session bus**

```dbus-monitor```

**Monitor system bus**

```dbus-monitor --system```

**Filter by interface**

```dbus-monitor "interface='[org.freedesktop.Notifications]'"```

**Monitor specific sender**

```dbus-monitor "sender='[org.gnome.Shell]'"```

**Monitor method calls only**

```dbus-monitor "type='method_call'"```

**Profile mode** (machine-readable)

```dbus-monitor --profile```

# SYNOPSIS

**dbus-monitor** [_options_] [_filter_...]

# DESCRIPTION

**dbus-monitor** displays D-Bus messages passing through the message bus. It's useful for debugging D-Bus services, understanding inter-process communication, and reverse-engineering application behavior.

The tool connects to the bus and becomes an eavesdropper, showing all messages matching the specified filters. Without filters, it shows all messages.

# PARAMETERS

**--system**
> Monitor system bus.

**--session**
> Monitor session bus (default).

**--address** _addr_
> Connect to specific bus address.

**--profile**
> Output in profile format.

**--monitor**
> Output in monitor format (default).

**--pcap**
> Output in pcap format.

# FILTER EXPRESSIONS

**type='signal'**: Signal messages
**type='method_call'**: Method calls
**type='method_return'**: Method returns
**type='error'**: Error messages
**sender='name'**: From specific sender
**destination='name'**: To specific destination
**interface='name'**: Specific interface
**member='name'**: Specific method/signal
**path='path'**: Specific object path

# CAVEATS

May require permissions to eavesdrop. Some buses restrict monitoring. High traffic buses produce verbose output. Security policies may limit visibility.

# HISTORY

**dbus-monitor** is part of the **D-Bus** project, started by **Red Hat** in **2002**. D-Bus became the standard IPC mechanism for Linux desktops, and dbus-monitor has been essential for debugging and development since the early days of the project.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [busctl](/man/busctl)(1), [gdbus](/man/gdbus)(1), [qdbus](/man/qdbus)(1)
