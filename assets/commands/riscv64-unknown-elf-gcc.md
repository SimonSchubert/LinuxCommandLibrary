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
> Target architecture (rv64imac, rv64gc).

**-mabi=**_abi_
> ABI (lp64, lp64d).

**-nostdlib**
> No standard library.

**-T** _script_
> Linker script.

**-mcmodel=**_model_
> Code model.

**-O**_level_
> Optimization level.

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
rv64imac  - Integer, Multiply, Atomic, Compressed
rv64gc    - General purpose (IMAFD + C)
rv32imac  - 32-bit version
```

# CAVEATS

Cross-compiler for embedded. Requires RISC-V toolchain installation. Different from riscv64-linux-gnu-gcc.

# HISTORY

RISC-V GCC toolchain was developed as part of the **RISC-V** open ISA project from UC Berkeley.

# SEE ALSO

[gcc](/man/gcc)(1), [riscv64-unknown-elf-objdump](/man/riscv64-unknown-elf-objdump)(1), [qemu-system-riscv64](/man/qemu-system-riscv64)(1)
