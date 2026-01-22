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

**ps** reports process status. Shows running processes.

The tool displays system processes. Essential system utility.

ps lists processes.

# CAVEATS

BSD and POSIX options differ. Use aux or -ef.

# HISTORY

ps is a **classic Unix** process monitoring utility.

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [pgrep](/man/pgrep)(1), [kill](/man/kill)(1)

