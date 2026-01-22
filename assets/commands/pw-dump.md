# TLDR

Print **JSON representation** of PipeWire's current state

```pw-dump```

Print JSON representation of a **specific object**

```pw-dump [object_id]```

Dump current state **monitoring changes**

```pw-dump -m```

Dump state of **remote instance** to a file

```pw-dump -r [remote_name] > [path/to/dump.json]```

Set **color configuration**

```pw-dump -C [never|always|auto]```

# SYNOPSIS

**pw-dump** [_options_] [_id_]

# PARAMETERS

_id_
> Dump only the specified object ID

**-m**, **--monitor**
> Monitor for changes and dump again on updates

**-r**, **--remote** _name_
> Connect to remote PipeWire instance

**-C**, **--color** _mode_
> Color mode (never, always, auto)

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-dump** outputs PipeWire's current state as JSON, including nodes, devices, modules, ports, links, and other objects. This comprehensive dump is useful for debugging, scripting, and understanding the current audio/video configuration.

The output includes object properties, formats, parameters, and relationships between components. The monitor mode keeps running and outputs changes as they occur.

# CAVEATS

Output can be very large on systems with many devices. Use object ID to filter to specific objects. JSON output is suitable for processing with jq or similar tools.

# HISTORY

Part of **PipeWire**, providing introspection capabilities for the multimedia framework. Complements pw-cli for automated and scripted queries.

# SEE ALSO

[pw-cli](/man/pw-cli)(1), [pw-dot](/man/pw-dot)(1), [pw-mon](/man/pw-mon)(1)
