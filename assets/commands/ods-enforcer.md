# TLDR

**Setup database**

```ods-enforcer-db-setup```

**Add zone**

```ods-enforcer zone add --zone [example.com]```

**List zones**

```ods-enforcer zone list```

**Show key status**

```ods-enforcer key list --zone [example.com]```

**Force key rollover**

```ods-enforcer key rollover --zone [example.com]```

**Export DS records**

```ods-enforcer key ds --zone [example.com]```

# SYNOPSIS

**ods-enforcer** _command_ [_options_]

# PARAMETERS

**zone add**
> Add zone to management.

**zone delete**
> Remove zone.

**zone list**
> List managed zones.

**key list**
> Show keys.

**key rollover**
> Initiate key rollover.

**key ds**
> Export DS records.

**policy list**
> List signing policies.

# DESCRIPTION

**ods-enforcer** is the OpenDNSSEC key management component. It manages DNSSEC keys according to configured policies (KASP), handling key generation, publication, and rollover.

The enforcer coordinates with the signer to maintain DNSSEC signatures.

# KASP POLICIES

```
Key Algorithm
Key Lifetime
Signature Validity
Rollover Timing
```

# KEY STATES

```
generate → publish → ready → active → retire → dead
```

# CAVEATS

Requires KASP configuration. Database setup needed first. Works with ods-signer.

# HISTORY

OpenDNSSEC enforcer implements automated key management following DNSSEC best practices from **IETF** RFCs.

# SEE ALSO

[ods-control](/man/ods-control)(8), [ods-signer](/man/ods-signer)(8), [dnssec-keygen](/man/dnssec-keygen)(8)
