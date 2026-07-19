# TAGLINE

Source RCON client for the command line

# TLDR

**Send a single command**

```rcon -H [host] -p [port] -P [password] status```

**Multi-word server command**

```rcon -H [host] -p [port] -P [password] sm plugins list```

**Commands from stdin**

```rcon -H [host] -p [port] -P [password] <<EOF
status
sm plugins list
EOF```

**Use a saved server profile**

```rcon -s [profile] status```

**Alternate config file**

```rcon -c [~/.rconrc] -s [profile] status```

# SYNOPSIS

**rcon** **-H** *host* **-p** *port* **-P** *password* [*command*...]
**rcon** **-s** *profile* [*command*...]

# DESCRIPTION

**rcon** is a command-line Source RCON client. It sends commands to a game server that exposes the Source RCON protocol and prints the reply on stdout. Extra argv words after the options are joined into one server command. Without a command on the argv, lines are read from stdin (lines starting with **#** are comments), so it can run script files.

Build with CMake (needs **libbsd**, **check**, **glib-2.0**). Optional bash completion via **INSTALL_BASH_COMPLETION=ON**. Packages exist on several platforms (see repology).

# PARAMETERS

**-H** *host*

> Server hostname or IP.

**-p** *port*

> RCON port.

**-P** *password*

> RCON password.

**-s** *profile*

> Named server entry from the config file.

**-c** *file*

> Config file path (default **$HOME/.rconrc**).

*command*...

> Server command words (concatenated). Omit to read commands from stdin.

# CONFIGURATION

Default config: **$HOME/.rconrc**. Define server profiles (host, port, password) and select them with **-s**. Prefer restricting file permissions (**chmod 600**) because credentials are stored in plain text.

# CAVEATS

RCON is not encrypted; passwords travel in cleartext on the network. Use only on trusted networks or tunnels. Exit status is 0 on success, non-zero on failure. Not related to Redis or other protocols named "RCON" outside Source engine games.

# SEE ALSO

[mcrcon](/man/mcrcon)(1), [netcat](/man/netcat)(1)

# RESOURCES

```[Source code](https://github.com/n0la/rcon)```

<!-- verified: 2026-07-19 -->
