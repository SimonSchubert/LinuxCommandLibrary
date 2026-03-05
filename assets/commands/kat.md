# TAGLINE

TUI and rule-based rendering engine for Kubernetes manifests

# TLDR

**Render and view manifests** in the current directory

```kat```

**Render with a specific profile**

```kat -p [profile_name]```

# SYNOPSIS

**kat** [**-p** _profile_] [_options_]

# DESCRIPTION

**kat** is a TUI and rule-based rendering engine for Kubernetes manifests. It lets you render, filter, and review **Helm** or **Kustomize** manifests in-shell, reloading on changes and flagging errors to streamline chart and manifest development.

Core features include profile-based manifest generation, automatic validation with **kubeconform** and **kyverno**, live reload with diff visualization, pre/post-render hooks, a plugin system for custom commands, and Chroma theme support.

# CAVEATS

Requires Helm and/or Kustomize to be installed for rendering. Validation tools (kubeconform, kyverno) are optional but recommended.

# HISTORY

**kat** was designed for Kubernetes engineers and DevOps teams to eliminate context-switching during manifest development by providing persistent, navigable views of rendered resources with instant feedback.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [kustomize](/man/kustomize)(1)
