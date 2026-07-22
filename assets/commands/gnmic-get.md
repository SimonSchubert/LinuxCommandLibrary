# TAGLINE

retrieve configuration or state from gNMI devices

# TLDR

**Get interface config**

```gnmic get -a [router:57400] --path [/interfaces]```

**Get with encoding**

```gnmic get -a [router:57400] --path [/system] --encoding json```

**Get multiple paths**

```gnmic get -a [router:57400] --path [/interfaces] --path [/system]```

**Get with type**

```gnmic get -a [router:57400] --path [/interfaces] --type config```

**Print only the values, not full paths**

```gnmic get -a [router:57400] --path [/system/name] --values-only```

**Apply a common prefix to all paths**

```gnmic get -a [router:57400] --prefix [/interfaces] --path [interface[name=eth0]]```

# SYNOPSIS

**gnmic get** [_options_]

# PARAMETERS

**-a**, **--address** _ADDRESS_
> Target address(es), as a global gnmic flag.

**--path** _PATH_
> YANG path to retrieve. Repeatable for multiple paths.

**--prefix** _PATH_
> Common prefix applied to all **--path** values.

**--encoding** _ENC_
> Data encoding (json, json_ietf, proto, bytes, ascii).

**--type** _TYPE_
> Data type to request: ALL, CONFIG, STATE, or OPERATIONAL. Defaults to ALL.

**--model** _NAME_
> YANG model name to include in the request.

**--target** _NAME_
> Target name to set in the gNMI prefix, for gateway/proxy setups.

**--values-only**
> Print only the returned values, omitting the full path structure.

**--depth** _N_
> gNMI extension depth value, limiting how deep results are returned.

**--help**
> Display help information.

# DESCRIPTION

**gnmic get** retrieves configuration or state data from gNMI-enabled devices. It fetches data at specified YANG paths and returns it in the requested encoding.

The command supports multiple paths, various encodings, and data type filtering. It is used for configuration retrieval and state inspection in network automation workflows.

# CAVEATS

Path must be valid YANG path. Device must support requested encoding. Large datasets may timeout.

# HISTORY

gnmic get is a subcommand of **gnmic**, the gNMI client created by Nokia.

# INSTALL

```brew: brew install gnmic```

```nix: nix profile install nixpkgs#gnmic```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-set](/man/gnmic-set)(1), [gnmic-subscribe](/man/gnmic-subscribe)(1)

# RESOURCES

```[Documentation](https://gnmic.openconfig.net/cmd/get/)```

```[Source code](https://github.com/openconfig/gnmic)```

<!-- verified: 2026-07-17 -->
