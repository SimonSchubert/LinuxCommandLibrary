# TAGLINE

Cancel an ongoing Pulumi stack update

# TLDR

**Cancel current update**

```pulumi cancel```

**Cancel in specific stack**

```pulumi cancel -s [stack]```

**Force cancel**

```pulumi cancel --yes```

# SYNOPSIS

**pulumi** **cancel** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

# DESCRIPTION

**pulumi cancel** cancels an ongoing stack update. Useful when an update is stuck or needs to be aborted. Cancellation may leave resources in an unknown state.

# CAVEATS

Canceling an update may leave resources in an inconsistent state requiring manual intervention.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1)

