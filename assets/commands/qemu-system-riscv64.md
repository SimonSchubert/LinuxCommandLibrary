# TAGLINE

Emulate 64-bit RISC-V systems with QEMU

# TLDR

**Boot a RISC-V kernel on the generic virt machine**

```qemu-system-riscv64 -machine virt -kernel [kernel] -append "root=/dev/vda"```

**Boot with an explicit firmware (OpenSBI) and kernel**

```qemu-system-riscv64 -machine virt -bios [opensbi.bin] -kernel [kernel]```

**Run with 2 GB RAM, 4 SMP cores and a raw disk image**

```qemu-system-riscv64 -machine virt -m [2G] -smp [4] -drive file=[disk.img],format=raw```

**Run headless with a serial console on stdio**

```qemu-system-riscv64 -machine virt -nographic -kernel [kernel]```

**Attach a user-mode network with SSH port forwarding**

```qemu-system-riscv64 -machine virt -netdev user,id=net0,hostfwd=tcp::[2222]-:22 -device virtio-net-device,netdev=net0```

**List supported machine types**

```qemu-system-riscv64 -machine help```

# SYNOPSIS

**qemu-system-riscv64** [_options_] [_disk_image_]

# PARAMETERS

**-machine** _type_
> Machine type to emulate (e.g. **virt**, **sifive_u**, **sifive_e**, **spike**).

**-cpu** _model_
> CPU model (e.g. **rv64**, **sifive-u54**). Default is **rv64**.

**-smp** _n_
> Number of virtual CPUs.

**-m** _size_
> RAM size (e.g. **512M**, **2G**).

**-kernel** _file_
> Bootable kernel image (ELF, uImage, or raw).

**-bios** _file_
> Firmware image loaded before the kernel (default: OpenSBI).

**-initrd** _file_
> Initial ramdisk image.

**-append** _args_
> Kernel command-line arguments.

**-drive** _options_
> Define a block device (e.g. **file=disk.img,format=raw,if=virtio**).

**-netdev** _options_
> Define a backend network (e.g. user, tap).

**-device** _options_
> Add a device (e.g. **virtio-net-device**, **virtio-blk-device**).

**-nographic**
> Disable graphical output; redirect serial/console to stdio.

**-serial** _dev_
> Redirect serial port (e.g. **stdio**, **mon:stdio**, **file:log**).

**-display** _type_
> Display backend (**none**, **gtk**, **sdl**, **vnc**).

**-S**
> Freeze CPU at startup (useful with **-s** for gdb).

**-s**
> Shortcut for **-gdb tcp::1234**.

# DESCRIPTION

**qemu-system-riscv64** is the QEMU system emulator for 64-bit RISC-V guests. It can run bare-metal code, bootloaders, or full Linux distributions on a range of emulated boards. The default **virt** machine is a paravirtualized board designed for virtualization, with VirtIO devices, a CLINT/PLIC interrupt controller and optional OpenSBI firmware.

Other boards model real hardware such as the **sifive_u** (SiFive HiFive Unleashed), **sifive_e** and **spike** simulator. The emulator supports the standard RV64GC ISA plus a large number of optional extensions (H, V, Zicbom, Zba, Zbb, etc.) that can be enabled with the **-cpu** option.

# CAVEATS

KVM acceleration on RISC-V requires a host CPU with the H extension; otherwise emulation is TCG-only and considerably slower than native. Some guest OSes expect a specific **-bios** firmware; mixing versions of OpenSBI and Linux can result in boot failures. When using **-nographic**, pressing **Ctrl-A X** exits the emulator.

# SEE ALSO

[qemu-system-x86_64](/man/qemu-system-x86_64)(1), [qemu-img](/man/qemu-img)(1), [qemu-nbd](/man/qemu-nbd)(1)
