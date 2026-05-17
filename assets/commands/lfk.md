# TAGLINE

Lightning-fast Miller-columns TUI for Kubernetes

# TLDR

**Launch** with the default kubeconfig

```lfk```

**Open a specific context and namespace**

```lfk --context [my-cluster] -n [kube-system]```

**Use a custom kubeconfig file**

```lfk --kubeconfig [/path/to/kubeconfig]```

**Combine multiple kubeconfigs** via environment

```KUBECONFIG=[/path/to/c1]:[/path/to/c2] lfk```

**Load every kubeconfig in a directory**

```lfk --kubeconfig-dir [/path/to/configs/]```

# SYNOPSIS

**lfk** [_options_]

# PARAMETERS

**--context** _name_
> Start in the given Kubernetes context.

**-n** _namespace_, **--namespace** _namespace_
> Open in the given namespace.

**--kubeconfig** _file_
> Override **KUBECONFIG** with the given file (colon-separated paths are supported).

**--kubeconfig-dir** _dir_
> Treat every file under _dir_ as a kubeconfig and load them all.

**--read-only**
> Start in read-only mode; mutating actions are disabled.

**--theme** _name_
> Pick one of the bundled colour themes (press **T** at runtime to switch).

**--help**
> Print built-in help and exit.

# KEY BINDINGS

**h / Left**, **l / Right**
> Move up or down a column in the Miller layout.

**j / Down**, **k / Up**
> Move the cursor within the active column.

**gg / Home**, **G / End**
> Jump to the top or bottom of the list.

**Enter**
> Open a full-screen YAML view of the selected resource.

**f**
> Filter the current list.

**/**
> Incremental search and jump.

**Space**
> Toggle multi-select for bulk actions.

**x**
> Open the action menu (logs, exec, debug, scale, delete, port-forward, ...).

**Ctrl+R**
> Toggle read-only mode at runtime.

**T**
> Cycle through bundled colour themes.

**?**
> Show the help screen.

# DESCRIPTION

**lfk** is a keyboard-driven terminal user interface for navigating and operating **Kubernetes** clusters, inspired by the **yazi** file manager. It presents resources in a three-column **Miller columns** layout (context → resource type → resource → owned resources → containers) so an operator can drill from cluster to log line without leaving the keyboard.

Beyond browsing, **lfk** supports the day-to-day operations expected from a Kubernetes CLI: tailing **logs**, **exec**'ing into containers, running **kubectl debug**, scaling workloads, deleting resources, and port-forwarding services. **Multi-cluster** and **multi-context** workflows are first-class; tabs and a quick switcher allow jumping between clusters in a single session. Optional integrations expose **Helm** releases, **ArgoCD** applications, **KEDA** scalers, and **External Secrets**.

A built-in **Prometheus** alert view surfaces firing alerts alongside the resources they reference. The binary is written in Go and ships as a single static executable.

# CONFIGURATION

**~/.config/lfk/config.yaml**
> User configuration: theme, search abbreviations, default context, keybindings.

**~/.config/lfk/keys.yaml**
> Custom keybinding overrides.

**KUBECONFIG** / **KUBECONFIG_DIR**
> Environment variables consumed in the same way as **kubectl**.

# CAVEATS

Requires **kubectl** to be installed and reachable on **PATH**. **helm** and **trivy** are optional but disable their respective integrations when missing. Mutating actions are guarded by a confirmation prompt; the **--read-only** flag and **Ctrl+R** toggle add an extra safety net for production clusters.

# HISTORY

**lfk** was created by **Janos Miko** and first released in **2024** on GitHub. Inspired by the resource-list/preview ergonomics of **yazi** and the keyboard speed of **k9s**, it aims to give SREs a faster path between *"where is the problem"* and *"what does the log say"*.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1), [helm](/man/helm)(1), [yazi](/man/yazi)(1)
