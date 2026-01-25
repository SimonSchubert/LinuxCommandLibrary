# TLDR

**Analyze RBAC permissions**

```rbac-tool analysis```

**Visualize RBAC**

```rbac-tool viz```

**Show who can perform action**

```rbac-tool who-can [get] [pods]```

**Generate policy**

```rbac-tool gen```

**Audit RBAC**

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

# CAVEATS

Requires kubectl configuration. Some commands need cluster-admin access. Kubernetes-specific.

# HISTORY

rbac-tool was created to help Kubernetes administrators understand and manage complex RBAC configurations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeaudit](/man/kubeaudit)(1), [kube-hunter](/man/kube-hunter)(1)
