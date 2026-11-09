# TAGLINE

.NET microservice development and deployment tool

# TLDR

**Run application**

```tye run```

**Run with dashboard on a specific port**

```tye run --dashboard --port [9000]```

**Run services as Docker containers**

```tye run --docker```

**Run with file watching for live reload**

```tye run --watch```

**Deploy to Kubernetes**

```tye deploy```

**Initialize a tye.yaml config file**

```tye init```

**Wait for a debugger** on every service

```tye run --debug "*"```

**Deploy interactively**, prompting for required values

```tye deploy --interactive```

**Build and push** containers without deploying

```tye push```

**Remove** a deployed application

```tye undeploy```

# SYNOPSIS

**tye** _command_ [_options_] [_path_]

# PARAMETERS

**run**
> Run the application locally.

**build**
> Build containers for the application.

**push**
> Build containers and push them to the container registry.

**deploy**
> Deploy the application to Kubernetes.

**undeploy**
> Remove a deployed application from Kubernetes.

**init**
> Scaffold a tye.yaml configuration file.

**--dashboard**
> Launch the web dashboard on run.

**--port** _PORT_
> Port for the dashboard (default: 8000).

**--docker**
> Run projects as Docker containers.

**--watch**
> Monitor for file changes and restart modified services.

**--no-build**
> Do not build projects before running.

**--debug** _SERVICE_
> Wait for debugger attach to a service. Use * for all services.

**--logs** _PROVIDER_
> Write structured logs to a provider (console, elastic, ai, seq).

**--tags** _TAGS_
> Filter running services by tag.

**--dtrace** _PROVIDER_
> Write distributed traces to a provider (zipkin).

**-f, --framework** _TFM_
> Target framework hint for cross-targeting projects.

**-i, --interactive**
> Prompt for required values (build, push, deploy, undeploy).

**-n, --namespace** _NAME_
> Kubernetes namespace (deploy, undeploy).

**--force**
> Override validation and force deployment; with **init**, overwrite an existing tye.yaml.

**--what-if**
> With **undeploy**, show what would be deleted.

**-v, --verbosity** _LEVEL_
> Output verbosity: Debug, Info (default), Quiet.

# DESCRIPTION

**Tye** is an experimental development tool from Microsoft that simplifies running and deploying .NET microservice applications. It orchestrates multiple services locally, starting them together with a single command and providing a web dashboard for monitoring their status, logs, and endpoints.

The tool handles service discovery automatically, allowing microservices to find each other without manual configuration of ports and addresses. Building and containerizing services is streamlined for deployment to Kubernetes clusters.

Configuration is defined in a **tye.yaml** file that lists services, their dependencies, and deployment settings.

# CAVEATS

Tye is an experimental project and is no longer developed; its GitHub repository is archived. It requires .NET SDK. Kubernetes deployment requires a container registry and cluster access.

# HISTORY

**Tye** was created by **Microsoft** as an experimental tool for developing and deploying microservices in .NET.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [dotnet](/man/dotnet)(1), [kubectl](/man/kubectl)(1), [helm](/man/helm)(1)

# RESOURCES

```[Source code](https://github.com/dotnet/tye)```

```[Documentation](https://github.com/dotnet/tye/tree/main/docs)```

<!-- verified: 2026-11-09 -->
