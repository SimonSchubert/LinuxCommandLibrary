# TAGLINE

Command-line launcher for Firecracker microVMs

# TLDR

**Start a VM** with kernel and root disk

```firectl --kernel=[./vmlinux] --root-drive=[/path/image.img]```

**Custom Firecracker binary** path

```firectl --firecracker-binary=[/usr/local/bin/firecracker] --kernel=[./vmlinux] --root-drive=[disk.img]```

**More CPUs and memory**

```firectl --kernel=[./vmlinux] --root-drive=[disk.img] -c [2] -m [1024]```

**With TAP networking**

```firectl --kernel=[./vmlinux] --root-drive=[disk.img] --tap-device=[tap0/AA:FC:00:00:00:01]```

**Writable root** and custom kernel cmdline

```firectl --kernel=[./vmlinux] --root-drive=[disk.img:rw] --kernel-opts="console=ttyS0 reboot=k panic=1 pci=off nomodules rw"```

# SYNOPSIS

**firectl** [*OPTIONS*]

# DESCRIPTION

**firectl** is a basic command-line tool to run Firecracker microVMs with console access, disk I/O, and optional networking. It wraps the **firecracker** binary: you supply a Linux kernel image (**vmlinux**) and root filesystem image, plus optional extra drives, TAP NIC, vsock, CPU/memory, and MMDS metadata.

By default it searches **PATH** for **firecracker**. Build with Go 1.23+ (**go build** or **make build-in-docker**). Needs KVM access (for example **setfacl** on **/dev/kvm**).

# PARAMETERS

**--firecracker-binary=**_path_

> Path to the firecracker binary.

**--kernel=**_path_

> Kernel image (default **./vmlinux**).

**--kernel-opts=**_cmdline_

> Kernel command line.

**--root-drive=**_path_[:ro|:rw]

> Root disk image, optional **:ro** or **:rw** suffix.

**--add-drive=**_path_[:ro|:rw]

> Additional drive (repeatable).

**--tap-device=**_DEVICE/MAC_

> TAP NIC configuration.

**--vsock-device=**_PATH:CID_

> Vsock interface (repeatable).

**-c**, **--ncpus=**_n_ / **-m**, **--memory=**_MiB_

> vCPU count (default 1) and memory in MiB (default 512).

**--cpu-template=**_C3|T2_

> Firecracker CPU template.

**-t**, **--disable-smt**

> Disable simultaneous multithreading.

**-s**, **--socket-path=**_path_

> Firecracker API socket path.

**-d**, **--debug**

> Debug output.

See **firectl --help** for log FIFOs, metrics, metadata JSON, and partition options.

# CAVEATS

Requires hardware virtualization (KVM) and a working Firecracker install. Kernel and rootfs must be Firecracker-compatible. Root/network setup often needs elevated privileges. Not a full orchestration stack (see Firecracker docs and tools like flintlock for production fleets).

# INSTALL

```zypper: sudo zypper install firectl```

```nix: nix profile install nixpkgs#firectl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[firecracker](/man/firecracker)(1), [qemu](/man/qemu)(1), [cloud-hypervisor](/man/cloud-hypervisor)(1)

# RESOURCES

```[Source code](https://github.com/firecracker-microvm/firectl)```

```[Homepage](https://firecracker-microvm.github.io/)```

<!-- verified: 2026-07-19 -->
