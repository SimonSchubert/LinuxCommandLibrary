# TLDR

**Compile program**

```valac [file.vala]```

**Output executable**

```valac -o [output] [file.vala]```

**With GTK**

```valac --pkg [gtk4] [file.vala]```

**Generate C code only**

```valac -C [file.vala]```

**Debug build**

```valac -g [file.vala]```

# SYNOPSIS

**valac** [_-o output_] [_--pkg name_] [_-C_] [_options_] _files_

# PARAMETERS

**-o** _FILE_
> Output name.

**--pkg** _NAME_
> Use package.

**-C**
> C code only.

**-g**
> Debug symbols.

**--gir** _FILE_
> Generate GIR.

**--target-glib** _VER_
> GLib version.

# DESCRIPTION

**valac** is the Vala compiler. It compiles to C then native.

Two-step compilation. Vala to C to binary.

Package system. --pkg for dependencies.

GObject integration. Object-oriented.

GNOME development. GTK applications.

# CAVEATS

C compiler needed. GLib required. GNOME-centric.

# HISTORY

**valac** is the official **Vala** compiler, generating C code that compiles with any C compiler.

# SEE ALSO

[vala](/man/vala)(1), [gcc](/man/gcc)(1), [pkg-config](/man/pkg-config)(1)
