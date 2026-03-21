# TAGLINE

triggers notifications when commands complete

# TLDR

**Notify when command completes**

```noti [long-running-command]```

**Notify with custom title**

```noti -t "[Build]" [make]```

**Notify with custom message**

```noti -m "[Done!]" [command]```

**Use specific service**

```noti --slack [command]```

**Pipe mode**

```[command] | noti```

**Banner notification**

```noti -b [command]```

**Watch a running process by PID**

```noti -w [PID]```

# SYNOPSIS

**noti** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to monitor.

**-t** _TITLE_
> Notification title.

**-m** _MESSAGE_
> Notification message.

**-b**
> Banner notification.

**-s**
> Speech notification (text-to-speech).

**-w** _PID_
> Watch a running process by PID and notify when it finishes.

**--slack**
> Notify via Slack.

**--pushover**
> Notify via Pushover.

**--help**
> Display help information.

# DESCRIPTION

**noti** triggers notifications when commands complete. Supports multiple services.

The tool alerts on completion. Works with Slack, Pushover, and native notifications.

# CAVEATS

Requires notification service. Cross-platform. Configuration for external services.

# HISTORY

noti was created to provide **command completion notifications** across multiple platforms and services.

# SEE ALSO

[notify-send](/man/notify-send)(1), [terminal-notifier](/man/terminal-notifier)(1)

