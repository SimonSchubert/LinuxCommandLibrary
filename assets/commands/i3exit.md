# TAGLINE

script that provides system power management and session control for the i3

# TLDR

**Log out** of i3

```i3exit logout```

**Lock** the screen

```i3exit lock```

**Suspend** the system

```i3exit suspend```

**Hibernate** the system

```i3exit hibernate```

**Reboot** the system

```i3exit reboot```

**Shut down** the system

```i3exit shutdown```

**Switch user** (return to login screen)

```i3exit switch_user```

# SYNOPSIS

**i3exit** _command_

# PARAMETERS

**logout**
> Exit i3 and return to display manager

**lock**
> Lock the screen

**suspend**
> Suspend the system to RAM

**hibernate**
> Hibernate the system to disk

**reboot**
> Reboot the system

**shutdown**
> Power off the system

**switch_user**
> Return to login screen for user switching

# DESCRIPTION

**i3exit** is a script that provides system power management and session control for the i3 window manager. It wraps common actions like locking, suspending, hibernating, and logging out into a single command.

The script is typically bound to keyboard shortcuts or used in i3 mode menus, providing consistent behavior for power management operations regardless of the underlying display manager or systemd configuration.

# CAVEATS

Requires appropriate permissions for power management operations. Behavior may vary depending on the display manager and systemd configuration. Some commands may require polkit authentication.

# HISTORY

i3exit was developed for Manjaro Linux's i3 edition to provide a convenient power management interface for i3 users. It abstracts the differences between various power management backends.

# SEE ALSO

[i3](/man/i3)(1), [systemctl](/man/systemctl)(1), [loginctl](/man/loginctl)(1)
