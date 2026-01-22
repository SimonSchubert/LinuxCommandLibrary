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

**get** _TYPE_
> List resources.

**describe** _TYPE_ _NAME_
> Show resource details.

**apply** **-f** _FILE_
> Apply configuration.

**delete** _TYPE_ _NAME_
> Delete resource.

**logs** _POD_
> Show pod logs.

**exec** _POD_
> Execute in container.

**-n** _NAMESPACE_
> Target namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl** is the Kubernetes command-line tool. It communicates with the Kubernetes API to manage cluster resources.

The tool creates, inspects, updates, and deletes workloads. It's the primary interface for cluster administration.

kubectl manages Kubernetes clusters.

# CAVEATS

Requires kubeconfig. Context determines cluster. RBAC affects access.

# HISTORY

kubectl is the official CLI for **Kubernetes**, developed as the primary cluster management interface.

# SEE ALSO

[kubeadm](/man/kubeadm)(1), [k9s](/man/k9s)(1), [helm](/man/helm)(1), [kubectx](/man/kubectx)(1)
