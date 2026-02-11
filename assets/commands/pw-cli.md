# TAGLINE

Manage PipeWire objects from command line

# TLDR

**List** objects by type

```pw-cli ls [Node|Link|Port|Device]```

Show **info** for specific object

```pw-cli info [4]```

Show **all** objects info

```pw-cli info all```

**Monitor** for changes

```pw-cli -m```

Display **help**

```pw-cli help```

# SYNOPSIS

**pw-cli** [**-m**|**--monitor**] [_command_] [_args_...]

# COMMANDS

**ls, list-objects _type_**
> List objects of specified type

**i, info _id_|_all_**
> Display info for object or all

**create-node _factory_ _props_**
> Create a new node

**destroy _id_**
> Destroy an object

**enum-params _id_ _param_**
> Enumerate object parameters

**set-param _id_ _param_ _value_**
> Set object parameter

# PARAMETERS

**-m, --monitor**
> Monitor for object changes

**-r, --remote _name_**
> Connect to remote PipeWire instance

**-h, --help**
> Display help information

# DESCRIPTION

**pw-cli** is the command-line interface for managing PipeWire. It can list, inspect, create, and destroy PipeWire objects including nodes, links, ports, and devices.

The tool provides low-level access to PipeWire's object model, useful for debugging, scripting, and understanding the audio graph.

# CAVEATS

Requires running PipeWire daemon. Object IDs may change between sessions. For simpler management use wpctl. Some operations require understanding PipeWire internals.

# HISTORY

**pw-cli** is part of **PipeWire**, the modern multimedia framework for Linux. It provides administrative capabilities similar to pactl for PulseAudio.

# SEE ALSO

[pw-top](/man/pw-top)(1), [pw-dump](/man/pw-dump)(1), [wpctl](/man/wpctl)(1), [pipewire](/man/pipewire)(1)
