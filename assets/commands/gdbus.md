# TAGLINE

command-line tool for D-Bus introspection and interaction

# TLDR

List all names on the **session bus**

```gdbus list-names --session```

List all names on the **system bus**

```gdbus list-names --system```

**Introspect** an object to see its interfaces and methods

```gdbus introspect --session --dest [destination_bus_name] --object-path /[path/to/object]```

**Call a method** on an object with arguments

```gdbus call --session --dest [destination_bus_name] --object-path /[path/to/object] --method [interface.method_name] [args...]```

**Emit a signal** from an object with arguments

```gdbus emit --session --object-path /[path/to/object] --signal [interface.signal_name] [args...]```

**Monitor** all messages on the session bus

```gdbus monitor --session```

# SYNOPSIS

**gdbus** _command_ [_options_]

# PARAMETERS

**list-names**
> List all names on a bus

**introspect**
> Introspect a remote object

**call**
> Invoke a method on a remote object

**emit**
> Emit a signal

**monitor**
> Monitor a remote object

**wait**
> Wait for a bus name to appear

**--session**
> Connect to the session bus (user-specific)

**--system**
> Connect to the system bus (system-wide)

**--dest** _NAME_
> Destination bus name

**--object-path** _PATH_
> D-Bus object path

**--method** _INTERFACE.METHOD_
> Method to call

**--signal** _INTERFACE.SIGNAL_
> Signal to emit

# DESCRIPTION

**gdbus** is a command-line tool for interacting with D-Bus, the inter-process communication system used extensively in Linux desktop environments. It's part of GLib and provides a way to inspect, call methods on, and monitor D-Bus objects.

The session bus is used for user applications (desktop notifications, media players, etc.), while the system bus handles system-wide services (NetworkManager, UPower, etc.).

Use **introspect** to discover available interfaces and methods on any D-Bus object before interacting with it.

# CAVEATS

D-Bus method signatures must match exactly. Complex types require proper GVariant formatting. Some system bus operations require elevated privileges or PolicyKit authorization.

# HISTORY

gdbus was introduced as part of GLib's GDBus implementation in **2010** (GLib 2.26), replacing the older dbus-glib bindings. It provides a more modern, GObject-based interface to D-Bus.

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [busctl](/man/busctl)(1), [qdbus](/man/qdbus)(1)
