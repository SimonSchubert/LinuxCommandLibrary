# TAGLINE

Proxy VNC connections to a Proxmox VM

# TLDR

**Proxy** VNC traffic for a virtual machine

```qm vncproxy 100```

# SYNOPSIS

**qm vncproxy** _vmid_

# DESCRIPTION

**qm vncproxy** proxies Virtual Network Computing (VNC) traffic for a virtual machine to stdin/stdout. This enables VNC clients to connect to VMs through the Proxmox VE infrastructure.

The proxy handles authentication and connection setup for VNC sessions.

# CAVEATS

Typically used internally by the Proxmox web interface. Direct use requires understanding of VNC protocol and connection handling.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. Provides the backend for web-based VNC console access.

# SEE ALSO

[qm](/man/qm)(1), [qm-terminal](/man/qm-terminal)(1)
