# TAGLINE

openDNSSEC signer daemon

# TLDR

**Start ODS server**

```ods-server```

**Start on specific port**

```ods-server -p [port]```

**Start with configuration**

```ods-server -c [config.conf]```

**Run in foreground**

```ods-server -f```

# SYNOPSIS

**ods-server** [_options_]

# PARAMETERS

**-p** _PORT_
> Listen port.

**-c** _FILE_
> Configuration file.

**-f**
> Run in foreground.

**-d**
> Debug mode.

**--help**
> Display help information.

# DESCRIPTION

**ods-server** is the OpenDNSSEC signer daemon. Signs DNS zones with DNSSEC.

The daemon handles zone signing operations. Part of OpenDNSSEC suite.

# CAVEATS

Part of OpenDNSSEC. Requires proper configuration. Works with KASP policies.

# HISTORY

ods-server was developed as part of **OpenDNSSEC** for automated DNSSEC signing.

# SEE ALSO

[ods-control](/man/ods-control)(1), [ods-enforcer](/man/ods-enforcer)(1), [named](/man/named)(1)

