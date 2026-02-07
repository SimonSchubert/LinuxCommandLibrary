# TAGLINE

Device Tree Compiler

# TLDR

**Compile DTS to DTB**

```dtc -I dts -O dtb -o [output.dtb] [input.dts]```

**Decompile DTB to DTS**

```dtc -I dtb -O dts -o [output.dts] [input.dtb]```

**Check DTS syntax**

```dtc -I dts -O dts [input.dts]```

**Include search path**

```dtc -I dts -O dtb -i [include_path] -o [output.dtb] [input.dts]```

**Generate assembly output**

```dtc -I dts -O asm -o [output.S] [input.dts]```

# SYNOPSIS

**dtc** [_options_] _input_file_

# PARAMETERS

**-I** _format_
> Input format (dts, dtb, fs).

**-O** _format_
> Output format (dts, dtb, asm).

**-o** _file_
> Output file.

**-i** _path_
> Include search path.

**-W** _warning_
> Enable warning.

**-E** _error_
> Enable error.

**-@**
> Generate symbols for overlays.

# DESCRIPTION

**dtc** (Device Tree Compiler) compiles Device Tree Source (DTS) files to Device Tree Blob (DTB) format and performs the reverse operation of decompiling DTB back to DTS. Device trees are data structures that describe hardware components and their relationships, allowing Linux kernels to support various hardware platforms without hardcoded board-specific code.

The compiler is essential for embedded Linux development, particularly for ARM, RISC-V, and PowerPC platforms. DTS files provide a human-readable description of hardware (CPUs, memory, peripherals, interrupts, buses), while DTB is the binary format loaded by bootloaders and passed to the kernel at runtime.

dtc supports device tree overlays, which allow runtime modification of the base device tree. This is particularly useful for add-on hardware like Raspberry Pi HATs or BeagleBone capes, where the overlay describes additional hardware without modifying the base system device tree.

The tool includes validation and warning systems to catch common errors in device tree syntax and structure. It can also generate assembly output for inclusion in firmware builds.

# SEE ALSO

[fdtdump](/man/fdtdump)(1), [fdtget](/man/fdtget)(1)

