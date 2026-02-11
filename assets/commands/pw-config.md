# TAGLINE

Inspect PipeWire configuration files and sections

# TLDR

List all **configuration files** that will be used

```pw-config```

List configuration files for **PipeWire PulseAudio** server

```pw-config -n pipewire-pulse.conf```

List all configuration **sections** used by PipeWire PulseAudio

```pw-config -n pipewire-pulse.conf list```

List the **context.properties fragments** used by JACK clients

```pw-config -n jack.conf list context.properties```

List the **merged context.properties** used by JACK clients

```pw-config -n jack.conf merge context.properties```

List the merged **context.modules** and reformat

```pw-config -n pipewire.conf -r merge context.modules```

# SYNOPSIS

**pw-config** [_options_] [_command_] [_section_]

# PARAMETERS

**-n**, **--name** _config_
> Specify configuration file name

**-r**, **--recurse**
> Reformat/recurse into nested structures

**list** [_section_]
> List configuration fragments

**merge** [_section_]
> Show merged configuration

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-config** displays configuration paths and sections used by PipeWire server and clients. It helps understand how PipeWire's split configuration files are combined, showing which files contribute to specific settings.

The tool can inspect different configuration contexts (pipewire.conf, pipewire-pulse.conf, jack.conf) and display both individual fragments and merged results.

# CAVEATS

Configuration files are searched in multiple locations (/etc/pipewire, ~/.config/pipewire, etc.) and merged by priority. Understanding the merge order is important for troubleshooting configuration issues.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Added to help administrators and users understand PipeWire's flexible configuration system.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [wpctl](/man/wpctl)(1)
