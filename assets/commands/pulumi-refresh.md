# TLDR

**Refresh state from cloud**

```pulumi refresh```

**Refresh specific stack**

```pulumi refresh -s [stack]```

**Refresh with auto-approval**

```pulumi refresh --yes```

# SYNOPSIS

**pulumi** **refresh** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

**--target** _urn_
> Refresh specific resources.

**-p**, **--parallel** _n_
> Parallelism level.

# DESCRIPTION

**pulumi refresh** updates stack state to match actual cloud resources. Detects drift between Pulumi state and real infrastructure. Run before updates when resources may have changed outside Pulumi.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-preview](/man/pulumi-preview)(1)

