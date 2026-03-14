# TAGLINE

Prevent the system from sleeping

# TLDR

**Prevent the system from sleeping indefinitely**

```caffeinate```

**Prevent display from sleeping**

```caffeinate -d```

**Prevent idle sleep for a duration** (seconds)

```caffeinate -t [3600]```

**Prevent sleep while a command runs**

```caffeinate -i [make]```

**Prevent sleep while a process is running** (by PID)

```caffeinate -w [pid]```

**Prevent system sleep on AC power**

```caffeinate -s```

# SYNOPSIS

**caffeinate** [_-disu_] [_-t timeout_] [_-w pid_] [_utility_ [_arguments_]]

# PARAMETERS

**-d**
> Prevent the display from sleeping.

**-i**
> Prevent the system from idle sleeping.

**-s**
> Prevent the system from sleeping (AC power only).

**-m**
> Prevent the disk from idle sleeping.

**-u**
> Declare that user is active, simulating user activity.

**-t** _timeout_
> Timeout in seconds after which the assertion is dropped.

**-w** _pid_
> Wait for the process with the given PID to exit before releasing the assertion.

# DESCRIPTION

**caffeinate** creates assertions to prevent the system from sleeping. When called with a utility argument, it runs the command and holds the assertion until the command exits. Without a utility, it holds the assertion until it is terminated (Ctrl+C).

Multiple flags can be combined (e.g., **-di**) to create multiple assertions simultaneously.

# CAVEATS

This is a macOS command. Only prevents sleep while the command is running. The **-s** flag only works on AC power. Without any flags, caffeinate creates an assertion to prevent idle sleep.

# SEE ALSO

[caffeine](/man/caffeine)(1), [xset](/man/xset)(1), [systemd-inhibit](/man/systemd-inhibit)(1)
