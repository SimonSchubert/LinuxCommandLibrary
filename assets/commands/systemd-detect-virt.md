# TAGLINE

Detect virtualization environment

# TLDR

**List** detectable virtualization technologies

```systemd-detect-virt --list```

**Detect** virtualization and print the result

```systemd-detect-virt```

**Silently** check without printing anything

```systemd-detect-virt -q```

**Only** detect container virtualization

```systemd-detect-virt -c```

**Only** detect hardware virtualization

```systemd-detect-virt -v```

**Detect** whether in a chroot environment

```systemd-detect-virt -r```

# SYNOPSIS

**systemd-detect-virt** [_options_]

# PARAMETERS

**--list**
> List all detectable virtualization technologies

**-q, --quiet**
> Suppress output, only return exit code

**-c, --container**
> Only detect container virtualization

**-v, --vm**
> Only detect hardware VM virtualization

**-r, --chroot**
> Detect chroot environment

**--private-users**
> Detect user namespace

# DESCRIPTION

**systemd-detect-virt** detects whether the system is running in a virtualized environment and prints the detected virtualization technology. It returns exit code 0 if virtualization is detected, non-zero otherwise.

Detectable technologies include: KVM, QEMU, VMware, VirtualBox, Xen, Hyper-V, Docker, LXC, systemd-nspawn, and many others. The **--list** option shows all supported technologies.

# CAVEATS

Detection relies on various heuristics and may not detect all virtualization types. Some nested virtualization scenarios may report only the innermost layer. Part of the systemd suite.

# SEE ALSO

[systemd-nspawn](/man/systemd-nspawn)(1), [systemd](/man/systemd)(1), [machinectl](/man/machinectl)(1)
