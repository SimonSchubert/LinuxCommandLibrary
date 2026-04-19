# TAGLINE

Alias for pulumi destroy

# TLDR

**Destroy all resources (alias)**

```pulumi down```

**Destroy with auto-approval**

```pulumi down --yes```

**Destroy a specific stack**

```pulumi down --stack [name]```

**Destroy without previewing first**

```pulumi down --skip-preview --yes```

**Destroy and remove the stack**

```pulumi down --remove --yes```

**Preview only, don't destroy**

```pulumi down --preview-only```

# SYNOPSIS

**pulumi** **down** [_options_]

# DESCRIPTION

**pulumi down** is an alias for **pulumi destroy**. Removes all resources managed by the current stack. Provides a more intuitive counterpart to **pulumi up**.

# PARAMETERS

**-y**, **--yes**
> Automatically approve and perform the destroy after previewing it.

**-s**, **--stack** _name_
> The name of the stack to operate on. Defaults to the current stack.

**-f**, **--skip-preview**
> Do not calculate a preview before performing the destroy.

**--preview-only**
> Only show a preview of the destroy, but don't perform the destroy itself.

**--target** _urn_
> Destroy only the specified resource URN (and its dependencies).

**-x**, **--exclude** _urn_
> Exclude the specified resource URN from the destroy.

**--exclude-protected**
> Do not destroy protected resources. Destroy all other resources.

**--remove**
> Remove the stack and its config file after all resources are deleted.

**-p**, **--parallel** _N_
> Allow P resource operations to run in parallel at once (default 16).

**-j**, **--json**
> Serialize the destroy diffs, operations, and overall output as JSON.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-destroy](/man/pulumi-destroy)(1), [pulumi-up](/man/pulumi-up)(1)

