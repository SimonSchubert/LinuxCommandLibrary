# TLDR

**Assemble to ELF64 object file**

```yasm -f elf64 -o [output.o] [input.asm]```

**Assemble for Windows 64-bit**

```yasm -f win64 -o [output.obj] [input.asm]```

**Assemble 32-bit ELF**

```yasm -f elf32 -o [output.o] [input.asm]```

**Use GAS syntax**

```yasm -p gas -f elf64 -o [output.o] [input.s]```

**Generate debug info** in DWARF format

```yasm -g dwarf2 -f elf64 -o [output.o] [input.asm]```

**Preprocess only**

```yasm -e [input.asm]```

**Define macro**

```yasm -D [DEBUG=1] -f elf64 -o [output.o] [input.asm]```

# SYNOPSIS

**yasm** [_options_] _infile_

# PARAMETERS

**-f** _format_
> Output format: elf32, elf64, win32, win64, macho32, macho64, bin, coff.

**-o** _outfile_
> Output file name.

**-a** _arch_
> Target architecture (default: x86).

**-m** _machine_
> Machine type: x86, amd64.

**-p** _parser_
> Syntax parser: nasm (default), gas.

**-r** _preproc_
> Preprocessor: nasm, raw, cpp, gas.

**-g** _debug_
> Debug format: dwarf2, stabs, cv8, null.

**-D** _macro[=value]_
> Define preprocessor macro.

**-U** _macro_
> Undefine macro.

**-I** _path_
> Add include search directory.

**-P** _file_
> Pre-include file.

**-e**
> Preprocess only (no assembly).

**-w**
> Inhibit warnings.

**-Werror**
> Treat warnings as errors.

**--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**yasm** is a modular assembler supporting x86 and AMD64 instruction sets. It is a complete rewrite of NASM under the BSD license, offering multiple input syntaxes and output formats.

Supported syntaxes include NASM (default) and GAS (GNU Assembler). Output formats cover ELF, Win32/Win64 PE, Mach-O, COFF, and raw binary. Debug information can be generated in DWARF 2, STABS, or CodeView 8 formats.

The assembler is used for low-level system programming, operating system development, and performance-critical code. It integrates with C/C++ toolchains through standard object file formats.

# CAVEATS

Some NASM syntax extensions may not be fully compatible. GAS syntax support is not complete. AMD64 mode requires explicit selection via -m amd64 or 64-bit object format.

# HISTORY

**yasm** was created by Peter Johnson and Michael Urman as a rewrite of NASM with a modular architecture. It aimed to support multiple architectures and syntaxes while maintaining NASM compatibility. Development began in 2001 with the project remaining actively used in various build systems.

# SEE ALSO

[nasm](/man/nasm)(1), [as](/man/as)(1), [ld](/man/ld)(1), [objdump](/man/objdump)(1)
