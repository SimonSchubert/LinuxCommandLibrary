# TAGLINE

autoconf macro collector for GNU build system

# TLDR

**Generate** aclocal.m4 from configure.ac

```aclocal```

Search for macros in **additional directories**

```aclocal -I [m4/]```

**Print** macro search directories

```aclocal --print-ac-dir```

Generate with **warnings** for obsolete macros

```aclocal --warnings=obsolete```

# SYNOPSIS

**aclocal** [_-I dir_] [_--output=file_] [_--warnings=category_] [_options_]

# DESCRIPTION

**aclocal** is part of the GNU Automake build system. It generates an aclocal.m4 file by scanning configure.ac (or configure.in) for macro invocations and collecting the required macro definitions from installed .m4 files.

The generated aclocal.m4 file contains all the M4 macros needed by autoconf to process configure.ac. This tool is essential for projects using the GNU build system (autotools) as it bridges Automake and Autoconf.

# PARAMETERS

**-I** _dir_
> Add directory to search path for .m4 files

**--output=**_file_
> Write output to specified file instead of aclocal.m4

**--print-ac-dir**
> Print the directory where system .m4 files are stored

**--warnings=**_category_
> Enable warnings: syntax, unsupported, obsolete, all, none, error

**--force**
> Always regenerate output file

**--verbose**
> Print names of files being processed

**--version**
> Print version information

**--help**
> Display help information

# CAVEATS

Must be run before autoconf when building from source. The search order for .m4 files matters; local directories specified with -I are searched before system directories. Changes to configure.ac require re-running aclocal.

# HISTORY

**aclocal** was created as part of GNU Automake by David MacKenzie and Tom Tromey, first released in **1994**. It was designed to simplify the process of gathering M4 macros required for Autoconf-based build systems.

# SEE ALSO

[autoconf](/man/autoconf)(1), [automake](/man/automake)(1), [autoreconf](/man/autoreconf)(1), [libtoolize](/man/libtoolize)(1)
