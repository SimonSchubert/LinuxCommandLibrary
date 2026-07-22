# TAGLINE

Bootstrap Flux on a Kubernetes cluster using GitOps

# TLDR

**Bootstrap Flux** using a GitHub repository (personal account)

```flux bootstrap github --owner [username] --repository [repo] --path [clusters/my-cluster] --personal```

**Bootstrap using GitLab**

```flux bootstrap gitlab --owner [group] --repository [repo] --path [clusters/my-cluster]```

**Bootstrap from a generic Git repository** over SSH

```flux bootstrap git --url ssh://git@example.com/repo.git --branch main --path ./clusters/my-cluster```

# SYNOPSIS

**flux** **bootstrap** _provider_ [_options_]

# DESCRIPTION

**flux bootstrap** installs Flux on a Kubernetes cluster by pushing the necessary manifests to a Git repository and configuring the cluster to sync from it. This establishes the GitOps control plane (source-controller, kustomize-controller, helm-controller, notification-controller, etc.).

It supports GitHub, GitLab, Gitea, Bitbucket Server, and generic Git repositories. The command creates the `flux-system` namespace, required secrets, and the initial GitRepository + Kustomization that keeps Flux itself up to date.

After bootstrap, the cluster is managed declaratively from Git.

# PARAMETERS

Common options across providers:

**--owner** _name_
> GitHub/GitLab owner or organization.

**--repository** _name_
> Name of the repository.

**--path** _path_
> Path within the repository where manifests live (e.g. `clusters/my-cluster`).

**--branch** _branch_
> Git branch (default `main`).

**--personal**
> Use a personal access token instead of an organization app.

**--private-key-file** _file_
> Path to SSH private key.

**--components** _list_
> Comma-separated list of components to install (default includes source, kustomize, helm, and notification controllers).

**--components-extra** _list_
> Additional components (e.g. `image-reflector-controller,image-automation-controller`).

**--token-auth**
> Use a personal access token instead of an SSH deploy key.

Other provider-specific options exist (see `flux bootstrap --help`).

# CAVEATS

Bootstrap requires a working `kubectl` context with cluster admin permissions and appropriate Git credentials. The repository must already exist (or be created by the command when using supported providers).

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-check](/man/flux-check)(1), [flux-create](/man/flux-create)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_bootstrap/)```

<!-- verified: 2026-07-11 -->
