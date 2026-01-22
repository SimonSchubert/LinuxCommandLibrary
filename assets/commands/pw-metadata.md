# TLDR

Show metadata in **default** name

```pw-metadata```

Show metadata with **ID 0** in settings

```pw-metadata -n settings 0```

List all **available metadata** objects

```pw-metadata -l```

Keep running and **log changes** to metadata

```pw-metadata -m```

**Delete** all metadata

```pw-metadata -d```

**Set** log.level to 1 in settings

```pw-metadata -n settings 0 log.level 1```

# SYNOPSIS

**pw-metadata** [_options_] [_id_] [_key_] [_value_] [_type_]

# PARAMETERS

**-n**, **--name** _name_
> Metadata name to operate on (default: "default")

**-l**, **--list**
> List all available metadata objects

**-m**, **--monitor**
> Monitor metadata changes continuously

**-d**, **--delete**
> Delete metadata entries

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-metadata** monitors, sets, and deletes metadata on PipeWire objects. Metadata provides key-value pairs associated with PipeWire graph objects, used for configuration and runtime state management.

The tool can operate on different metadata namespaces including "default" for general metadata and "settings" for PipeWire configuration values like log levels.

# CAVEATS

Modifying metadata in the "settings" namespace can affect PipeWire behavior immediately. Use caution when deleting metadata as it may reset configuration to defaults.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides runtime inspection and modification of PipeWire's metadata system.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-mon](/man/pw-mon)(1), [pw-cli](/man/pw-cli)(1)
