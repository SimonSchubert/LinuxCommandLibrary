# TLDR

**Notify** systemd that the service has completed initialization

```systemd-notify --booted```

**Signal** to systemd that the service is ready

```systemd-notify --ready```

**Provide** a custom status message to systemd

```systemd-notify --status "[Add custom status message here...]"```

# SYNOPSIS

**systemd-notify** [_options_] [_variable=value_...]

# PARAMETERS

**--ready**
> Signal service readiness to systemd

**--booted**
> Check if system was booted with systemd

**--status _text_**
> Send status text to service manager

**--pid _pid_**
> Inform about main PID of daemon

**--uid _user_**
> Specify the user to notify as

**--reloading**
> Signal that service is reloading configuration

**--stopping**
> Signal that service is stopping

# DESCRIPTION

**systemd-notify** notifies the service manager about start-up completion and other daemon status changes. It is primarily used within systemd service scripts for services with **Type=notify**.

The status text provided with **--status** is displayed by **systemctl status**. This allows services to communicate their current state and progress to administrators.

# CAVEATS

Only useful within systemd service contexts. The service must be configured with **Type=notify** or **Type=notify-reload** in its unit file. Has no effect when run outside of systemd services. Part of the systemd suite.

# SEE ALSO

[systemd](/man/systemd)(1), [systemctl](/man/systemctl)(1), [systemd.service](/man/systemd.service)(5)
