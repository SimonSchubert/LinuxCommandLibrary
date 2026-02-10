# TAGLINE

GCC frontend for the LLVM compiler infrastructure

# TLDR

**Compile C program**

```llvm-gcc -o [program] [source.c]```

**Compile with optimization**

```llvm-gcc -O2 -o [program] [source.c]```

**Generate LLVM bitcode**

```llvm-gcc -emit-llvm -c [source.c]```

# SYNOPSIS

**llvm-gcc** [_options_] _source_files_...

# PARAMETERS

**-o** _file_
> Output file name.

**-O** _level_
> Optimization level (0-3).

**-emit-llvm**
> Generate LLVM bitcode.

**-c**
> Compile only, no linking.

**-S**
> Generate assembly output.

**-g**
> Include debug information.

# DESCRIPTION

**llvm-gcc** is a GCC frontend for the LLVM compiler infrastructure. Provides GCC-compatible interface that generates LLVM intermediate representation. Deprecated in favor of clang.

# CAVEATS

This tool is deprecated. Use **clang** instead for LLVM-based compilation.

# SEE ALSO

[clang](/man/clang)(1), [gcc](/man/gcc)(1), [llvm-g++](/man/llvm-g++)(1)

