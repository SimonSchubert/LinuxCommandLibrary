# TAGLINE

Emulate 32-bit x86 systems with QEMU

# TLDR

**Boot ISO image**

```qemu-system-i386 -cdrom [image.iso] -boot d```

**Boot disk with memory**

```qemu-system-i386 -m [512M] -hda [disk.img]```

**Boot with KVM**

```qemu-system-i386 -enable-kvm -hda [disk.img]```

# SYNOPSIS

**qemu-system-i386** [_options_] [_disk_image_]

# PARAMETERS

**-m** _size_
> RAM size.

**-hda** _file_
> Hard disk image.

**-cdrom** _file_
> CD-ROM image.

**-enable-kvm**
> Enable KVM acceleration.

**-boot** _order_
> Boot order.

# DESCRIPTION

**qemu-system-i386** emulates 32-bit x86 systems. Use for running legacy 32-bit operating systems. Same options as qemu-system-x86_64 but for i386 architecture.

# INSTALL

```apt: sudo apt install qemu-system-x86```

```dnf: sudo dnf install qemu-system-x86```

```pacman: sudo pacman -S qemu-system-x86```

```apk: sudo apk add qemu-system-i386```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[qemu-system-x86_64](/man/qemu-system-x86_64)(1), [qemu-img](/man/qemu-img)(1)

