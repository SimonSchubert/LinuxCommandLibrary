# TLDR

**Compile** C++ program

```c++ [program.cpp] -o [program]```

**Compile** with optimization

```c++ -O2 [program.cpp] -o [program]```

**Compile** with debugging

```c++ -g [program.cpp] -o [program]```

**Specify** C++ standard

```c++ -std=c++17 [program.cpp] -o [program]```

**Link** library

```c++ [program.cpp] -o [program] -l[library]```

# SYNOPSIS

**c++** [_options_] _file_...

# DESCRIPTION

**c++** is typically a symlink to the system's C++ compiler (g++ or clang++). It compiles C++ source code into executable programs or object files, handling preprocessing, compilation, and linking.

The command provides access to the C++ compiler with standard naming convention.

# PARAMETERS

**-o** _file_
> Output file name

**-c**
> Compile without linking

**-g**
> Include debug information

**-O**[_level_]
> Optimization level (0, 1, 2, 3, s)

**-std=**_standard_
> C++ standard (c++11, c++14, c++17, c++20, c++23)

**-Wall**
> Enable all warnings

**-Werror**
> Treat warnings as errors

**-I** _dir_
> Add include directory

**-L** _dir_
> Add library directory

**-l** _lib_
> Link library

# C++ STANDARDS

- **c++98** / **c++03** - Classic C++
- **c++11** - Modern C++ (auto, lambdas, etc.)
- **c++14** - Minor improvements
- **c++17** - Major update (filesystem, etc.)
- **c++20** - Concepts, ranges, modules
- **c++23** - Latest standard

# WORKFLOW

```bash
# Simple compile
c++ hello.cpp -o hello

# Modern C++ with warnings
c++ -std=c++20 -Wall -Wextra program.cpp -o program

# Optimized release build
c++ -std=c++17 -O3 -DNDEBUG program.cpp -o program

# Debug build
c++ -std=c++17 -g -O0 program.cpp -o program

# Link with libraries
c++ program.cpp -o program -lpthread -lm

# Multiple source files
c++ main.cpp utils.cpp -o program
```

# CAVEATS

Actual compiler depends on system (g++, clang++, etc.). Behavior may vary between compilers. C++ compilation slower than C. Template errors can be cryptic. ABI compatibility between compiler versions.

# HISTORY

The **c++** command name has been a standard convention since C++ compilers became common in the **1980s**, typically symlinking to the system's C++ compiler.

# SEE ALSO

[g++](/man/g++)(1), [clang++](/man/clang++)(1), [gcc](/man/gcc)(1)
