# TAGLINE

Concatenate LLVM bitcode files into a single bitcode file

# TLDR

**Concatenate bitcode files** into a single output

```llvm-cat -o [output.bc] [file1.bc] [file2.bc]```

**Concatenate multiple bitcode files** using a glob

```llvm-cat -o [combined.bc] [*.bc]```

**Produce a module containing embedded modules** (binary bundle)

```llvm-cat -b -o [bundle.bc] [file1.bc] [file2.bc]```

# SYNOPSIS

**llvm-cat** [_-o_ _output_] [_-b_] _files_...

# PARAMETERS

**-o** _file_
> Write output bitcode to _file_ (defaults to standard output).

**-b**
> Produce a binary bundle. Embeds each input module as a separate module inside the output, instead of linking them together.

**--help**
> Display help information.

# DESCRIPTION

**llvm-cat** concatenates LLVM bitcode files. By default it produces a single bitcode module that contains the linked contents of all inputs. With **-b**, it produces a bundle in which each input remains a distinct embedded module, useful for tools that operate on multiple modules without merging them.

It is part of the LLVM toolchain and is typically used in build systems that need to aggregate bitcode prior to linking, optimization, or analysis with **llvm-link**, **opt**, or **llc**.

# SEE ALSO

[llvm-dis](/man/llvm-dis)(1), [llvm-as](/man/llvm-as)(1), [llvm-bcanalyzer](/man/llvm-bcanalyzer)(1)

