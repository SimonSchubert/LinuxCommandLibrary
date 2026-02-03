# TLDR

**Concatenate bitcode files**

```llvm-cat [file1.bc] [file2.bc] -o [output.bc]```

**Concatenate multiple files**

```llvm-cat [*.bc] -o [combined.bc]```

# SYNOPSIS

**llvm-cat** [_options_] _files_...

# PARAMETERS

**-o** _file_
> Output file name.

# DESCRIPTION

**llvm-cat** concatenates LLVM bitcode files into a single bitcode file. Combines multiple modules while preserving their individual contents. Used in build systems for collecting bitcode before linking.

# SEE ALSO

[llvm-link](/man/llvm-link)(1), [llvm-dis](/man/llvm-dis)(1)

