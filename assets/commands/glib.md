# TAGLINE

general-purpose C utility library for GTK and GNOME

# TLDR

**Compile with GLib**

```gcc [program.c] $(pkg-config --cflags --libs glib-2.0) -o [program]```

**Get GLib version**

```pkg-config --modversion glib-2.0```

**Generate enum types**

```glib-mkenums --template [enum.h.template] [header.h] > [enum-types.h]```

**Compile GLib resources**

```glib-compile-resources [resources.gresource.xml] --target=[resources.c]```

# DESCRIPTION

**GLib** is a general-purpose utility library used by GTK and GNOME. It provides data structures, portability wrappers, event loops, threads, and many utilities for C programming.

GLib is not a command but a library. Related tools include glib-compile-resources, glib-mkenums, and glib-genmarshal.

# KEY FEATURES

- **GList/GSList**: Linked lists
- **GHashTable**: Hash tables
- **GString**: Dynamic strings
- **GMainLoop**: Event loop
- **GThread**: Threading
- **GObject**: Object system
- **GSettings**: Configuration storage

# RELATED TOOLS

```
glib-compile-resources  Compile resources
glib-compile-schemas    Compile GSettings schemas
glib-mkenums           Generate enum types
glib-genmarshal        Generate marshallers
gdbus                  D-Bus tool
gsettings              GSettings CLI
```

# PARAMETERS

**glib-mkenums --template** _file_
> Text template controlling the generated enum descriptions.

**glib-genmarshal --header** / **--body**
> Generate the marshaller header or C source respectively.

**glib-compile-resources --target** _file_
> Output file for the compiled resource bundle (C source or binary `.gresource`).

**glib-compile-resources --generate-source** / **--generate-header**
> Generate only the C source or only the header, instead of both.

**glib-compile-resources --sourcedir** _dir_
> Directory to search for referenced resource files.

# CAVEATS

C library, not a command. Requires understanding of C and GLib conventions. Memory management follows GLib patterns. Documentation at docs.gtk.org.

# HISTORY

GLib was originally part of **GTK+**, extracted as a separate library in **1998** to enable non-GUI programs to use its utilities. It's maintained by the GNOME project and used throughout the Linux desktop ecosystem.

# INSTALL

```dnf: sudo dnf install glib```

```brew: brew install glib```

```nix: nix profile install nixpkgs#glib```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pkg-config](/man/pkg-config)(1), [gdbus](/man/gdbus)(1), [gsettings](/man/gsettings)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/glib)```

```[Documentation](https://docs.gtk.org/glib/)```

<!-- verified: 2026-07-17 -->
