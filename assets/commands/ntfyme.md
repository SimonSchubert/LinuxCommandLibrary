# TLDR

**Notify when command finishes**

```ntfyme [command]```

**Run command with notification**

```ntfyme -c "[command]"```

**Custom notification message**

```ntfyme -m "[message]" [command]```

**Track long running process**

```ntfyme --pid [process_id]```

# SYNOPSIS

**ntfyme** [_options_] [_command_]

# PARAMETERS

**-c** _COMMAND_
> Command to execute.

**-m** _MESSAGE_
> Custom notification message.

**--pid** _PID_
> Wait for process ID.

**--sound**
> Play notification sound.

**--help**
> Display help information.

# DESCRIPTION

**ntfyme** sends desktop notifications when commands complete. Monitors long tasks.

The tool wraps commands with notifications. Useful for lengthy operations.

ntfyme notifies on completion.

# CAVEATS

Requires notification daemon. System dependent. May need configuration.

# HISTORY

ntfyme provides **command completion notifications** for terminal workflows.

# SEE ALSO

[notify-send](/man/notify-send)(1), [nohup](/man/nohup)(1), [time](/man/time)(1)

