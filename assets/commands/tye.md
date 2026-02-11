# TAGLINE

.NET microservice development and deployment tool

# TLDR

**Run application**

```tye run```

**Run with dashboard**

```tye run --dashboard```

**Build project**

```tye build```

**Deploy to Kubernetes**

```tye deploy```

**Initialize config**

```tye init```

# SYNOPSIS

**tye** _command_ [_--dashboard_] [_options_]

# PARAMETERS

**run**
> Run application.

**build**
> Build containers.

**deploy**
> Deploy to K8s.

**init**
> Create tye.yaml.

**--dashboard**
> Enable dashboard.

**--port** _PORT_
> Dashboard port.

# DESCRIPTION

**Tye** is an experimental development tool from Microsoft that simplifies running and deploying .NET microservice applications. It orchestrates multiple services locally, starting them together with a single command and providing a web dashboard for monitoring their status, logs, and endpoints.

The tool handles service discovery automatically, allowing microservices to find each other without manual configuration of ports and addresses. Building and containerizing services is streamlined for deployment to Kubernetes clusters.

Configuration is defined in a **tye.yaml** file that lists services, their dependencies, and deployment settings.

# CAVEATS

.NET focused. Experimental tool. Microsoft project.

# HISTORY

**Tye** was created by **Microsoft** as an experimental tool for developing and deploying microservices in .NET.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [dotnet](/man/dotnet)(1), [kubectl](/man/kubectl)(1)
