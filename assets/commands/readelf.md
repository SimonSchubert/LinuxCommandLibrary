# TAGLINE

Display information about ELF binary files

# TLDR

Display **all information** about an ELF file

```readelf -a /path/to/binary```

Display all **headers** (file, program, and section)

```readelf -e /path/to/binary```

Display the **symbol table**

```readelf -s /path/to/binary```

Display the **dynamic symbol table**

```readelf --dyn-syms /path/to/binary```

Display **section headers**

```readelf -S /path/to/binary```

Display **relocation** entries

```readelf -r /path/to/binary```

Display the contents of a **section** as hex bytes

```readelf -x .text /path/to/binary```

Display the contents of a **section** as printable strings

```readelf -p .rodata /path/to/binary```

# SYNOPSIS

**readelf** [_options_] _elffile_...

# DESCRIPTION

**readelf** displays information about one or more ELF (Executable and Linkable Format) object files. It supports both 32-bit and 64-bit ELF files and operates independently of the BFD library, providing detailed analysis of binary files.

# PARAMETERS

**-a, --all**
> Display all information

**-h, --file-header**
> Display the ELF file header

**-l, --program-headers**
> Display program (segment) headers

**-S, --section-headers**
> Display section headers

**-e, --headers**
> Display all headers (file, program, section)

**-s, --symbols**
> Display symbol table entries

**--dyn-syms**
> Display dynamic symbol table

**-r, --relocs**
> Display relocation sections

**-d, --dynamic**
> Display dynamic section contents

**-n, --notes**
> Display NOTE segments/sections

**-V, --version-info**
> Display version sections

**-x** _section_, **--hex-dump=**_section_
> Display section contents as hexadecimal bytes

**-p** _section_, **--string-dump=**_section_
> Display section contents as printable strings

**-u, --unwind**
> Display unwind table information

**-w, --debug-dump**
> Display DWARF debug sections

**-I, --histogram**
> Display a histogram of bucket list lengths for symbol tables

**-W, --wide**
> Allow wide output (do not break lines at 80 columns)

**-C, --demangle**
> Decode (demangle) low-level symbol names into user-level names

**-z, --decompress**
> Decompress sections before displaying their contents

**-H, --help**
> Display usage information

# CAVEATS

Unlike objdump, readelf operates independently of the BFD library and may show different output. It only works with ELF format files and cannot disassemble code.

# HISTORY

**readelf** is part of the GNU **binutils** package. It provides more detailed ELF analysis compared to objdump for ELF-specific information.

# SEE ALSO

[objdump](/man/objdump)(1), [nm](/man/nm)(1), [strings](/man/strings)(1), [strip](/man/strip)(1), [size](/man/size)(1), [elf](/man/elf)(5)
