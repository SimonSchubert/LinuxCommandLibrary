# TAGLINE

Obsolete G++-based C++ front-end for LLVM, superseded by clang++

# TLDR

**Compile C++ program**

```llvm-g++ -o [program] [source.cpp]```

**Compile with optimization**

```llvm-g++ -O2 -o [program] [source.cpp]```

**Generate LLVM bitcode**

```llvm-g++ -emit-llvm -c [source.cpp] -o [source.bc]```

Generate human-readable **LLVM assembly**

```llvm-g++ -emit-llvm -S [source.cpp] -o [source.ll]```

Modern equivalent using **clang++**

```clang++ -std=c++20 -O2 -o [program] [source.cpp]```

# SYNOPSIS

**llvm-g++** [_options_] _filename_...

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

**-std=** _standard_
> C++ standard version (at most c++98 / gnu++98 and partial c++0x, as in GCC 4.2).

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

**llvm-g++** was the LLVM C++ front-end: a modified version of g++ from GCC 4.2 that compiled C++ and Objective-C++ into native code, LLVM bitcode or LLVM assembly. By default it produced native objects like g++; with **-emit-llvm** it wrote LLVM IR instead. It accepted most g++ options and extensions.

# CAVEATS

Obsolete and unmaintained, with no support for modern C++ standards. It is not part of any current LLVM release, and on macOS any remaining **llvm-g++** name is just an alias for clang++. Use **clang++** instead.

# HISTORY

llvm-g++ shipped alongside **llvm-gcc** as part of the original LLVM GCC-based front-end. Apple bundled it in Xcode 4. It was deprecated after **LLVM 2.9** (2011) in favor of **clang++** and removed from Xcode in version 5 (2013).

# SEE ALSO

[clang++](/man/clang++)(1), [g++](/man/g++)(1), [llvm-gcc](/man/llvm-gcc)(1), [opt](/man/opt)(1), [llc](/man/llc)(1)

# RESOURCES

```[Homepage](https://clang.llvm.org/)```

```[Documentation](https://releases.llvm.org/2.9/docs/CommandGuide/html/llvmgxx.html)```

<!-- verified: 2026-09-29 -->
