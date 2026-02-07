# TAGLINE

FreeSWITCH command-line interface

# TLDR

Connect to the **local FreeSWITCH** instance with an interactive session

```fs_cli```

Connect to a **remote FreeSWITCH** server

```fs_cli -H [host] -P [port] -p [password]```

Execute a **single command** and exit

```fs_cli -x "[command]"```

Show FreeSWITCH **system status**

```fs_cli -x "status"```

**Reload** FreeSWITCH XML configuration

```fs_cli -x "reloadxml"```

Check if a **module is loaded**

```fs_cli -x "module_exists [module_name]"```

Show **active calls**

```fs_cli -x "show calls"```

**Retry** connection on failure

```fs_cli -r```

# SYNOPSIS

**fs_cli** [_options_]

# PARAMETERS

**-H**, **--host** _HOST_
> Connect to remote FreeSWITCH server at _HOST_

**-P**, **--port** _PORT_
> Connect to Event Socket on _PORT_ (default: 8021)

**-p**, **--password** _PASSWORD_
> Event Socket password (default: ClueCon)

**-x**, **--execute** _COMMAND_
> Execute command and exit

**-r**, **--retry**
> Retry connection on failure

**-l**, **--loglevel** _LEVEL_
> Set log level (0-7)

**-q**, **--quiet**
> Disable logging to console

**-d**, **--debug** _LEVEL_
> Debug level (0-7)

# CONFIGURATION

**/etc/freeswitch/autoload_configs/event_socket.conf.xml**
> Event Socket Layer configuration controlling the listen address, port, and authentication password for ESL connections.

# DESCRIPTION

**fs_cli** is the FreeSWITCH command-line interface client that connects to a running FreeSWITCH server via the Event Socket Layer (ESL). It provides interactive access to FreeSWITCH's API for managing calls, configurations, and system status.

The tool can operate in interactive mode for real-time control or execute single commands via the **-x** option for scripting and automation. It connects to the ESL port (default 8021) using configured credentials.

Common operations include checking call status, reloading configurations, managing channels, and monitoring system health.

# CAVEATS

Requires the Event Socket module to be loaded and properly configured in FreeSWITCH. Default password "ClueCon" should be changed in production. Network access to ESL port must be properly secured.

# HISTORY

fs_cli is part of the FreeSWITCH project, an open-source communications platform started in **2006** by Anthony Minessale II. It was created as a modern, scalable alternative to Asterisk for building telephony applications.

# SEE ALSO

[asterisk](/man/asterisk)(8), [freeswitch](/man/freeswitch)(1)
