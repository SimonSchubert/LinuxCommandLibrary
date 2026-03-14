# TAGLINE

kubernetes command-line tool

# TLDR

**Get resources**

```kubectl get [pods|deployments|services|nodes]```

**Describe resource**

```kubectl describe [pod] [name]```

**Apply manifest**

```kubectl apply -f [manifest.yaml]```

**Delete resource**

```kubectl delete [pod] [name]```

**View logs**

```kubectl logs [pod-name]```

**Execute in pod**

```kubectl exec -it [pod-name] -- [/bin/bash]```

**Port forward**

```kubectl port-forward [pod-name] [8080:80]```

# SYNOPSIS

**kubectl** [_options_] _command_ [_type_] [_name_] [_flags_]

# PARAMETERS

**get** _TYPE_ [_NAME_]
> List resources of specified type.

**describe** _TYPE_ _NAME_
> Show detailed information about a resource.

**apply** **-f** _FILE_
> Apply configuration from file or directory.

**delete** _TYPE_ _NAME_
> Delete a resource.

**logs** _POD_ [**-c** _container_]
> Show pod logs, optionally for a specific container.

**exec** [**-it**] _POD_ **--** _COMMAND_
> Execute command in a container.

**port-forward** _POD_ _LOCAL:REMOTE_
> Forward local port to pod port.

**scale** _TYPE/NAME_ **--replicas**=_N_
> Scale a resource to N replicas.

**create** _TYPE_ _NAME_
> Create a resource imperatively.

**edit** _TYPE_ _NAME_
> Edit a resource in your default editor.

**-n**, **--namespace** _NAMESPACE_
> Target namespace.

**-o**, **--output** _FORMAT_
> Output format: json, yaml, wide, name.

**-l**, **--selector** _LABEL_
> Filter by label selector.

**--context** _CONTEXT_
> Kubeconfig context to use.

**-A**, **--all-namespaces**
> List resources across all namespaces.

# DESCRIPTION

**kubectl** is the official command-line interface for Kubernetes, used to communicate with the cluster's API server to manage and inspect resources. It supports the full lifecycle of Kubernetes objects, including creating, reading, updating, and deleting resources such as pods, deployments, services, configmaps, and more through declarative manifests or imperative commands.

The tool reads connection details from a kubeconfig file, which defines clusters, users, and contexts that determine which cluster and namespace kubectl targets. Beyond basic resource management, kubectl provides capabilities for debugging with log retrieval and exec sessions, scaling workloads, rolling out updates, port-forwarding to pods, and applying configuration changes from YAML or JSON manifests. Role-based access control (RBAC) on the cluster side governs what operations each authenticated user may perform.

# CAVEATS

Requires kubeconfig. Context determines cluster. RBAC affects access.

# HISTORY

kubectl is the official CLI for **Kubernetes**, developed as the primary cluster management interface.

# SEE ALSO

[kubeadm](/man/kubeadm)(1), [k9s](/man/k9s)(1), [helm](/man/helm)(1), [kubectx](/man/kubectx)(1)
