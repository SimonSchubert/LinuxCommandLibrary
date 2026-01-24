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

**tcc** (Tiny C Compiler) compiles C extremely fast. It can compile and run C code as if it were a scripting language.

Compilation speed is the primary feature. TCC compiles several times faster than GCC. This enables interactive development.

Run mode compiles to memory and executes immediately. No intermediate files are created. Arguments after -- pass to the program.

The compiler supports most C99 features. Some GCC extensions are implemented for compatibility.

Bounds checking catches buffer overflows at runtime. This helps debug memory errors without external tools.

TCC can compile itself, demonstrating its capability to handle real-world code despite its small size.

# CAVEATS

Optimization is minimal - generated code is slower. Some C features may differ from GCC. Not suitable for production builds needing performance.

# HISTORY

**TCC** was created by **Fabrice Bellard** around **2001**. Bellard is known for QEMU, FFmpeg, and other influential projects. TCC demonstrates that a full C compiler can be very small and fast.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1)
