# TLDR

**Compile C++ file**

```g++ [source.cpp] -o [output]```

**Compile with warnings**

```g++ -Wall -Wextra [source.cpp] -o [output]```

**Compile with optimization**

```g++ -O2 [source.cpp] -o [output]```

**Debug build**

```g++ -g [source.cpp] -o [output]```

**Compile with C++** standard

```g++ -std=c++17 [source.cpp] -o [output]```

# SYNOPSIS

**g++** [_options_] _files_...

# PARAMETERS

_FILES_
> Source files to compile.

**-o** _FILE_
> Output filename.

**-c**
> Compile only, no linking.

**-Wall**
> Enable all warnings.

**-g**
> Generate debug info.

**-O** _LEVEL_
> Optimization level (0-3, s, fast).

**-std** _STANDARD_
> C++ standard (c++11, c++14, c++17, c++20).

**-I** _PATH_
> Include path.

**-L** _PATH_
> Library path.

**-l** _LIBRARY_
> Link library.

**--help**
> Display help information.

# DESCRIPTION

**g++** is the GNU C++ compiler, part of the GNU Compiler Collection. It compiles C++ source code to executables or object files, supporting modern C++ standards.

The compiler handles preprocessing, compilation, assembly, and linking. It provides extensive optimization options and warning controls for quality code production.

g++ is the standard C++ compiler on Linux systems, supporting the full range of C++ language features.

# CAVEATS

Large codebases compile slowly. Template errors can be cryptic. Different standards have different feature sets.

# HISTORY

g++ is part of **GCC** (GNU Compiler Collection), originally written by Richard Stallman. It evolved from the original GNU C Compiler to support multiple languages including C++.

# SEE ALSO

[gcc](/man/gcc)(1), [clang++](/man/clang++)(1), [make](/man/make)(1)
