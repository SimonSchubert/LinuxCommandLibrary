# TAGLINE

lists cluster events

# TLDR

**Show events** in the current namespace

```kubectl events```

**Show events** in a specific namespace

```kubectl events -n [namespace]```

**Show events** across all namespaces

```kubectl events -A```

**Events scoped to a specific resource**

```kubectl events --for [pod/pod-name]```

**Watch live events** as they arrive

```kubectl events --watch```

**Only Warnings** (filter by event type)

```kubectl events --types=[Warning]```

**Sort events** chronologically (oldest first)

```kubectl events --sort-by=[lastTimestamp]```

**Output as JSON**

```kubectl events -o json```

# SYNOPSIS

**kubectl events** [_options_]

# PARAMETERS

**-n** _NAMESPACE_
> Target namespace (default: current context's namespace).

**-A**, **--all-namespaces**
> List events from every namespace.

**--for** _KIND/NAME_
> Restrict to events whose **involvedObject** matches the given resource (e.g. **pod/web-0**).

**--watch**, **-w**
> Stream new events instead of exiting after one snapshot.

**--types** _TYPES_
> Comma-separated event types (Normal, Warning).

**--sort-by** _FIELD_
> Sort by a JSONPath field, typically **.lastTimestamp** or **.metadata.creationTimestamp**.

**-o** _FORMAT_
> Output format (wide, json, yaml, jsonpath, ...).

**--no-headers**
> Suppress the column header line.

**--help**
> Display help information.

# DESCRIPTION

**kubectl events** is the modern, dedicated subcommand for listing Kubernetes Event objects. It was added as an alpha in **kubectl 1.23** and promoted to GA in **1.27**, replacing the older **kubectl get events** form with a cleaner default output and live-watch support.

Events are short-lived records emitted by controllers (kubelet, scheduler, controller-manager, custom operators, ...) that describe noteworthy state changes such as pod scheduling, image pulls, liveness-probe failures, or HPA scaling decisions. Use **--for** to follow a specific Pod, Deployment, or Job, **--watch** for live debugging, and **--sort-by** to put the most recent events at the bottom for chronological reading.

# CAVEATS

Events expire after **--event-ttl** (default **1 hour**); historical incidents need an external aggregator (Loki, Elasticsearch, Datadog) or persistent storage of the Events API. The **--for** flag is exact: events emitted on a parent resource (Deployment) are not surfaced when watching the child Pod. **kubectl events** is a separate plugin in some older distributions; on those, fall back to **kubectl get events**.

# HISTORY

**kubectl events** landed as an alpha command in **Kubernetes 1.23** (December 2021), became beta in **1.25**, and reached general availability in **1.27** (April 2023). It was contributed to consolidate the various flags previously needed on **kubectl get events** to make ad-hoc cluster debugging more ergonomic.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-describe](/man/kubectl-describe)(1), [kubectl-logs](/man/kubectl-logs)(1)
