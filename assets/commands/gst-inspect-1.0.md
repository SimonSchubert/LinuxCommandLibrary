# TAGLINE

GStreamer plugin and element inspector

# TLDR

**List all available plugins and elements**

```gst-inspect-1.0```

**Inspect a specific element**

```gst-inspect-1.0 [filesrc]```

**Inspect a plugin by name**

```gst-inspect-1.0 [coreelements]```

**Print details of all elements**

```gst-inspect-1.0 -a```

**Print machine-parseable feature info for a plugin**

```gst-inspect-1.0 --print-plugin-auto-install-info [playback]```

**Show GStreamer version**

```gst-inspect-1.0 --version```

**Search for elements by name or description**

```gst-inspect-1.0 | grep [audio]```

# SYNOPSIS

**gst-inspect-1.0** [_options_] [_element_|_plugin_]

# PARAMETERS

**-a**, **--print-all**
> Print information about all available elements.

**--print-plugin-auto-install-info**
> Print a machine-parseable list of features the specified plugin or element provides. Useful for package managers and auto-installers.

**-b**, **--print-blacklist**
> Print a list of blacklisted (failed to load) plugins.

**--plugin**
> List features of a plugin. The argument is treated as a plugin name rather than an element.

**--types** _types_
> Filter elements by type when used with `--print-all` (e.g., Audio/Sink).

**--exists** _element_
> Check if the specified element exists. Returns exit code 0 if found, 1 if not.

**--atleast-version** _version_
> When used with `--exists`, also check that the element is at least the specified version.

**--uri-handlers**
> Print all available URI handlers.

**--gst-plugin-path=**_PATH_
> Add directories to the plugin search path (separated by colons).

**--version**
> Show GStreamer version information.

**--help**
> Print help and exit.

# DESCRIPTION

**gst-inspect-1.0** queries information about GStreamer plugins and elements. It displays element details including pad information, capabilities, properties with types and defaults, and available signals.

Without arguments, it lists all available plugins and their elements with summaries. With an element or plugin name, it shows detailed information about that component, including the element's factory details, pads, properties, and signals.

This is an essential tool for GStreamer pipeline development, allowing developers to discover available elements, understand their capabilities, and check property types before constructing pipelines with **gst-launch-1.0**.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-discoverer-1.0](/man/gst-discoverer-1.0)(1), [gst-play-1.0](/man/gst-play-1.0)(1), [gst-typefind-1.0](/man/gst-typefind-1.0)(1)
