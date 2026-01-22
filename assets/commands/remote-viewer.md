# TLDR

View a remote desktop using a **virt-viewer file**

```remote-viewer path/to/virt_viewer_file```

# SYNOPSIS

**remote-viewer** [_options_] [_URI_|_file_]

# DESCRIPTION

**remote-viewer** provides remote desktop viewing capabilities using SPICE, VNC, or other protocols. It can connect to remote virtual machines or physical systems displaying their graphical output.

Connection parameters can be specified via command line, URI, or virt-viewer configuration file.

# CAVEATS

Requires appropriate client libraries for the connection protocol (SPICE, VNC). Display quality depends on network bandwidth.

# HISTORY

Part of **virt-viewer**, providing remote display tools for virtual machine management, commonly used with libvirt and QEMU/KVM.

# SEE ALSO

[virt-viewer](/man/virt-viewer)(1), [virt-manager](/man/virt-manager)(1)
