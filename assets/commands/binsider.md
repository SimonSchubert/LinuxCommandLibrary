# TAGLINE

TUI tool for analyzing ELF binaries

# TLDR

**Analyze an ELF binary**

```binsider [path/to/binary]```

**Analyze a binary** starting on the static analysis tab

```binsider -t static [path/to/binary]```

**Analyze a binary** with a custom minimum string length

```binsider -n [8] [path/to/binary]```

**Analyze a binary** starting on the strings tab with a minimum length of 8

```binsider -t strings -n 8 [path/to/binary]```

# SYNOPSIS

**binsider** [_options_] [_file_...]

# PARAMETERS

**-n**, **--min-len** _value_
> Minimum length of strings to extract (default: 15)

**-t**, **--tab** _tab_
> The initial application tab to open (default: general)

**--accent-color** _color_
> Accent color of the application

**-h**, **--help**
> Display help information

**-V**, **--version**
> Display version information

# DESCRIPTION

**binsider** is a terminal user interface for performing both static and dynamic analysis of ELF (Executable and Linkable Format) binary files. It combines the functionality of several standard Unix utilities into a single interactive interface, acting as a swiss army knife for reverse engineers.

The **general analysis** tab displays file metadata such as size, ownership, permissions, and timestamps (similar to **stat**), as well as linked shared libraries (similar to **ldd**). Selecting a shared library allows recursive analysis of its dependencies.

The **static analysis** tab examines the ELF structure without executing the binary, displaying file headers, notes, program headers, section headers, symbols, dynamic symbols, dynamic linking information, and relocations (similar to **readelf**).

The **dynamic analysis** tab executes the binary while tracing system calls and signals (similar to **strace** and **ltrace**), showing process IDs, call arguments, and return values. An execution summary provides timing data, call frequency, and error counts. This feature is powered by the **lurk** tracing library.

The **strings** tab extracts embedded strings from the binary (similar to **strings**), useful for discovering URLs, credentials, or other sensitive data. The minimum string length can be adjusted interactively with +/- keys or via the **-n** flag.

The **hexdump** tab provides a structured hex viewer with a rich dashboard. It supports keyboard-driven navigation, searching, jumping to specific byte offsets, and direct hex editing with the ability to save modifications back to the file. This feature is powered by the **heh** hex editor.

Built with Rust and the Ratatui TUI framework, binsider uses keyboard-driven navigation throughout. Tabs are switched with Tab/Shift+Tab, items navigated with h/j/k/l or arrow keys, and searches initiated with the forward slash key.

# CAVEATS

Dynamic analysis requires executing the target binary and is only available on Linux. Hex editing modifies the binary in-place, so backups should be made before saving changes. The file must be opened in read-write mode for editing to work. ELF analysis features are specific to the ELF format and do not apply to other binary formats such as PE or Mach-O.

# HISTORY

**binsider** was created by **Orhun Parmaksiz** and first released in **September 2024**. It is written in Rust and dual-licensed under the Apache License 2.0 and MIT License. The project is hosted on GitHub and continues active development, with its website and documentation at https://binsider.dev.

# SEE ALSO

[readelf](/man/readelf)(1), [strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [strings](/man/strings)(1), [ldd](/man/ldd)(1), [objdump](/man/objdump)(1), [hexdump](/man/hexdump)(1), [stat](/man/stat)(1), [nm](/man/nm)(1), [file](/man/file)(1)
