# TAGLINE

Marketplace CLI to install developer tools and Kubernetes apps

# TLDR

**Download** popular CLIs into PATH

```arkade get [kubectl] [kind] [terraform]```

**List** available CLI packages

```arkade get --help```

**Install** a Kubernetes app (OpenFaaS example)

```arkade install [openfaas]```

**Install** a system package (e.g. Go)

```arkade system install [go]```

**Install** a binary from an OCI image

```arkade oci install [ghcr.io/org/tool]```

# SYNOPSIS

**arkade** *command* [*args*]

# DESCRIPTION

**arkade** installs pinned versions of common developer CLIs and Kubernetes applications with simple commands. **arkade get** downloads static binaries (kubectl, helm, terraform, jq, …) without package-manager delays; **arkade install** deploys charts/apps to a cluster; **arkade system** and **arkade oci** cover host packages and image-packaged tools. Maintained by Alex Ellis / OpenFaaS community.

# PARAMETERS

**get** *tool*[@version]...

> Download CLI binaries to the arkade bin directory (often **$HOME/.arkade/bin**).

**install** *app*

> Install a Kubernetes application with sensible defaults and flags.

**uninstall** *app*

> Remove a previously installed app.

**system install** *package*

> Install host-level tools (Go, containerd, …).

**oci install** *image* [*path*]

> Extract/install from an OCI container image.

**info** / **chart** / **version**

> Introspection helpers—see **arkade --help**.

# CAVEATS

Downloading binaries from the internet requires trust in upstream release artifacts. Kubernetes installs need a working kubeconfig. Keep **$HOME/.arkade/bin** on your PATH.

# INSTALL

```zypper: sudo zypper install arkade```

```brew: brew install arkade```

```nix: nix profile install nixpkgs#arkade```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [kind](/man/kind)(1)

# RESOURCES

```[Source code](https://github.com/alexellis/arkade)```

```[Homepage](https://arkade.dev)```

<!-- verified: 2026-07-19 -->
