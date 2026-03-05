# TAGLINE

CLI application to easily create SSH tunnels

# TLDR

**Create a local SSH tunnel**

```mole new -source :[local_port] -destination [host]:[port] -server [user]@[ssh_server]```

**Create a tunnel with auto-selected local port**

```mole new -destination [host]:[port] -server [user]@[ssh_server]```

**Create multiple tunnels** through one connection

```mole new -destination [host1]:[port1] -destination [host2]:[port2] -server [user]@[ssh_server]```

**Save a tunnel alias**

```mole new -alias [name] -destination [host]:[port] -server [user]@[ssh_server]```

**Start a saved tunnel**

```mole start [name]```

# SYNOPSIS

**mole** _command_ [_options_]

# PARAMETERS

**-source** _:[PORT]_
> Local port to listen on. Auto-selected if not specified.

**-destination** _HOST:PORT_
> Remote destination to forward to.

**-server** _USER@HOST_
> SSH server to tunnel through.

**-alias** _NAME_
> Save the tunnel configuration under an alias.

# DESCRIPTION

**mole** is a CLI application for creating SSH tunnels with a focus on resiliency and user experience. It forwards local ports to remote addresses through SSH servers, supports multiple tunnels over a single connection, and leverages SSH config file settings.

Tunnel configurations can be saved as aliases for quick reuse.

# CAVEATS

Requires SSH access to the tunnel server. Authentication uses the system's SSH configuration and keys.

# HISTORY

**mole** was created by **davrodpin** and is written in **Go**.

# SEE ALSO

[ssh](/man/ssh)(1), [autossh](/man/autossh)(1)
