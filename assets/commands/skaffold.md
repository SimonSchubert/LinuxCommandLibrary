# TAGLINE

Automate Kubernetes development workflows

# TLDR

**Initialize skaffold**

```skaffold init```

**Development mode**

```skaffold dev```

**Build images**

```skaffold build```

**Deploy to cluster**

```skaffold deploy```

**Run once**

```skaffold run```

**Delete deployment**

```skaffold delete```

**Debug mode**

```skaffold debug```

**Render manifests**

```skaffold render```

# SYNOPSIS

**skaffold** _command_ [_-f config_] [_options_]

# PARAMETERS

**init**
> Create config.

**dev**
> Continuous development.

**build**
> Build images.

**deploy**
> Deploy to cluster.

**run**
> Build and deploy once.

**delete**
> Remove deployment.

**debug**
> Debug mode.

**-f**, **--filename** _FILE_
> Config file.

**-p**, **--profile** _NAME_
> Use profile.

**-n**, **--namespace** _NS_
> Kubernetes namespace.

**--default-repo** _REPO_
> Default image repository (overrides global config).

**--kube-context** _CTX_
> Deploy to specified Kubernetes context.

**--tail**
> Stream logs from deployed objects (default: true in dev mode).

**--port-forward**
> Port-forward exposed container ports within pods.

**--trigger** _MODE_
> Change detection trigger: polling, notify, or manual (default: notify).

# COMMANDS

**verify**
> Run verification tests against deployments.

**test**
> Run tests against built application images.

**apply**
> Apply hydrated manifests to a cluster.

**diagnose**
> Run a diagnostic on Skaffold configuration.

**fix**
> Update old configuration to a newer schema version.

# DESCRIPTION

**Skaffold** automates the Kubernetes development workflow by handling the build, push, and deploy cycle for containerized applications. The **dev** command watches source files for changes and automatically rebuilds images and redeploys to the cluster on each save, providing a rapid inner development loop.

The tool integrates with multiple build systems including Docker, Jib, and Cloud Native Buildpacks, and supports deployment via kubectl, Helm, and kustomize. Profiles allow customizing the pipeline for different environments such as development, staging, and production, each with different image registries, build configurations, and deployment targets.

Port forwarding automatically exposes deployed services on localhost, and the **debug** command configures remote debugging for supported languages.

# CAVEATS

Requires Kubernetes cluster. Docker or alternative builder needed. Learning curve for configuration.

# HISTORY

**Skaffold** was created by **Google** for Kubernetes development. It simplifies the inner development loop for containerized applications.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1), [helm](/man/helm)(1), [devspace](/man/devspace)(1)
