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

**vala** compiles Vala language. It generates C code.

GNOME-oriented. GObject-based.

C code generation. Then compiles with gcc.

Modern syntax. C# like.

Library binding. Use C libraries.

# CAVEATS

GNOME ecosystem. Generates C. Requires GLib.

# HISTORY

**Vala** was created by **Jürg Billeter** for GNOME development, compiling to C with GObject support.

# SEE ALSO

[valac](/man/valac)(1), [gcc](/man/gcc)(1), [glib](/man/glib)(1)
