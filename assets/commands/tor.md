# TLDR

Start **Tor** client

```tor```

Use specific **configuration file**

```tor -f /etc/tor/torrc```

**Verify** configuration syntax

```tor --verify-config```

Generate **hashed password** for control port

```tor --hash-password mypassword```

Display **version** information

```tor --version```

# SYNOPSIS

**tor** [_OPTION_ _value_]...

# DESCRIPTION

**tor** is a connection-oriented anonymizing communication service. Users establish source-routed paths through a distributed network of relays where each node only knows its neighboring nodes, not the full path. This enables anonymous TCP stream routing for web browsing, FTP, SSH, and other services.

# PARAMETERS

**-h, --help**
> Display help message and exit

**-f, --torrc-file FILE**
> Specify configuration file location

**--verify-config**
> Verify configuration file syntax and exit

**--hash-password PASSWORD**
> Generate hashed control port password

**--version**
> Display version information

**--keygen**
> Generate ed25519 master identity key for relays

**--list-fingerprint**
> Generate keys and output fingerprint

**--quiet**
> Only log errors during startup

# CAVEATS

By default, Tor runs as a client-only service. The SOCKS protocol is unencrypted and unauthenticated, so exposing it to untrusted networks could leak information. Configuration files use "OptionName OptionValue" format while command-line uses "--OptionName OptionValue" format.

# HISTORY

**tor** is "The Onion Router," a second-generation anonymity network originally developed by the U.S. Naval Research Laboratory and now maintained by The Tor Project.

# SEE ALSO

[torsocks](/man/torsocks)(1), [torify](/man/torify)(1), [privoxy](/man/privoxy)(8)
