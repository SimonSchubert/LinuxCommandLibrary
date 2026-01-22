# TLDR

**Bootstrap controller**

```juju bootstrap [cloud] [controller-name]```

**Deploy application**

```juju deploy [charm-name]```

**Add machine**

```juju add-machine```

**Check status**

```juju status```

**Add relation**

```juju add-relation [app1] [app2]```

**SSH to unit**

```juju ssh [unit/0]```

# SYNOPSIS

**juju** _command_ [_options_]

# PARAMETERS

**bootstrap** _CLOUD_ _NAME_
> Create controller.

**deploy** _CHARM_
> Deploy charm.

**add-machine**
> Add machine to model.

**status**
> Show model status.

**add-relation** _APP1_ _APP2_
> Connect applications.

**ssh** _UNIT_
> SSH to unit.

**--help**
> Display help information.

# DESCRIPTION

**Juju** orchestrates application deployment and management. It deploys applications as charms across clouds and bare metal.

The tool manages complex application topologies. It handles scaling, relations, and configuration.

Juju orchestrates cloud services.

# CAVEATS

Requires controller setup. Cloud credentials needed. Canonical product.

# HISTORY

Juju was created by **Canonical** for service orchestration, evolving from a configuration management approach to application modeling.

# SEE ALSO

[maas](/man/maas)(1), [lxc](/man/lxc)(1), [snap](/man/snap)(8)
