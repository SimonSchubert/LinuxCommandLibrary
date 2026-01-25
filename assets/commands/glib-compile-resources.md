# TLDR

**Compile resources** to a binary bundle

```glib-compile-resources [resources.gresource.xml]```

**Compile with specific output** file

```glib-compile-resources --target=[resources.gresource] [resources.gresource.xml]```

**Generate C source code** instead of binary

```glib-compile-resources --generate-source --target=[resources.c] [resources.gresource.xml]```

**Generate C header file**

```glib-compile-resources --generate-header --target=[resources.h] [resources.gresource.xml]```

**Specify source directory** for resource files

```glib-compile-resources --sourcedir=[path/to/resources] [resources.gresource.xml]```

**Print dependencies** for build systems

```glib-compile-resources --generate-dependencies [resources.gresource.xml]```

**Set C identifier prefix**

```glib-compile-resources --c-name=[myapp] --generate-source [resources.gresource.xml]```

# SYNOPSIS

**glib-compile-resources** [_OPTIONS_] _FILE_

# PARAMETERS

**--target**=_TARGET_
> Output file path. Defaults to basename of input with appropriate extension.

**--sourcedir**=_DIR_
> Directory containing resource files referenced in the XML.

**--generate-source**
> Generate C source file instead of binary bundle.

**--generate-header**
> Generate C header file for use with generated source.

**--generate-dependencies**
> Print list of referenced files to stdout.

**--c-name**=_PREFIX_
> Prefix for C identifiers in generated code.

**--manual-register**
> Generate manual register/unregister functions instead of auto-initialization.

**--internal**
> Generate internal symbols (not exported).

# DESCRIPTION

**glib-compile-resources** compiles application resources (images, UI files, CSS, icons, data) into binary bundles or C source for embedding in GLib/GTK applications. Resources are described in XML files (typically with .gresource.xml extension) that list files to include and optional preprocessing.

The GResource system enables applications to access embedded resources through a virtual filesystem path (e.g., /org/myapp/data.txt) without external file dependencies. This simplifies deployment and improves load times.

Generated C source can be compiled directly into the application binary. Binary .gresource files can be loaded at runtime with g_resource_load().

# CAVEATS

Resource paths in the XML must match actual file locations relative to sourcedir. The xmllint tool may be required for XML preprocessing options. Large resources increase binary size significantly.

# HISTORY

glib-compile-resources was introduced with GLib 2.32 in **March 2012** as part of the GResource API. It replaced ad-hoc methods for embedding resources in GTK applications, providing a standardized approach that integrates with the GNOME build system.

# SEE ALSO

[glib-genmarshal](/man/glib-genmarshal)(1), [glib-mkenums](/man/glib-mkenums)(1), [gtk4-builder-tool](/man/gtk4-builder-tool)(1)
