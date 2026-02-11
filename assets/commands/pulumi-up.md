# TAGLINE

Deploy infrastructure changes

# TLDR

**Deploy stack**

```pulumi up```

**Deploy with auto-approval**

```pulumi up --yes```

**Deploy specific stack**

```pulumi up -s [stack]```

**Deploy with preview**

```pulumi up --diff```

**Deploy specific targets**

```pulumi up --target [urn]```

# SYNOPSIS

**pulumi** **up** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

**--diff**
> Show detailed diff.

**--target** _urn_
> Update specific resources.

**--refresh**
> Refresh before update.

**-p**, **--parallel** _n_
> Parallelism level.

**--skip-preview**
> Skip preview step.

**--replace** _urn_
> Force replacement of resources.

**-f**, **--skip-preview**
> Skip preview.

# DESCRIPTION

**pulumi up** creates or updates infrastructure. Compares desired state with current infrastructure and applies necessary changes. The primary command for deploying Pulumi programs.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-preview](/man/pulumi-preview)(1), [pulumi-destroy](/man/pulumi-destroy)(1)

