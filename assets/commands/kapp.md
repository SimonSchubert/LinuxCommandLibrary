# TAGLINE

Kubernetes application deploy tool focused on labeled resource sets

# TLDR

**Deploy** an application from YAML

```kapp deploy -a [my-app] -f [manifests/] -y```

**List** apps in the cluster

```kapp list```

**Inspect** app resources

```kapp inspect -a [my-app]```

**Delete** an app and its resources

```kapp delete -a [my-app] -y```

# SYNOPSIS

**kapp** *command* [*options*]

# DESCRIPTION

**kapp** (Carvel) deploys sets of Kubernetes resources as a named “app”, tracking ownership via labels. It calculates creates/updates/deletes, waits for reconciliation, and supports diff inspection before apply. Often used with **ytt** for templating and **kbld** for image resolution.

# PARAMETERS

**deploy** **-a** *name* **-f** *path*

> Deploy or update an app. **-y** skips confirmation.

**list**

> List apps.

**inspect** **-a** *name*

> Show resources belonging to an app.

**delete** **-a** *name*

> Delete app resources.

**logs** / **diff** related commands

> Debugging helpers—see **kapp --help**.

# CAVEATS

Requires working **kubectl** cluster access. Label-based ownership can conflict if labels are edited manually. Not a full Helm replacement for chart ecosystems.

# INSTALL

```apk: sudo apk add kapp```

```brew: brew install kapp```

```nix: nix profile install nixpkgs#kapp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kubectl](/man/kubectl)(1), [ytt](/man/ytt)(1), [helm](/man/helm)(1), [kustomize](/man/kustomize)(1)

# RESOURCES

```[Source code](https://github.com/carvel-dev/kapp)```

```[Homepage](https://carvel.dev/kapp/)```

```[Documentation](https://carvel.dev/kapp/docs/)```

<!-- verified: 2026-07-19 -->
