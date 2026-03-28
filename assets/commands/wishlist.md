# TAGLINE

SSH directory and host browser

# TLDR

**Start the SSH directory** with default settings

```wishlist```

**Start with a specific config** file

```wishlist -c [config.yaml]```

**Listen on a specific port**

```wishlist -p [2222]```

**Start with a specific listen address**

```wishlist -l [0.0.0.0:2222]```

# SYNOPSIS

**wishlist** [_-c config_] [_-p port_] [_-l address_] [_options_]

# PARAMETERS

**-c** _FILE_
> Path to the YAML configuration file.

**-l** _ADDRESS_
> Bind address to listen on (e.g., 0.0.0.0:2222).

**-p** _PORT_
> Port to listen on (default: 22).

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show help.

# DESCRIPTION

**wishlist** is an SSH directory that provides a terminal user interface for browsing and connecting to configured SSH hosts. It presents a searchable menu of available servers, allowing quick selection and connection without remembering hostnames or typing full SSH commands.

Hosts are defined in a YAML configuration file with connection details like hostname, port, and user. The tool is part of the Charm ecosystem and runs as an SSH server itself, meaning users can access their host directory by connecting to wishlist over SSH from any machine.

# CAVEATS

Configuration needed. Charm Labs tool. Go implementation.

# HISTORY

**wishlist** is part of the **Charm** ecosystem, providing an SSH directory for easy host access.

# SEE ALSO

[ssh](/man/ssh)(1), [sshd](/man/sshd)(8), [tmux](/man/tmux)(1)
