# TAGLINE

Terminal user interface (TUI) for Kubernetes API inspired by k9s

# TLDR

**Launch b4n** with the default kubeconfig and context

```b4n```

**Start with a specific resource** kind

```b4n [pods]```

**Use a specific kubeconfig** context

```b4n --context [my-cluster]```

**Focus on a specific namespace** at startup

```b4n --namespace [kube-system]```

**Start with a cluster-wide view** across all namespaces

```b4n --all-namespaces```

**Use a custom kubeconfig** file

```b4n --kube-config [path/to/kubeconfig]```

**Skip TLS certificate verification**

```b4n --insecure```

# SYNOPSIS

**b4n** [_options_] [_resource_]

# PARAMETERS

**--kube-config** _path_
> Path to the kubeconfig file. Defaults to **$HOME/.kube/config**. Can also be set via the **KUBECONFIG** environment variable.

**--context** _name_
> Kubernetes context to use from the kubeconfig file.

**-n**, **--namespace** _name_
> Namespace to focus on at startup.

**-A**, **--all-namespaces**
> Start with a cluster-wide view showing resources across all namespaces.

**--insecure**
> Skip TLS certificate verification when connecting to the cluster.

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Print help information.

# DESCRIPTION

**b4n** is an interactive terminal user interface for managing Kubernetes clusters, written in Rust using the **kube-rs** and **ratatui** libraries. It provides a keyboard-driven interface for performing common Kubernetes operations without leaving the terminal.

The TUI supports full CRUD operations on Kubernetes resources. Users can list, create, edit, and delete resources through the interactive interface. Additional capabilities include viewing resource events with **e**, streaming pod and container logs with **l**, launching interactive shell sessions in containers with **s**, inspecting resource YAML with **y**, decoding secrets with **x**, and configuring port forwarding with **f**.

Navigation uses a command palette accessible via **:** or **>**, along with dedicated keys for namespace selection (**left arrow**) and resource kind selection (**right arrow**). Resources can be filtered with **/**, and columns can be sorted with **Alt+[0-9]**. Resources are selected with **Space** and deleted with **Ctrl+D** after confirmation. Mouse support can be toggled with **Ctrl+N**.

The command palette supports configurable aliases for quick resource access. Default aliases include **pp** for pods, **svc** for services, **cm** for configmaps, **ds** for daemonsets, **ns** for namespaces, **pvc** for persistentvolumeclaims, and **sts** for statefulsets, among others.

# CONFIGURATION

Configuration is stored in **$HOME/.b4n/** with the following structure:

**config.yaml**
> Main application settings including log preferences, mouse support, active theme, context-specific highlight colors, resource aliases, and custom key bindings. Auto-generated with defaults if missing.

**themes/**
> Directory containing TUI theme files in YAML format. A default theme is auto-generated on first run.

**history.yaml**
> Stores filter and search history per Kubernetes context, as well as the last used namespace and resource kind.

**logs/**
> Daily application log files for debugging.

Key configuration options in **config.yaml** include **logs.lines** (number of retrieved log lines, default 800), **logs.timestamps** (show timestamps in logs, default true), **mouse** (enable mouse support, default true), **theme** (active theme name), **contexts** (per-cluster highlight colors), **aliases** (command palette shortcuts), and **key_bindings** (custom key mappings supporting Ctrl, Alt, and function keys).

# CAVEATS

Requires a valid kubeconfig file and network access to a Kubernetes cluster. A terminal font with Nerd Font symbols (such as Cascadia Code) is recommended for proper UI rendering. Building from source requires Rust 1.88 or newer. The project is under active development and was created primarily as a Rust learning exercise.

# SEE ALSO

[k9s](/man/k9s)(1), [kubectl](/man/kubectl)(1), [helm](/man/helm)(1)
