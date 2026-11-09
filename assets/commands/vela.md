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

```vela port-forward [appname] [8080:80]```

**Execute command** in application container

```vela exec [appname] -- [command]```

**Install KubeVela** on a Kubernetes cluster

```vela install```

**Deploy and wait** until the application is healthy

```vela up -f [app.yaml] --wait --timeout [300s]```

**Preview** the rendered resources without applying them

```vela dry-run -f [app.yaml]```

**Show the resource tree** of an application

```vela status [appname] --tree```

**Enable an addon**

```vela addon enable [addon]```

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

**uninstall**
> Remove KubeVela from a Kubernetes cluster.

**init**
> Create an application description interactively.

**dry-run**
> Render an application and print the resulting Kubernetes resources without applying them.

**live-diff**
> Compare an application file with a deployed revision.

**addon**
> List, enable, disable, and upgrade addons.

**env**
> Manage delivery environments.

**cluster**
> Manage Kubernetes clusters for multi-cluster delivery.

**show**
> Show reference documentation for components, traits, or workflow types.

**components**
> List available component types.

**workflow**
> Operate application delivery workflows (suspend, resume, terminate, restart, rollback, logs, debug).

**version**
> Print version information.

**-n**, **--namespace** _NAMESPACE_
> Specify the namespace scope for the request.

**-e**, **--env** _ENV_
> Specify environment name for the application.

**-y**, **--yes**
> Assume yes for all prompts.

**-f**, **--file** _PATH_
> Application file path or remote URL (up).

**-w**, **--wait**
> Wait until the application is healthy (up) or fully deleted (delete).

**--timeout** _DURATION_
> Time limit for **--wait** on up (default: 300s).

**-c**, **--component** _NAME_
> Filter pods or endpoints by component name (status, logs, exec, port-forward).

**-t**, **--tree**
> Display application resources as a tree (status).

# DESCRIPTION

**vela** is the command-line client for KubeVela, an application delivery platform built on the Open Application Model (OAM). It manages the full lifecycle of applications on Kubernetes, from deployment and scaling to monitoring and rollback.

Applications are defined with components, traits, and policies that abstract away infrastructure complexity. The platform supports multi-cluster deployment, allowing applications to be distributed across different Kubernetes clusters and cloud providers from a single definition.

# CAVEATS

Requires a running Kubernetes cluster with KubeVela installed. Familiarity with Kubernetes concepts and the Open Application Model (OAM) is recommended. Multi-cluster features require additional setup.

# HISTORY

**KubeVela** was created by the Alibaba Cloud team and accepted as a **CNCF sandbox project** in 2021, later graduating to incubation level. It implements the Open Application Model (OAM) specification to simplify application delivery on Kubernetes.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [argocd](/man/argocd)(1)

# RESOURCES

```[Source code](https://github.com/kubevela/kubevela)```

```[Homepage](https://kubevela.io/)```

```[Documentation](https://kubevela.io/docs/)```

<!-- verified: 2026-11-09 -->
