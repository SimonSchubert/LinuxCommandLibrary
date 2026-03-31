# TAGLINE

Compile and run Vala source code directly

# TLDR

**Run a Vala program** directly

```vala [file.vala]```

**Run with a package** dependency

```vala --pkg [gtk4] [file.vala]```

**Run with multiple** source files

```vala --pkg [gio-2.0] [file1.vala] [file2.vala]```

**Pass arguments** to the program

```vala [file.vala] -- [arg1] [arg2]```

# SYNOPSIS

**vala** [_--pkg name_] [_options_] _files_ [-- _args_]

# PARAMETERS

**--pkg** _NAME_
> Include package (resolved via pkg-config).

**--vapidir** _DIR_
> Look for VAPI files in the given directory.

**--girdir** _DIR_
> Look for GIR files in the given directory.

**--version**
> Display version number.

# DESCRIPTION

**vala** compiles and immediately runs Vala source code without producing persistent output files. It is equivalent to running **valac --run** and is useful for scripting and quick testing. For producing compiled binaries or C source files, use **valac** instead.

Vala provides a modern, C#-like syntax with features such as type inference, lambda expressions, and signals while compiling down to plain C code that uses the GObject type system. The **--pkg** flag links against system libraries discovered through pkg-config.

# CAVEATS

GNOME ecosystem. Generates C. Requires GLib.

# HISTORY

**Vala** was created by **Jürg Billeter** for GNOME development, compiling to C with GObject support.

# SEE ALSO

[valac](/man/valac)(1), [gcc](/man/gcc)(1), [pkg-config](/man/pkg-config)(1), [meson](/man/meson)(1)
