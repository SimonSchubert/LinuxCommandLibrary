# TAGLINE

Generate language bindings for C/C++ code

# TLDR

**Generate Python wrapper**

```swig -python [interface.i]```

**Generate with C++**

```swig -c++ -python [interface.i]```

**Specify output file**

```swig -python -o [wrap.c] [interface.i]```

**Include directory**

```swig -I[/usr/include] -python [interface.i]```

**Generate Java wrapper**

```swig -java [interface.i]```

# SYNOPSIS

**swig** [_-python|-java|-ruby_] [_-c++_] [_-o file_] [_options_] _interface.i_

# PARAMETERS

**-python**
> Python target.

**-java**
> Java target.

**-ruby**
> Ruby target.

**-c++**
> C++ mode.

**-o** _FILE_
> Output file.

**-I** _DIR_
> Include path.

**-module** _NAME_
> Module name.

# DESCRIPTION

**swig** (Simplified Wrapper and Interface Generator) generates wrapper code that allows C and C++ libraries to be called from other programming languages. It reads interface definition files (.i) that describe which functions, classes, and types to expose, and produces the glue code needed for the target language.

Supported target languages include Python, Java, Ruby, Perl, PHP, Lua, Go, JavaScript, C#, and many others. SWIG handles automatic type conversion and data marshaling between C/C++ and the target language, including complex types, pointers, arrays, and object-oriented constructs like inheritance and templates.

Interface files use a syntax similar to C/C++ header files with additional SWIG directives for controlling the wrapping process. SWIG can also parse actual C/C++ header files directly for simpler cases.

# CAVEATS

Learning curve for interface files. C/C++ knowledge needed. Build system integration.

# HISTORY

**SWIG** (Simplified Wrapper and Interface Generator) was created by **David Beazley** for connecting C/C++ with scripting languages.

# SEE ALSO

[cython](/man/cython)(1), [pybind11](/man/pybind11)(1), [ctypes](/man/ctypes)(1)
