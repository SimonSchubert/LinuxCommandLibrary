# TLDR

**Disassemble bitcode to LLVM IR**

```llvm-dis [file.bc]```

**Output to specific file**

```llvm-dis [file.bc] -o [output.ll]```

**Disassemble to stdout**

```llvm-dis [file.bc] -o -```

# SYNOPSIS

**llvm-dis** [_options_] [_file_]

# PARAMETERS

**-o** _file_
> Output file name.

**--show-annotations**
> Show annotations in output.

# DESCRIPTION

**llvm-dis** is the LLVM disassembler. Converts LLVM bitcode (.bc) files to human-readable LLVM assembly language (.ll) format. Useful for inspecting compiled code and debugging LLVM optimization passes.

# SEE ALSO

[llvm-as](/man/llvm-as)(1), [llc](/man/llc)(1)

