# TLDR

**Generate** config.h.in

```autoheader```

Generate from **specific input**

```autoheader [configure.ac]```

Force **regeneration**

```autoheader --force```

# SYNOPSIS

**autoheader** [_-f_] [_-W category_] [_input_]

# DESCRIPTION

**autoheader** creates a template header file (config.h.in) for configure to use. It scans configure.ac for AC_DEFINE macros and generates corresponding #define statements.

This is part of the autotools workflow, typically run before autoconf.

# PARAMETERS

**-f**, **--force**
> Force regeneration even if current

**-W** _category_
> Warning level

**-I** _dir_
> Add include directory

**-v**, **--verbose**
> Verbose output

# WORKFLOW

1. Write configure.ac with AC_DEFINE macros
2. Run **autoheader** to generate config.h.in
3. Run autoconf to generate configure
4. Users run ./configure to generate config.h

# CAVEATS

Part of autotools; typically called by autoreconf. Output is template; actual config.h created by configure. Not needed for all projects.

# HISTORY

**autoheader** is part of GNU Autoconf, developed to manage configuration header files in portable software since the early **1990s**.

# SEE ALSO

[autoconf](/man/autoconf)(1), [autoreconf](/man/autoreconf)(1), [automake](/man/automake)(1)
