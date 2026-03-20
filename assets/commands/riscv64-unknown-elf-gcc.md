# TAGLINE

Cross-compile C code for RISC-V targets

# TLDR

**Compile for RISC-V**

```riscv64-unknown-elf-gcc -o [output] [source.c]```

**Compile with specific architecture**

```riscv64-unknown-elf-gcc -march=rv64imac -o [output] [source.c]```

**Compile for bare metal**

```riscv64-unknown-elf-gcc -nostdlib -o [output] [source.c]```

**Produce assembly**

```riscv64-unknown-elf-gcc -S [source.c]```

# SYNOPSIS

**riscv64-unknown-elf-gcc** [_options_] _files_...

# PARAMETERS

**-march=**_arch_
> Target architecture (e.g. rv64imac, rv64gc, rv32imac).

**-mabi=**_abi_
> Integer and floating-point calling convention (e.g. lp64, lp64d, lp64f, ilp32).

**-nostdlib**
> Do not link standard library or startup files.

**-T** _script_
> Use the specified linker script.

**-mcmodel=**_model_
> Code model: medlow (default) or medany.

**-msave-restore**
> Use smaller but slower prologue/epilogue routines to reduce code size.

**-msmall-data-limit=**_n_
> Put global and static data smaller than _n_ bytes in a special section.

**--specs=**_file_
> Use the specified specs file (e.g. nano.specs for newlib-nano).

**-O**_level_
> Optimization level (0, 1, 2, 3, s, g).

# DESCRIPTION

**riscv64-unknown-elf-gcc** is the GCC cross-compiler for RISC-V 64-bit bare-metal targets. It compiles C/C++ code for RISC-V processors without an operating system.

# EXAMPLES

```bash
# Basic compilation
riscv64-unknown-elf-gcc -o hello hello.c

# With specific ISA extensions
riscv64-unknown-elf-gcc -march=rv64gc -mabi=lp64d -o prog prog.c

# Bare metal with linker script
riscv64-unknown-elf-gcc -nostdlib -T link.ld -o firmware firmware.c

# Generate object file
riscv64-unknown-elf-gcc -c -o main.o main.c

# With newlib
riscv64-unknown-elf-gcc --specs=nano.specs -o app app.c
```

# ARCHITECTURES

```
rv64imac   - Integer, Multiply, Atomic, Compressed
rv64gc     - General purpose (IMAFDC) - equivalent to rv64imafdC
rv64imafdc - Same as rv64gc (explicit form)
rv32imac   - 32-bit: Integer, Multiply, Atomic, Compressed
rv32gc     - 32-bit general purpose
```

# CAVEATS

Cross-compiler for embedded. Requires RISC-V toolchain installation. Different from riscv64-linux-gnu-gcc.

# HISTORY

RISC-V GCC toolchain was developed as part of the **RISC-V** open ISA project from UC Berkeley.

# SEE ALSO

[gcc](/man/gcc)(1), [objdump](/man/objdump)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1)
