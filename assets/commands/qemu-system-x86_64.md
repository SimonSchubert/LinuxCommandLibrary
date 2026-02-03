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

# DESCRIPTION

**qemu-system-x86_64** emulates x86_64 systems. Full system emulator for running operating systems. Supports KVM hardware acceleration on Linux for near-native performance.

# SEE ALSO

[qemu-img](/man/qemu-img)(1), [qemu-system-i386](/man/qemu-system-i386)(1)

