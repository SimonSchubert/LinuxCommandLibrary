# TAGLINE

LLVM bitcode disassembler

# TLDR

**Disassemble bitcode to LLVM IR**

```llvm-dis [file.bc]```

**Output to specific file**

```llvm-dis [file.bc] -o [output.ll]```

**Disassemble from stdin to stdout**

```llvm-dis -o - < [file.bc]```

**Show version**

```llvm-dis --version```

# SYNOPSIS

**llvm-dis** [_options_] [_file_]

# PARAMETERS

**-o** _file_
> Output file name. If omitted, input filename with .ll extension is used.

**-f**, **--force**
> Force disassembly even if input file lacks standard .bc extension.

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

[llvm-as](/man/llvm-as)(1), [llc](/man/llc)(1)

