# TAGLINE

Hibernate system to disk

# TLDR

**Hibernate** the system immediately

```systemctl hibernate```

Hibernate, **ignoring inhibitor locks**

```systemctl hibernate -i```

**Force** hibernation if logind returns an error

```systemctl hibernate --force```

Hibernate without sending a **wall message** to logged-in users

```systemctl hibernate --no-wall```

**Show** what would be done

```systemctl hibernate --dry-run```

# SYNOPSIS

**systemctl hibernate** [_OPTIONS_]

# DESCRIPTION

**systemctl hibernate** hibernates the system by saving the current state to disk (swap) and powering off. When the system is powered on again, it resumes from where it left off.

The command triggers **hibernate.target** and is asynchronous: it returns once the operation is enqueued and does not wait for the hibernate and resume cycle to complete.

# PARAMETERS

**-f, --force**
> Ignore an error returned by systemd-logind and start the hibernate target directly

**--no-wall**
> Do not send wall message to logged-in users before hibernating

**--check-inhibitors=** _auto|yes|no_
> Control the checking of inhibitor locks (default: auto)

**-i**
> Ignore inhibitor locks; shortcut for **--check-inhibitors=no**

**--dry-run**
> Just print what would be done

# CAVEATS

Requires sufficient swap space to hold the contents of RAM. The system must support hibernation at the hardware level. Some systems may need additional kernel parameters for hibernation to work properly. Hibernation can be disabled with **AllowHibernation=no** in **/etc/systemd/sleep.conf**.

# HISTORY

**systemctl hibernate** is part of **systemd**, the system and service manager for Linux, providing modern power management capabilities.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1), [systemctl-suspend-then-hibernate](/man/systemctl-suspend-then-hibernate)(1), [systemctl-poweroff](/man/systemctl-poweroff)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
