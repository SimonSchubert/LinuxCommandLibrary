# TAGLINE

Directly manipulate stack state

# TLDR

**Delete resource from state**

```pulumi state delete [urn]```

**Unprotect resource**

```pulumi state unprotect [urn]```

**Rename resource**

```pulumi state rename [urn] [new_name]```

**Upgrade state schema**

```pulumi state upgrade```

# SYNOPSIS

**pulumi** **state** _command_ [_options_]

# PARAMETERS

**delete** _urn_
> Remove resource from state.

**unprotect** _urn_
> Remove protection from resource.

**rename** _urn_ _name_
> Rename resource in state.

**upgrade**
> Upgrade state schema.

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

**--force**
> Force operation.

# DESCRIPTION

**pulumi state** manipulates stack state directly. Use for state surgery when resources need manual removal or modification. Dangerous operations that bypass normal resource lifecycle.

# CAVEATS

Direct state manipulation can cause drift between state and actual infrastructure. Use with caution.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-stack](/man/pulumi-stack)(1), [pulumi-import](/man/pulumi-import)(1)

