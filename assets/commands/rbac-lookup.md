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

**rbac-lookup** finds Kubernetes RBAC bindings for subjects. It answers "what can this user/account do?"

User lookups find human operator permissions. Shows which roles are bound.

Service account lookups check workload permissions. Important for security audits.

Group lookups show inherited permissions. RBAC groups aggregate access.

Wide output shows binding details. Namespace, role type, and source displayed.

# CAVEATS

Requires cluster read access. Large clusters may be slow. Aggregated roles not expanded.

# HISTORY

**rbac-lookup** was created by **FairwindsOps** for Kubernetes RBAC auditing. It simplifies understanding of complex role binding relationships.

# SEE ALSO

[kubectl](/man/kubectl)(1), [rbac-tool](/man/rbac-tool)(1), [kubeaudit](/man/kubeaudit)(1)
