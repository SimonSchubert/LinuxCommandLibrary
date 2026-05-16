# TAGLINE

manage kubeconfig files: clusters, users, and contexts

# TLDR

**View** the merged kubeconfig

```kubectl config view```

**View raw** kubeconfig including secrets

```kubectl config view --raw```

**Show current context**

```kubectl config current-context```

**List contexts**

```kubectl config get-contexts```

**Switch context**

```kubectl config use-context [context-name]```

**Set default namespace** for the current context

```kubectl config set-context --current --namespace=[namespace]```

**Add a cluster** entry

```kubectl config set-cluster [name] --server=[https://api.example.com]```

**Delete a context**

```kubectl config delete-context [context-name]```

# SYNOPSIS

**kubectl config** _SUBCOMMAND_ [_options_]

# PARAMETERS

**view**
> Display the merged kubeconfig. Use **--raw** to include credentials, **--minify** to show only the current context, **-o** for a different output format.

**current-context**
> Print the current-context.

**use-context** _NAME_
> Set the current-context in the kubeconfig.

**get-contexts** [_NAME_]
> List one or all contexts.

**set-context** _NAME_ | **--current**
> Create or modify a context. Use **--current** to update the active context (commonly with **--namespace**).

**rename-context** _OLD_ _NEW_
> Rename a context.

**delete-context** _NAME_
> Remove a context.

**get-clusters**
> List clusters defined in the kubeconfig.

**set-cluster** _NAME_ [**--server**=_URL_] [**--certificate-authority**=_FILE_] [**--insecure-skip-tls-verify**]
> Create or modify a cluster entry.

**delete-cluster** _NAME_
> Remove a cluster entry.

**get-users**
> List users defined in the kubeconfig.

**set-credentials** _NAME_ [**--token**=_BEARER_] [**--client-certificate**=_FILE_] [**--client-key**=_FILE_] [**--username**=_USER_ **--password**=_PASS_]
> Create or modify a user entry.

**delete-user** _NAME_
> Remove a user entry.

**set** _PROPERTY_ _VALUE_
> Set an individual value in the kubeconfig (dotted path).

**unset** _PROPERTY_
> Unset an individual value.

**--kubeconfig** _FILE_
> Operate on a specific kubeconfig file instead of the default chain.

**--help**
> Display help information.

# DESCRIPTION

**kubectl config** manages **kubeconfig** files, which store the connection details, credentials, and preferences needed to interact with Kubernetes clusters. A kubeconfig defines three list-shaped sections: **clusters**, **users**, and **contexts**, where each context binds a cluster, a user, and an optional default namespace.

By default kubectl reads `~/.kube/config`. The loading order is the explicit **--kubeconfig** flag, then the colon-separated paths in the **KUBECONFIG** environment variable, then `~/.kube/config`. When **KUBECONFIG** lists multiple files, they are merged in order, with earlier files winning conflicts.

The subcommands let you inspect the merged view, switch between contexts to target different clusters, set per-context defaults such as the namespace, and add or remove cluster, user and context entries.

# CAVEATS

**kubectl config view** redacts credentials by default; use **--raw** when you actually need the secret material (and handle the output carefully). **kubectl config** is a subcommand of **kubectl**: it edits the kubeconfig file, it does not talk to the cluster. For interactive context and namespace switching many users prefer **kubectx** and **kubens**.

# HISTORY

**kubectl config** has shipped with **kubectl** since early **Kubernetes** releases and codifies the kubeconfig format used across the ecosystem (kubectl, client-go, Helm, kustomize, ...).

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1)
