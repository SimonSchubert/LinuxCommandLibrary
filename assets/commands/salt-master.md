# TAGLINE

Salt central management daemon

# TLDR

**Start the Salt master daemon** in the foreground

```salt-master```

**Start the Salt master** in the background (daemonized)

```salt-master -d```

**Start with a specific configuration directory**

```salt-master -c [/etc/salt]```

**Start with debug logging** to console

```salt-master -l debug```

**Start with a specific log file**

```salt-master --log-file=[/var/log/salt/master]```

# SYNOPSIS

**salt-master** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run the Salt master as a daemon in the background

**-c** _DIR_, **--config-dir**=_DIR_
> Specify the configuration directory (default: /etc/salt)

**-l** _LEVEL_, **--log-level**=_LEVEL_
> Console log level: info, warning, error, debug, trace, garbage, none

**--log-file**=_FILE_
> Specify the log file path

**--log-file-level**=_LEVEL_
> Log file logging level

**--pidfile**=_FILE_
> Specify the location of the pidfile

**-u** _USER_, **--user**=_USER_
> Specify user to run salt-master

**-h**, **--help**
> Print help message and exit

**--version**
> Print version information

# DESCRIPTION

**salt-master** is the central control daemon for SaltStack infrastructure. It manages minion keys, distributes configurations, executes remote commands, and serves files to connected minions.

The master listens on two ports: 4505 for publishing commands to minions via ZeroMQ, and 4506 for receiving returns and file server requests. Configuration is stored in **/etc/salt/master**.

Key components include the job cache for tracking command execution, the file server for distributing states and files, and the PKI infrastructure for secure minion authentication. The master supports worker threads for handling large numbers of minions.

# CONFIGURATION

**/etc/salt/master**
> Main master configuration file controlling worker threads, file server roots, pillar data, and network settings.

**/etc/salt/master.d/**
> Directory for additional configuration files that are merged with the main master config.

**/srv/salt/**
> Default file server root directory for Salt states, formulas, and files served to minions.

**/srv/pillar/**
> Default directory for pillar data providing secure per-minion configuration variables.

# CAVEATS

Firewall rules must allow ports 4505 and 4506 for master-minion communication. Large deployments may require tuning worker_threads in the configuration. The master must be running before minions can connect and have their keys accepted.

# HISTORY

salt-master is part of **SaltStack**, created by Thomas Hatch in **2011**. Originally developed at a startup, SaltStack grew into a major configuration management platform. VMware acquired SaltStack in **2020**, and the project continues as the open-source Salt Project.

# SEE ALSO

[salt](/man/salt)(1), [salt-minion](/man/salt-minion)(8), [salt-key](/man/salt-key)(1), [salt-call](/man/salt-call)(1)
