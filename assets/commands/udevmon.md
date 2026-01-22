# TLDR

Start with **config** file

```udevmon -c [path/to/config.yaml]```

# SYNOPSIS

**udevmon** [_OPTIONS_]

# PARAMETERS

**-c** _FILE_
> Use specified configuration file

# DESCRIPTION

**udevmon** intercepts and monitors input devices for launching tasks. It filters or modifies input events according to configuration files, typically located in /etc/interception/udevmon.d/*.yaml.

This tool is part of the Interception Tools suite, enabling advanced keyboard and mouse event processing like key remapping at a low level.

# CAVEATS

Requires root privileges. Configuration files must be valid YAML. Part of the Interception Tools project. Running incorrectly can disrupt input devices.

# SEE ALSO

[uinput](/man/uinput)(1)
