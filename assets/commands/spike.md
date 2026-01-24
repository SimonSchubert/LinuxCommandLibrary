# TLDR

**Run simulator**

```spike [program.elf]```

**With ISA extension**

```spike --isa=[rv64gc] [program.elf]```

**Interactive debug**

```spike -d [program.elf]```

**Multiple cores**

```spike -p[4] [program.elf]```

**With memory size**

```spike -m[0x80000000:0x10000000] [program.elf]```

# SYNOPSIS

**spike** [_--isa spec_] [_-d_] [_-p n_] [_options_] _program_

# PARAMETERS

**--isa** _SPEC_
> ISA specification.

**-d**
> Debug mode.

**-p** _N_
> Number of processors.

**-m** _RANGE_
> Memory configuration.

**--pc** _ADDR_
> Start address.

**-l**
> Log instructions.

# DESCRIPTION

**spike** simulates RISC-V. It's the reference emulator.

RISC-V ISA simulator. Instruction-accurate.

Multiple extensions. RV32/64, M, A, F, D, C.

Debug mode included. Step through code.

Multi-core support. SMP simulation.

# CAVEATS

Instruction-level only. No cycle accuracy. Development tool.

# HISTORY

**spike** is the official RISC-V ISA simulator, developed as the reference implementation for the RISC-V architecture.

# SEE ALSO

[qemu](/man/qemu)(1), [riscv64-unknown-elf-gcc](/man/riscv64-unknown-elf-gcc)(1)
