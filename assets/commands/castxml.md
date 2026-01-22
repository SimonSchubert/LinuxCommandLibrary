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

**castxml** creates an XML representation of C++ declarations from source files. It parses C-family languages using Clang and outputs an abstract syntax tree in XML format.

The tool is commonly used for generating language bindings and code analysis.

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
