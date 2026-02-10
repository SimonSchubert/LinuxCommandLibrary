# TAGLINE

remote terminal application

# TLDR

**Connect to remote host**

```mosh [user@host]```

**Connect on specific port**

```mosh --ssh="ssh -p [2222]" [user@host]```

**Connect with specific server**

```mosh --server=[/usr/bin/mosh-server] [user@host]```

**Predict typing locally**

```mosh --predict=always [user@host]```

**Disable prediction**

```mosh --predict=never [user@host]```

**Use specific locale**

```mosh --client="LANG=en_US.UTF-8 mosh-client" [user@host]```

# SYNOPSIS

**mosh** [_options_] [_user@host_] [_command_]

# PARAMETERS

_USER@HOST_
> Remote host connection.

**--ssh** _CMD_
> SSH command to use.

**--server** _PATH_
> Path to mosh-server.

**--predict** _MODE_
> Prediction mode (always, adaptive, never).

**--port** _PORT_
> Use specific UDP port.

**--help**
> Display help information.

# DESCRIPTION

**mosh** (Mobile Shell) is a remote terminal application. It handles intermittent connectivity.

The tool uses UDP for connection. Provides local echo and roaming. More resilient than SSH alone.

# CAVEATS

Requires mosh-server on remote. Uses UDP port range. SSH for initial connection.

# HISTORY

mosh was developed at **MIT** to provide a better mobile shell experience, released in 2012.

# SEE ALSO

[ssh](/man/ssh)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)

