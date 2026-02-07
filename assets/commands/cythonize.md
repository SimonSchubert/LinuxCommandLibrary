# TAGLINE

Cython compilation wrapper for building extensions

# TLDR

**Compile Cython file**

```cythonize -i [module.pyx]```

**Compile with build directory**

```cythonize -b [module.pyx]```

**Compile multiple files**

```cythonize -i [*.pyx]```

**Compile with parallelism**

```cythonize -j [4] -i [module.pyx]```

**Force recompilation**

```cythonize -f -i [module.pyx]```

**Annotate with HTML**

```cythonize -a [module.pyx]```

# SYNOPSIS

**cythonize** [_options_] _files_...

# DESCRIPTION

**cythonize** compiles Cython source files (.pyx) into C extension modules. Cython is a superset of Python that enables C-level performance through static typing and direct C API access.

The tool handles the full compilation pipeline: generating C code, compiling with a C compiler, and building importable Python modules.

# PARAMETERS

**-i**, **--inplace**
> Build extensions in place.

**-b**, **--build**
> Build using temporary build directory.

**-j** _n_
> Parallel compilation jobs.

**-f**, **--force**
> Force recompilation.

**-a**, **--annotate**
> Generate HTML annotation.

**-3**
> Use Python 3 syntax.

**-X** _directive_
> Set Cython directive.

**-s** _option_
> Set compiler option.

**--cplus**
> Generate C++ code.

# CAVEATS

Requires C compiler installed. Platform-specific extensions not portable. Annotation helps identify Python-heavy code. Some Python features slower in Cython.

# HISTORY

**Cython** evolved from **Pyrex**, created by **Greg Ewing** in **2002**. The Cython fork by **Robert Bradshaw** and **Stefan Behnel** added Python compatibility and features. The cythonize command provides a convenient wrapper over the compilation process.

# SEE ALSO

[python](/man/python)(1), [gcc](/man/gcc)(1), [pip](/man/pip)(1), [numba](/man/numba)(1)
