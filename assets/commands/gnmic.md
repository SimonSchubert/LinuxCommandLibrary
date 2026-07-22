# TAGLINE

gNMI network management CLI client

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

**gnmic** [_global-flags_] _command_ [_command-flags_]

# PARAMETERS

**capabilities**
> Query target gNMI capabilities.

**get**
> Get configuration/state.

**set**
> Set configuration.

**subscribe**
> Subscribe to telemetry.

**path**
> Generate or search YANG paths from loaded models.

**prompt**
> Interactive mode with path autocompletion.

**diff**
> Compare gNMI GetResponses or config states.

**version**
> Show gnmic version.

**-a**, **--address** _TARGET_
> Comma-separated address(es) of the target(s), host:port.

**-u**, **--username** _USER_
> Username for authentication.

**-p**, **--password** _PASS_
> Password for authentication.

**--path** _PATH_
> YANG/gNMI path.

**-e**, **--encoding** _ENCODING_
> Data encoding: json, json_ietf, bytes, proto, ascii, or config.

**--insecure**
> Disable TLS on the connection to the target.

**--skip-verify**
> Skip verification of the target's TLS certificate.

**--tls-ca** _FILE_
> TLS CA certificate file.

**--tls-cert** _FILE_
> TLS client certificate file.

**--tls-key** _FILE_
> TLS client key file.

**--timeout** _DURATION_
> gRPC timeout after which a request is cancelled (default 10s).

**--config** _FILE_
> Configuration file (default searches for .gnmic.yaml).

**--log**
> Enable logging to stderr.

**--help**
> Display help information.

# DESCRIPTION

**gnmic** is a gNMI (gRPC Network Management Interface) CLI client. It interacts with network devices supporting gNMI for configuration retrieval, modification, and streaming telemetry.

The tool supports get, set, subscribe, and capability operations. It is used for network automation and monitoring with modern network operating systems.

# CONFIGURATION

**~/.gnmic.yaml**
> Global configuration file for targets, credentials, and default settings.

**.gnmic.yaml**
> Per-directory configuration file for project-specific settings.

# CAVEATS

Target must support gNMI. Authentication may be required. YANG model knowledge helpful.

# HISTORY

gnmic was created by **Nokia** to provide a flexible gNMI client for network automation and telemetry collection.

# INSTALL

```brew: brew install gnmic```

```nix: nix profile install nixpkgs#gnmic```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gnmic-get](/man/gnmic-get)(1), [gnmic-set](/man/gnmic-set)(1), [gnmic-subscribe](/man/gnmic-subscribe)(1)

# RESOURCES

```[Source code](https://github.com/openconfig/gnmic)```

```[Documentation](https://gnmic.openconfig.net/)```

<!-- verified: 2026-07-17 -->
