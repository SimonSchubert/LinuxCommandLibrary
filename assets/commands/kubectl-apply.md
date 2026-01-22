# TLDR

**Apply manifest**

```kubectl apply -f [manifest.yaml]```

**Apply directory**

```kubectl apply -f [manifests/]```

**Apply from URL**

```kubectl apply -f [https://example.com/manifest.yaml]```

**Apply with kustomization**

```kubectl apply -k [directory/]```

**Dry run**

```kubectl apply -f [manifest.yaml] --dry-run=client```

**Server-side apply**

```kubectl apply -f [manifest.yaml] --server-side```

# SYNOPSIS

**kubectl apply** [_options_] **-f** _filename_

# PARAMETERS

**-f** _FILE_
> File, directory, or URL.

**-k** _DIR_
> Kustomization directory.

**--dry-run** _MODE_
> client, server, or none.

**--server-side**
> Server-side apply.

**--force-conflicts**
> Force apply on conflicts.

**-n** _NAMESPACE_
> Target namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl apply** creates or updates Kubernetes resources. It uses declarative configuration to manage resources.

The command compares desired state with current state. It's the recommended way to manage Kubernetes resources.

kubectl apply manages resources declaratively.

# CAVEATS

Subcommand of kubectl. Last-applied annotation used. Prefer over create for management.

# HISTORY

kubectl apply implements declarative resource management for **Kubernetes**, enabling GitOps workflows.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-delete](/man/kubectl-delete)(1)
