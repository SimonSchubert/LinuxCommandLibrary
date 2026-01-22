# TLDR

**Compile D source** file

```dmd [file.d]```

**Compile with output** name

```dmd -of=[output] [file.d]```

**Compile with optimizations**

```dmd -O [file.d]```

**Compile to object** file only

```dmd -c [file.d]```

**Include import paths**

```dmd -I[/path/to/imports] [file.d]```

**Enable all warnings**

```dmd -w [file.d]```

**Generate debug info**

```dmd -g [file.d]```

# SYNOPSIS

**dmd** [_options_] _file_...

# PARAMETERS

_FILE_
> D source file(s) to compile.

**-of**=_FILE_
> Output file name.

**-O**
> Enable optimizations.

**-c**
> Compile only (no link).

**-I**_PATH_
> Add import path.

**-w**
> Enable all warnings.

**-g**
> Generate debug information.

**-release**
> Compile for release (disable asserts).

**-unittest**
> Compile and run unit tests.

**--help**
> Display help information.

# DESCRIPTION

**dmd** is the reference compiler for the D programming language. It compiles D source code to native machine code, supporting the full D language specification including templates, mixins, and compile-time function execution.

D combines the power of low-level programming with modern language features like garbage collection, closures, and built-in unit testing. dmd provides fast compilation suitable for rapid development cycles.

The compiler includes a standard library (Phobos) with extensive functionality for common programming tasks, and supports interfacing with C and C++ code.

# CAVEATS

Reference implementation may have performance differences from alternative compilers (LDC, GDC). Some optimizations less aggressive than LLVM-based compilers. Platform support varies.

# HISTORY

dmd was created by **Walter Bright**, who began developing D in **1999** as a successor to C and C++. The first public release was in **2001**. D draws on experience from compiler development and aims to fix perceived issues in C++.

# SEE ALSO

[ldc](/man/ldc)(1), [gdc](/man/gdc)(1), [rdmd](/man/rdmd)(1)
