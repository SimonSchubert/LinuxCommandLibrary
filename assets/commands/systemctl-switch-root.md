# TLDR

**Switch** to new root filesystem

```systemctl switch-root [/path/to/new_root]```

Switch and run **specific init**

```systemctl switch-root [/path/to/new_root] [/sbin/init]```

Switch with **verbose** output

```systemctl switch-root [/path/to/new_root] -v```

# SYNOPSIS

**systemctl switch-root** _ROOT_ [_INIT_]

# PARAMETERS

**-v, --verbose**
> Enable verbose output

_ROOT_
> Path to the new root filesystem

_INIT_
> Init binary to execute (default: systemd)

# DESCRIPTION

**systemctl switch-root** transitions the system from an initramfs to the real root filesystem and executes a new system manager. This is the final step of the boot process after the initramfs has set up the real root.

This command is typically used internally by the initramfs to complete the boot process, not called manually.

# CAVEATS

Intended for initramfs use during boot. Incorrect use can render the system unbootable. The new root must contain a valid init system. All processes from the old root are terminated.

# HISTORY

The **switch-root** subcommand formalizes the initramfs-to-real-root transition in systemd, replacing the traditional pivot_root operations.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd](/man/systemd)(1), [pivot_root](/man/pivot_root)(2)
