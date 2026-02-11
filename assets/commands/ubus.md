# TAGLINE

OpenWrt system message bus client

# TLDR

**List** available objects

```ubus list```

Get **system** information

```ubus call system board```

**Subscribe** to events

```ubus subscribe [event_name]```

Display **help**

```ubus```

# SYNOPSIS

**ubus** _COMMAND_ [_OPTIONS_]

# COMMANDS

**list**
> List available ubus objects

**call** _OBJECT_ _METHOD_
> Call a method on an object

**subscribe** _EVENT_
> Subscribe to event notifications

**send** _EVENT_
> Send an event

# DESCRIPTION

**ubus** is the command-line interface for interacting with the OpenWrt ubusd message bus server. It allows communication between different system services and provides access to system information and configuration.

The ubus system enables IPC (inter-process communication) on OpenWrt routers and embedded systems, allowing scripts and applications to query and control system services.

# CAVEATS

OpenWrt specific. Requires running ubusd daemon. Available methods depend on installed services. Output is typically JSON formatted.

# HISTORY

**ubus** was developed as part of **OpenWrt's** system architecture to provide a unified IPC mechanism for the lightweight Linux distribution used on routers and embedded devices.

# SEE ALSO

[uci](/man/uci)(1), [opkg](/man/opkg)(1)
