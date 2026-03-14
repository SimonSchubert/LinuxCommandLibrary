# TAGLINE

Detect virtualization technology

# TLDR

**Detect** virtualization technology (requires root)

```sudo virt-what```

**Log** output to file

```sudo virt-what > [path/to/file]```

Display **version**

```virt-what --version```

# SYNOPSIS

**virt-what** [_OPTIONS_]

# PARAMETERS

**--version**
> Display version information

# DESCRIPTION

**virt-what** is a shell script that detects if you are running inside a virtual machine. It prints one or more lines identifying the virtualization technology. If nothing is printed, the system is running on bare metal.

The tool can detect various hypervisors including KVM, QEMU, Xen (HVM and PV), VMware, VirtualBox, Hyper-V, Docker, LXC, OpenVZ, Podman, and others. Multiple lines may be printed for nested virtualization (e.g., both "kvm" and "hyperv" when running KVM inside Hyper-V).

# OUTPUT VALUES

Common output values include: **kvm**, **qemu**, **xen**, **xen-hvm**, **xen-pv**, **vmware**, **virtualbox**, **hyperv**, **docker**, **lxc**, **openvz**, **podman**, **parallels**, **bhyve**, **uml** (User-Mode Linux).

# CAVEATS

Requires root privileges for reliable detection. Some detection methods read DMI data or kernel modules that are only accessible as root. Nested virtualization may produce multiple lines of output. Container detection (Docker, LXC, Podman) is also supported.

# HISTORY

**virt-what** was created by **Richard W.M. Jones** at Red Hat. It is distributed as part of the virt-what package and is commonly used in provisioning scripts to detect the runtime environment.

# SEE ALSO

[systemd-detect-virt](/man/systemd-detect-virt)(1), [lscpu](/man/lscpu)(1)
