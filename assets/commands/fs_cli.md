# TAGLINE

FreeSWITCH command-line interface

# TLDR

Open an **interactive console** on the local FreeSWITCH

```fs_cli```

Connect to a **remote server**

```fs_cli --host [10.0.0.5] --port [8021] --password [secret]```

Run **one command and exit**, which is what scripts want

```fs_cli --execute "status"```

**Reload the XML configuration** without restarting the switch

```fs_cli --execute "reloadxml"```

List the **calls currently up**

```fs_cli --execute "show calls"```

List the **registered SIP endpoints**

```fs_cli --execute "sofia status profile internal reg"```

Check whether a **module is loaded**

```fs_cli --execute "module_exists [mod_sofia]"```

**Load a module** at runtime

```fs_cli --execute "load [mod_sofia]"```

Choose how much the console **prints**

```fs_cli --loglevel [debug]```

Keep **retrying** while FreeSWITCH is still starting

```fs_cli --retry```

**Reconnect automatically** if the connection drops

```fs_cli --reconnect```

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

# INSTALL

```apk: sudo apk add freeswitch```

```brew: brew install freeswitch```

```nix: nix profile install nixpkgs#freeswitch```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[asterisk](/man/asterisk)(8)
