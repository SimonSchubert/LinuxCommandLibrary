# TLDR

**List all available plugins**

```gst-inspect-1.0```

**Inspect a specific element**

```gst-inspect-1.0 [filesrc]```

**Inspect a plugin**

```gst-inspect-1.0 [coreelements]```

**Print all elements**

```gst-inspect-1.0 -a```

**List elements in a plugin**

```gst-inspect-1.0 --plugin [playback]```

**Show version**

```gst-inspect-1.0 --version```

# SYNOPSIS

**gst-inspect-1.0** [_options_] [_element_|_plugin_]

# PARAMETERS

**-a**, **--print-all**
> Print all elements.

**--plugin** _name_
> List elements from plugin.

**-b**
> Print machine-parseable list.

**--version**
> Show GStreamer version.

**--help**
> Print help and exit.

# DESCRIPTION

**gst-inspect-1.0** queries information about GStreamer plugins and elements. It displays element details, pad information, capabilities, properties with types and defaults, and available signals. Without arguments, it lists all available plugins. With an element or plugin name, it shows detailed information about that component.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-discoverer-1.0](/man/gst-discoverer-1.0)(1)

