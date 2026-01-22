# TLDR

**Execute a command every 2 seconds** (default)

```watch [command]```

**Execute a command** with a custom interval

```watch -n [5] [command]```

**Highlight differences** between updates

```watch -d [command]```

**Exit when output changes**

```watch -g [command]```

**Hide the header** showing time and command

```watch -t [command]```

**Beep on command error**

```watch -b [command]```

**Preserve ANSI colors**

```watch -c [ls --color=always]```

**Exit on command error**

```watch -e [command]```

# SYNOPSIS

**watch** [_options_] _command_

# PARAMETERS

**-n**, **--interval** _SECS_
> Update interval in seconds (default: 2, min: 0.1)

**-d**, **--differences** [=_permanent_]
> Highlight differences; permanent shows all changes since start

**-g**, **--chgexit**
> Exit when output changes

**-e**, **--errexit**
> Freeze on error and exit after key press

**-b**, **--beep**
> Beep on non-zero exit code

**-c**, **--color**
> Interpret ANSI color sequences

**-C**, **--no-color**
> Do not interpret ANSI color sequences

**-t**, **--no-title**
> Hide header (interval, command, time)

**-w**, **--no-wrap**
> Disable line wrapping

**-p**, **--precise**
> Run command at precise intervals from start time

**-f**, **--follow**
> Scroll output like tail -f instead of clearing

**-x**, **--exec**
> Pass command to exec instead of sh -c

**-h**, **--help**
> Show help

**-v**, **--version**
> Show version

# DESCRIPTION

**watch** executes a command repeatedly, displaying output in full-screen mode. This allows monitoring of changing data such as disk usage, running processes, or log files without manually re-running commands.

By default, the command runs every 2 seconds. The header displays the interval, command, and current time. Use **-d** to highlight what changed between updates—useful for spotting modifications in large output.

The command is passed to **sh -c**, so shell features like pipes and redirects work but may require quoting. Non-printing characters are stripped; use **cat -v** in the pipeline to see them.

# CAVEATS

Commands with special characters may need extra quoting due to shell interpretation. POSIX option processing stops at the first non-option argument, so flags after the command aren't processed by watch. Very fast intervals may cause high CPU usage. The **-c** option is needed for colored output from commands like **ls --color**.

# HISTORY

The watch command was written by **Tony Rems** and became part of the **procps** package (later **procps-ng**) for Linux. It provides a simple alternative to writing custom loops for monitoring command output. The concept of periodically executing and displaying a command's output has been implemented in various forms across Unix systems.

# SEE ALSO

[tail](/man/tail)(1), [top](/man/top)(1), [htop](/man/htop)(1), [while](/man/while)(1)
