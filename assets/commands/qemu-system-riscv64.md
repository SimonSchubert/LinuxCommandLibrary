# TAGLINE

Emulate 64-bit RISC-V systems with QEMU

# TLDR

**Boot RISC-V system**

```qemu-system-riscv64 -machine virt -kernel [kernel] -append "root=/dev/vda"```

**Boot with OpenSBI**

```qemu-system-riscv64 -machine virt -bios [opensbi.bin] -kernel [kernel]```

**Boot with disk**

```qemu-system-riscv64 -machine virt -m [2G] -drive file=[disk.img],format=raw```

# SYNOPSIS

**qemu-system-riscv64** [_options_]

# PARAMETERS

**-machine** _type_
> Machine type (virt, sifive_u).

**-kernel** _file_
> Kernel image.

**-bios** _file_
> BIOS/firmware image.

**-m** _size_
> RAM size.

**-append** _args_
> Kernel command line.

**-drive** _options_
> Drive configuration.

# DESCRIPTION

**qemu-system-riscv64** emulates 64-bit RISC-V systems. Supports virt and SiFive machine types. Used for RISC-V development and testing without physical hardware.

# SEE ALSO

[qemu-system-x86_64](/man/qemu-system-x86_64)(1)

