# TLDR

**Compile D program**

```ldc2 [source.d]```

**Output executable name**

```ldc2 -of=[output] [source.d]```

**Compile with optimization**

```ldc2 -O2 [source.d]```

**Release build**

```ldc2 -release [source.d]```

**Debug build**

```ldc2 -g [source.d]```

**Compile only**

```ldc2 -c [source.d]```

# SYNOPSIS

**ldc2** [_options_] _files_

# PARAMETERS

_FILES_
> D source files.

**-of** _FILE_
> Output filename.

**-O** _LEVEL_
> Optimization level.

**-release**
> Disable runtime checks.

**-g**
> Include debug info.

**-c**
> Compile only, no link.

**--help**
> Display help information.

# DESCRIPTION

**ldc** is the LLVM-based D compiler. It compiles D language source code to native executables.

The compiler produces fast code using LLVM optimizations. It's one of the main D compilers alongside DMD.

ldc compiles D language code.

# CAVEATS

Requires LLVM. D language specific. May lag DMD features.

# HISTORY

LDC was created to provide LLVM-based compilation for the **D programming language**, offering better optimization.

# SEE ALSO

[dmd](/man/dmd)(1), [gdc](/man/gdc)(1), [dub](/man/dub)(1)
