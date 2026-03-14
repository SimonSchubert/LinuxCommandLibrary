# TAGLINE

Run apps in isolated PipeWire security contexts

# TLDR

Create a **new security context** and print its socket address

```pw-container```

Run a program within a **new security context**

```pw-container [command] [arg1] [arg2]```

Run connecting to a **specific remote** PipeWire instance

```pw-container -r [remote_name] [command]```

Run with specific **security properties** using JSON

```pw-container -P '{"pipewire.sec.app-id": "[my-app]"}' [command]```

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

**pw-container** creates a new security context using the PipeWire SecurityContext extension API. It sets up a temporary Unix socket as a server with the given properties, and clients created from this socket have the security properties attached to them.

If a command is specified, it is executed within the new security context. If no command is given, the socket address is printed to standard output. The process does not exit until terminated with a signal (exits 0 on SIGINT/SIGTERM).

This is useful for sandboxing applications or running programs with restricted PipeWire access.

# CAVEATS

Security contexts must be supported by the PipeWire configuration. Properties must be valid JSON format. The process stays running until signaled.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides application isolation capabilities for audio and video access control.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [pw-cat](/man/pw-cat)(1), [wpctl](/man/wpctl)(1)
