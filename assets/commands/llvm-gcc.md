# TAGLINE

Obsolete GCC-based C front-end for LLVM, superseded by clang

# TLDR

**Compile C program**

```llvm-gcc -o [program] [source.c]```

**Compile with optimization**

```llvm-gcc -O2 -o [program] [source.c]```

**Generate LLVM bitcode**

```llvm-gcc -emit-llvm -c [source.c] -o [source.bc]```

Generate human-readable **LLVM assembly**

```llvm-gcc -emit-llvm -S [source.c] -o [source.ll]```

Modern equivalent using **clang**

```clang -emit-llvm -c [source.c] -o [source.bc]```

# SYNOPSIS

**llvm-gcc** [_options_] _filename_...

# PARAMETERS

**-o** _file_
> Output file name.

**-O** _level_
> Optimization level (0-3, s).

**-emit-llvm**
> Emit LLVM bitcode (with -c) or LLVM assembly (with -S) instead of native code.

**-c**
> Compile only, no linking.

**-S**
> Generate assembly output.

**-I** _directory_
> Add a directory to the header search path.

**-L** _directory_
> Add a directory to the library search path.

**-l**_name_
> Link with library _name_.

**-g**
> Include debug information.

**--help**
> Print a summary of command line options.

# DESCRIPTION

**llvm-gcc** was the LLVM C front-end: a modified version of GCC 4.2 whose parser fed LLVM's optimizer and code generator. By default it produced native object files like GCC; with **-emit-llvm** it wrote LLVM bitcode or LLVM assembly for use with tools such as **opt**, **llc** and **lli**. Since it was derived from GCC it accepted most GCC options and extensions, and also compiled Objective-C.

# CAVEATS

Obsolete and unmaintained. It is not part of any current LLVM release or distribution, and on macOS any remaining **llvm-gcc** name is just an alias for clang. Use **clang** instead.

# HISTORY

llvm-gcc was the original front-end of the LLVM project, based on GCC 4.0 and later GCC 4.2. Apple shipped **llvm-gcc-4.2** as a default compiler in Xcode 4. It was deprecated after **LLVM 2.9** (2011), replaced by **clang** and the short-lived **DragonEgg** GCC plugin, and removed from Xcode in version 5 (2013).

# SEE ALSO

[clang](/man/clang)(1), [gcc](/man/gcc)(1), [llvm-g++](/man/llvm-g++)(1), [opt](/man/opt)(1), [llc](/man/llc)(1), [lli](/man/lli)(1)

# RESOURCES

```[Homepage](https://clang.llvm.org/)```

```[Documentation](https://releases.llvm.org/2.9/docs/CommandGuide/html/llvmgcc.html)```

<!-- verified: 2026-09-29 -->
