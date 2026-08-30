# TAGLINE

Detect virtualization environment

# TLDR

Report which **virtualization is in use**, if any

```systemd-detect-virt```

Report through the **exit status only**, printing nothing

```systemd-detect-virt --quiet```

Use it as a **condition in a script**

```systemd-detect-virt --quiet && echo "[running virtualized]"```

Only consider **container** technologies

```systemd-detect-virt --container```

Only consider **full machine** virtualization

```systemd-detect-virt --vm```

Detect a **chroot**

```systemd-detect-virt --chroot```

Detect a **user namespace**

```systemd-detect-virt --private-users```

List everything it can **recognize**

```systemd-detect-virt --list```

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

# INSTALL

```apt: sudo apt install systemd```

```dnf: sudo dnf install systemd```

```pacman: sudo pacman -S systemd```

```zypper: sudo zypper install systemd```

```brew: brew install systemd```

```nix: nix profile install nixpkgs#systemd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[systemd-nspawn](/man/systemd-nspawn)(1), [machinectl](/man/machinectl)(1)
