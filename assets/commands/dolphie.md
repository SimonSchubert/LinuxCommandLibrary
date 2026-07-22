# TAGLINE

MySQL/MariaDB/ProxySQL real-time monitoring TUI

# TLDR

**Connect** to MySQL server and monitor

```dolphie -u [username] --ask-pass -h [host]```

**Connect** using a URI

```dolphie mysql://[user]:[pass]@[host]:[port]```

**Connect** using a configuration file

```dolphie -c [config.ini]```

**Monitor** ProxySQL instance

```dolphie --host [host] --port 6032 -u [user] --ask-pass```

**Auto-refresh** every 2 seconds

```dolphie -r 2 -h [host] -u [user]```

**Read credentials** from a MySQL config file

```dolphie -m ~/.my.cnf -h [host]```

**Record** a session for later replay

```dolphie -R -h [host] -u [user]```

# SYNOPSIS

**dolphie** [_options_] [_uri_]

# PARAMETERS

**-u**, **--user** _USERNAME_
> Database username.

**-p**, **--password** _PASSWORD_
> Database password. Prefer **--ask-pass** or a config file to avoid leaking through shell history.

**--ask-pass**
> Prompt for the password interactively.

**-h**, **--host** _HOST_
> Database host (default: localhost).

**-P**, **--port** _PORT_
> Database port (default: 3306; 6032 for ProxySQL).

**-S**, **--socket** _SOCKET_
> Unix socket file path.

**-c**, **--config-file** _FILE_
> Path to a Dolphie configuration file.

**-m**, **--mycnf-file** _FILE_
> MySQL-style config file to read credentials from.

**-l**, **--login-path** _NAME_
> Login path from `~/.mylogin.cnf`.

**-C**, **--cred-profile** _NAME_
> Named credential profile defined in the Dolphie config file.

**-r**, **--refresh-interval** _SECONDS_
> Data collection cycle (default: 1).

**--panels** _LIST_
> Comma-separated panels to display at startup (dashboard, processlist, graphs, replication, ...).

**--graph-marker** _MARKER_
> Style used for graph markers (default: braille).

**--ssl-mode** _MODE_
> REQUIRED, VERIFY_CA, or VERIFY_IDENTITY.

**--ssl-ca** _FILE_
> SSL CA certificate file.

**--ssl-cert** _FILE_
> SSL client certificate file.

**--ssl-key** _FILE_
> SSL client private key file.

**-H**, **--hostgroup** _NAME_
> Connect to a group of hosts defined in the config.

**--heartbeat-table** _TABLE_
> pt-heartbeat table reference (MySQL only) for replication lag.

**-R**, **--record**
> Record the session to disk for later replay.

**-D**, **--daemon**
> Run headless in daemon mode; recording is enabled automatically.

**--replay-file** _FILE_
> Replay a previously recorded session.

**--show-trxs-only**
> Filter the processlist to active transactions only.

**-V**, **--version**
> Display version and exit.

**--help**
> Display help and exit.

# DESCRIPTION

**dolphie** is a real-time terminal user interface for monitoring MySQL, MariaDB, and ProxySQL. It shows dashboards, graphs, processlists, replication status, lock waits, transactions, and resource usage, similar in spirit to **mytop** and **innotop** but built on a modern TUI framework.

Beyond live monitoring, dolphie can record a session to disk and replay it later, run in daemon mode to collect metrics continuously, and aggregate multiple hosts via hostgroups.

# CAVEATS

Requires the **PROCESS**, **REPLICATION CLIENT** and (for **KILL**) **SUPER** privileges on MySQL. Continuous polling at a very low refresh interval can add load to the monitored server. Passing **-p** on the command line exposes the password in `ps` and shell history: prefer **--ask-pass**, a config file, or a login path.

# HISTORY

**dolphie** was created by **Charles Thompson** as a modern, Python-based replacement for **mytop** and **innotop**, with first-class support for MySQL 8, MariaDB, and ProxySQL, and features such as recording, daemon mode, and SSL/TLS connections.

# INSTALL

```brew: brew install dolphie```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mysql](/man/mysql)(1), [mytop](/man/mytop)(1), [htop](/man/htop)(1)
