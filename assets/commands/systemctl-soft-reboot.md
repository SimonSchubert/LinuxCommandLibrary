# TAGLINE

Restart userspace without kernel reboot

# TLDR

**Soft reboot** (userspace only)

```systemctl soft-reboot```

**Force** soft reboot

```systemctl soft-reboot -f```

Soft reboot ignoring **inhibitors**

```systemctl soft-reboot -i```

**Schedule** soft reboot

```systemctl soft-reboot --when "[timestamp]"```

**Cancel** scheduled soft reboot

```systemctl soft-reboot --when cancel```

# SYNOPSIS

**systemctl soft-reboot** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Skip service shutdown, but still kill all processes and unmount file systems or remount them read-only

**-i**
> Shortcut for `--check-inhibitors=no`: ignore inhibitor locks

**--when=** _TIMESTAMP_
> Schedule at a timestamp in `systemd.time` syntax, or pass `show` to print the scheduled action, `cancel` to cancel it, `auto` for the maintenance window or one minute from now

# DESCRIPTION

**systemctl soft-reboot** shuts down and restarts userspace while keeping the kernel running. This is faster than a full reboot as it skips BIOS/firmware initialization and kernel boot.

The kernel continues running; only systemd and userspace services are restarted. The command is asynchronous and returns once the reboot is enqueued. If a new root file system has been set up on `/run/nextroot/`, it becomes the new root. This is useful for quickly applying updates that don't require a kernel change.

# CAVEATS

Not suitable when kernel updates need to be applied, since the kernel is not reset. Kernel settings such as sysctl values are not reset either. `/run/` stays mounted and populated. Executables in `/usr/lib/systemd/system-shutdown/` are not run. Requires systemd 254 or later.

# HISTORY

The **soft-reboot** subcommand was added in systemd **254** to support faster system restarts for scenarios where only userspace changes need to take effect.

# SEE ALSO

[systemctl-reboot](/man/systemctl-reboot)(1), [systemctl-kexec](/man/systemctl-kexec)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
