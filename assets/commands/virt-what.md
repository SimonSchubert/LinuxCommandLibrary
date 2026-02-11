# TAGLINE

Detect virtualization technology

# TLDR

**Detect** virtual machine

```virt-what```

**Log** output to file

```virt-what > [path/to/file]```

Display **version**

```virt-what --version```

# SYNOPSIS

**virt-what** [_OPTIONS_]

# PARAMETERS

**--version**
> Display version information

# DESCRIPTION

**virt-what** is a shell script that detects if you are running inside a virtual machine. It outputs specific codes identifying the virtualization technology if detected.

The tool can detect various hypervisors including KVM, Xen, VMware, VirtualBox, Hyper-V, and others. Empty output means running on bare metal.

# CAVEATS

Detection may not be 100% accurate in all cases. Some nested virtualization scenarios may produce unexpected results. Requires root for some detection methods.

# SEE ALSO

[systemd-detect-virt](/man/systemd-detect-virt)(1)
