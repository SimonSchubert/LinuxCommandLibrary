# TAGLINE

shows differences between the current live configuration and the proposed

# TLDR

**Show diff against live configuration**

```kubectl diff -f [manifest.yaml]```

**Diff entire directory**

```kubectl diff -f [manifests/]```

**Diff from stdin**

```cat [manifest.yaml] | kubectl diff -f -```

# SYNOPSIS

**kubectl** **diff** [_options_]

# PARAMETERS

**-f**, **--filename** _file_
> File containing configuration to diff.

**-R**, **--recursive**
> Process directory recursively.

**-l**, **--selector** _selector_
> Label selector for filtering.

# DESCRIPTION

**kubectl diff** shows differences between the current live configuration and the proposed configuration in a file. Useful for previewing changes before applying them. Uses server-side dry run to compute the diff.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1)

