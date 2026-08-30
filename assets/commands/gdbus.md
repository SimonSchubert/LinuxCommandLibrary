# TAGLINE

command-line tool for D-Bus introspection and interaction

# TLDR

List the **names currently on the session bus**

```gdbus call --session --dest org.freedesktop.DBus --object-path /org/freedesktop/DBus --method org.freedesktop.DBus.ListNames```

Show an object's **interfaces, methods and properties**

```gdbus introspect --session --dest [org.example.Service] --object-path /[org/example/Object]```

Print the raw introspection **XML**

```gdbus introspect --session --dest [service] --object-path /[path] --xml```

Walk the **whole object tree** below a path

```gdbus introspect --session --dest [service] --object-path / --recurse```

Show only the interfaces that carry **properties**

```gdbus introspect --session --dest [service] --object-path /[path] --only-properties```

**Call a method**, passing arguments as serialized GVariant

```gdbus call --session --dest [service] --object-path /[path] --method [org.example.Iface.Method] [argument]```

Call a method on the **system bus** instead

```gdbus call --system --dest [service] --object-path /[path] --method [method]```

Allow a slow call **longer than the default timeout**

```gdbus call --session --dest [service] --object-path /[path] --method [method] --timeout [30]```

**Emit a signal**

```gdbus emit --session --object-path /[path] --signal [org.example.Iface.Signal] [argument]```

**Watch the traffic** belonging to one service

```gdbus monitor --session --dest [service]```

**Block until a service appears** on the bus

```gdbus wait --session [org.example.Service]```

# SYNOPSIS

**gdbus** _command_ [_options_]

# PARAMETERS

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

# INSTALL

```apt: sudo apt install libglib2.0-bin```

```dnf: sudo dnf install glib```

```apk: sudo apk add glib```

```brew: brew install glib```

```nix: nix profile install nixpkgs#glib```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dbus-send](/man/dbus-send)(1), [busctl](/man/busctl)(1), [qdbus](/man/qdbus)(1)

# RESOURCES

```[Documentation](https://docs.gtk.org/gio/gdbus.html)```

```[Source code](https://gitlab.gnome.org/GNOME/glib)```

<!-- verified: 2026-07-15 -->
