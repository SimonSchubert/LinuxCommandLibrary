# TLDR

**Run static analysis** on a source file

```clang-check [source.cpp]```

**Check with specific compiler flags**

```clang-check [source.cpp] -- [--std=c++17] [-I/include/path]```

**Run analysis with AST dump**

```clang-check -ast-dump [source.cpp]```

**Analyze using compilation database**

```clang-check -p [build/] [source.cpp]```

# SYNOPSIS

**clang-check** [_options_] _source-files_ [**--**] [_compiler-options_]

# PARAMETERS

**-p** _path_
> Path to compilation database (compile_commands.json).

**-ast-dump**
> Dump the AST to stdout.

**-ast-list**
> List AST nodes.

**-ast-print**
> Pretty-print the AST.

**-analyze**
> Run static analysis.

# DESCRIPTION

**clang-check** is a tool for running Clang-based static analysis on C/C++ source files. It performs syntax checking, type checking, and can dump the Abstract Syntax Tree (AST) for inspection.

Part of the LLVM/Clang toolchain, it's useful for quick validation and AST exploration without full compilation.

# CAVEATS

Requires Clang to be installed. For project-wide analysis with correct include paths, use a compilation database (compile_commands.json).

# SEE ALSO

[clang](/man/clang)(1), [clang-tidy](/man/clang-tidy)(1), [clang-format](/man/clang-format)(1)
