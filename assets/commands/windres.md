# TAGLINE

GNU Windows resource compiler

# TLDR

**Compile resource script** to COFF object file

```windres [input.rc] -o [output.o]```

**Compile to binary resource format**

```windres -O res [input.rc] -o [output.res]```

**Convert res file** to COFF object

```windres -i [input.res] -o [output.o]```

**Specify input format** explicitly

```windres -J rc -i [input.rc] -O coff -o [output.o]```

**Include directory** for headers

```windres -I [path/to/includes] [input.rc] -o [output.o]```

**Define preprocessor symbol**

```windres -D [SYMBOL=value] [input.rc] -o [output.o]```

**Extract resources** from an executable to a resource script

```windres -i [app.exe] -o [resources.rc]```

**Cross-compile for 64-bit Windows**

```x86_64-w64-mingw32-windres [input.rc] -o [output.o]```

# SYNOPSIS

**windres** [_options_] [_input-file_] [_output-file_]

# PARAMETERS

**-i** _file_, **--input** _file_
> Input file name. Without this, uses the first non-option argument, or standard input if there is none.

**-o** _file_, **--output** _file_
> Output file name. Without an output file, resources are printed in rc format to standard output.

**-J** _format_, **--input-format** _format_
> Input format: rc (resource script), res (binary), coff (object). Guessed from the file name or contents if omitted.

**-O** _format_, **--output-format** _format_
> Output format: rc, res, or coff. Guessed from the file name if omitted.

**-F** _target_, **--target** _target_
> Specify BFD target format for COFF output.

**-I** _dir_, **--include-dir** _dir_
> Add directory to search path for included files. An argument matching a format name behaves like **-J** with a deprecation warning; prefix a directory of that name with ./ to avoid this.

**-D** _sym_[=_val_], **--define** _sym_[=_val_]
> Define preprocessor symbol.

**-U** _sym_, **--undefine** _sym_
> Undefine preprocessor symbol.

**--preprocessor** _prog_
> Preprocessor program to use (default: gcc).

**--preprocessor-arg** _arg_
> Additional argument for preprocessor.

**-c** _val_, **--codepage** _val_
> Default codepage for rc files, in decimal or 0x-prefixed hexadecimal.

**-l** _val_, **--language** _val_
> Default language for rc files, as a hexadecimal language code.

**-r**
> Ignored for compatibility with rc.

**--no-use-temp-file**
> Use pipes for communication with the preprocessor (default).

**--use-temp-file**
> Use a temporary file for preprocessor communication instead of pipes.

**@** _file_
> Read command-line options from file.

**-v**, **--verbose**
> Enable verbose mode.

**-h**, **--help**
> Display help message.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**windres** is the GNU resource compiler for Windows applications, part of GNU Binutils. It compiles resource script (.rc) files containing UI elements like icons, cursors, menus, dialogs, and version information into binary formats usable by Windows executables.

The tool supports three formats: "rc" (text resource scripts), "res" (binary resource files), and "coff" (object files for linking). Typical workflow involves compiling .rc files to COFF objects, then linking them with the application.

For cross-compilation from Linux to Windows, windres is typically used as part of the MinGW-w64 toolchain with architecture-specific prefixes (e.g., x86_64-w64-mingw32-windres for 64-bit Windows targets).

Resource scripts are preprocessed by gcc before compilation, allowing use of #include and #define directives.

# CAVEATS

Resource script syntax follows Microsoft conventions but may have minor compatibility differences. Some complex resources may require adjustments when moving from Microsoft's rc.exe. The tool is primarily useful for Windows cross-compilation; native Windows development typically uses Microsoft tools.

# HISTORY

**windres** was developed as part of **GNU Binutils** to provide a free alternative to Microsoft's Resource Compiler (rc.exe). It has been part of the MinGW and MinGW-w64 toolchains since the **late 1990s**, enabling Windows application development on Unix-like systems. The tool continues to be maintained as part of the Binutils project.

# SEE ALSO

[gcc](/man/gcc)(1), [ld](/man/ld)(1), [objcopy](/man/objcopy)(1), [objdump](/man/objdump)(1), [dlltool](/man/dlltool)(1)

# RESOURCES

```[Source code](https://sourceware.org/git/binutils-gdb.git)```

```[Homepage](https://sourceware.org/binutils/)```

```[Documentation](https://sourceware.org/binutils/docs/binutils/windres.html)```

<!-- verified: 2026-11-09 -->
