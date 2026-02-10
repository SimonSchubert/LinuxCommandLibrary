# TAGLINE

LLVM optimizer

# TLDR

**Optimize LLVM bitcode**

```opt [input.bc] -o [output.bc]```

**Run specific pass**

```opt -mem2reg [input.bc] -o [output.bc]```

**Enable all optimizations**

```opt -O3 [input.bc] -o [output.bc]```

**Print pass statistics**

```opt -stats [input.bc] -o [output.bc]```

**List available passes**

```opt --print-passes```

# SYNOPSIS

**opt** [_options_] [_input_]

# PARAMETERS

_INPUT_
> LLVM bitcode file.

**-o** _OUTPUT_
> Output file.

**-O**_LEVEL_
> Optimization level (0-3).

**--print-passes**
> List passes.

**-stats**
> Print statistics.

**--help**
> Display help information.

# DESCRIPTION

**opt** is the LLVM optimizer. Runs optimization passes on bitcode.

The tool transforms LLVM intermediate representation. Part of LLVM toolchain.

# CAVEATS

Part of LLVM. Works with bitcode only. Pass names version-specific.

# HISTORY

opt was developed as part of the **LLVM compiler infrastructure** project.

# SEE ALSO

[llvm-as](/man/llvm-as)(1), [llc](/man/llc)(1), [clang](/man/clang)(1)

