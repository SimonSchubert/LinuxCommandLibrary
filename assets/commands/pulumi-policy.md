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

**Disable policy pack**

```pulumi policy disable [org/pack]```

**Remove policy pack**

```pulumi policy rm [org/pack] [version]```

**Validate policy pack configuration**

```pulumi policy validate-config [org/pack] [version] --config [policy-config.json]```

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

**rm** _pack_ _version_
> Remove a policy pack from the organization. Must be disabled from all Policy Groups first.

**group**
> Manage policy groups.

**validate-config** _pack_ _version_
> Validate a policy pack configuration against the configuration schema.

# DESCRIPTION

**pulumi policy** manages Policy as Code (CrossGuard). Policies enforce compliance rules on infrastructure. Create, publish, and enable policy packs to validate deployments.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-preview](/man/pulumi-preview)(1), [pulumi-stack](/man/pulumi-stack)(1)

