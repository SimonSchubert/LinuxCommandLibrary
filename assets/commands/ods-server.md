# TAGLINE

openDNSSEC signer engine daemon

# TLDR

**Start the signer engine (normally done via ods-control)**

```ods-control start```

**Run the signer daemon in the foreground**

```ods-signerd -d```

**Use an alternate configuration file**

```ods-signerd -c [conf.xml]```

**Run once then exit (debugging)**

```ods-signerd -1```

**Print the parsed configuration and exit**

```ods-signerd -i```

# SYNOPSIS

**ods-signerd** [_options_]

# PARAMETERS

**-d**
> Run in the foreground instead of daemonizing.

**-c** _FILE_
> Read configuration from _FILE_ instead of the default conf.xml.

**-1**
> Run the engine a single time, then exit (debugging).

**-i**
> Print the parsed configuration and exit (debugging).

**-v**
> Increase verbosity.

**-V**
> Print version and exit.

**-h**
> Display help information.

# DESCRIPTION

The OpenDNSSEC Signer Engine daemon keeps DNS zones continuously signed with DNSSEC. The actual binary is **ods-signerd**; there is no separate "ods-server" program.

It is rarely started directly. In normal operation it is launched and stopped through **ods-control** (which wraps `ods-signer start`/`stop`), and it takes signing instructions from the policies defined by the KASP and the Enforcer. Diagnostics are written to syslog.

# CAVEATS

Part of OpenDNSSEC. Requires a valid conf.xml and a working HSM (or SoftHSM) configuration. Run the Enforcer (**ods-enforcer**) so keys and signing policy are available.

# HISTORY

Developed as part of **OpenDNSSEC** for automated, policy-driven DNSSEC zone signing.

# SEE ALSO

[ods-control](/man/ods-control)(1), [ods-enforcer](/man/ods-enforcer)(1), [named](/man/named)(1)

# RESOURCES

```[Source code](https://github.com/opendnssec/opendnssec)```

```[Homepage](https://www.opendnssec.org)```

<!-- verified: 2026-11-07 -->
