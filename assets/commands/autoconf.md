# TLDR

**Generate** configure script

```autoconf```

Generate with **specific template**

```autoconf -o [configure] [configure.ac]```

Generate from **configure.in** (old)

```autoconf configure.in > configure```

Show **version**

```autoconf --version```

# SYNOPSIS

**autoconf** [_-o output_] [_input_]

# DESCRIPTION

**autoconf** generates configure scripts from templates (configure.ac or configure.in). These scripts probe the system for available features, libraries, and tools, producing Makefiles tailored to the build environment.

Autoconf is part of the GNU Build System (autotools), used by thousands of open source projects.

# PARAMETERS

**-o** _file_
> Output file (default: configure)

**-W** _category_
> Warning category

**-I** _dir_
> Add directory to search path

**-f**, **--force**
> Force regeneration

**-v**, **--verbose**
> Verbose output

**--trace=**_macro_
> Trace macro calls

# WORKFLOW

1. Write configure.ac
2. Run **autoconf** to generate configure
3. Distribute configure with source
4. Users run ./configure to generate Makefile

# CAVEATS

Requires M4 macro processor. Complex syntax based on M4. Generated configure scripts are large. Learning curve is steep.

# HISTORY

**Autoconf** was created by David MacKenzie in **1991** to address the portability problems of Unix software. It became the standard build system for GNU and many other projects.

# SEE ALSO

[automake](/man/automake)(1), [autoreconf](/man/autoreconf)(1), [configure](/man/configure)(1)
