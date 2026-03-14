# TAGLINE

Clang-based static analysis and AST inspection tool

# TLDR

**Run syntax checking** on a source file

```clang-check [source.cpp]```

**Check with specific compiler flags**

```clang-check [source.cpp] -- -std=c++17 -I[/include/path]```

**Dump the AST** of a source file

```clang-check -ast-dump [source.cpp]```

Dump only AST nodes matching a **filter**

```clang-check -ast-dump -ast-dump-filter [functionName] [source.cpp]```

**Analyze using a compilation database**

```clang-check -p [build/] [source.cpp]```

Apply **fix-it** suggestions to the source file

```clang-check -fixit [source.cpp]```

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

**-ast-dump-filter** _name_
> Filter AST dump/print to only nodes with a matching qualified name.

**-fixit**
> Apply fix-it advice to the input source.

**--extra-arg** _arg_
> Additional argument to append to the compiler command line.

**--extra-arg-before** _arg_
> Additional argument to prepend to the compiler command line.

# DESCRIPTION

**clang-check** is a tool that combines the LibTooling framework for running a Clang tool with basic Clang diagnostics. It performs syntax checking, type checking, and can dump or pretty-print the Abstract Syntax Tree (AST) for inspection. It can also apply fix-it suggestions automatically.

Part of the LLVM/Clang toolchain, it is useful for quick validation and AST exploration without full compilation.

# CAVEATS

Requires Clang to be installed. For project-wide analysis with correct include paths, use a compilation database (compile_commands.json).

# SEE ALSO

[clang](/man/clang)(1), [clang-tidy](/man/clang-tidy)(1), [clang-format](/man/clang-format)(1)
