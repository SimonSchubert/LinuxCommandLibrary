# TLDR

**Check KVM support**

```lscpu | grep Virtualization```

**Load KVM module**

```sudo modprobe kvm-intel```  # or kvm-amd

**Run VM with QEMU/KVM**

```qemu-system-x86_64 -enable-kvm -m [2048] -hda [disk.qcow2]```

**Check if KVM is enabled**

```ls /dev/kvm```

**List running VMs (libvirt)**

```virsh list --all```

# DESCRIPTION

**KVM** (Kernel-based Virtual Machine) is a Linux kernel virtualization module. It turns Linux into a hypervisor, allowing it to run multiple virtual machines with near-native performance.

KVM requires hardware virtualization support (Intel VT-x or AMD-V). It's typically used with QEMU for device emulation and optionally with libvirt for management.

# ARCHITECTURE

```
Applications → Guest OS → KVM → Host Kernel → Hardware

Components:
- kvm.ko: Core virtualization
- kvm-intel.ko or kvm-amd.ko: CPU-specific
- QEMU: Device emulation
- libvirt: Management API
```

# VERIFY SUPPORT

```bash
# Check CPU support
grep -E 'vmx|svm' /proc/cpuinfo

# Check KVM module
lsmod | grep kvm

# Check device
ls -la /dev/kvm
```

# CAVEATS

Requires VT-x/AMD-V enabled in BIOS. Nested virtualization needs additional configuration. Performance varies by workload.

# HISTORY

KVM was created by **Qumranet** and merged into Linux kernel **2.6.20** in **2007**. Red Hat acquired Qumranet in 2008. KVM became the standard Linux hypervisor, replacing Xen in many deployments.

# SEE ALSO

[qemu](/man/qemu)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1)
