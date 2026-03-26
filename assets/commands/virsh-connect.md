# TAGLINE

Connect or reconnect to a libvirt hypervisor from within a virsh shell

# TLDR

**Reconnect to the local QEMU/KVM system daemon (as root)**

```virsh connect qemu:///system```

**Connect to the session QEMU/KVM daemon (as a normal user)**

```virsh connect qemu:///session```

**Connect to a remote host over SSH**

```virsh connect qemu+ssh://[user]@[host]/system```

**Connect to a remote host over TLS**

```virsh connect qemu+tls://[host]/system```

**Open a read-only connection**

```virsh connect qemu:///system --readonly```

# SYNOPSIS

**connect** [_URI_] [_--readonly_]

# PARAMETERS

**--readonly**
> Open a read-only connection to the hypervisor. Restricts operations to non-destructive queries.

# DESCRIPTION

**connect** is a virsh shell command that establishes or re-establishes a connection to a libvirt hypervisor. It is run automatically when the virsh shell starts, using the URI supplied via the **-c** flag on the command line. It can be used interactively inside a running virsh session to switch to a different hypervisor connection.

If no URI is given, virsh reconnects using the current URI. The URI format is `driver[+transport]://[user@][host][:port]/[path]`. Common local URIs include `qemu:///system` (system-wide QEMU/KVM, requires root), `qemu:///session` (per-user QEMU/KVM), `xen:///system` (Xen), and `lxc:///system` (Linux Containers). Remote connections use transport suffixes such as **+ssh**, **+tls**, **+tcp**, or **+libssh**. When no URI is specified at all, libvirt checks the `LIBVIRT_DEFAULT_URI` environment variable, then the `uri_default` setting in the client configuration, and finally probes available hypervisors.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-list](/man/virsh-list)(1), [virsh-help](/man/virsh-help)(1)

