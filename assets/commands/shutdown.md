# TAGLINE

Safely power off or reboot the system

# TLDR

**Power off** immediately

```shutdown -h now```

**Reboot** immediately

```shutdown -r now```

**Reboot** in 5 minutes

```shutdown -r +5 &```

**Shutdown** at 1:00 PM (24-hour clock)

```shutdown -h 13:00```

**Cancel** a pending shutdown/reboot

```shutdown -c```

# SYNOPSIS

**shutdown** [_options_] [_time_] [_message_]

# PARAMETERS

**-h, --halt**
> Halt the system after shutdown

**-P, --poweroff**
> Power off the system (default with -h)

**-r, --reboot**
> Reboot the system

**-c**
> Cancel a pending shutdown

**-k**
> Send warning message but don't actually shutdown

**now**
> Execute immediately

**+_m_**
> Execute in m minutes

**_hh:mm_**
> Execute at specified time (24-hour format)

# DESCRIPTION

**shutdown** brings the system down in a safe way. All logged-in users are notified, new logins are blocked, and running processes are signaled to terminate gracefully.

The time argument specifies when to shut down: **now** for immediate, **+m** for minutes from now, or **hh:mm** for a specific time. An optional message can be broadcast to all users.

# CAVEATS

Requires root privileges. Scheduled shutdowns can be cancelled with **-c**. On systemd systems, this command is typically a wrapper around **systemctl poweroff/reboot**.

# HISTORY

The **shutdown** command originated in early Unix systems. It evolved from a simple system halt to a comprehensive tool for graceful system shutdowns with user notification.

# SEE ALSO

[reboot](/man/reboot)(8), [halt](/man/halt)(8), [poweroff](/man/poweroff)(8), [systemctl](/man/systemctl)(1)
