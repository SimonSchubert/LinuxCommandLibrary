# TAGLINE

Tiny C Compiler

# TLDR

**Compile and run**

```tcc -run [program.c]```

**Compile to executable**

```tcc -o [program] [program.c]```

**Compile to object file**

```tcc -c [program.c]```

**Run C code from stdin**

```echo 'int main(){return 0;}' | tcc -run -```

**Compile with library**

```tcc -o [program] [program.c] -l[m]```

**Run with arguments**

```tcc -run [program.c] -- [arg1] [arg2]```

**Compile as shared library**

```tcc -shared -o [lib.so] [lib.c]```

# SYNOPSIS

**tcc** [_-run_] [_-o output_] [_-c_] [_-l lib_] [_options_] _files_

# PARAMETERS

**-run**
> Compile and run immediately.

**-o** _FILE_
> Output file.

**-c**
> Compile to object file only.

**-shared**
> Create shared library.

**-l** _LIB_
> Link library.

**-L** _DIR_
> Library search path.

**-I** _DIR_
> Include search path.

**-D** _NAME_
> Define preprocessor macro.

**-g**
> Generate debug info.

**-b**
> Enable bounds checking.

**-Wall**
> Enable warnings.

**-v**
> Verbose mode.

# DESCRIPTION

**tcc** (Tiny C Compiler) is an extremely fast C compiler that can also serve as a C script interpreter. Its primary feature is compilation speed — TCC compiles several times faster than GCC, making it suitable for rapid development iterations and using C as a scripting language.

The **-run** flag compiles source code directly into memory and executes it immediately without creating intermediate object files or executables. Arguments after **--** are passed to the compiled program. This enables workflows where C files are treated like scripts, including use in shebangs.

TCC supports most of the C99 standard along with common GCC extensions for compatibility. It can generate executables, object files, and shared libraries. A built-in bounds checker (**-b**) catches buffer overflows and out-of-bounds access at runtime without requiring external tools like Valgrind. Despite its small size, TCC is capable enough to compile itself.

# CAVEATS

Optimization is minimal - generated code is slower. Some C features may differ from GCC. Not suitable for production builds needing performance.

# HISTORY

**TCC** was created by **Fabrice Bellard** around **2001**. Bellard is known for QEMU, FFmpeg, and other influential projects. TCC demonstrates that a full C compiler can be very small and fast.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1)
