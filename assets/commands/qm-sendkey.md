# TAGLINE

Send key events to a Proxmox VM

# TLDR

**Send** a key event to a virtual machine

```qm sendkey [vmid] ctrl-alt-delete```

Send a **single key** to a VM

```qm sendkey [vmid] ret```

Send a key event **ignoring locks** (root only)

```qm sendkey --skiplock [vmid] [key]```

# SYNOPSIS

**qm sendkey** [_options_] _vmid_ _key_

# PARAMETERS

_vmid_
> The unique VM ID (integer between 100 and 999999999).

_key_
> Key name in QEMU monitor encoding format (e.g. `ctrl-alt-delete`, `ret`, `esc`, `f1`, `meta_l-r`).

**--skiplock** _boolean_
> Ignore VM locks and force key send. Requires root privileges.

# DESCRIPTION

**qm sendkey** sends a QEMU monitor encoding key event to a running virtual machine. This is useful for sending keyboard input such as `ctrl-alt-delete` or function keys directly to the VM console without needing graphical access.

Key names follow QEMU monitor encoding: alphanumeric characters are written literally, special keys use names like `ret`, `esc`, `tab`, `spc`, `f1`–`f12`, `up`, `down`, `left`, `right`, and modifier combinations use hyphens (e.g. `ctrl-alt-delete`, `meta_l-r`).

# CAVEATS

Key encoding follows QEMU monitor format, not standard key names. The --skiplock option requires root privileges.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-monitor](/man/qm-monitor)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1), [qm-terminal](/man/qm-terminal)(1)
