# TAGLINE

machine code playground

# TLDR

**Assemble to object file**

```llvm-mc -filetype=obj [input.s] -o [output.o]```

**Disassemble hex bytes**

```echo "0x90" | llvm-mc --disassemble```

**Assemble for specific architecture**

```llvm-mc -triple=x86_64-linux-gnu [input.s]```

**Show encoding**

```llvm-mc -show-encoding [input.s]```

# SYNOPSIS

**llvm-mc** [_options_] _file_

# PARAMETERS

**-filetype** _type_
> Output type (asm, null, obj).

**-triple** _triple_
> Target triple.

**--disassemble**
> Disassemble input.

**-show-encoding**
> Show instruction encoding.

**-o** _file_
> Output file name.

# DESCRIPTION

**llvm-mc** is the LLVM machine code playground. Assembles and disassembles machine code for various targets. Useful for testing assembly syntax, examining instruction encodings, and low-level debugging.

# SEE ALSO

[llvm-as](/man/llvm-as)(1), [as](/man/as)(1)

