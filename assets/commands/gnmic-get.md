# TLDR

**Get interface config**

```gnmic get -a [router:57400] --path [/interfaces]```

**Get with encoding**

```gnmic get -a [router:57400] --path [/system] --encoding json```

**Get multiple paths**

```gnmic get -a [router:57400] --path [/interfaces] --path [/system]```

**Get with type**

```gnmic get -a [router:57400] --path [/interfaces] --type config```

# SYNOPSIS

**gnmic get** [_options_]

# PARAMETERS

**-a** _ADDRESS_
> Target address.

**--path** _PATH_
> YANG path to retrieve.

**--encoding** _ENC_
> Data encoding (json, proto).

**--type** _TYPE_
> Data type (config, state, all).

**--help**
> Display help information.

# DESCRIPTION

**gnmic get** retrieves configuration or state data from gNMI-enabled devices. It fetches data at specified YANG paths and returns it in the requested encoding.

The command supports multiple paths, various encodings, and data type filtering. It's used for configuration retrieval and state inspection.

gnmic get reads data from network devices via gNMI.

# CAVEATS

Path must be valid YANG path. Device must support requested encoding. Large datasets may timeout.

# HISTORY

gnmic get is a subcommand of **gnmic**, the gNMI client created by Nokia.

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-set](/man/gnmic-set)(1)
