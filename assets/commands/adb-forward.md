# TLDR

**Forward** local port to device port

```adb forward tcp:[8080] tcp:[8080]```

Forward to a **Unix domain socket**

```adb forward tcp:[8080] localabstract:[socket_name]```

**List** all forwarded ports

```adb forward --list```

**Remove** a specific forward

```adb forward --remove tcp:[8080]```

Remove **all** forwards

```adb forward --remove-all```

# SYNOPSIS

**adb forward** [_--no-rebind_] _local_ _remote_

**adb forward** --list | --remove _local_ | --remove-all

# DESCRIPTION

**adb forward** sets up port forwarding from a local port on your computer to a port on the connected Android device. This enables connecting to services running on the device as if they were running locally.

Common uses include debugging apps with remote debuggers, accessing development servers running on the device, or connecting to app-specific sockets.

# PARAMETERS

**tcp:**_port_
> TCP port number

**localabstract:**_name_
> Unix domain socket in abstract namespace

**localreserved:**_name_
> Unix domain socket in reserved namespace

**localfilesystem:**_name_
> Unix domain socket in filesystem namespace

**jdwp:**_pid_
> JDWP (Java Debug Wire Protocol) for process ID

**--no-rebind**
> Fail if local port is already forwarded

**--list**
> List all active port forwards

**--remove** _local_
> Remove specific forward rule

**--remove-all**
> Remove all forward rules

# CAVEATS

Port forwards persist until removed, the device disconnects, or the adb server restarts. Both local and remote ports must be available. Firewalls may block forwarded connections.

# HISTORY

Port forwarding has been a core adb feature since Android's initial release in **2008**, essential for remote debugging of Android applications through JDWP and other protocols.

# SEE ALSO

[adb](/man/adb)(1), [adb-reverse](/man/adb-reverse)(1)
