# TAGLINE

Exoscale compute instance and infrastructure management

# TLDR

**List instances**

```exo compute instance list```

**Create instance**

```exo compute instance create [name] --template [Linux Ubuntu] --zone [ch-gva-2]```

**Start instance**

```exo compute instance start [name]```

**Stop instance**

```exo compute instance stop [name]```

**Delete instance**

```exo compute instance delete [name]```

**SSH to instance**

```exo compute ssh [name]```

**Show instance details**

```exo compute instance show [name]```

# SYNOPSIS

**exo compute** _resource_ _action_ [_options_]

# PARAMETERS

_RESOURCE_
> Resource type: instance, template, security-group, etc.

_ACTION_
> Operation: list, create, delete, start, stop, show.

**--template** _NAME_
> Instance template.

**--zone** _ZONE_
> Availability zone.

**--type** _TYPE_
> Instance type.

**--help**
> Display help information.

# DESCRIPTION

**exo compute** manages Exoscale compute instances (virtual machines). It handles the full lifecycle from creation through deletion, including power management.

Commands support all instance configurations including templates, security groups, SSH keys, and network settings. Zones are Exoscale data center locations.

This subcommand provides IaaS management for Exoscale's compute platform.

# CAVEATS

Instances incur costs while running. Zone resources may be limited. Some templates require specific configurations. Deletion is immediate.

# HISTORY

exo compute is part of the **Exoscale CLI**, providing programmatic access to Exoscale's compute infrastructure for automated cloud management.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute-sks](/man/exo-compute-sks)(1)
