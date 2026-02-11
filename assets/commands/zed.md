# TAGLINE

ZFS event monitoring daemon

# TLDR

**Start zed in foreground mode**

```sudo zed -F```

**Start zed with verbose output**

```sudo zed -v```

**Run in foreground without state file**

```sudo zed -M```

**Specify alternative config directory**

```sudo zed -d [/etc/zfs/zed.d]```

# SYNOPSIS

**zed** [**-FhMvV**] [**-c** _conffile_] [**-d** _confdir_] [**-I** _idle_] [**-p** _pidfile_] [**-P** _path_] [**-s** _statefile_]

# PARAMETERS

**-c** _conffile_
> Read configuration from specified file

**-d** _confdir_
> Read enabled scripts from directory (default: /etc/zfs/zed.d)

**-F**
> Run in foreground, don't daemonize

**-h**
> Display help message

**-I** _idle_
> Idle timeout in seconds for script execution

**-M**
> Ignore missing state file

**-p** _pidfile_
> Write process ID to file

**-P** _path_
> Set PATH for script execution

**-s** _statefile_
> Write state to file

**-v**
> Verbose mode, log events to stderr

**-V**
> Display version

# DESCRIPTION

**zed** (ZFS Event Daemon) monitors ZFS kernel events and executes scripts in response. It listens for events like scrub completion, device failures, pool imports, and data errors, then runs corresponding handler scripts.

Scripts are stored in **/etc/zfs/zed.d/** with naming convention **event-name.sh**. Enabled scripts are symlinked to be active. Common events include:

- **resilver.finish** - Resilver completed
- **scrub.finish** - Scrub completed
- **statechange** - Pool state changed
- **data** - Data errors detected

zed enables automated responses to ZFS events like sending email notifications on errors or running custom maintenance scripts.

# CAVEATS

zed must run as root to receive kernel events and access pool information.

Script execution is serialized by default. Long-running scripts can delay processing of subsequent events.

Poorly written event scripts can cause system issues. Test scripts thoroughly before enabling.

On systemd systems, zed typically runs as a systemd service (zfs-zed.service).

# SEE ALSO

[zfs](/man/zfs)(8), [zpool](/man/zpool)(8), [zpool-events](/man/zpool-events)(8)
