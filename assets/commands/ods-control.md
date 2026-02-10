# TAGLINE

manages OpenDNSSEC components

# TLDR

**Start ODS services**

```ods-control start```

**Stop ODS services**

```ods-control stop```

**Check status**

```ods-control status```

**Reload configuration**

```ods-control reload```

**Start enforcer only**

```ods-control enforcer start```

# SYNOPSIS

**ods-control** [_component_] _command_

# PARAMETERS

**start**
> Start services.

**stop**
> Stop services.

**status**
> Show status.

**reload**
> Reload configuration.

**enforcer**
> Control enforcer only.

**signer**
> Control signer only.

# DESCRIPTION

**ods-control** manages OpenDNSSEC components. OpenDNSSEC automates DNSSEC key management and zone signing.

The tool controls the enforcer (key management) and signer (zone signing) daemons.

# COMPONENTS

```
enforcer - Key management daemon
signer   - Zone signing daemon
```

# TYPICAL WORKFLOW

```bash
# Start OpenDNSSEC
ods-control start

# Check status
ods-control status

# After config change
ods-control reload
```

# CAVEATS

Requires configured KASP. Database must be initialized. Root privileges typically needed.

# HISTORY

OpenDNSSEC was developed to simplify DNSSEC deployment, providing automated key rollover and zone signing.

# SEE ALSO

[ods-enforcer](/man/ods-enforcer)(8), [ods-signer](/man/ods-signer)(8), [opendnssec](/man/opendnssec)(7)
