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

**llc** compiles LLVM intermediate representation to machine code. It generates assembly or object files.

The tool is the LLVM static compiler. It's part of the compilation pipeline after optimization.

llc compiles LLVM IR to native code.

# CAVEATS

Requires LLVM IR input. Target support varies. Part of LLVM toolchain.

# HISTORY

llc is part of the **LLVM** compiler infrastructure project, providing the backend compilation step.

# SEE ALSO

[clang](/man/clang)(1), [opt](/man/opt)(1), [lli](/man/lli)(1), [llvm-as](/man/llvm-as)(1)

