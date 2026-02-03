# TLDR

**Disassemble object file**

```llvm-objdump -d [file.o]```

**Show all headers**

```llvm-objdump -x [file]```

**Show section headers**

```llvm-objdump -h [file]```

**Disassemble with source**

```llvm-objdump -dS [file]```

**Show relocations**

```llvm-objdump -r [file.o]```

**Show symbol table**

```llvm-objdump -t [file]```

# SYNOPSIS

**llvm-objdump** [_options_] [_file_...]

# PARAMETERS

**-d**, **--disassemble**
> Disassemble text sections.

**-D**, **--disassemble-all**
> Disassemble all sections.

**-S**, **--source**
> Show source with disassembly.

**-h**, **--headers**
> Show section headers.

**-x**, **--all-headers**
> Show all headers.

**-t**, **--syms**
> Show symbol table.

**-r**, **--reloc**
> Show relocations.

**--demangle**
> Demangle symbol names.

# DESCRIPTION

**llvm-objdump** displays information about object files. Drop-in replacement for GNU objdump. Supports disassembly, header display, symbol tables, and relocation information for various binary formats.

# SEE ALSO

[objdump](/man/objdump)(1), [llvm-nm](/man/llvm-nm)(1)

