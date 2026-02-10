# TAGLINE

checks authorization permissions

# TLDR

**Check if action is allowed**

```kubectl auth can-i [create] [pods]```

**Check as user**

```kubectl auth can-i [delete] [deployments] --as [user@example.com]```

**Check in namespace**

```kubectl auth can-i [get] [secrets] -n [namespace]```

**List all permissions**

```kubectl auth can-i --list```

**Check all namespaces**

```kubectl auth can-i [get] [pods] --all-namespaces```

**Reconcile RBAC**

```kubectl auth reconcile -f [rbac.yaml]```

# SYNOPSIS

**kubectl auth** _subcommand_ [_options_]

# PARAMETERS

**can-i** _VERB_ _RESOURCE_
> Check authorization.

**reconcile**
> Reconcile RBAC rules.

**--as** _USER_
> Impersonate user.

**--as-group** _GROUP_
> Impersonate group.

**--list**
> List all permissions.

**-n** _NAMESPACE_
> Target namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl auth** checks authorization permissions. It verifies what actions are allowed for users and service accounts.

The command tests RBAC policies. It's useful for debugging access issues and auditing permissions.

# CAVEATS

Subcommand of kubectl. Shows RBAC results. May not reflect all policies.

# HISTORY

kubectl auth provides authorization checking for **Kubernetes** RBAC policies and access debugging.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-config](/man/kubectl-config)(1)
