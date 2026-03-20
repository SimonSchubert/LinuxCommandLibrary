# TAGLINE

Reboot using kexec fast path

# TLDR

Fast **kexec** reboot

```systemctl kexec```

**Fall back** to normal reboot if no kexec kernel loaded

```systemctl kexec --force```

# SYNOPSIS

**systemctl kexec** [_OPTIONS_]

# PARAMETERS

**-f**, **--force**
> Continue without a kexec kernel, performing a normal reboot instead. If specified twice, skip service shutdown and immediately reboot (may cause data loss).

# DESCRIPTION

**systemctl kexec** shuts down and reboots the system via kexec, which loads and boots directly into a new kernel without going through BIOS/UEFI firmware. This provides significantly faster reboots by skipping hardware initialization.

A kexec kernel must be loaded beforehand (e.g. via `kexec -l`) or this command will fail. If no kernel is loaded, use `--force` to fall back to a normal reboot.

# CAVEATS

Requires a kernel to be pre-loaded with `kexec -l`. Skips firmware initialization, which may cause issues with some hardware. Not all hardware supports kexec reliably. May not work with secure boot enabled.

# HISTORY

The **kexec** subcommand integrates the Linux kexec facility with systemd's shutdown process, enabling fast reboots in environments where boot time is critical.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [kexec](/man/kexec)(8)
