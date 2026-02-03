# TLDR

**Replace resource from file**

```kubectl replace -f [manifest.yaml]```

**Force replace (delete and recreate)**

```kubectl replace --force -f [manifest.yaml]```

**Replace from stdin**

```cat [manifest.yaml] | kubectl replace -f -```

# SYNOPSIS

**kubectl** **replace** [_options_]

# PARAMETERS

**-f**, **--filename** _file_
> File containing resource definition.

**--force**
> Delete existing resource before creating.

**--grace-period** _seconds_
> Grace period for deletion.

**--cascade** _mode_
> Cascade deletion strategy.

# DESCRIPTION

**kubectl replace** replaces a resource by filename or stdin. The resource must already exist. Unlike apply, replace requires the complete resource specification. Use --force to delete and recreate.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1)

