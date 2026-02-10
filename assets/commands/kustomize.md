# TAGLINE

customizes Kubernetes YAML configurations without templates

# TLDR

**Build kustomization** from current directory

```kustomize build .```

**Build from specific directory**

```kustomize build [path/to/overlay]```

**Build from git repository**

```kustomize build [https://github.com/org/repo//path]```

**Create new kustomization** in current directory

```kustomize create```

**Create with autodetected resources**

```kustomize create --autodetect```

**Edit to add a resource**

```kustomize edit add resource [deployment.yaml]```

**Edit to set namespace**

```kustomize edit set namespace [my-namespace]```

**Edit to set image tag**

```kustomize edit set image [nginx:1.25]```

# SYNOPSIS

**kustomize** _command_ [_options_]

# COMMANDS

**build** [_path_]
> Build kustomization target from directory or URL to stdout.

**create**
> Create a new kustomization.yaml in current directory.

**edit**
> Edit an existing kustomization.yaml file.

**cfg**
> Commands for reading and writing configuration.

**fn**
> Commands for running functions against configuration.

**completion** _shell_
> Generate shell completion script.

**version**
> Print kustomize version.

**help**
> Help about any command.

# PARAMETERS

**--enable-helm**
> Enable Helm chart inflator generator.

**--enable-alpha-plugins**
> Enable alpha kustomize plugins.

**--as-current-user**
> Use uid and gid of command executor.

**--load-restrictor** _value_
> Control file loading: LoadRestrictionsRootOnly or LoadRestrictionsNone.

**-o**, **--output** _path_
> Write output to file instead of stdout.

**--stack-trace**
> Print stack trace on error.

**-h**, **--help**
> Show help information.

# EDIT SUBCOMMANDS

**edit add resource** _file_
> Add a resource to kustomization.

**edit add patch** _file_
> Add a patch file.

**edit set namespace** _name_
> Set the namespace for all resources.

**edit set image** _name:tag_
> Set or override an image tag.

**edit set replicas** _name=count_
> Set replica count for a deployment.

**edit add label** _key:value_
> Add a label to all resources.

**edit add annotation** _key:value_
> Add an annotation to all resources.

# DESCRIPTION

**kustomize** customizes Kubernetes YAML configurations without templates. It uses a **kustomization.yaml** file to declaratively specify base resources and overlay modifications like patches, labels, namespaces, and image tags.

The tool follows a base/overlay pattern: bases contain common resources, overlays customize them for specific environments (dev, staging, prod). This approach avoids duplication while maintaining environment-specific differences.

Kustomize is built into kubectl (since v1.14) as **kubectl kustomize** and **kubectl apply -k**. The standalone CLI provides the latest features and is recommended for advanced use cases.

Key concepts include **resources** (YAML files to include), **patches** (strategic merge or JSON patches), **configMapGenerator** and **secretGenerator** (generate ConfigMaps/Secrets from files), and **vars** (variable substitution).

# CAVEATS

The kubectl-embedded version may lag behind the standalone CLI. Some features require **--enable-helm** or **--enable-alpha-plugins** flags. Variable substitution has limitations compared to templating tools like Helm.

# HISTORY

Kustomize was developed by the **Kubernetes SIG CLI** team starting around **2017** as a template-free approach to Kubernetes configuration management. It was integrated into kubectl in version **1.14 (2019)**. The project emphasizes declarative configuration and follows Kubernetes' philosophy of desired state management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [k9s](/man/k9s)(1)
