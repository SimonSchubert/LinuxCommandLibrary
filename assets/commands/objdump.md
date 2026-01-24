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

# SYNOPSIS

**objdump** [_options_] _files_...

# DESCRIPTION

**objdump** displays information about object files. It can disassemble executables, show headers, symbol tables, and relocations. It's essential for binary analysis and debugging.

The tool works with ELF, PE, and other object file formats, providing insights into compiled binaries.

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

# CAVEATS

Stripped binaries lack debug info. Large binaries produce verbose output. Disassembly may miss data in code sections.

# HISTORY

**objdump** is part of **GNU Binutils**, started in the late **1980s**. It provides a unified tool for examining various object file formats across different architectures.

# SEE ALSO

[readelf](/man/readelf)(1), [nm](/man/nm)(1), [gdb](/man/gdb)(1), [strings](/man/strings)(1)
