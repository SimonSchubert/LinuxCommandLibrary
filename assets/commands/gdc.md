# TAGLINE

GNU D Compiler for the D programming language

# TLDR

**Compile D file**

```gdc [source.d] -o [output]```

**Compile with optimization**

```gdc -O2 [source.d] -o [output]```

**Enable debug info**

```gdc -g [source.d] -o [output]```

**Compile only**

```gdc -c [source.d]```

**Link with library**

```gdc [source.d] -l[library] -o [output]```

# SYNOPSIS

**gdc** [_options_] _files_...

# PARAMETERS

_FILES_
> D source files to compile.

**-o** _FILE_
> Output filename.

**-c**
> Compile only, no linking.

**-g**
> Generate debug information.

**-O** _LEVEL_
> Optimization level (0-3).

**-I** _PATH_
> Import path.

**-L** _FLAG_
> Linker flag.

**--help**
> Display help information.

# DESCRIPTION

**gdc** is the GNU D Compiler, providing a D programming language frontend for the GCC (GNU Compiler Collection) backend. It compiles D source code to native machine code using GCC's proven optimization infrastructure and code generation capabilities.

The compiler supports the D2 language specification, including modern features like compile-time function execution (CTFE), mixins, templates, and garbage collection. As a GCC frontend, gdc integrates seamlessly with the GNU toolchain, accepting familiar GCC flags for optimization levels, debugging, linking, and cross-compilation.

gdc benefits from GCC's extensive platform support, making D code portable across architectures that GCC supports. It leverages GCC's mature optimization passes, often producing highly efficient native code. The compiler can interoperate with C and C++ code through D's foreign function interface capabilities.

While the reference D compiler (DMD) typically implements new language features first, gdc provides broader platform support and benefits from GCC's optimization technology. It's a solid choice for D development when maximum portability, GCC ecosystem integration, or specific optimization characteristics are priorities.

# CAVEATS

May lag behind reference DMD compiler. Some D features may differ. GCC version dependencies.

# HISTORY

gdc was developed to bring the D programming language to GCC, providing an alternative to the reference DMD compiler with broader platform support.

# SEE ALSO

[gcc](/man/gcc)(1), [dmd](/man/dmd)(1), [ldc2](/man/ldc2)(1)
