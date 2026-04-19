# TAGLINE

Windows DLL import library creator

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

**-d**, **--input-def** _FILE_
> Read the named .def file.

**-l**, **--output-lib** _FILE_
> Generate an import library.

**-e**, **--output-exp** _FILE_
> Generate an exports file.

**-z**, **--output-def** _FILE_
> Generate a .def file (from DLL or objects).

**-y**, **--output-delaylib** _FILE_
> Create a delay-import library.

**-m**, **--machine** _MACHINE_
> Target machine type (e.g. i386, x86_64, arm).

**-D**, **--dllname** _NAME_
> Name of input DLL recorded in the library.

**-U**, **--add-underscore**
> Prepend an underscore to all exported symbols.

**-k**, **--kill-at**
> Strip @n suffix from stdcall exported names.

**-A**, **--add-stdcall-alias**
> Add aliases for stdcall symbols without @n.

**--export-all-symbols**
> Export all global and weak symbols.

**-I**, **--identify** _FILE_
> Report DLL name associated with an import library.

**-v**, **--verbose**
> Describe what is being done.

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
