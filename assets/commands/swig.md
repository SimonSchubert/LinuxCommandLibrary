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

**swig** wraps C/C++ for other languages. It generates bindings.

Multiple target languages. Python, Java, Ruby, etc.

Interface file syntax. Describe what to wrap.

Automatic type conversion. Data marshaling.

Supports classes. Object-oriented wrapping.

# CAVEATS

Learning curve for interface files. C/C++ knowledge needed. Build system integration.

# HISTORY

**SWIG** (Simplified Wrapper and Interface Generator) was created by **David Beazley** for connecting C/C++ with scripting languages.

# SEE ALSO

[cython](/man/cython)(1), [pybind11](/man/pybind11)(1), [ctypes](/man/ctypes)(1)
