# TAGLINE

Record terminal session to file

# TLDR

**Record** a new session to a file named "typescript"

```script```

**Record** a session to a custom file path

```script [path/to/session.out]```

**Append** to an existing file

```script -a [logfile.log]```

**Record** timing information to a separate file

```script -t 2> [path/to/timing_file]```

**Write** out data as soon as it happens (flush immediately)

```script -f [path/to/file]```

**Execute** quietly without start and done messages

```script -q [logfile.log]```

**Stop** recording

```exit```

# SYNOPSIS

**script** [_options_] [_file_]

# PARAMETERS

**-a, --append**
> Append output to an existing file

**-f, --flush**
> Flush output after each write

**-q, --quiet**
> Be quiet (suppress start and done messages)

**-t, --timing[=_file_]**
> Output timing data for scriptreplay

**-c, --command _command_**
> Run command rather than interactive shell

**-e, --return**
> Return exit code of the child process

**-O, --log-out _file_**
> Log stdout to file (structured)

# DESCRIPTION

**script** records all terminal output to a typescript file. It creates a forked shell and captures everything displayed on the terminal, including input and output, until the session ends with **exit** or **Ctrl-D**.

The recorded session can be replayed using **scriptreplay** when timing information is captured. This is useful for creating tutorials, documenting procedures, or auditing terminal sessions.

# CAVEATS

The typescript file contains control characters and escape sequences. Use **cat -v** or **less -R** to view. Large sessions can produce very large files. Part of the util-linux package.

# HISTORY

The **script** command first appeared in 3.0BSD. It has been a standard Unix utility for recording terminal sessions since the early 1980s.

# SEE ALSO

[scriptreplay](/man/scriptreplay)(1), [scriptlive](/man/scriptlive)(1), [tee](/man/tee)(1), [ttyrec](/man/ttyrec)(1)
