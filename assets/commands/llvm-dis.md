# TAGLINE

LLVM bitcode disassembler

# TLDR

**Disassemble bitcode to LLVM IR**

```llvm-dis [file.bc]```

**Output to specific file**

```llvm-dis [file.bc] -o [output.ll]```

**Disassemble from stdin to stdout**

```llvm-dis -o - < [file.bc]```

**Disassemble and show timing for each pass**

```llvm-dis --time-passes [file.bc]```

**Show version**

```llvm-dis --version```

# SYNOPSIS

**llvm-dis** [_options_] [_file_]

# PARAMETERS

**-o** _file_
> Output file name. If omitted, input filename with .ll extension is used.

**-f**, **--force**
> Enable binary output on terminals and overwrite existing output files.

**--show-annotations**
> Show annotations in output.

**--disable-output**
> Discard output (useful with --time-passes for benchmarking).

**--time-passes**
> Time each pass during disassembly.

**--help**
> Display available options.

**--version**
> Display LLVM version.

# DESCRIPTION

**llvm-dis** is the LLVM disassembler. It converts LLVM bitcode (.bc) files to human-readable LLVM assembly language (.ll) format. If no filename is given or the filename is -, it reads from stdin. Useful for inspecting compiled code and debugging LLVM optimization passes.

# SEE ALSO

[llvm-as](/man/llvm-as)(1), [llc](/man/llc)(1), [opt](/man/opt)(1), [llvm-bcanalyzer](/man/llvm-bcanalyzer)(1), [llvm-objdump](/man/llvm-objdump)(1), [clang](/man/clang)(1)

