# TAGLINE

Manage infrastructure policy packs

# TLDR

**List policy packs**

```pulumi policy ls```

**Create new policy pack**

```pulumi policy new [template]```

**Publish policy pack**

```pulumi policy publish [org]```

**Enable policy pack**

```pulumi policy enable [org/pack] [version]```

# SYNOPSIS

**pulumi** **policy** _command_ [_options_]

# PARAMETERS

**ls**
> List policy packs.

**new** _template_
> Create policy pack.

**publish** _org_
> Publish policy pack.

**enable** _pack_ _version_
> Enable policy pack.

**disable** _pack_
> Disable policy pack.

**validate-config**
> Validate policy configuration.

# DESCRIPTION

**pulumi policy** manages Policy as Code (CrossGuard). Policies enforce compliance rules on infrastructure. Create, publish, and enable policy packs to validate deployments.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-preview](/man/pulumi-preview)(1)

