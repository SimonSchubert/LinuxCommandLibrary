# TAGLINE

RISC-V reference ISA simulator

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

**spike** is the official RISC-V ISA (Instruction Set Architecture) reference simulator. It provides instruction-accurate emulation of RISC-V processors, supporting both RV32 and RV64 base integer instruction sets along with standard extensions including M (multiply/divide), A (atomic), F/D (floating-point), and C (compressed).

The simulator includes an interactive debug mode for stepping through instructions, setting breakpoints, and inspecting registers and memory. It supports multi-core SMP simulation with configurable processor counts and memory layouts, making it suitable for testing both bare-metal firmware and operating system kernels.

As the reference implementation maintained by the RISC-V project, spike serves as the golden model for verifying hardware implementations and compiler output against the specification.

# CAVEATS

Instruction-level only. No cycle accuracy. Development tool.

# HISTORY

**spike** is the official RISC-V ISA simulator, developed as the reference implementation for the RISC-V architecture.

# SEE ALSO

[qemu](/man/qemu)(1), [riscv64-unknown-elf-gcc](/man/riscv64-unknown-elf-gcc)(1)
