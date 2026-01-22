# TLDR

**Send a method call** to a service

```dbus-send --session --dest=[org.freedesktop.Notifications] [/org/freedesktop/Notifications] [org.freedesktop.Notifications.GetCapabilities]```

**Send notification** via D-Bus

```dbus-send --session --dest=org.freedesktop.Notifications /org/freedesktop/Notifications org.freedesktop.Notifications.Notify string:"app" uint32:0 string:"" string:"[Title]" string:"[Body]" array:string:"" dict:string:string:"" int32:5000```

**List available services** on session bus

```dbus-send --session --dest=org.freedesktop.DBus --print-reply /org/freedesktop/DBus org.freedesktop.DBus.ListNames```

**Call system bus** method

```dbus-send --system --print-reply --dest=[org.freedesktop.hostname1] [/org/freedesktop/hostname1] [org.freedesktop.DBus.Properties.GetAll] string:"[org.freedesktop.hostname1]"```

**Get property value**

```dbus-send --session --print-reply --dest=[destination] [object_path] org.freedesktop.DBus.Properties.Get string:"[interface]" string:"[property]"```

# SYNOPSIS

**dbus-send** [_options_] _object-path_ _message_

# PARAMETERS

**--session**
> Send to session bus.

**--system**
> Send to system bus.

**--dest** _NAME_
> Destination service name.

**--print-reply**
> Wait for and print reply.

**--type** _TYPE_
> Message type: method_call or signal.

_OBJECT-PATH_
> D-Bus object path (e.g., /org/freedesktop/DBus).

_MESSAGE_
> Method name including interface.

**string:**, **int32:**, **uint32:**, etc.
> Typed arguments to pass.

**--help**
> Display help information.

# DESCRIPTION

**dbus-send** sends a message to a D-Bus message bus, either the system-wide bus or a session bus. It can invoke methods on D-Bus objects or emit signals, and optionally wait for and print replies.

The command is useful for scripting interactions with D-Bus services, debugging D-Bus interfaces, and testing service implementations. Arguments are type-annotated (string:, int32:, boolean:, etc.) to construct properly typed D-Bus messages.

Common use cases include sending desktop notifications, querying system properties, and controlling media players or other desktop services that expose D-Bus interfaces.

# CAVEATS

Complex method calls with nested types can be difficult to construct. System bus methods often require elevated privileges. Missing --print-reply means responses are ignored. Type annotations must match service expectations exactly.

# HISTORY

dbus-send is part of the **D-Bus** reference implementation, developed by **Red Hat** and freedesktop.org starting in **2003**. It provides command-line access to the D-Bus IPC system used extensively in Linux desktop environments.

# SEE ALSO

[dbus-daemon](/man/dbus-daemon)(1), [dbus-launch](/man/dbus-launch)(1), [busctl](/man/busctl)(1), [gdbus](/man/gdbus)(1)
