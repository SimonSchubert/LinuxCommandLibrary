# TAGLINE

CLI application to easily create SSH tunnels

# TLDR

**Create a local SSH tunnel**

```mole start local --source :[local_port] --destination [host]:[port] --server [user]@[ssh_server]```

**Create a tunnel with verbose output**

```mole start local --verbose --source :[local_port] --destination [host]:[port] --server [user]@[ssh_server]```

**Create a tunnel using a specific SSH key**

```mole start local --source :[local_port] --destination [host]:[port] --server [user]@[ssh_server] --key [~/.ssh/id_rsa]```

**Save a tunnel as an alias for reuse**

```mole add alias local [name] --source :[local_port] --destination [host]:[port] --server [user]@[ssh_server]```

**Start a saved tunnel alias**

```mole start alias [name]```

**Show all saved aliases**

```mole show alias```

# SYNOPSIS

**mole** _command_ [_subcommand_] [_options_]

# PARAMETERS

**--source** _[HOST:]PORT_
> Local address and port to listen on. Auto-selected if not specified.

**--destination** _HOST:PORT_
> Remote destination to forward to.

**--server** _USER@HOST[:PORT]_
> SSH server to tunnel through.

**--key** _path_
> Path to the SSH private key file.

**--verbose**
> Enable verbose logging output.

**--detach**
> Run mole in the background.

**--insecure**
> Skip SSH host key validation.

**--connection-retries** _N_
> Number of reconnection attempts if the SSH connection drops.

**--retry-wait** _duration_
> Time to wait between reconnection attempts.

# DESCRIPTION

**mole** is a CLI application for creating SSH tunnels focused on resiliency and user experience. It forwards local ports to remote addresses through SSH servers, supports multiple tunnels over a single connection, and leverages SSH config file settings.

Subcommands include **start** (start a tunnel or alias), **add** (save a tunnel alias), **delete** (remove an alias), **show** (display alias details), **stop** (stop a running tunnel), and **version**.

Mole keeps idle connections alive with synthetic packets and automatically reconnects if the SSH connection drops. Tunnel configurations can be saved as aliases for quick reuse.

# CAVEATS

Requires SSH access to the tunnel server. Authentication uses the system's SSH configuration and keys.

# HISTORY

**mole** was created by **davrodpin** and is written in **Go**.

# SEE ALSO

[ssh](/man/ssh)(1), [autossh](/man/autossh)(1)
