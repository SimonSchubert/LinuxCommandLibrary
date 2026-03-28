# TAGLINE

LLVM machine code playground

# TLDR

**Assemble to object file**

```llvm-mc -filetype=obj [input.s] -o [output.o]```

**Disassemble hex bytes** for x86_64

```echo "0x90" | llvm-mc --disassemble -triple=x86_64```

**Assemble for a specific target triple**

```llvm-mc -triple=x86_64-linux-gnu [input.s]```

**Show instruction encoding** alongside assembly

```llvm-mc -show-encoding [input.s]```

**Assemble with Intel syntax** instead of AT&T

```llvm-mc -x86-asm-syntax=intel [input.s]```

**Assemble for ARM target**

```llvm-mc -triple=aarch64-linux-gnu -filetype=obj [input.s] -o [output.o]```

# SYNOPSIS

**llvm-mc** [_options_] [_file_]

# PARAMETERS

**-filetype**=_type_
> Output file type: **asm** (assembly listing, default), **obj** (object file), or **null** (no output).

**-triple**=_triple_
> Target triple for assembly/disassembly (e.g., x86_64-linux-gnu, aarch64-linux-gnu).

**--disassemble**, **-disassemble**
> Disassemble hex-encoded input bytes into assembly.

**-show-encoding**
> Print instruction encoding as comments alongside assembly output.

**-show-inst**
> Show internal LLVM instruction representation in output.

**-o** _file_
> Output file name (default: stdout).

**-x86-asm-syntax**=_syntax_
> Assembly syntax for x86: **att** (default) or **intel**.

**-mcpu**=_cpu_
> Specify target CPU for instruction selection.

**-mattr**=_attributes_
> Target-specific attributes (e.g., +sse4.2,+avx).

**-output-asm-variant**=_N_
> Select assembly output variant (0 = AT&T, 1 = Intel for x86).

**-g**
> Generate DWARF debug information in object output.

# DESCRIPTION

**llvm-mc** is the LLVM machine code playground. It assembles assembly source into machine code and disassembles machine code bytes back into assembly for various target architectures. It is useful for testing assembly syntax, examining instruction encodings, verifying assembler behavior, and low-level debugging.

Input for assembly mode is an assembly source file. Input for disassembly mode (**--disassemble**) is hex-encoded bytes, which can be piped from stdin. When no input file is given, stdin is read.

# SEE ALSO

[llvm-as](/man/llvm-as)(1), [llvm-objdump](/man/llvm-objdump)(1), [as](/man/as)(1), [nasm](/man/nasm)(1), [objdump](/man/objdump)(1)

