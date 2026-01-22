# TLDR

**Send** a key event to a virtual machine

```qm sendkey 100 ctrl-alt-delete```

Send key event **ignoring locks** (root only)

```qm sendkey --skiplock true 100 key```

# SYNOPSIS

**qm sendkey** [_options_] _vmid_ _key_

# PARAMETERS

**--skiplock** _true|false_
> Ignore locks and force key send (root only)

# DESCRIPTION

**qm sendkey** sends QEMU monitor encoding key events to a virtual machine. This allows sending keyboard input like Ctrl+Alt+Delete or other key combinations to the VM.

Key names follow QEMU monitor encoding format.

# CAVEATS

Key encoding follows QEMU monitor format, not standard key names. The skiplock option requires root privileges.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-monitor](/man/qm-monitor)(1)
