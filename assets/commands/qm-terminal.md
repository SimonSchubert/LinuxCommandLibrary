# TAGLINE

Attach to a Proxmox VM serial console

# TLDR

**Attach** to a VM's serial console

```qm terminal 100```

**Attach** to a specific serial interface

```qm terminal 100 -iface serial1```

**Detach** from the terminal

```Ctrl+o```

# SYNOPSIS

**qm terminal** _vmid_ [**-iface** _serial0..3_]

# DESCRIPTION

**qm terminal** attaches to the serial console of a virtual machine. This provides direct console access to the VM without requiring network connectivity or VNC.

Use Ctrl+o to detach from the terminal session without affecting the VM.

# PARAMETERS

**-iface** _serial0..3_
> Select the serial device to connect to (serial0, serial1, serial2, or serial3). Defaults to the first available serial console.

# CAVEATS

Requires the VM to have a serial console configured (serial device type "socket") and the VM display set to "Serial Terminal". The guest OS must have serial console output enabled for useful interaction.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-monitor](/man/qm-monitor)(1), [qm-vncproxy](/man/qm-vncproxy)(1)
