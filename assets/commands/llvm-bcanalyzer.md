# TLDR

**Analyze bitcode file**

```llvm-bcanalyzer [file.bc]```

**Show detailed dump**

```llvm-bcanalyzer --dump [file.bc]```

**Show only statistics**

```llvm-bcanalyzer --dump-blockinfo [file.bc]```

# SYNOPSIS

**llvm-bcanalyzer** [_options_] _file_

# PARAMETERS

**--dump**
> Dump low-level bitcode contents.

**--dump-blockinfo**
> Show block info statistics.

**--show-binary-blobs**
> Show binary blob data.

# DESCRIPTION

**llvm-bcanalyzer** analyzes LLVM bitcode files. Shows statistics about bitcode structure, including block types, record counts, and bit distribution. Useful for debugging bitcode generation and understanding LLVM IR serialization.

# SEE ALSO

[llvm-dis](/man/llvm-dis)(1), [llvm-as](/man/llvm-as)(1)

