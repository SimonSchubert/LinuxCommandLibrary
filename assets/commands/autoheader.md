# TAGLINE

Generate template header files for configure

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

**-W** _category_, **--warnings=**_category_
> Report warnings for the given category (e.g. all, none, error, obsolete).

**-I** _dir_, **--include=**_dir_
> Append dir to the include search path. Accumulates over multiple uses.

**-B** _dir_, **--prepend-include=**_dir_
> Prepend dir to the include search path.

**-v**, **--verbose**
> Report processing steps.

**-d**, **--debug**
> Do not remove the temporary files.

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

# RESOURCES

```[Homepage](https://www.gnu.org/software/autoconf/)```

```[Documentation](https://www.gnu.org/software/autoconf/manual/)```

<!-- verified: 2026-06-17 -->

