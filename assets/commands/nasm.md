# TAGLINE

portable x86 and x86-64 assembler using Intel syntax

# TLDR

**Assemble to object file**

```nasm -f [elf64] [source.asm] -o [output.o]```

**Assemble for Linux 32-bit**

```nasm -f elf32 [source.asm]```

**Assemble for Windows 64-bit**

```nasm -f win64 [source.asm]```

**Generate listing file**

```nasm -f [elf64] -l [listing.lst] [source.asm]```

**Define preprocessor macro**

```nasm -D [MACRO_NAME]=[value] [source.asm]```

**Include search path**

```nasm -I [/path/to/includes/] [source.asm]```

**Preprocess only** (output to stdout)

```nasm -E [source.asm]```

**Show available output formats**

```nasm -hf```

# SYNOPSIS

**nasm** [_-f format_] [_-o outfile_] [_-l listfile_] [_-D name=value_] [_options_] _source.asm_

# PARAMETERS

**-f** _format_
> Output format (elf64, elf32, win64, win32, macho64, bin, etc.).

**-o** _file_
> Output file name.

**-l** _file_
> Generate listing file.

**-M**
> Generate Makefile dependencies.

**-E**
> Preprocess only, output to stdout.

**-a**
> Preprocess only, no output.

**-D** _macro_[=_value_]
> Define preprocessor macro.

**-U** _macro_
> Undefine preprocessor macro.

**-I** _path_
> Add include file search directory.

**-P** _file_
> Pre-include file before source.

**-w**[+|-]_warning_
> Enable/disable warning type.

**-g**
> Generate debug information.

**-F** _format_
> Debug information format.

**-O** _level_
> Optimization level (0, 1, x for multi-pass).

**-s**
> Output errors to stdout.

**-v**
> Display version.

**-h**
> Display help.

**-hf**
> List output formats.

# DESCRIPTION

**NASM** (Netwide Assembler) is a portable x86 and x86-64 assembler using Intel syntax. It produces object files for various operating systems and formats, making it suitable for cross-platform assembly development.

The Intel syntax NASM uses is generally considered more readable than AT&T syntax: destination comes first (mov eax, 1), memory references use brackets ([var]), and size specifiers are explicit (dword, qword).

Output formats cover major platforms: ELF for Linux/Unix, PE/COFF for Windows, Mach-O for macOS, and flat binary for bootloaders and embedded systems. The -f option selects the target format.

NASM includes a powerful macro preprocessor supporting multi-line macros, conditional assembly, string manipulation, and file inclusion. Context-local labels enable reusable code structures.

For debugging, NASM generates debugging information in formats like DWARF and CodeView, compatible with GDB, LLDB, and Visual Studio debuggers.

# CAVEATS

Intel syntax differs from GNU as (AT&T syntax). Object files must be linked (ld, gcc, link.exe) to create executables. Platform-specific calling conventions matter for function calls. Binary output requires manual memory layout. 16-bit and 32-bit modes need attention to processor mode.

# HISTORY

**NASM** was written by **Simon Tatham** and **Julian Hall** starting in **1996**, aiming to create a free, portable assembler with clean Intel syntax. It became the assembler of choice for many open-source projects needing low-level code. The project has seen contributions from many developers and remains actively maintained for modern processor extensions including AVX-512.

# SEE ALSO

[as](/man/as)(1), [yasm](/man/yasm)(1), [ld](/man/ld)(1), [objdump](/man/objdump)(1), [gdb](/man/gdb)(1)
