# TAGLINE

Compiler for the Haskell functional programming language

# TLDR

**Compile a Haskell file**

```ghc [file.hs]```

**Compile with optimization**

```ghc -O2 [file.hs]```

**Compile to object file only**

```ghc -c [file.hs]```

**Specify output name**

```ghc -o [program] [file.hs]```

**Enable all warnings**

```ghc -Wall [file.hs]```

**Compile modules in parallel**

```ghc -j [file.hs]```

**Enable a language extension**

```ghc -XOverloadedStrings [file.hs]```

# SYNOPSIS

**ghc** [_options_] _files_

# PARAMETERS

_FILES_
> Haskell source files (.hs, .lhs).

**-o** _FILE_
> Output file name.

**-c**
> Compile to object file only.

**-O**, **-O1**
> Enable standard optimization.

**-O2**
> Enable aggressive optimization with additional passes.

**-O0**
> Disable optimization (default).

**-Wall**
> Enable most warnings.

**-w**
> Suppress all warnings.

**-Werror**
> Treat warnings as errors.

**-i**_DIR_
> Add directory to import search path.

**-package** _PKG_
> Expose the specified package.

**--make**
> Build program and resolve module dependencies automatically.

**-e** _EXPR_
> Evaluate a single expression and exit.

**-j**[_N_]
> Compile N modules in parallel.

**-threaded**
> Use the threaded runtime system.

**-prof**
> Enable profiling.

**-fllvm**
> Compile via LLVM backend.

**-X**_EXTENSION_
> Enable a language extension (e.g., -XOverloadedStrings).

**-cpp**
> Run the C preprocessor on source files.

**-v**[_N_]
> Set verbosity level (0-3).

**--help**
> Display help information.

# DESCRIPTION

**ghc** (Glasgow Haskell Compiler) is the leading compiler for the Haskell programming language. It compiles Haskell source code to native machine code, producing efficient executables.

GHC supports the full Haskell language standard plus numerous extensions for advanced type system features, parallelism, and performance. The --make mode (default) automatically handles module dependencies. GHC also provides native code generation and an optional LLVM backend.

# CAVEATS

Compilation can be memory-intensive. Large projects benefit from incremental builds. Extension flags vary by GHC version. The **-O2** level significantly increases compile time compared to **-O**.

# HISTORY

GHC was started at the **University of Glasgow** in **1989**. It has become the de facto standard Haskell compiler, actively developed by the Haskell community and industrial users.

# SEE ALSO

[ghci](/man/ghci)(1), [runghc](/man/runghc)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)
