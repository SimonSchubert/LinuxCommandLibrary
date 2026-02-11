# TAGLINE

Display information about ELF binary files

# TLDR

Display **all information** about ELF file

```readelf -a /path/to/binary```

Display all **headers**

```readelf --headers /path/to/binary```

Display **symbol table**

```readelf --symbols /path/to/binary```

Display **ELF header**

```readelf --file-header /path/to/binary```

Display **section headers**

```readelf --section-headers /path/to/binary```

Display **program headers**

```readelf --program-headers /path/to/binary```

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

**-w, --debug-dump**
> Display DWARF debug sections

**-W, --wide**
> Allow wide output lines

**-C, --demangle**
> Decode C++ symbol names

**-z, --decompress**
> Decompress sections before display

# CAVEATS

Unlike objdump, readelf operates independently of the BFD library and may provide different information. It only works with ELF format files.

# HISTORY

**readelf** is part of the GNU **binutils** package. It provides more detailed ELF analysis compared to objdump for ELF-specific information.

# SEE ALSO

[objdump](/man/objdump)(1), [nm](/man/nm)(1), [strings](/man/strings)(1), [elf](/man/elf)(5)
