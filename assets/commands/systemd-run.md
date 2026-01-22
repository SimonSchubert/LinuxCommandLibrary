# TLDR

**Start** a transient service

```sudo systemd-run [command] [arguments]```

**Start** a transient service under the current user

```systemd-run --user [command] [arguments]```

**Start** a transient service with a custom name and description

```sudo systemd-run -u [name] --description [string] [command]```

**Start** a service that remains after exit with custom environment

```sudo systemd-run -r --set-env=[name]=[value] [command]```

**Start** a transient timer that runs periodically

```sudo systemd-run --on-calendar=[calendar_event] [command]```

**Run** interactively with terminal access

```systemd-run -r --pty [command]```

**Set** resource limits and wait for completion

```systemd-run -p MemoryMax=[bytes] -p CPUQuota=[percentage]% --wait [command]```

**Use** in a shell pipeline

```[command1] | systemd-run -P [command2] | [command3]```

# SYNOPSIS

**systemd-run** [_options_] [_command_] [_arguments_]

# PARAMETERS

**--user**
> Run under user service manager

**-u, --unit _name_**
> Unit name for the transient service

**--description _text_**
> Description for the unit

**-r, --remain-after-exit**
> Keep unit after process exits

**--set-env _name=value_**
> Set environment variables

**--on-calendar _spec_**
> Create a timer unit

**--pty**
> Allocate a pseudo-TTY

**-p, --property _name=value_**
> Set unit properties

**--wait**
> Wait for service completion

**-P, --pipe**
> Enable pipe mode for use in pipelines

# DESCRIPTION

**systemd-run** runs programs in transient scope or service units managed by systemd. This allows applying resource controls, creating timers, and proper service management for ad-hoc commands.

The tool is useful for running commands with specific resource limits (CPU, memory), creating one-shot timers, and ensuring proper cleanup and logging through systemd.

# CAVEATS

Timer syntax follows systemd.time format. Resource properties require appropriate cgroup controllers. Some options require root privileges. Part of the systemd suite.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.service](/man/systemd.service)(5), [systemd.timer](/man/systemd.timer)(5), [systemd.resource-control](/man/systemd.resource-control)(5)
