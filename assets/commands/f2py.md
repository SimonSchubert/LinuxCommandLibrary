# TAGLINE

Fortran to Python interface generator

# TLDR

**Generate Python wrapper** for Fortran

```f2py -c [module.f90] -m [module_name]```

**Create signature file**

```f2py [module.f90] -h [module.pyf]```

**Build with specific** compiler

```f2py -c --fcompiler=[gfortran] [module.f90] -m [module_name]```

**Link external libraries**

```f2py -c [module.f90] -m [module_name] -l[blas]```

**Show available compilers**

```f2py --help-fcompiler```

# SYNOPSIS

**f2py** [_options_] _fortran-files_ [_options_]

# PARAMETERS

_FORTRAN-FILES_
> Fortran source files (.f, .f90, .f95).

**-c**
> Compile and build extension module.

**-m** _NAME_
> Set module name.

**-h** _FILE_
> Generate signature file.

**--fcompiler** _NAME_
> Specify Fortran compiler.

**-l** _LIBRARY_
> Link with library.

**-L** _PATH_
> Library search path.

**-I** _PATH_
> Include search path.

**--help-fcompiler**
> List available Fortran compilers.

**--help**
> Display help information.

# DESCRIPTION

**f2py** (Fortran to Python) is a NumPy tool that creates Python bindings for Fortran code. It generates wrapper modules that allow calling Fortran subroutines and functions directly from Python.

The tool automatically handles type conversion between Python/NumPy arrays and Fortran arrays. It parses Fortran source code or signature files to determine interfaces, then generates C wrapper code compiled into a Python extension module.

f2py enables using high-performance Fortran libraries in Python scientific computing workflows without rewriting existing code.

# CAVEATS

Requires Fortran compiler and NumPy installation. Complex Fortran constructs may need signature file tweaks. Array ordering differs between Fortran (column-major) and C (row-major).

# HISTORY

f2py was created by **Pearu Peterson** in the late 1990s and became part of NumPy. It bridges Python's scientific computing ecosystem with decades of Fortran numerical libraries, enabling their continued use in modern Python workflows.

# SEE ALSO

[python](/man/python)(1), [gfortran](/man/gfortran)(1), [numpy](/man/numpy)(1)
