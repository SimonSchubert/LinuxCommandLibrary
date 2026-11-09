# TAGLINE

Reboot using kexec fast path

# TLDR

Fast **kexec** reboot, loading the default boot entry if needed

```sudo systemctl kexec```

Load a **custom kernel** first, then reboot into it

```sudo kexec -l [/boot/vmlinuz] --initrd=[/boot/initrd.img] --reuse-cmdline && sudo systemctl kexec```

**Force**: skip orderly unit shutdown, and do a normal reboot if no kexec kernel can be loaded

```sudo systemctl kexec --force```

**Schedule** the kexec reboot for later

```sudo systemctl kexec --when=[+5min]```

# SYNOPSIS

**systemctl kexec** [_OPTIONS_]

# PARAMETERS

**-f**, **--force**
> Execute without shutting down all units; processes are killed forcibly and file systems unmounted or remounted read-only. Also continues without a kexec kernel, performing a normal reboot. Unlike other shutdown verbs, specifying it twice has no extra effect.

**--when=** _TIMESTAMP_
> Schedule the action for a time, in systemd.time syntax. **show** displays the scheduled action, **cancel** or an empty value cancels it.

**--check-inhibitors=** _MODE_
> Control inhibitor lock checking: auto, yes, or no (default auto).

# DESCRIPTION

**systemctl kexec** shuts down and reboots the system via kexec, which loads and boots directly into a new kernel without going through BIOS/UEFI firmware. This provides significantly faster reboots by skipping hardware initialization.

If no kexec kernel is loaded yet, systemctl loads the default boot entry, enumerated following the Boot Loader Specification; this needs a UEFI system with proper boot entries (see `bootctl list`). A kernel can also be loaded beforehand with `kexec -l`, which is the way to use a custom initrd or kernel command line.

The command is asynchronous: it returns once the reboot is enqueued. The final step is equivalent to `systemctl start kexec.target --job-mode=replace-irreversibly --no-block`.

# CAVEATS

Fails if no kernel is loaded and none can be loaded, unless **--force** is given. Skipping firmware initialization may cause issues with some hardware, and not all hardware supports kexec reliably. Secure Boot kernel lockdown can restrict kexec to signed kernels. Note that a plain `systemctl reboot` also performs a kexec when a kernel is already loaded, unless `SYSTEMCTL_SKIP_AUTO_KEXEC=1` is set.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [kexec](/man/kexec)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
