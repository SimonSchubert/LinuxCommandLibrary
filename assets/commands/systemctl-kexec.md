# TLDR

Fast **kexec** reboot

```systemctl kexec```

**Force** if kexec unavailable

```systemctl kexec -f```

# SYNOPSIS

**systemctl kexec** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Fall back to normal reboot if kexec not available

# DESCRIPTION

**systemctl kexec** reboots the system using kexec, which loads and boots directly into a new kernel without going through BIOS/UEFI firmware. This provides significantly faster reboots by skipping hardware initialization.

A kernel must be pre-loaded using the `kexec` command before this works. If no kernel is loaded, the command fails unless `--force` is used.

# CAVEATS

Requires a kernel to be pre-loaded with `kexec -l`. Skips firmware initialization, which may cause issues with some hardware. Not all hardware supports kexec reliably. May not work with secure boot enabled.

# HISTORY

The **kexec** subcommand integrates the Linux kexec facility with systemd's shutdown process, enabling fast reboots in environments where boot time is critical.

# SEE ALSO

[systemctl-reboot](/man/systemctl-reboot)(1), [kexec](/man/kexec)(8)
