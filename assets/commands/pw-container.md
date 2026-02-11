# TAGLINE

Run apps in isolated PipeWire security contexts

# TLDR

Create a **new security context** and print its socket address

```pw-container```

Run a program within a **new security context**

```pw-container command arg1 arg2```

Run connecting to a **specific remote** PipeWire instance

```pw-container -r remote_instance command```

Run with specific **properties** using JSON

```pw-container -P '{"key": "value"}' command```

Display **help**

```pw-container -h```

# SYNOPSIS

**pw-container** [_options_] [_command_] [_arguments_...]

# PARAMETERS

**-r**, **--remote** _name_
> Connect to specific remote PipeWire instance

**-P**, **--properties** _json_
> Set context properties using JSON object

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-container** runs a program in a new security context within PipeWire. It creates isolated environments for applications to access PipeWire with specific permissions and properties.

This is useful for sandboxing applications or running programs with restricted PipeWire access.

# CAVEATS

Security contexts must be supported by the PipeWire configuration. Properties must be valid JSON format.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides application isolation capabilities for audio and video access control.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1)
