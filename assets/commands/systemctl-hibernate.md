# TAGLINE

Hibernate system to disk

# TLDR

**Hibernate** the system immediately

```systemctl hibernate```

**Force** hibernation, ignoring inhibitors

```systemctl hibernate --force```

Hibernate without sending a **wall message** to logged-in users

```systemctl hibernate --no-wall```

# SYNOPSIS

**systemctl hibernate** [_OPTIONS_]

# DESCRIPTION

**systemctl hibernate** hibernates the system by saving the current state to disk (swap) and powering off. When the system is powered on again, it resumes from where it left off.

# PARAMETERS

**-f, --force**
> Force hibernation even if inhibitors are present (programs blocking sleep). When specified twice, the operation is executed without contacting the login manager.

**--no-wall**
> Do not send wall message to logged-in users before hibernating

**-i, --ignore-inhibitors**
> Ignore inhibitor locks when performing the hibernate operation

# CAVEATS

Requires sufficient swap space to hold the contents of RAM. The system must support hibernation at the hardware level. Some systems may need additional kernel parameters for hibernation to work properly.

# HISTORY

**systemctl hibernate** is part of **systemd**, the system and service manager for Linux, providing modern power management capabilities.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1), [systemctl-suspend-then-hibernate](/man/systemctl-suspend-then-hibernate)(1), [systemctl-poweroff](/man/systemctl-poweroff)(1)
