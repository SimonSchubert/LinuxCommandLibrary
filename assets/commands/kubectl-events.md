# TLDR

**Show all events**

```kubectl events```

**Events in namespace**

```kubectl events -n [namespace]```

**Events for resource**

```kubectl events --for [pod/pod-name]```

**Watch events**

```kubectl events --watch```

**Filter by type**

```kubectl events --types=[Warning]```

# SYNOPSIS

**kubectl events** [_options_]

# PARAMETERS

**-n** _NAMESPACE_
> Target namespace.

**--for** _RESOURCE_
> Events for specific resource.

**--watch**
> Watch for new events.

**--types** _TYPES_
> Filter by event types.

**-A**, **--all-namespaces**
> All namespaces.

**--help**
> Display help information.

# DESCRIPTION

**kubectl events** lists cluster events. Events record significant occurrences like pod scheduling and container starts.

The command shows recent cluster activity. It's useful for monitoring and debugging cluster behavior.

kubectl events shows cluster events.

# CAVEATS

Subcommand of kubectl. Events have TTL. Consider event aggregation for production.

# HISTORY

kubectl events provides event viewing for **Kubernetes** cluster monitoring and troubleshooting.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-describe](/man/kubectl-describe)(1), [kubectl-logs](/man/kubectl-logs)(1)
