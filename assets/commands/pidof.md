# TAGLINE

finds the process IDs of the named programs and prints them on standard output

# TLDR

List all **process IDs** with given name

```pidof bash```

List a **single** process ID with given name

```pidof -s bash```

List process IDs including **scripts**

```pidof -x script.py```

**Kill** all processes with given name

```kill $(pidof name)```

Show **thread IDs** instead of process IDs

```pidof -t process_name```

# SYNOPSIS

**pidof** [_-s_] [_-c_] [_-q_] [_-w_] [_-x_] [_-o omitpid_] [_-t_] [_-S separator_] _program_...

# DESCRIPTION

**pidof** finds the process IDs (PIDs) of the named programs and prints them on standard output. It is useful for scripting and identifying running processes by name.

# PARAMETERS

**-s**
> Single shot - only return one PID

**-c**
> Only return process IDs running with the same root directory

**-q**
> Quiet mode - suppress output and only set exit status

**-w**
> Show processes without visible command line (e.g., kernel threads)

**-x**
> Also return PIDs of shells running the named scripts

**-o omitpid**
> Omit processes with the specified PID; use %PPID for parent process

**-t**
> Show thread IDs instead of PIDs

**-S separator**
> Use specified separator between PIDs (default is space)

# CAVEATS

Exit status 0 means at least one matching program was found; exit status 1 means no matching program was found. When using **-x** for scripts, the script name must match exactly.

# HISTORY

**pidof** is part of the **sysvinit** package and provides a way to find process IDs by name, complementing commands like pgrep.

# SEE ALSO

[pgrep](/man/pgrep)(1), [pkill](/man/pkill)(1), [killall](/man/killall)(1), [ps](/man/ps)(1)
