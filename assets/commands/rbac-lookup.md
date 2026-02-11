# TAGLINE

Look up Kubernetes RBAC roles for users

# TLDR

**Find roles for user**

```rbac-lookup [user@example.com]```

**Find roles for service account**

```rbac-lookup [service-account-name] --kind serviceaccount```

**Find roles for group**

```rbac-lookup [group-name] --kind group```

**Output wide format**

```rbac-lookup [subject] -o wide```

**Search in namespace**

```rbac-lookup [subject] -n [namespace]```

**All bindings for subject**

```rbac-lookup [subject] --all-namespaces```

# SYNOPSIS

**rbac-lookup** [_--kind type_] [_-n namespace_] [_-o format_] [_options_] _subject_

# PARAMETERS

**--kind** _TYPE_
> Subject kind (user, group, serviceaccount).

**-n**, **--namespace** _NS_
> Namespace to search.

**-A**, **--all-namespaces**
> All namespaces.

**-o**, **--output** _FORMAT_
> Output format.

**--gke**
> GKE-specific mode.

**-k**, **--kubeconfig** _FILE_
> Kubeconfig file.

# DESCRIPTION

**rbac-lookup** queries a Kubernetes cluster to find all RBAC role bindings associated with a given subject, answering the question "what permissions does this user, group, or service account have?" It searches both ClusterRoleBindings and namespace-scoped RoleBindings to provide a complete picture of a subject's access across the cluster.

The tool supports lookups by user identity, group membership, and service account name via the **--kind** flag. Wide output format (**-o wide**) displays detailed binding information including the namespace, role type, and source binding for each permission grant. This makes it particularly useful for security audits and troubleshooting access issues in clusters with complex RBAC configurations.

# CONFIGURATION

**~/.kube/config**
> Default kubeconfig file specifying cluster connections, authentication credentials, and context selection. Override with **-k** flag.

# CAVEATS

Requires cluster read access. Large clusters may be slow. Aggregated roles not expanded.

# HISTORY

**rbac-lookup** was created by **FairwindsOps** for Kubernetes RBAC auditing. It simplifies understanding of complex role binding relationships.

# SEE ALSO

[kubectl](/man/kubectl)(1), [rbac-tool](/man/rbac-tool)(1), [kubeaudit](/man/kubeaudit)(1)
