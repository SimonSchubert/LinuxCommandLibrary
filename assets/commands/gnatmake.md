# TAGLINE

Ada program build utility

# TLDR

**Compile an Ada program**

```gnatmake [main.adb]```

**Compile with optimization**

```gnatmake -O2 [main.adb]```

**Compile with debugging info**

```gnatmake -g [main.adb]```

**Compile with parallel jobs**

```gnatmake -j4 [main.adb]```

**Specify output executable name**

```gnatmake [main.adb] -o [program]```

**Force recompilation of all sources**

```gnatmake -f [main.adb]```

# SYNOPSIS

**gnatmake** [_options_] _file_name_ [_options_]

# PARAMETERS

**-jN**
> Use N parallel jobs for compilation.

**-g**
> Generate debugging information.

**-O**_level_
> Optimization level (0, 1, 2, 3, or s for size).

**-o** _name_
> Output executable name.

**-c**
> Compile only, do not bind or link.

**-f**
> Force recompilation of all sources.

**-q**
> Quiet mode, less output.

**-v**
> Verbose mode.

**-I**_dir_
> Add directory to source search path.

**--RTS=**_runtime_
> Specify Ada runtime library.

# DESCRIPTION

**gnatmake** is the primary build utility for Ada programs in the GNAT (GNU Ada Toolset) environment. It automatically determines dependencies by analyzing Ada's with clauses, compiles modified source files, and performs binding and linking to create an executable. Unlike traditional make utilities, **gnatmake** always recomputes dependencies from sources, ensuring accurate tracking of changes.

# CAVEATS

Multiple main files can be specified to build several executables. Dependencies are computed from Ada source files rather than object file timestamps.

# SEE ALSO

[gcc](/man/gcc)(1), [gnatbind](/man/gnatbind)(1), [gnatlink](/man/gnatlink)(1)
