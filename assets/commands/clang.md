# TLDR

**Compile** C program

```clang [program.c] -o [program]```

**Compile** with optimization

```clang -O3 [program.c] -o [program]```

**Compile** with debug info

```clang -g [program.c] -o [program]```

**Enable** all warnings

```clang -Wall -Wextra [program.c] -o [program]```

**Compile** C++ program

```clang++ [program.cpp] -o [program]```

# SYNOPSIS

**clang** [_options_] _file_...

# DESCRIPTION

**clang** is a C, C++, and Objective-C compiler based on LLVM. It provides fast compilation, excellent diagnostics with clear error messages, and is designed as a drop-in replacement for GCC.

The compiler is known for its helpful error messages and modern architecture.

# PARAMETERS

**-o** _file_
> Output file name

**-c**
> Compile without linking

**-g**
> Generate debug information

**-O**[_level_]
> Optimization (0, 1, 2, 3, fast, s, z)

**-std=**_standard_
> Language standard (c11, c17, c++17, c++20)

**-Wall**
> Enable common warnings

**-Wextra**
> Enable extra warnings

**-Werror**
> Treat warnings as errors

**-I** _dir_
> Add include directory

**-L** _dir_
> Add library directory

**-l** _lib_
> Link library

**-fsanitize=**_type_
> Enable sanitizer (address, thread, memory, undefined)

# OPTIMIZATION LEVELS

- **-O0** - No optimization (default)
- **-O1** - Basic optimization
- **-O2** - Moderate optimization (recommended)
- **-O3** - Aggressive optimization
- **-Os** - Optimize for size
- **-Ofast** - Maximum speed (may break standards)

# WORKFLOW

```bash
# Simple compile
clang hello.c -o hello

# With warnings and optimization
clang -Wall -Wextra -O2 program.c -o program

# Debug build
clang -g -O0 program.c -o program

# C++ compilation
clang++ -std=c++20 program.cpp -o program

# With sanitizers
clang -fsanitize=address -g program.c -o program

# Multiple source files
clang main.c utils.c -o program

# Link with library
clang program.c -o program -lm -lpthread
```

# SANITIZERS

**Address Sanitizer:**
> Detect memory errors

**Thread Sanitizer:**
> Detect data races

**Undefined Behavior Sanitizer:**
> Detect undefined behavior

**Memory Sanitizer:**
> Detect uninitialized memory reads

# CAVEATS

Some GCC-specific features not supported. Different optimization behavior than GCC. Sanitizers add overhead. Error messages more verbose than some prefer. Compilation may be slower than GCC in some cases.

# HISTORY

**clang** was created by Apple and the LLVM community starting in **2007** as a modern, modular compiler to replace GCC, first released in **2009**.

# SEE ALSO

[gcc](/man/gcc)(1), [clang++](/man/clang++)(1), [llvm](/man/llvm)(1)
