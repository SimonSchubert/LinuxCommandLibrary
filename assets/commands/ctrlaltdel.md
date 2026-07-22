# TAGLINE

control Ctrl+Alt+Del key combination behavior

# TLDR

**Get** current setting

```ctrlaltdel```

Set Ctrl+Alt+Del to reboot **immediately** (hard)

```sudo ctrlaltdel hard```

Set Ctrl+Alt+Del to reboot **gracefully** (soft)

```sudo ctrlaltdel soft```

# SYNOPSIS

**ctrlaltdel** [_hard_|_soft_]

# DESCRIPTION

**ctrlaltdel** controls the kernel's behavior when Ctrl+Alt+Del is pressed on the console. The setting determines whether the system reboots immediately or allows processes to shut down gracefully.

With "hard", the system reboots immediately. With "soft", SIGINT is sent to PID 1 (init/systemd), which handles a graceful shutdown.

# PARAMETERS

**hard**
> Reboot immediately without preparation

**soft**
> Send SIGINT to init for graceful reboot

# CAVEATS

Requires root privileges to change the setting. Part of util-linux. On modern systemd systems, systemd handles the Ctrl+Alt+Del signal regardless of this setting.

# HISTORY

This control exists from early Unix days when physical console access was common. The three-key combination was chosen to be difficult to press accidentally.

# INSTALL

```apt: sudo apt install util-linux-extra```

```apk: sudo apk add util-linux-misc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[reboot](/man/reboot)(8), [shutdown](/man/shutdown)(8), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

<!-- verified: 2026-06-26 -->
