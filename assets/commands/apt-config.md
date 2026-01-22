# TLDR

**Show** APT configuration

```apt-config dump```

Show **specific option**

```apt-config dump | grep [Dir::Cache]```

Show configuration in **shell format**

```apt-config shell VAR [Dir::Cache]```

# SYNOPSIS

**apt-config** [_-o option_] [_-c config_] _command_

# DESCRIPTION

**apt-config** displays APT's configuration values. It shows the effective configuration from all sources including /etc/apt/apt.conf, /etc/apt/apt.conf.d/, and command-line options.

This is useful for debugging APT behavior, understanding which settings are active, and scripting with APT configuration values.

# PARAMETERS

**dump**
> Show entire configuration

**shell** _var_ _option_
> Output shell-compatible variable assignment

**-o** _option_
> Set configuration option

**-c** _file_
> Read additional configuration file

# CAVEATS

Configuration is hierarchical; lower-level options override higher ones. Command-line options override file settings. Some options require specific APT versions.

# HISTORY

**apt-config** has been part of APT since early versions, providing programmatic access to APT's configuration system.

# SEE ALSO

[apt.conf](/man/apt.conf)(5), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8)
