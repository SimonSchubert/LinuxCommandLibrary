# TLDR

**Compile source** to executable

```gcc [source.c] -o [output]```

**Compile with warnings enabled**

```gcc -Wall -Wextra [source.c] -o [output]```

**Compile with debugging symbols**

```gcc -g [source.c] -o [output]```

**Compile with optimization**

```gcc -O2 [source.c] -o [output]```

**Compile multiple files**

```gcc [file1.c] [file2.c] -o [output]```

**Link with a library**

```gcc [source.c] -l[pthread] -o [output]```

**Compile to object file** only

```gcc -c [source.c]```

**Specify C standard**

```gcc -std=c11 [source.c] -o [output]```

**Include header directory**

```gcc -I[/path/to/headers] [source.c] -o [output]```

# SYNOPSIS

**gcc** [_options_] _file_...

# DESCRIPTION

**GCC** (GNU Compiler Collection) is a compiler system supporting C, C++, Objective-C, Fortran, Ada, Go, and other languages. For C code, gcc is the primary front-end that invokes the preprocessor, compiler, assembler, and linker.

The compilation process transforms source code through preprocessing (macro expansion, includes), compilation (to assembly), assembly (to object code), and linking (combining objects and libraries into an executable).

GCC is the standard compiler on most Unix-like systems and supports extensive optimization levels, debugging features, and code generation options for various architectures.

# PARAMETERS

**-c**
> Compile to object file, don't link.

**-o** _file_
> Output file name.

**-g**
> Include debugging information.

**-Wall**
> Enable common warnings.

**-Wextra**
> Enable additional warnings.

**-Werror**
> Treat warnings as errors.

**-O** _level_
> Optimization level (0, 1, 2, 3, s, fast).

**-I** _dir_
> Add include directory.

**-L** _dir_
> Add library search directory.

**-l** _lib_
> Link with library.

**-D** _name_[=_value_]
> Define preprocessor macro.

**-std=** _standard_
> C language standard (c89, c99, c11, c17, c23).

**-E**
> Preprocess only, don't compile.

**-S**
> Compile to assembly, don't assemble.

**-v**
> Verbose output.

**-static**
> Prevent linking with shared libraries.

# CAVEATS

Default behavior varies by system and gcc version. Order of libraries matters for linking. Some warnings are not enabled by -Wall. Debugging and optimization can conflict. Different standards may change behavior.

# HISTORY

**GCC** was started by **Richard Stallman** in **1987** as part of the GNU Project. Originally named GNU C Compiler, it was later renamed GNU Compiler Collection as support for other languages was added. GCC has become the most widely used compiler suite for open-source software and is the default compiler on most Linux distributions and BSD systems.

# SEE ALSO

[g++](/man/g++)(1), [clang](/man/clang)(1), [make](/man/make)(1), [gdb](/man/gdb)(1)
