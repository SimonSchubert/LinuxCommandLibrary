# TLDR

**Compile Fortran file**

```gfortran [source.f90] -o [output]```

**Compile with optimization**

```gfortran -O3 [source.f90] -o [output]```

**Enable warnings**

```gfortran -Wall [source.f90] -o [output]```

**Debug build**

```gfortran -g [source.f90] -o [output]```

**Link math library**

```gfortran [source.f90] -o [output] -lm```

# SYNOPSIS

**gfortran** [_options_] _files_...

# PARAMETERS

_FILES_
> Fortran source files (.f, .f90, .f95).

**-o** _FILE_
> Output filename.

**-c**
> Compile only, no linking.

**-g**
> Generate debug info.

**-O** _LEVEL_
> Optimization level (0-3).

**-Wall**
> Enable warnings.

**-l** _LIBRARY_
> Link library.

**--help**
> Display help information.

# DESCRIPTION

**gfortran** is the GNU Fortran compiler, part of GCC. It compiles Fortran 77, 90, 95, 2003, and 2008 standards to native executables.

The compiler provides extensive optimization, debugging support, and interoperability with C code. It benefits from GCC's mature infrastructure.

gfortran is the standard open source Fortran compiler for scientific computing.

# CAVEATS

Standard compliance varies by feature. Array bounds checking optional. Legacy code may need adaptation.

# HISTORY

gfortran replaced g77 as GCC's Fortran compiler starting with GCC 4.0. It supports modern Fortran standards while maintaining compatibility with older code.

# SEE ALSO

[gcc](/man/gcc)(1), [f2py](/man/f2py)(1), [ifort](/man/ifort)(1)
