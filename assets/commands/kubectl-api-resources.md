# TAGLINE

lists all resource types available in the Kubernetes cluster

# TLDR

**List all API resources**

```kubectl api-resources```

**List namespaced resources only**

```kubectl api-resources --namespaced=true```

**List resources with specific API group**

```kubectl api-resources --api-group=[apps]```

**Show resource short names**

```kubectl api-resources -o wide```

**List verbs for resources**

```kubectl api-resources --verbs=[list,get]```

# SYNOPSIS

**kubectl** **api-resources** [_options_]

# PARAMETERS

**--namespaced** _bool_
> Filter namespaced/cluster-scoped resources.

**--api-group** _group_
> Filter by API group.

**--verbs** _verbs_
> Filter by supported verbs.

**-o** _format_
> Output format (wide, name).

# DESCRIPTION

**kubectl api-resources** lists all resource types available in the Kubernetes cluster. Shows resource names, short names, API group, and whether they are namespaced. Useful for discovering available resource types.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-api-versions](/man/kubectl-api-versions)(1)

