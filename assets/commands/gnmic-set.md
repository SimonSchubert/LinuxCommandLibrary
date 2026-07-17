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

**Combine path, type, and value in one flag**

```gnmic set -a [router:57400] --update [/system/name:::string:::router1]```

**Preview a set without sending it**

```gnmic set -a [router:57400] --update-path [/system/name] --update-value "[router1]" --dry-run```

# SYNOPSIS

**gnmic set** [_options_]

# PARAMETERS

**-a**, **--address** _ADDRESS_
> Target address(es), as a global gnmic flag.

**--prefix** _PATH_
> Common prefix applied to all paths in the request.

**--update-path** _PATH_
> Path to update; pairs with **--update-value** or **--update-file**.

**--update-value** _VALUE_
> Value to set at **--update-path**.

**--update-file** _FILE_
> Read the update value from a JSON or YAML file.

**--update** _PATH:::TYPE:::VALUE_
> Define a full update in one flag, using the `:::` delimiter (customizable via **--delimiter**).

**--replace-path** _PATH_
> Path to replace; pairs with **--replace-value** or **--replace-file**.

**--replace-value** _VALUE_
> Value to set at **--replace-path**.

**--replace-file** _FILE_
> Read the replace value from a JSON or YAML file.

**--replace** _PATH:::TYPE:::VALUE_
> Define a full replace in one flag, using the `:::` delimiter.

**--delete** _PATH_
> Path to delete.

**--dry-run**
> Build and print the SetRequest without sending it to the target.

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

[gnmic](/man/gnmic)(1), [gnmic-get](/man/gnmic-get)(1), [gnmic-subscribe](/man/gnmic-subscribe)(1)

# RESOURCES

```[Documentation](https://gnmic.openconfig.net/cmd/set/)```

```[Source code](https://github.com/openconfig/gnmic)```

<!-- verified: 2026-07-17 -->
