# TAGLINE

compiles LLVM intermediate representation to machine code

# TLDR

**Compile LLVM IR to assembly**

```llc [input.ll]```

**Output to file**

```llc -o [output.s] [input.ll]```

**Compile to object file**

```llc -filetype=obj [input.ll]```

**Target specific architecture**

```llc -march=[x86-64] [input.ll]```

**Optimization level**

```llc -O[2] [input.ll]```

**List targets**

```llc --version```

# SYNOPSIS

**llc** [_options_] _file_

# PARAMETERS

_FILE_
> LLVM bitcode or IR file.

**-o** _FILE_
> Output file name.

**-filetype** _TYPE_
> Output type (asm, obj, null).

**-march** _ARCH_
> Target architecture.

**-O** _LEVEL_
> Optimization level (0-3).

**-mtriple** _TRIPLE_
> Target triple.

**--help**
> Display help information.

# DESCRIPTION

**llc** is the LLVM static compiler that translates LLVM intermediate representation (IR) into native machine code. It accepts input in either LLVM bitcode (.bc) or human-readable LLVM assembly (.ll) format and produces target-specific assembly language or object files. As the backend stage of the LLVM compilation pipeline, llc performs instruction selection, register allocation, and machine-specific optimizations to generate efficient code for the target architecture.

The tool supports a wide range of target architectures including x86, ARM, AArch64, MIPS, RISC-V, and others, selectable via the `-march` and `-mtriple` flags. Optimization levels from `-O0` (no optimization) through `-O3` (aggressive optimization) control how much effort llc spends on code improvement during compilation. Output can be either textual assembly (default) or a relocatable object file when using `-filetype=obj`, making llc useful both for inspecting generated code and for producing linkable artifacts directly.

# CAVEATS

Requires LLVM IR input. Target support varies. Part of LLVM toolchain.

# HISTORY

llc is part of the **LLVM** compiler infrastructure project, providing the backend compilation step.

# SEE ALSO

[clang](/man/clang)(1), [opt](/man/opt)(1), [lli](/man/lli)(1), [llvm-as](/man/llvm-as)(1)

