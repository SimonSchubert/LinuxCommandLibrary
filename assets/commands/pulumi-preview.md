# TAGLINE

Preview infrastructure changes before deployment

# TLDR

**Preview changes**

```pulumi preview```

**Preview specific stack**

```pulumi preview -s [stack]```

**Preview with detailed diff**

```pulumi preview --diff```

**Preview in JSON format**

```pulumi preview --json```

**Preview specific targets**

```pulumi preview --target [urn]```

# SYNOPSIS

**pulumi** **preview** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**--diff**
> Show detailed diff.

**--json**
> Output as JSON.

**--target** _urn_
> Preview specific resources.

**--refresh**
> Refresh state before preview.

**--expect-no-changes**
> Error if changes detected.

**-p**, **--parallel** _n_
> Parallelism level.

# DESCRIPTION

**pulumi preview** shows planned changes without applying them. Compares desired state with current infrastructure. Essential for reviewing changes before deployment.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-destroy](/man/pulumi-destroy)(1)

