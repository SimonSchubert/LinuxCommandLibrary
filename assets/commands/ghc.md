# TAGLINE

Compiler for the Haskell functional programming language

# TLDR

**Compile a Haskell file**

```ghc [file.hs]```

**Compile with optimization**

```ghc -O2 [file.hs]```

**Compile to object file**

```ghc -c [file.hs]```

**Specify output name**

```ghc -o [program] [file.hs]```

**Enable all warnings**

```ghc -Wall [file.hs]```

# SYNOPSIS

**ghc** [_options_] _files_

# PARAMETERS

_FILES_
> Haskell source files (.hs, .lhs).

**-o** _FILE_
> Output file name.

**-c**
> Compile to object file only.

**-O**, **-O2**
> Enable optimization.

**-Wall**
> Enable all warnings.

**-Werror**
> Treat warnings as errors.

**-i** _DIR_
> Add to import path.

**-package** _PKG_
> Use specified package.

**--make**
> Build program with dependencies.

**--help**
> Display help information.

# DESCRIPTION

**ghc** (Glasgow Haskell Compiler) is the leading compiler for the Haskell programming language. It compiles Haskell source code to native machine code, producing efficient executables.

GHC supports the full Haskell language standard plus numerous extensions for advanced type system features, parallelism, and performance. The --make mode automatically handles module dependencies.

# CAVEATS

Compilation can be memory-intensive. Large projects benefit from incremental builds. Extension flags vary by GHC version.

# HISTORY

GHC was started at the **University of Glasgow** in **1989**. It has become the de facto standard Haskell compiler, actively developed by the Haskell community and industrial users.

# SEE ALSO

[ghci](/man/ghci)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)
