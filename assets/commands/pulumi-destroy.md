# TAGLINE

Delete all resources in a Pulumi stack

# TLDR

**Destroy all resources**

```pulumi destroy```

**Destroy with auto-approval**

```pulumi destroy --yes```

**Destroy specific stack**

```pulumi destroy -s [stack]```

**Preview destruction**

```pulumi destroy --preview-only```

**Destroy specific targets**

```pulumi destroy --target [urn]```

# SYNOPSIS

**pulumi** **destroy** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

**--preview-only**
> Preview without executing.

**--target** _urn_
> Destroy specific resources.

**-p**, **--parallel** _n_
> Parallelism level.

**--refresh**
> Refresh state before destroy.

# DESCRIPTION

**pulumi destroy** deletes all resources in a stack. Removes cloud infrastructure managed by Pulumi. Always preview changes before destruction in production environments.

# CAVEATS

This permanently destroys cloud resources. Use --preview-only first in production.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-preview](/man/pulumi-preview)(1)

