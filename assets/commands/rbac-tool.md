# TAGLINE

Analyze and visualize Kubernetes RBAC policies

# TLDR

**Show who can perform an action on a resource**

```rbac-tool who-can [get] [pods]```

**Visualize RBAC as HTML**

```rbac-tool viz --outformat html > [rbac.html]```

**Look up permissions for a specific subject**

```rbac-tool lookup -e [user@example.com]```

**Generate RBAC policy from audit log**

```rbac-tool gen --from-audit [audit.log]```

**Audit RBAC for security issues**

```rbac-tool audit```

# SYNOPSIS

**rbac-tool** _command_ [_options_]

# COMMANDS

**analysis**
> Analyze RBAC configuration.

**viz**
> Visualize RBAC.

**who-can** _verb_ _resource_
> Find subjects with permission.

**gen**
> Generate RBAC policy.

**audit**
> Audit permissions.

**lookup**
> Lookup subject permissions.

# DESCRIPTION

**rbac-tool** analyzes and visualizes Kubernetes RBAC (Role-Based Access Control) configurations. It helps understand permissions, find security issues, and generate policies.

# EXAMPLES

```bash
# Who can delete pods?
rbac-tool who-can delete pods

# Who can access secrets?
rbac-tool who-can get secrets -n default

# Visualize RBAC as HTML
rbac-tool viz --outformat html > rbac.html

# Analyze cluster RBAC
rbac-tool analysis

# Audit for issues
rbac-tool audit

# Generate policy from audit log
rbac-tool gen --from-audit audit.log
```

# OUTPUT FORMATS

```
--outformat dot    # Graphviz DOT
--outformat html   # Interactive HTML
--outformat json   # JSON
```

# CONFIGURATION

**~/.kube/config**
> Default kubeconfig file specifying cluster connections and authentication. Used by rbac-tool to connect to the target cluster.

# CAVEATS

Requires kubectl configuration. Some commands need cluster-admin access. Kubernetes-specific.

# HISTORY

rbac-tool was created to help Kubernetes administrators understand and manage complex RBAC configurations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeaudit](/man/kubeaudit)(1)
