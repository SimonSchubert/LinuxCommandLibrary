# TAGLINE

Sync stack state with cloud resources

# TLDR

**Refresh state from cloud**

```pulumi refresh```

**Refresh specific stack**

```pulumi refresh -s [stack]```

**Refresh with auto-approval**

```pulumi refresh --yes```

**Refresh specific resources** by URN

```pulumi refresh --target [urn]```

**Refresh and fail if changes are detected**

```pulumi refresh --expect-no-changes```

**Refresh with JSON output**

```pulumi refresh --json```

# SYNOPSIS

**pulumi** **refresh** [_options_]

# PARAMETERS

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

**--target** _urn_
> Refresh specific resources.

**-m**, **--message** _string_
> Message to associate with the update operation.

**-j**, **--json**
> Serialize the refresh diffs and output as JSON.

**--expect-no-changes**
> Return an error if any changes occur during refresh.

**--exclude** _urn_
> Exclude specific resources from refresh (supports wildcards).

**--import-pending-creates**
> Import resources that were created during pending operations.

**--clear-pending-creates**
> Remove any pending CREATEs from state.

**-p**, **--parallel** _n_
> Parallelism level (1 for no parallelism).

# DESCRIPTION

**pulumi refresh** updates stack state to match actual cloud resources. Detects drift between Pulumi state and real infrastructure. Run before updates when resources may have changed outside Pulumi.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-preview](/man/pulumi-preview)(1), [pulumi-destroy](/man/pulumi-destroy)(1), [pulumi-stack](/man/pulumi-stack)(1)

