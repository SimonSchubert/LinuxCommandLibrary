# TAGLINE

Analyze and visualize Kubernetes RBAC policies

# TLDR

**Show who can perform an action on a resource**

```rbac-tool who-can [get] [secret/some-secret]```

**Visualize RBAC as HTML** (writes rbac.html by default)

```rbac-tool viz --cluster-context [myctx] --outfile [rbac.html]```

**Render the RBAC graph as a PNG** via Graphviz

```rbac-tool viz --outformat dot --outfile [rbac.dot] && dot -Tpng [rbac.dot] > [rbac.png]```

**Look up roles assigned to a specific subject**

```rbac-tool lookup -e '[.*myname.*]'```

**List policy rules for a subject**

```rbac-tool policy-rules -e '[^system:unauth]' -o json```

**Analyze RBAC for risky configurations**

```rbac-tool analysis```

**Generate a read-only ClusterRole** that excludes secrets

```rbac-tool gen --deny-resources=secrets. --allowed-verbs=get,list,watch```

**Generate RBAC policies from audit events**

```rbac-tool auditgen -f [audit.log]```

**Show current user's permissions**

```rbac-tool whoami```

# SYNOPSIS

**rbac-tool** _command_ [_options_]

# COMMANDS

**analysis** | **analyze**
> Examine RBAC permissions to identify overly permissive principals and risky configurations.

**visualize** | **viz** | **vis**
> Generate a visual representation of RBAC relationships (DOT or HTML).

**who-can** _verb_ _kind_|_kind/name_|_url_
> Find all subjects with permission to perform a given action on a resource.

**lookup** | **look**
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

**bash-completion**
> Generate bash completion: **source <(rbac-tool bash-completion)**.

# PARAMETERS

**--outformat** _FORMAT_
> **viz** output format: `html` (default) or `dot`.

**--outfile** _FILE_
> **viz** output file (default `rbac.html`).

**-o**, **--output** _FORMAT_
> Output type for **who-can**, **policy-rules**, **analysis**, **auditgen**: `table`, `json` or `yaml`.

**-e**, **--regex** _REGEX_
> Subject filter as a regular expression (used with **lookup**, **policy-rules**).

**-n**, **--not**
> Invert the regex match (e.g. subjects not matching **^system:**).

**-c**, **--config** _FILE_
> Custom analysis ruleset file (used with **analysis**).

**--cluster-context** _NAME_
> kubeconfig context to use.

**--include-namespaces** _LIST_
> Comma-separated namespaces to include in visualization (default `*`).

**--exclude-namespaces** _LIST_
> Comma-separated namespaces to exclude from visualization (default `kube-system`).

**-t**, **--generated-type** _TYPE_
> Role or ClusterRole (default) for **generate**.

**--allowed-verbs** _LIST_
> Verbs to include in generated role.

**--allowed-groups** _LIST_
> API groups to include in generated role.

**--deny-resources** _LIST_
> Resources to exclude from generated role.

**--for-groups** _LIST_
> API groups to include with the **show** command.

**-f**, **--filename** _PATH_|_URL_
> Source file, directory, HTTP URL, or **-** for stdin with audit events (used with **auditgen**).

# CONFIGURATION

**~/.kube/config**
> Default kubeconfig used to connect to the target cluster.

# DESCRIPTION

**rbac-tool** analyzes and visualizes Kubernetes RBAC (Role-Based Access Control) configurations. It helps administrators understand who can do what, identify over-privileged subjects, generate least-privilege policies, and visualize the role/subject graph.

The `viz` command produces a Graphviz DOT graph or an interactive HTML page. `policy-rules` and `lookup` accept regular expressions, making it easy to query large clusters.

# CAVEATS

Requires a working kubeconfig. Some commands need cluster-admin privileges to enumerate all roles and bindings. Generated policies should be reviewed before applying. Also installable as a kubectl plugin via **kubectl krew install rbac-tool**.

# HISTORY

**rbac-tool** was developed by **Alcide** (acquired by **Rapid7** in 2021, now branded under insightCloudSec) and released under Apache 2.0. The **auditgen** command builds on Jordan Liggitt's audit2rbac. Upstream activity has been sparse since early 2025. It was built to help Kubernetes administrators understand and manage complex RBAC configurations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeaudit](/man/kubeaudit)(1), [krew](/man/krew)(1), [dot](/man/dot)(1)

# RESOURCES

```[Source code](https://github.com/alcideio/rbac-tool)```

<!-- verified: 2026-11-23 -->
