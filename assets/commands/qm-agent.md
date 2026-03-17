# TAGLINE

execute commands via QEMU guest agent in Proxmox VE

# TLDR

**This command is an alias of `qm guest cmd`**

```tldr qm guest cmd```

**Execute a guest agent command on a VM**

```qm agent [vmid] [command]```

**Ping the guest agent to check if it is running**

```qm agent [vmid] ping```

**Freeze the guest filesystem (for snapshots)**

```qm agent [vmid] fsfreeze-freeze```

**Thaw the guest filesystem after a snapshot**

```qm agent [vmid] fsfreeze-thaw```

# SYNOPSIS

**qm agent** _vmid_ _command_

# DESCRIPTION

**qm agent** is an alias for **qm guest cmd** in Proxmox VE. It executes commands through the QEMU guest agent (qemu-ga) running inside a virtual machine, enabling host-to-guest communication for operations like filesystem freeze/thaw, graceful shutdown, and information retrieval.

The QEMU guest agent must be installed and running inside the VM, and the agent option must be enabled in the VM configuration.

# CAVEATS

The QEMU guest agent must be installed inside the guest OS and enabled in the VM configuration. On Linux guests, install the **qemu-guest-agent** package. On Windows guests, the agent is included with the VirtIO drivers. Communication fails if the agent is not running.

# HISTORY

**qm agent** is part of **Proxmox VE**, the open-source virtualization platform. The QEMU guest agent protocol allows fine-grained control of VMs beyond what ACPI power management provides.

# SEE ALSO

[qm](/man/qm)(1), [qm-guest](/man/qm-guest)(1), [qm-guest-exec](/man/qm-guest-exec)(1)
