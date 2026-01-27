# TLDR

**Start logging to a directory**

```svlogd [/var/log/myservice]```

**Log with human-readable timestamps**

```svlogd -tt [/var/log/myservice]```

**Log with ISO 8601 timestamps**

```svlogd -ttt [/var/log/myservice]```

**Log to multiple directories**

```svlogd [/var/log/service1] [/var/log/service2]```

**Set buffer length**

```svlogd -b [8192] [/var/log/myservice]```

**Replace unprintable characters**

```svlogd -r [?] [/var/log/myservice]```

# SYNOPSIS

**svlogd** [**-tttv**] [**-r** _c_] [**-R** _xyz_] [**-l** _len_] [**-b** _buflen_] _logs_...

# PARAMETERS

**-t**
> Prefix lines with tai64n timestamp.

**-tt**
> Prefix lines with human-readable UTC timestamp (YYYY-MM-DD_HH:MM:SS.xxxxx).

**-ttt**
> Prefix lines with ISO 8601 UTC timestamp (YYYY-MM-DDTHH:MM:SS.xxxxx).

**-v**
> Verbose mode.

**-r** _c_
> Replace unprintable characters with character c.

**-R** _xyz_
> Character replacement specification.

**-l** _len_
> Set maximum line length.

**-b** _buflen_
> Set buffer length (default 1024).

# DESCRIPTION

**svlogd** is the logging daemon for runit, a UNIX init scheme. It continuously reads log data from standard input, optionally filters and transforms log messages, and writes them to one or more automatically rotated log directories.

Each log directory contains the current log file named **current**, and rotated logs with filenames starting with @ followed by a tai64n timestamp. Log rotation is configured via a **config** file in each log directory.

The daemon supports filtering log messages using pattern matching, alerting selected messages to standard error or UDP destinations, and processing rotated logs with external programs.

svlogd runs until it receives end-of-file on standard input or a TERM signal.

# SIGNALS

**HUP**: Closes and reopens all logs, reloads configuration.

**TERM**: Stops reading input, processes buffer, and exits.

**ALRM**: Forces immediate log rotation for all logs.

# CAVEATS

Requires proper permissions on log directories. Configuration is done via files in log directories, not command-line options. Part of the runit supervision suite. Buffer size affects memory usage and log latency.

# HISTORY

**svlogd** was created by Gerrit Pape as part of the runit init system. It was designed as a reliable replacement for syslog-style logging, providing automatic log rotation and timestamp handling. Runit was inspired by daemontools and provides similar functionality with some enhancements.

# SEE ALSO

[sv](/man/sv)(8), [runsv](/man/runsv)(8), [chpst](/man/chpst)(8), [multilog](/man/multilog)(8)
