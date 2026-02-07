# TAGLINE

Python to C/C++ compiler

# TLDR

**Compile a Cython file** to C

```cython [module.pyx]```

**Compile with Python 3** language level

```cython -3 [module.pyx]```

**Generate C++ code** instead of C

```cython --cplus [module.pyx]```

**Compile with annotations** (HTML report)

```cython -a [module.pyx]```

**Specify output filename**

```cython -o [output.c] [module.pyx]```

**Embed the Python interpreter** (create standalone executable)

```cython --embed [module.pyx]```

# SYNOPSIS

**cython** [_options_] _source_file.pyx_

# PARAMETERS

**-o** _FILE_
> Specify output C/C++ file name.

**-3**, **--3**
> Use Python 3 syntax and semantics.

**-2**, **--2**
> Use Python 2 syntax and semantics.

**--cplus**
> Generate C++ code instead of C.

**-a**, **--annotate**
> Generate annotated HTML showing Python/C interaction.

**--embed** [_MAIN_]
> Generate a main() function to embed Python.

**-I** _DIR_, **--include-dir** _DIR_
> Add include directory.

**-w**, **--working** _DIR_
> Set working directory.

**--line-directives**
> Emit source line directives.

**-X** _NAME=VALUE_
> Set compiler directive.

# DESCRIPTION

**Cython** is a programming language and compiler that translates Python-like code to C or C++. It enables writing C extensions for Python with Python syntax, providing significant performance improvements over pure Python.

The compiler takes **.pyx** files (Cython source) and produces C or C++ files that can be compiled into Python extension modules. Cython code can include both Python and C type declarations, enabling fine-grained optimization.

The annotation mode (**-a**) is particularly useful for optimization, generating an HTML report showing which lines generate Python API calls versus pure C code, with color-coding to highlight slow paths.

# CAVEATS

Generated C files must still be compiled with a C compiler. Build systems like setuptools typically handle this. Type annotations affect both performance and behavior. C exceptions handling differs from Python exceptions.

# HISTORY

Cython evolved from **Pyrex**, created by Greg Ewing in **2002**. The Cython fork began in **2007**, adding features like typed memoryviews and parallel support. It's widely used for scientific computing and creating Python bindings for C libraries.

# SEE ALSO

[python](/man/python)(1), [gcc](/man/gcc)(1), [cythonize](/man/cythonize)(1)
