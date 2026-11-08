# TAGLINE

Find Kubernetes roles bound to users, groups, or service accounts

# TLDR

**Find roles for user**

```rbac-lookup [user@example.com]```

**Find roles for service account**

```rbac-lookup [service-account-name] --kind serviceaccount```

**Find roles for group**

```rbac-lookup [group-name] --kind group```

**Output wide format**

```rbac-lookup [subject] -o wide```

**Query a specific kubeconfig context**

```rbac-lookup [subject] --context [context]```

**Include GKE IAM roles**

```rbac-lookup [subject] --gke```

# SYNOPSIS

**rbac-lookup** [_subject_query_] [**-k** _kind_] [**-o** _format_] [**--kubeconfig** _file_] [**--context** _name_] [**--gke**]

# PARAMETERS

_subject_query_
> Substring matched against subject names.

**-k**, **--kind** _TYPE_
> Filter by subject kind (user, group, serviceaccount).

**-o**, **--output** _FORMAT_
> Output format (normal, wide).

**--gke**
> Enable GKE integration.

**--kubeconfig** _FILE_
> Kubeconfig file location.

**--context** _NAME_
> Kubeconfig context to use.

# DESCRIPTION

**rbac-lookup** queries a Kubernetes cluster to find all RBAC role bindings associated with a given subject, answering the question "what permissions does this user, group, or service account have?" It searches both ClusterRoleBindings and namespace-scoped RoleBindings to provide a complete picture of a subject's access across the cluster.

The tool supports lookups by user identity, group membership, and service account name via the **--kind** flag. Wide output format (**-o wide**) displays detailed binding information including the namespace, role type, and source binding for each permission grant. This makes it particularly useful for security audits and troubleshooting access issues in clusters with complex RBAC configurations.

# CONFIGURATION

**~/.kube/config**
> Default kubeconfig file specifying cluster connections, authentication credentials, and context selection. Override with **--kubeconfig**.

# CAVEATS

Requires read access to role bindings. The query matches by substring, so similar names are returned together. It lists bindings rather than the individual permissions inside each role.

# HISTORY

**rbac-lookup** was created by **FairwindsOps** for Kubernetes RBAC auditing. It simplifies understanding of complex role binding relationships.

# SEE ALSO

[kubectl](/man/kubectl)(1), [rbac-tool](/man/rbac-tool)(1), [kubeaudit](/man/kubeaudit)(1)

# RESOURCES

```[Source code](https://github.com/FairwindsOps/rbac-lookup)```

```[Documentation](https://rbac-lookup.docs.fairwinds.com/)```

<!-- verified: 2026-11-08 -->
