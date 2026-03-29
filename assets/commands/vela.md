# TAGLINE

KubeVela application delivery CLI

# TLDR

**Deploy application** from file

```vela up -f [app.yaml]```

**Show application status**

```vela status [appname]```

**List applications**

```vela ls```

**Delete application**

```vela delete [appname]```

**Show logs** for an application

```vela logs [appname]```

**Port-forward** to an application

```vela port-forward [appname]```

**Execute command** in application container

```vela exec [appname] -- [command]```

**Install KubeVela** on a Kubernetes cluster

```vela install```

# SYNOPSIS

**vela** _command_ [_options_] [_args_]

# PARAMETERS

**up**
> Create or update an application from file or URL.

**status**
> Show application status and health.

**ls**
> List all applications.

**delete**
> Remove an application.

**logs**
> View application logs.

**exec**
> Execute a command in an application container.

**port-forward**
> Forward local ports to an application container or service.

**install**
> Install KubeVela on a Kubernetes cluster.

**show**
> Show reference documentation for components, traits, or workflow types.

**components**
> List available component types.

**workflow**
> Operate application delivery workflows (suspend, resume, restart, rollback).

**version**
> Print version information.

**-n**, **--namespace** _NAMESPACE_
> Specify the namespace scope for the request.

**-e**, **--env** _ENV_
> Specify environment name for the application.

**-y**, **--yes**
> Assume yes for all prompts.

# DESCRIPTION

**vela** is the command-line client for KubeVela, an application delivery platform built on the Open Application Model (OAM). It manages the full lifecycle of applications on Kubernetes, from deployment and scaling to monitoring and rollback.

Applications are defined with components, traits, and policies that abstract away infrastructure complexity. The platform supports multi-cluster deployment, allowing applications to be distributed across different Kubernetes clusters and cloud providers from a single definition.

# CAVEATS

Requires a running Kubernetes cluster with KubeVela installed. Familiarity with Kubernetes concepts and the Open Application Model (OAM) is recommended. Multi-cluster features require additional setup.

# HISTORY

**KubeVela** was created by the Alibaba Cloud team and accepted as a **CNCF sandbox project** in 2021, later graduating to incubation level. It implements the Open Application Model (OAM) specification to simplify application delivery on Kubernetes.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [argocd](/man/argocd)(1)
