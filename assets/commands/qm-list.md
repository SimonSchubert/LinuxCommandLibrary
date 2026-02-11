# TAGLINE

List Proxmox virtual machines

# TLDR

List **all virtual machines**

```qm list```

List with **full status** for running VMs

```qm list --full 1```

# SYNOPSIS

**qm list** [_options_]

# PARAMETERS

**--full** _0|1_
> Show full status information for running VMs

# DESCRIPTION

**qm list** displays all virtual machines on the Proxmox VE node. It shows basic information including VM ID, name, and status.

With the full option, additional details are shown for running VMs including resource usage.

# SEE ALSO

[qm](/man/qm)(1), [qm-status](/man/qm-status)(1)
