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
> Target stack name.

**--diff**
> Show detailed property-level diff for each changed resource.

**--json**
> Emit machine-readable JSON output.

**--target** _urn_
> Preview operations only on the listed resource URNs (repeatable).

**--target-dependents**
> Also include resources that depend on the targeted ones.

**--refresh**
> Refresh state from the cloud provider before computing the preview.

**--expect-no-changes**
> Exit with a non-zero status if any changes are detected. Useful for CI drift detection.

**-p**, **--parallel** _n_
> Maximum number of resource operations to run concurrently.

**--config** _key=value_
> Override a config value for this preview.

**--message** _text_
> Optional message recorded with the update.

**--show-replacement-steps**
> Show the underlying create/delete steps that make up a replacement.

# DESCRIPTION

**pulumi preview** computes and displays the set of resource operations that **pulumi up** would perform, without actually making any changes. It compares the desired state described in the program with the current state recorded for the stack (optionally refreshed from the cloud), and reports the create/update/replace/delete operations that would result.

Use **--diff** for a full property-level view of what would change, and **--expect-no-changes** in CI pipelines to detect drift between the program and the deployed infrastructure.

# CAVEATS

A preview only reflects what Pulumi can determine statically: provider-side validation errors or runtime failures may still surface during **pulumi up**. Without **--refresh**, the preview is computed against the last-known state, which may be stale.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-destroy](/man/pulumi-destroy)(1)

