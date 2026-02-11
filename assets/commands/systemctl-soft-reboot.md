# TAGLINE

Restart userspace without kernel reboot

# TLDR

**Soft reboot** (userspace only)

```systemctl soft-reboot```

**Force** soft reboot

```systemctl soft-reboot -f```

**Schedule** soft reboot

```systemctl soft-reboot --when "[timestamp]"```

**Cancel** scheduled soft reboot

```systemctl soft-reboot --when cancel```

# SYNOPSIS

**systemctl soft-reboot** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Force reboot even if inhibitors are present

**--when** _TIMESTAMP_
> Schedule reboot at specified time or cancel

# DESCRIPTION

**systemctl soft-reboot** shuts down and restarts userspace while keeping the kernel running. This is faster than a full reboot as it skips BIOS/firmware initialization and kernel boot.

The kernel continues running; only systemd and all user services are restarted. This is useful for quickly testing service configurations or applying updates that don't require a kernel change.

# CAVEATS

Requires kernel support. Not suitable when kernel updates need to be applied. Some hardware state may persist inappropriately. Newer feature requiring recent systemd versions.

# HISTORY

The **soft-reboot** subcommand was added in systemd **254** to support faster system restarts for scenarios where only userspace changes need to take effect.

# SEE ALSO

[systemctl-reboot](/man/systemctl-reboot)(1), [systemctl-kexec](/man/systemctl-kexec)(1), [systemctl](/man/systemctl)(1)
