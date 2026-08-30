# TAGLINE

Monitor and manage PipeWire metadata

# TLDR

Show the **default metadata object**

```pw-metadata```

**List every** metadata object

```pw-metadata --list```

Show the entries of a **named object**

```pw-metadata --name [settings] [0]```

**Read one property**

```pw-metadata --name [settings] [0] [log.level]```

**Set a property**

```pw-metadata --name [settings] [0] [log.level] [1]```

Change the **default audio sink**

```pw-metadata [0] [default.audio.sink] '{ "name": "[sink_name]" }'```

**Follow changes** as they happen

```pw-metadata --monitor```

**Clear** all metadata

```pw-metadata --delete```

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

**-r**, **--remote** _NAME_
> Name of the remote instance to connect to (default: default PipeWire instance).

**--version**
> Show version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**pw-metadata** monitors, sets, and deletes metadata on PipeWire objects. Metadata provides key-value pairs associated with PipeWire graph objects, used for configuration and runtime state management.

The tool can operate on different metadata namespaces including "default" for general metadata and "settings" for PipeWire configuration values like log levels.

# CAVEATS

Modifying metadata in the "settings" namespace can affect PipeWire behavior immediately. Use caution when deleting metadata as it may reset configuration to defaults.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides runtime inspection and modification of PipeWire's metadata system.

# INSTALL

```apt: sudo apt install pipewire-bin```

```apk: sudo apk add pipewire-tools```

```zypper: sudo zypper install pipewire-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-mon](/man/pw-mon)(1), [pw-cli](/man/pw-cli)(1)
