# TAGLINE

Connect command output to journal

# TLDR

**Write** the output of a command to the journal

```systemd-cat [command]```

**Write** the output of a pipeline to the journal

```[command] | systemd-cat```

**Use** a specified identifier for log entries

```[command] | systemd-cat -t [id]```

**Use** a specified priority level for logged messages

```systemd-cat -p [emerg|alert|crit|err|warning|notice|info|debug] [command]```

**Use** a specified priority for stderr messages

```systemd-cat --stderr-priority [priority] [command]```

# SYNOPSIS

**systemd-cat** [_options_] [_command_] [_arguments_]

# PARAMETERS

**-t, --identifier _name_**
> Syslog identifier for log entries

**-p, --priority _level_**
> Default priority level for stdout messages

**--stderr-priority _level_**
> Priority level for stderr messages

**--level-prefix**
> Interpret priority prefixes in log output

**-h, --help**
> Display help information

# DESCRIPTION

**systemd-cat** connects a command or pipeline's output streams to the systemd journal. It is useful for logging output from cron jobs, scripts, or any command that doesn't natively support journal logging.

When run with a command, both stdout and stderr are captured. When used as a pipe target, only stdin (the pipe) is captured while stderr remains connected to the terminal.

# CAVEATS

When used in a pipeline, only the piped output is captured. The identifier defaults to "cat" in pipe mode. Priority levels follow syslog conventions.

# SEE ALSO

[journalctl](/man/journalctl)(1), [systemd-journald](/man/systemd-journald)(8), [logger](/man/logger)(1)
