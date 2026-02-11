# TAGLINE

Compile Vala source to C or binaries

# TLDR

**Compile to C**

```vala [file.vala]```

**Compile and link**

```vala -o [output] [file.vala]```

**With package**

```vala --pkg [gtk4] [file.vala]```

**Generate header**

```vala -H [header.h] -C [file.vala]```

# SYNOPSIS

**vala** [_-o output_] [_--pkg name_] [_options_] _files_

# PARAMETERS

**-o** _FILE_
> Output executable.

**--pkg** _NAME_
> Include package.

**-C**
> Generate C only.

**-H** _FILE_
> Generate header.

**-d** _DIR_
> Output directory.

# DESCRIPTION

**vala** compiles Vala source code into C and optionally into native executables. Vala provides a modern, C#-like syntax with features such as type inference, lambda expressions, and signals while compiling down to plain C code that uses the GObject type system.

The compiler generates C source files that can be compiled with any standard C compiler. This approach gives Vala programs native performance with no runtime overhead while allowing seamless interoperability with existing C libraries. The **--pkg** flag links against system libraries discovered through pkg-config.

# CAVEATS

GNOME ecosystem. Generates C. Requires GLib.

# HISTORY

**Vala** was created by **Jürg Billeter** for GNOME development, compiling to C with GObject support.

# SEE ALSO

[valac](/man/valac)(1), [gcc](/man/gcc)(1), [glib](/man/glib)(1)
