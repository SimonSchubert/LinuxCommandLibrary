# TLDR

**Create import library** from def file

```dlltool -d [library.def] -l [library.a]```

**Create def file** from DLL

```dlltool -z [output.def] [library.dll]```

**Create DLL from** def and objects

```dlltool -d [library.def] -e [exports.o] [objects.o]```

**Specify machine type**

```dlltool -m [i386] -d [library.def] -l [library.a]```

**Create both import** lib and exports

```dlltool -d [library.def] -l [library.a] -e [exports.o]```

# SYNOPSIS

**dlltool** [_options_] [_file_...]

# PARAMETERS

**-d** _FILE_
> Input def file.

**-l** _FILE_
> Generate import library.

**-e** _FILE_
> Generate exports file.

**-z** _FILE_
> Generate def file from DLL.

**-m** _MACHINE_
> Target machine type (i386, x86_64).

**-D** _NAME_
> Name of input DLL.

**-k**
> Kill @n from exported names.

**--help**
> Display help information.

# DESCRIPTION

**dlltool** is a GNU binutils tool for creating files needed to build and use Dynamic Link Libraries (DLLs) on Windows. It processes module definition (.def) files and creates import libraries and exports files.

Import libraries allow linking against DLLs at compile time. The tool generates the necessary stubs that resolve at runtime. Export files define symbols that a DLL makes available to other programs.

dlltool is essential for cross-compiling Windows software on Unix systems and for creating DLLs with MinGW and similar toolchains.

# CAVEATS

Windows-specific tool. Def file syntax must be correct. Machine type must match target architecture. Import library format may vary between toolchains.

# HISTORY

dlltool is part of **GNU binutils**, developed for supporting Windows DLL creation in cross-compilation environments. It enables building Windows software using GNU toolchains like MinGW.

# SEE ALSO

[ld](/man/ld)(1), [nm](/man/nm)(1), [objdump](/man/objdump)(1), [windres](/man/windres)(1)
