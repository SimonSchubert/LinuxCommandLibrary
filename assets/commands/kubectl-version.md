# TLDR

**Show versions**

```kubectl version```

**Client version only**

```kubectl version --client```

**Output as JSON**

```kubectl version -o json```

**Output as YAML**

```kubectl version -o yaml```

**Short format**

```kubectl version --short```

# SYNOPSIS

**kubectl version** [_options_]

# PARAMETERS

**--client**
> Show client version only.

**-o** _FORMAT_
> Output format (json, yaml).

**--short**
> Short output format.

**--help**
> Display help information.

# DESCRIPTION

**kubectl version** shows client and server versions. It displays the kubectl and Kubernetes API server versions.

The command verifies version compatibility. Client and server should be within one minor version.

kubectl version shows versions.

# CAVEATS

Subcommand of kubectl. Server version needs cluster access. Version skew matters.

# HISTORY

kubectl version provides version checking for **Kubernetes** compatibility verification.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cluster-info](/man/kubectl-cluster-info)(1)
