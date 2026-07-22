# TAGLINE

Resize Proxmox VM disk volumes

# TLDR

This command is an alias of **qm disk resize**

View documentation for the original command

```tldr qm disk```

# SYNOPSIS

**qm resize** _vmid_ _disk_ _size_

# DESCRIPTION

**qm resize** is an alias for **qm disk resize** that changes the size of a virtual machine disk. It can extend disk capacity but cannot shrink disks.

# INSTALL

```dnf: sudo dnf install qm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[qm](/man/qm)(1), [qm-disk](/man/qm-disk)(1)
