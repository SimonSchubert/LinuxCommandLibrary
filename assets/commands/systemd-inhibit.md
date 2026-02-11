# TAGLINE

Block system sleep or shutdown

# TLDR

**List** all active inhibition locks

```systemd-inhibit --list```

**Block** system shutdown while running a command

```systemd-inhibit --what shutdown [command]```

**Keep** the system from sleeping or idling

```systemd-inhibit --what sleep:idle wget [https://example.com/file]```

**Ignore** lid close switch until the script exits

```systemd-inhibit --what sleep:handle-lid-switch [path/to/script]```

**Ignore** power button press while command is running

```systemd-inhibit --what handle-power-key [command]```

**Describe** who and why created the inhibitor

```systemd-inhibit --who [$USER] --why [reason] --what [operation] [command]```

# SYNOPSIS

**systemd-inhibit** [_options_] [_command_] [_arguments_]

# PARAMETERS

**--list**
> List all active inhibitor locks

**--what _operation_**
> Operations to inhibit (shutdown, sleep, idle, handle-power-key, handle-suspend-key, handle-hibernate-key, handle-lid-switch)

**--who _name_**
> Descriptive name of who is holding the lock

**--why _reason_**
> Descriptive reason for holding the lock

**--mode _mode_**
> Either "block" or "delay"

# DESCRIPTION

**systemd-inhibit** creates inhibitor locks that can block or delay system sleep, shutdown, and hardware key handling while a command runs. The lock is held for the duration of the command's execution.

Multiple operations can be specified by separating them with colons. The **--list** option shows all active inhibitors from all sources, not just those created by this tool.

# CAVEATS

Inhibitor locks should be used sparingly to avoid blocking normal system operation. "Delay" mode only holds off the operation briefly. Requires appropriate privileges for some operations. Part of the systemd suite.

# SEE ALSO

[systemd](/man/systemd)(1), [systemctl](/man/systemctl)(1), [loginctl](/man/loginctl)(1)
