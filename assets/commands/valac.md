# TAGLINE

Vala programming language compiler

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

**valac** is the official compiler for the Vala programming language. It performs a two-step compilation process, first translating Vala source code into C, then invoking a C compiler to produce native binaries. This design provides native performance while offering a high-level, object-oriented syntax.

The compiler integrates with the GObject type system and uses pkg-config for dependency management via the **--pkg** flag. It is commonly used for GNOME and GTK application development, and can also generate GObject Introspection data for language bindings and C header files for library interoperability.

# CAVEATS

C compiler needed. GLib required. GNOME-centric.

# HISTORY

**valac** is the official **Vala** compiler, generating C code that compiles with any C compiler.

# SEE ALSO

[vala](/man/vala)(1), [gcc](/man/gcc)(1), [pkg-config](/man/pkg-config)(1)
