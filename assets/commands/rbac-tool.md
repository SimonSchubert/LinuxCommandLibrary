# TAGLINE

Analyze and visualize Kubernetes RBAC policies

# TLDR

**Show who can perform an action on a resource**

```rbac-tool who-can [get] [pods]```

**Visualize RBAC as HTML**

```rbac-tool viz --outformat html > [rbac.html]```

**Look up roles assigned to a specific subject**

```rbac-tool lookup -e [user@example.com]```

**List policy rules for a subject**

```rbac-tool policy-rules -e [system:serviceaccount:default:.*]```

**Analyze RBAC for risky configurations**

```rbac-tool analysis```

**Generate a ClusterRole from audit events**

```rbac-tool auditgen -f [audit.log]```

**Show current user's permissions**

```rbac-tool whoami```

# SYNOPSIS

**rbac-tool** _command_ [_options_]

# COMMANDS

**analysis**
> Examine RBAC permissions to identify overly permissive principals and risky configurations.

**viz**
> Generate a visual representation of RBAC relationships (DOT or HTML).

**who-can** _verb_ _kind_|_kind/name_|_url_
> Find all subjects with permission to perform a given action on a resource.

**lookup**
> List Roles and ClusterRoles assigned to specified users, service accounts, or groups.

**policy-rules**
> List RBAC policy rules associated with the given subjects.

**generate** | **gen**
> Generate a Role or ClusterRole with explicit permissions.

**auditgen**
> Generate RBAC policies from Kubernetes audit events.

**show**
> Generate a ClusterRole containing the cluster's available permissions.

**whoami**
> Display the currently authenticated subject as seen by the API server.

**version**
> Print rbac-tool version.

# PARAMETERS

**--outformat** _FORMAT_
> Output format. For **viz**: `dot` or `html`. For data commands: `json`, `yaml`, `table`.

**-e** _REGEX_
> Subject filter as a regular expression (used with **lookup**, **policy-rules**).

**--config** _FILE_
> Custom analysis ruleset file (used with **analysis**).

**--cluster-context** _NAME_
> kubeconfig context to use.

**--exclude-namespaces** _LIST_
> Comma-separated namespaces to exclude from visualization.

**--generated-type** _TYPE_
> Role or ClusterRole (used with **generate**).

**--allowed-verbs** _LIST_
> Verbs to include in generated role.

**--allowed-groups** _LIST_
> API groups to include in generated role.

**--deny-resources** _LIST_
> Resources to exclude from generated role.

**--for-groups** _LIST_
> API groups to include with the **show** command.

**-f** _PATH_|_URL_
> Source file, directory, or HTTP URL of audit events (used with **auditgen**).

# CONFIGURATION

**~/.kube/config**
> Default kubeconfig used to connect to the target cluster.

# DESCRIPTION

**rbac-tool** analyzes and visualizes Kubernetes RBAC (Role-Based Access Control) configurations. It helps administrators understand who can do what, identify over-privileged subjects, generate least-privilege policies, and visualize the role/subject graph.

The `viz` command produces a Graphviz DOT graph or an interactive HTML page. `policy-rules` and `lookup` accept regular expressions, making it easy to query large clusters.

# CAVEATS

Requires a working kubeconfig. Some commands need cluster-admin privileges to enumerate all roles and bindings. Generated policies should be reviewed before applying.

# HISTORY

**rbac-tool** is developed by **Alcide** (now part of Rapid7) and released under Apache 2.0. It was built to help Kubernetes administrators understand and manage complex RBAC configurations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeaudit](/man/kubeaudit)(1)
