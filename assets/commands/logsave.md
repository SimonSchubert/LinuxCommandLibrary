# TAGLINE

executes a command and saves both stdout and stderr to a log file

# TLDR

**Save command output** to log

```logsave [path/to/logfile] [command]```

Save **stdin** to log

```logsave [logfile] -```

**Append** to log file

```logsave -a [logfile] [command]```

Run with **verbose** output

```logsave -v [logfile] [command]```

# SYNOPSIS

**logsave** [_options_] _logfile_ _command_ [_arguments_]

# DESCRIPTION

**logsave** executes a command and saves both stdout and stderr to a log file. It includes timestamps and exit status, making it useful for recording the output of scheduled tasks or system scripts.

# PARAMETERS

**-a**
> Append to log file instead of replacing

**-v**
> Verbose mode

**-**
> Read from stdin instead of running command

# CAVEATS

Part of e2fsprogs package. The log file is created with timestamps for start, end, and command exit status.

# SEE ALSO

[script](/man/script)(1), [tee](/man/tee)(1), [logger](/man/logger)(1)
