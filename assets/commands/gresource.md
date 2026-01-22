# TLDR

**List resources in file**

```gresource list [file.gresource]```

**Extract resource**

```gresource extract [file.gresource] [/path/to/resource]```

**Show resource sections**

```gresource sections [file.gresource]```

**Get resource details**

```gresource details [file.gresource] [/path/to/resource]```

# SYNOPSIS

**gresource** _command_ [_options_] _file_ [_path_]

# PARAMETERS

_COMMAND_
> Operation to perform (list, extract, sections, details).

_FILE_
> GResource file or ELF binary with embedded resources.

_PATH_
> Resource path within the bundle.

**--section** _NAME_
> Specify resource section.

**--help**
> Display help information.

# DESCRIPTION

**gresource** inspects and extracts resources from GResource bundles. GResource is GNOME's resource bundling system that embeds files like icons, UI definitions, and data into executables.

The tool can list all resources, extract individual files, and show detailed information. It works with both standalone .gresource files and ELF binaries with embedded resources.

gresource manages GNOME application resources.

# CAVEATS

Specific to GNOME/GLib applications. Resource paths are case-sensitive. Part of glib package.

# HISTORY

gresource was developed as part of **GLib** by the **GNOME** project to provide resource inspection and extraction capabilities.

# SEE ALSO

[glib-compile-resources](/man/glib-compile-resources)(1), [gtk-builder](/man/gtk-builder)(1)
