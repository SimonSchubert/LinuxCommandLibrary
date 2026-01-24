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

# DESCRIPTION

**skaffold** automates Kubernetes development workflow. It handles building, pushing, and deploying.

Dev mode watches for changes. Rebuilds and redeploys automatically on save.

Build integrates with Docker, Jib, Buildpacks. Multi-builder configurations supported.

Profiles customize for environments. Dev, staging, prod with different settings.

Port forwarding provides local access. Services available on localhost.

# CAVEATS

Requires Kubernetes cluster. Docker or alternative builder needed. Learning curve for configuration.

# HISTORY

**Skaffold** was created by **Google** for Kubernetes development. It simplifies the inner development loop for containerized applications.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1), [helm](/man/helm)(1)
