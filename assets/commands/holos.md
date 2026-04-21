# TAGLINE

Holistic Kubernetes platform manager using CUE

# TLDR

**Show the installed version**

```holos --version```

**Initialize a new platform** in the current directory

```holos init platform [v1alpha5]```

**Render the whole platform** to deploy/ manifests

```holos render platform```

**Render a single component**

```holos render component [path/to/component]```

**Render using an alternate platform directory**

```holos render platform --platform [path/to/platform]```

**List build plans** the platform produces

```holos show buildplans```

# SYNOPSIS

**holos** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**Holos** is a configuration management tool for Kubernetes that implements the **rendered manifests pattern**. Instead of templating YAML, platforms and their components are described in **CUE**; **holos** combines CUE specs with **Helm** charts and **Kustomize** overlays and writes the resulting manifests to disk so they can be committed to Git and applied by any GitOps controller (Argo CD, Flux, etc.).

A platform consists of a root directory containing **cue.mod/** and a generated **platform.gen.cue** describing a Platform resource. Each component lives in its own directory and exports a **BuildPlan** that **holos render** executes. The output is plain Kubernetes YAML under _deploy/_, which makes diffs reviewable and decouples rendering from cluster access.

# COMMANDS

**init platform** _version_
> Scaffold a new platform using the given API version (e.g. _v1alpha5_). Creates _platform/_, _cue.mod/_, and _platform.gen.cue_.

**render platform**
> Render every component of the platform into _deploy/_.

**render component** _path_
> Render a single component directory.

**show buildplans**
> Print the BuildPlan resources Holos will execute.

**generate**
> Run code generators (e.g. regenerate CUE schemas from Kubernetes CRDs).

**version**
> Print build and API version information.

**help** [_command_]
> Show help for a command.

# PARAMETERS

**--platform** _dir_
> Override the default platform directory (_platform/_) used as the rendering entry point.

**--version**
> Print the Holos version and exit.

**--help**, **-h**
> Show help for a command.

# CAVEATS

Holos is pre-1.0 and the API is versioned per directory (**v1alpha3**, **v1alpha4**, **v1alpha5**, ...); mixing versions in one platform is not supported, and upgrading usually requires regenerating **platform.gen.cue**. CUE has a learning curve if you are coming from Helm/Kustomize-only workflows. The tool itself only renders manifests — applying them to a cluster is left to your GitOps controller or **kubectl apply**.

# HISTORY

Started by **Jeff McCune** and the **holos-run** collective in **2023** to address drawbacks of pure templating in large multi-cluster Kubernetes platforms. Written in **Go** and **CUE** and released under **Apache 2.0**. Distributed via **Homebrew** (_brew install holos-run/tap/holos_) and as static binaries from GitHub releases.

# SEE ALSO

[cue](/man/cue)(1), [helm](/man/helm)(1), [kustomize](/man/kustomize)(1), [kubectl](/man/kubectl)(1), [argocd](/man/argocd)(1)
