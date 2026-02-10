# TAGLINE

g++ frontend for the LLVM compiler infrastructure

# TLDR

**Compile C++ program**

```llvm-g++ -o [program] [source.cpp]```

**Compile with optimization**

```llvm-g++ -O2 -o [program] [source.cpp]```

**Generate LLVM bitcode**

```llvm-g++ -emit-llvm -c [source.cpp]```

# SYNOPSIS

**llvm-g++** [_options_] _source_files_...

# PARAMETERS

**-o** _file_
> Output file name.

**-O** _level_
> Optimization level (0-3).

**-emit-llvm**
> Generate LLVM bitcode.

**-c**
> Compile only, no linking.

**-std=** _standard_
> C++ standard version.

**-g**
> Include debug information.

# DESCRIPTION

**llvm-g++** is a G++ frontend for the LLVM compiler infrastructure. Provides GCC-compatible C++ interface that generates LLVM intermediate representation. Deprecated in favor of clang++.

# CAVEATS

This tool is deprecated. Use **clang++** instead for LLVM-based C++ compilation.

# SEE ALSO

[clang++](/man/clang++)(1), [g++](/man/g++)(1), [llvm-gcc](/man/llvm-gcc)(1)

