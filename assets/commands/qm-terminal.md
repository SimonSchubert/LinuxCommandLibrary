# TLDR

**Attach** to a VM's serial console

```qm terminal 100```

**Detach** from the terminal

```Ctrl+o```

# SYNOPSIS

**qm terminal** _vmid_

# DESCRIPTION

**qm terminal** attaches to the serial console of a virtual machine. This provides direct console access to the VM without requiring network connectivity or VNC.

Use Ctrl+o to detach from the terminal session without affecting the VM.

# CAVEATS

Requires the VM to have a serial console configured. The guest OS must have serial console output enabled for useful interaction.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-monitor](/man/qm-monitor)(1), [qm-vncproxy](/man/qm-vncproxy)(1)
