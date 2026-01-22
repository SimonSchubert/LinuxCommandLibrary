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

**gdc** is the GNU D Compiler, a D language frontend for GCC. It compiles D source code to native executables using the GCC backend and optimization infrastructure.

The compiler supports D2 language features and integrates with GCC's toolchain. It provides familiar options for GCC users and benefits from GCC's mature optimization passes.

gdc enables D programming with GCC's platform support and performance.

# CAVEATS

May lag behind reference DMD compiler. Some D features may differ. GCC version dependencies.

# HISTORY

gdc was developed to bring the D programming language to GCC, providing an alternative to the reference DMD compiler with broader platform support.

# SEE ALSO

[gcc](/man/gcc)(1), [dmd](/man/dmd)(1), [ldc2](/man/ldc2)(1)
