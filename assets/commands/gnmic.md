# TLDR

**Get configuration**

```gnmic -a [router:57400] get --path [/interfaces]```

**Set value**

```gnmic -a [router:57400] set --update-path [/interface/name] --update-value "[eth0]"```

**Subscribe to telemetry**

```gnmic -a [router:57400] subscribe --path [/interfaces/interface/statistics]```

**List capabilities**

```gnmic -a [router:57400] capabilities```

# SYNOPSIS

**gnmic** [_options_] _command_

# PARAMETERS

**-a** _ADDRESS_
> Target address:port.

**get**
> Get configuration/state.

**set**
> Set configuration.

**subscribe**
> Subscribe to telemetry.

**capabilities**
> Query capabilities.

**--path** _PATH_
> YANG path.

**--help**
> Display help information.

# DESCRIPTION

**gnmic** is a gNMI (gRPC Network Management Interface) CLI client. It interacts with network devices supporting gNMI for configuration and telemetry.

The tool supports get, set, subscribe, and capability operations. It's used for network automation and monitoring with modern network operating systems.

gnmic provides command-line gNMI network management.

# CAVEATS

Target must support gNMI. Authentication may be required. YANG model knowledge helpful.

# HISTORY

gnmic was created by **Nokia** to provide a flexible gNMI client for network automation and telemetry collection.

# SEE ALSO

[gnmic-get](/man/gnmic-get)(1), [gnmic-set](/man/gnmic-set)(1)
