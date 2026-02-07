# TAGLINE

generate XML descriptions of C/C++ declarations

# TLDR

**Generate XML from C++ header**

```castxml --castxml-output=1 [header.hpp] -o [output.xml]```

**Generate gccxml-compatible output**

```castxml --castxml-gccxml [header.hpp] -o [output.xml]```

**Configure for GNU compiler**

```castxml --castxml-cc-gnu [g++] [header.hpp] -o [output.xml]```

**Start traversal at specific declaration**

```castxml --castxml-start [ClassName] [header.hpp] -o [output.xml]```

**Include path and defines**

```castxml -I[/include/path] -D[MACRO] [header.hpp] -o [output.xml]```

# SYNOPSIS

**castxml** [_options_] _input_file_

# DESCRIPTION

**castxml** creates an XML representation of C and C++ declarations from source files. It uses the Clang compiler frontend to parse C-family source code and produces a structured XML output describing types, functions, classes, and other declarations.

The tool is commonly used as a foundation for generating language bindings, enabling projects like pygccxml to automatically create Python wrappers for C++ libraries. It also serves as a code analysis backend where machine-readable representations of header files are needed.

CastXML was created as a replacement for the deprecated GCC-XML tool, providing a modern Clang-based alternative with compatible output formats for backward compatibility.

# PARAMETERS

**--castxml-output**=_version_
> Generate castxml-format output (version must be '1')

**--castxml-gccxml**
> Generate gccxml-compatible output format

**--castxml-cc-gnu** _compiler_
> Configure preprocessor/target for GNU compiler

**--castxml-cc-msvc** _compiler_
> Configure preprocessor/target for MSVC compiler

**--castxml-cc-gnu-c** _compiler_
> Configure for GNU C compiler

**--castxml-cc-msvc-c** _compiler_
> Configure for MSVC C compiler

**--castxml-start** _name_
> Start AST traversal at named declaration

**-o** _file_
> Output file path

**-I** _path_
> Add include search path

**-D** _macro_
> Define preprocessor macro

**-std**=_standard_
> C++ standard (c++11, c++14, c++17, etc.)

# USE CASES

**Language bindings**
> Generate bindings for Python, Rust, etc.

**Code analysis**
> Parse and analyze C++ codebases

**Documentation**
> Extract API information

# CAVEATS

Output format depends on selected option. GCCXML format provided for legacy compatibility. Use with pygccxml for Python-based analysis.

# SEE ALSO

[clang](/man/clang)(1), [g++](/man/g++)(1)
