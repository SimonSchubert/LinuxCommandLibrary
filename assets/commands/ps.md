# TAGLINE

Report running process status

# TLDR

**List all processes**

```ps aux```

**List processes for current user**

```ps -u [username]```

**Show process tree**

```ps -ef --forest```

**Show specific process**

```ps -p [pid]```

**Custom output format**

```ps -eo pid,ppid,cmd,%mem,%cpu```

**List threads**

```ps -eLf```

# SYNOPSIS

**ps** [_options_]

# PARAMETERS

**a**
> All users.

**u**
> User-oriented format.

**x**
> Include processes without tty.

**-e**
> Every process.

**-f**
> Full format.

**-p** _PID_
> Select by PID.

**-u** _USER_
> Select by user.

**--forest**
> Process tree.

**-o** _FORMAT_
> Custom output.

# DESCRIPTION

**ps** reports a snapshot of currently running processes on the system. It displays information such as process ID, user, CPU and memory usage, command name, and runtime for each process, providing a point-in-time view of system activity.

The command accepts options in two distinct styles: BSD syntax (without dashes, e.g., **aux**) and POSIX syntax (with dashes, e.g., **-ef**). Both produce similar output but differ in column defaults and filtering behavior. The **-o** option allows fully custom output formats, selecting specific fields like pid, ppid, command, and resource usage.

Common usage patterns include **ps aux** to list all processes with detailed info, **ps -ef --forest** to show the process hierarchy as a tree, and **ps -p** to inspect a specific process by PID.

# CAVEATS

BSD and POSIX options differ. Use aux or -ef.

# HISTORY

ps is a **classic Unix** process monitoring utility.

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [pgrep](/man/pgrep)(1), [kill](/man/kill)(1)

