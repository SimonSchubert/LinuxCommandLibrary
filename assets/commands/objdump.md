# TAGLINE

displays information about object files

# TLDR

**Disassemble executable**

```objdump -d [binary]```

**Show all headers**

```objdump -x [binary]```

**Show section contents**

```objdump -s [binary]```

**Disassemble with source**

```objdump -S [binary]```

**Show symbol table**

```objdump -t [binary]```

**Show dynamic symbols**

```objdump -T [binary]```

**Disassemble specific section**

```objdump -d -j [.text] [binary]```

**Disassemble with Intel syntax** (x86)

```objdump -d -M intel [binary]```

**Disassemble with demangled C++ symbols**

```objdump -d -C [binary]```

**Show file header** information

```objdump -f [binary]```

**Show relocation entries**

```objdump -r [binary]```

# SYNOPSIS

**objdump** [_options_] _files_...

# DESCRIPTION

**objdump** displays information about object files. It can disassemble executables, show headers, symbol tables, and relocations. It is essential for binary analysis, debugging, and reverse engineering.

The tool works with ELF, PE/COFF, Mach-O, and other object file formats supported by the BFD library. On x86, disassembly defaults to AT&T syntax; use **-M intel** for Intel syntax. The **-S** option interleaves source code with disassembly when debug info is present, making it valuable for understanding compiler output.

# PARAMETERS

**-d**, **--disassemble**
> Disassemble code sections.

**-D**
> Disassemble all sections.

**-S**, **--source**
> Mix source with disassembly.

**-t**, **--syms**
> Symbol table.

**-T**, **--dynamic-syms**
> Dynamic symbol table.

**-x**, **--all-headers**
> All headers.

**-h**, **--section-headers**
> Section headers.

**-r**, **--reloc**
> Relocation entries.

**-j** _section_
> Specific section only.

**-M** _options_
> Disassembler options.

**-C**, **--demangle**
> Demangle C++ symbols.

**-s**, **--full-contents**
> Display full contents of all sections.

**-f**, **--file-headers**
> Display file header information.

**-l**, **--line-numbers**
> Include source file and line numbers in disassembly (requires debug info).

**-w**, **--wide**
> Format output for more than 80 columns.

**--no-show-raw-insn**
> Don't show raw instruction bytes alongside disassembly.

# CAVEATS

Stripped binaries lack debug info. Large binaries produce verbose output. Disassembly may miss data in code sections.

# HISTORY

**objdump** is part of **GNU Binutils**, started in the late **1980s**. It provides a unified tool for examining various object file formats across different architectures.

# SEE ALSO

[readelf](/man/readelf)(1), [nm](/man/nm)(1), [gdb](/man/gdb)(1), [strings](/man/strings)(1)
