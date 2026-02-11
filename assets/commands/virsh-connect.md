# TAGLINE

Connect to libvirt hypervisor

# TLDR

**Connect to local QEMU/KVM**

```virsh connect qemu:///system```

**Connect to session hypervisor**

```virsh connect qemu:///session```

**Connect to remote host**

```virsh connect qemu+ssh://[user]@[host]/system```

# SYNOPSIS

**virsh** **connect** _URI_ [_options_]

# PARAMETERS

**--readonly**
> Read-only connection.

# DESCRIPTION

**virsh connect** establishes connection to a libvirt hypervisor. Supports local QEMU/KVM, Xen, and remote connections over SSH. System connections require root; session is per-user.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1)

