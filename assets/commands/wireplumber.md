# TAGLINE

Session and policy manager for PipeWire

# TLDR

**Enable** with systemd

```systemctl --user --now enable wireplumber```

**Run** manually

```wireplumber```

Use custom **config** file

```wireplumber --config-file [path/to/file]```

Display **help**

```wireplumber --help```

Display **version**

```wireplumber --version```

# SYNOPSIS

**wireplumber** [_OPTIONS_]

# PARAMETERS

**-c**, **--config-file** _FILE_
> Use the specified main configuration file instead of `wireplumber.conf`.

**-n**, **--name** _NAME_
> Use a custom daemon name (useful for running multiple instances).

**-d**, **--debug** _LEVEL_
> Set log level (e.g. `D` for debug, `I` for info, `W` for warnings, `E` for errors) or a GLib-style domain:level spec.

**-v**, **--verbose**
> Increase log verbosity (equivalent to `--debug=D`).

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**wireplumber** is a modular session/policy manager for PipeWire. It handles device routing, audio policy decisions, and session management for the PipeWire multimedia framework.

The tool provides a GObject-based high-level library that wraps PipeWire's API for easier integration.

# CAVEATS

Requires PipeWire to be running. Usually managed by systemd on modern systems. Configuration is Lua-based.

# SEE ALSO

[wpctl](/man/wpctl)(1), [pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1)
