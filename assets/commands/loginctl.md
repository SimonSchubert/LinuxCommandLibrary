# TLDR

Print all **current sessions**

```loginctl```

Show **all properties** of a session

```loginctl show-session session_id -a```

Show properties of a **specific user**

```loginctl show-user username```

Show a **specific property** of a user

```loginctl show-user username -p Property```

Execute on a **remote host**

```loginctl list-users -H hostname```

**Log out** a user from all sessions

```loginctl terminate-user username```

**Lock** all sessions

```loginctl lock-sessions```

# SYNOPSIS

**loginctl** [_OPTIONS_] [_COMMAND_]

# DESCRIPTION

**loginctl** controls the systemd login manager (systemd-logind). It can be used to introspect and control the state of user sessions, seats, and the login manager itself.

# COMMANDS

**list-sessions**
> List current sessions

**session-status [ID]**
> Show runtime session status

**show-session [ID]**
> Show properties of sessions

**activate ID**
> Activate a session

**lock-session [ID]**
> Lock sessions

**unlock-session [ID]**
> Unlock sessions

**lock-sessions**
> Lock all sessions

**unlock-sessions**
> Unlock all sessions

**terminate-session ID**
> Terminate a session

**list-users**
> List logged-in users

**user-status [USER]**
> Show runtime user status

**show-user [USER]**
> Show properties of users

**enable-linger [USER]**
> Enable user linger (keep services running after logout)

**disable-linger [USER]**
> Disable user linger

**terminate-user USER**
> Terminate all sessions of a user

**list-seats**
> List available seats

**seat-status [SEAT]**
> Show seat status

# PARAMETERS

**-a, --all**
> Show all properties

**-p, --property**
> Show specific property

**-H, --host**
> Execute on remote host

**-M, --machine**
> Execute in container

**--no-pager**
> Do not pipe output to pager

**--no-legend**
> Do not print header/footer

# CAVEATS

Enable-linger allows user services to persist after logout. Terminating sessions may cause data loss in running applications.

# HISTORY

**loginctl** is part of **systemd**, managing multi-seat configurations, user sessions, and user lingering through systemd-logind.

# SEE ALSO

[systemd-logind](/man/systemd-logind)(8), [systemctl](/man/systemctl)(1), [lslogins](/man/lslogins)(1)
