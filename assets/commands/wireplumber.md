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

**--config-file** _FILE_
> Use specified configuration file

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**wireplumber** is a modular session/policy manager for PipeWire. It handles device routing, audio policy decisions, and session management for the PipeWire multimedia framework.

The tool provides a GObject-based high-level library that wraps PipeWire's API for easier integration.

# CAVEATS

Requires PipeWire to be running. Usually managed by systemd on modern systems. Configuration is Lua-based.

# SEE ALSO

[wpctl](/man/wpctl)(1), [pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1)
