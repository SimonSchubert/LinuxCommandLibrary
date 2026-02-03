# TLDR

**Compile a C++ source file**

```clang++ [source.cpp] -o [output]```

**Compile with C++17 standard**

```clang++ -std=c++17 [source.cpp] -o [output]```

**Compile with optimizations**

```clang++ -O2 [source.cpp] -o [output]```

**Compile with debug symbols**

```clang++ -g [source.cpp] -o [output]```

**Compile with all warnings**

```clang++ -Wall -Wextra [source.cpp] -o [output]```

**Link with a library**

```clang++ [source.cpp] -l[library] -o [output]```

**Generate object file only**

```clang++ -c [source.cpp] -o [source.o]```

# SYNOPSIS

**clang++** [_options_] _files..._

# PARAMETERS

**-o** _file_
> Output file name.

**-c**
> Compile only, don't link.

**-std=**_standard_
> Set C++ standard (c++11, c++14, c++17, c++20, c++23).

**-O**_level_
> Optimization level (0, 1, 2, 3, s, z).

**-g**
> Generate debug information.

**-Wall**
> Enable most warnings.

**-Wextra**
> Enable extra warnings.

**-I** _path_
> Add include directory.

**-L** _path_
> Add library search path.

**-l** _library_
> Link with library.

# DESCRIPTION

**clang++** is the Clang C++ compiler frontend, part of the LLVM project. It compiles C++ source code to executable binaries or object files. Clang provides fast compilation, expressive diagnostics, and GCC compatibility.

It supports modern C++ standards and provides advanced static analysis and tooling integration.

# CAVEATS

Some GCC-specific extensions may not be supported. Use **-stdlib=libc++** for LLVM's libc++ or **-stdlib=libstdc++** for GNU's standard library.

# SEE ALSO

[clang](/man/clang)(1), [g++](/man/g++)(1), [clang-format](/man/clang-format)(1)
