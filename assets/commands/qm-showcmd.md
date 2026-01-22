# TLDR

Show **command-line** used to start a VM

```qm showcmd 100```

Show with **enhanced readability** (one option per line)

```qm showcmd --pretty true 100```

Show command-line from a **specific snapshot**

```qm showcmd --snapshot snapshot_name 100```

# SYNOPSIS

**qm showcmd** [_options_] _vmid_

# PARAMETERS

**--pretty** _true|false_
> Put each option on a new line for readability

**--snapshot** _name_
> Fetch configuration from specific snapshot

# DESCRIPTION

**qm showcmd** displays the command-line that would be used to start a virtual machine. This is useful for debugging VM configuration and understanding how QEMU is invoked.

The output shows all QEMU options and arguments based on the VM's current configuration or a specific snapshot.

# CAVEATS

Debug information only; the actual command may vary at runtime. Configuration changes require VM restart to take effect.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for debugging VM configuration.

# SEE ALSO

[qm](/man/qm)(1), [qm-config](/man/qm-config)(1)
