# TAGLINE

Open-source machine emulator and virtualizer

# TLDR

**Run virtual machine**

```qemu-system-x86_64 -hda [disk.img]```

**Run with memory**

```qemu-system-x86_64 -m [2048] -hda [disk.img]```

**Boot from ISO**

```qemu-system-x86_64 -cdrom [installer.iso] -boot d```

**Enable KVM acceleration**

```qemu-system-x86_64 -enable-kvm -hda [disk.img]```

**Network with port forwarding**

```qemu-system-x86_64 -hda [disk.img] -netdev user,id=net0,hostfwd=tcp::2222-:22 -device e1000,netdev=net0```

# SYNOPSIS

**qemu-system-***_arch_ [_options_]

# PARAMETERS

**-hda** _FILE_
> Primary hard disk.

**-m** _SIZE_
> Memory in MB.

**-cdrom** _FILE_
> CD-ROM image.

**-enable-kvm**
> KVM acceleration.

**-boot** _ORDER_
> Boot order.

**-smp** _CPUS_
> CPU count.

# DESCRIPTION

**QEMU** (Quick EMUlator) is an open-source machine emulator and virtualizer that can run operating systems for any supported architecture on any host. It provides full system emulation including CPU, memory, storage, and peripheral devices, supporting architectures like x86, ARM, RISC-V, MIPS, PowerPC, and others.

When combined with KVM (Kernel-based Virtual Machine) on Linux, QEMU achieves near-native performance by using hardware virtualization extensions. Without KVM, it uses dynamic binary translation for full software emulation, which is slower but works across platforms. QEMU disk images support multiple formats (qcow2, raw, vmdk) with features like snapshots, thin provisioning, and backing files.

# CAVEATS

Performance varies by mode. KVM for best performance.

# HISTORY

QEMU was created by **Fabrice Bellard** for processor emulation.

# SEE ALSO

[qemu-img](/man/qemu-img)(1), [kvm](/man/kvm)(1), [virsh](/man/virsh)(1)

