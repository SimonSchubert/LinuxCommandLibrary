# TLDR

**Start the Salt minion daemon** in the foreground

```salt-minion```

**Start the Salt minion** in the background (daemonized)

```salt-minion -d```

**Start with a specific configuration directory**

```salt-minion -c [/etc/salt]```

**Start with debug logging** to console

```salt-minion -l debug```

**Start without the keepalive restart wrapper**

```salt-minion --disable-keepalive```

# SYNOPSIS

**salt-minion** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run the Salt minion as a daemon in the background

**-c** _DIR_, **--config-dir**=_DIR_
> Specify the configuration directory (default: /etc/salt)

**-l** _LEVEL_, **--log-level**=_LEVEL_
> Console log level: info, warning, error, debug, trace, garbage, none

**--log-file**=_FILE_
> Specify the log file path (default: /var/log/salt/minion)

**--log-file-level**=_LEVEL_
> Log file logging level

**--pidfile**=_FILE_
> Specify the location of the pidfile (default: /var/run/salt-minion.pid)

**-u** _USER_, **--user**=_USER_
> Specify user to run salt-minion

**--disable-keepalive**
> Disable automatic restart mechanism; run daemon directly

**-h**, **--help**
> Print help message and exit

**--version**
> Print version information

# DESCRIPTION

**salt-minion** is the agent daemon that runs on managed systems in a SaltStack infrastructure. It connects to a Salt master, receives commands, executes them locally, and returns results.

On startup, the minion generates a key pair and sends its public key to the master for acceptance. Once accepted, the minion subscribes to the master's ZeroMQ publish socket to receive commands. Configuration is stored in **/etc/salt/minion** or the **/etc/salt/minion.d/** directory.

The minion can also run in masterless mode using **salt-call --local**, enabling local configuration management without a master. Setting **master_type: disable** allows running beacons and engines without master connectivity.

# CAVEATS

The minion key must be accepted on the master before commands can be executed. By default, the daemon runs with an automatic restart wrapper; use **--disable-keepalive** when managed by systemd or container runtimes. Configuration in minion.d/ is applied alphabetically, so duplicate settings may override unexpectedly.

# HISTORY

salt-minion is part of **SaltStack**, created by Thomas Hatch in **2011**. The minion agent enables Salt's remote execution and configuration management capabilities across infrastructure at scale.

# SEE ALSO

[salt](/man/salt)(1), [salt-master](/man/salt-master)(8), [salt-key](/man/salt-key)(1), [salt-call](/man/salt-call)(1)
