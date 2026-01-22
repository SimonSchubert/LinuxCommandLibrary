# TLDR

Run **Lua** script

```wpexec [path/to/file.lua]```

Display **help**

```wpexec --help```

# SYNOPSIS

**wpexec** [_OPTIONS_] _SCRIPT_

# PARAMETERS

**--help**
> Display help information

# DESCRIPTION

**wpexec** runs WirePlumber Lua scripts. It provides access to WirePlumber's Lua API for scripting audio routing, device management, and policy customization.

Scripts can interact with PipeWire nodes, links, and sessions through WirePlumber's object model.

# CAVEATS

Requires WirePlumber and PipeWire. Scripts must use WirePlumber's Lua API. Errors in scripts may affect audio functionality.

# SEE ALSO

[wpctl](/man/wpctl)(1), [wireplumber](/man/wireplumber)(1)
