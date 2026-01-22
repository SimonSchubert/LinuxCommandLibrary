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

**qemu** is machine emulator and virtualizer. Runs virtual machines.

The tool emulates various architectures. Full system virtualization.

qemu virtualizes systems.

# CAVEATS

Performance varies by mode. KVM for best performance.

# HISTORY

QEMU was created by **Fabrice Bellard** for processor emulation.

# SEE ALSO

[qemu-img](/man/qemu-img)(1), [kvm](/man/kvm)(1), [virsh](/man/virsh)(1)

