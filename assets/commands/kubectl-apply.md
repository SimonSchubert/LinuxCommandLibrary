# TAGLINE

creates or updates Kubernetes resources

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

**kubectl apply** creates or updates Kubernetes resources using declarative configuration files. It compares the desired state defined in YAML or JSON manifests against the current state of the cluster and makes only the necessary changes to reconcile any differences, using a three-way merge strategy that considers the last-applied configuration, the live state, and the new manifest.

The command accepts manifests from local files, directories, URLs, or Kustomize overlays, making it well-suited for GitOps workflows where cluster state is version-controlled. It supports both client-side and server-side apply modes, with server-side apply providing better conflict detection when multiple actors manage the same resource through field ownership tracking.

This is the recommended approach for managing Kubernetes resources in production, as it preserves changes made by other controllers and allows incremental updates without replacing entire resource definitions.

# CAVEATS

Subcommand of kubectl. Last-applied annotation used. Prefer over create for management.

# HISTORY

kubectl apply implements declarative resource management for **Kubernetes**, enabling GitOps workflows.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-delete](/man/kubectl-delete)(1)
