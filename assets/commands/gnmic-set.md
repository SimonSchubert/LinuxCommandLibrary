# TAGLINE

modify configuration on gNMI devices

# TLDR

**Set configuration value**

```gnmic set -a [router:57400] --update-path [/system/name] --update-value "[router1]"```

**Delete configuration**

```gnmic set -a [router:57400] --delete [/interfaces/interface[name=eth1]]```

**Set from file**

```gnmic set -a [router:57400] --update-path [/] --update-file [config.json]```

**Replace configuration**

```gnmic set -a [router:57400] --replace-path [/interfaces] --replace-file [interfaces.json]```

# SYNOPSIS

**gnmic set** [_options_]

# PARAMETERS

**-a** _ADDRESS_
> Target address.

**--update-path** _PATH_
> Path to update.

**--update-value** _VALUE_
> Value to set.

**--update-file** _FILE_
> Value from file.

**--delete** _PATH_
> Path to delete.

**--replace-path** _PATH_
> Path to replace.

**--help**
> Display help information.

# DESCRIPTION

**gnmic set** modifies configuration on gNMI-enabled devices. It supports update (merge), replace, and delete operations on configuration data.

The command can set individual values or apply entire configuration files. It is used for network automation and configuration management via the gNMI protocol.

# CAVEATS

Changes may require commit on some devices. Invalid config may be rejected. Test in lab first.

# HISTORY

gnmic set is a subcommand of **gnmic**, the gNMI client created by Nokia.

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-get](/man/gnmic-get)(1)
