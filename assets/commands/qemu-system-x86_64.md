# TAGLINE

Emulate x86_64 systems with QEMU

# TLDR

**Boot ISO image**

```qemu-system-x86_64 -cdrom [image.iso] -boot d```

**Boot disk image**

```qemu-system-x86_64 -hda [disk.qcow2]```

**Boot with memory and CPU**

```qemu-system-x86_64 -m [2G] -smp [2] -hda [disk.qcow2]```

**Boot with KVM acceleration**

```qemu-system-x86_64 -enable-kvm -m [4G] -hda [disk.qcow2]```

**Boot with network**

```qemu-system-x86_64 -hda [disk.qcow2] -nic user,hostfwd=tcp::2222-:22```

# SYNOPSIS

**qemu-system-x86_64** [_options_] [_disk_image_]

# PARAMETERS

**-m** _size_
> RAM size (e.g., 2G, 4096M).

**-smp** _cpus_
> Number of CPUs.

**-hda** _file_
> Primary hard disk image.

**-cdrom** _file_
> CD-ROM image.

**-boot** _order_
> Boot order (c=disk, d=cdrom).

**-enable-kvm**
> Enable KVM acceleration.

**-nic** _options_
> Network configuration.

**-nographic**
> Disable graphical output.

**-vnc** _display_
> Enable VNC server.

**-cpu** _model_
> CPU model to emulate.

**-drive** _options_
> Define a drive (file, format, if, media).

**-serial** _device_
> Redirect serial port.

# DESCRIPTION

**qemu-system-x86_64** is a full-system emulator for the x86_64 architecture. It can run complete operating systems including Linux, Windows, and BSD. With **KVM** hardware acceleration on Linux, it achieves near-native performance.

QEMU emulates CPU, memory, storage, network, and display devices. It supports multiple disk image formats (qcow2, raw, vmdk), various network configurations, and both graphical and serial console output. It is the backend for higher-level virtualization tools like libvirt, virt-manager, and Proxmox.

# CAVEATS

KVM requires hardware virtualization support (Intel VT-x/AMD-V) and the kvm kernel module. Without KVM, emulation is significantly slower. High memory and CPU allocation may impact the host system.

# HISTORY

**QEMU** was created by **Fabrice Bellard** and first released in **2003**. KVM hardware acceleration was merged into the Linux kernel in **2007**, making QEMU the standard userspace component of Linux virtualization.

# SEE ALSO

[qemu-img](/man/qemu-img)(1), [qemu-system-i386](/man/qemu-system-i386)(1)

