# TAGLINE

KubeVela application delivery CLI

# TLDR

**Deploy application**

```vela up```

**Show status**

```vela status```

**List applications**

```vela ls```

**Delete application**

```vela delete [appname]```

**Show logs**

```vela logs [appname]```

**Execute command**

```vela exec [appname] -- [command]```

# SYNOPSIS

**vela** _command_ [_options_] [_args_]

# PARAMETERS

**up**
> Deploy application.

**status**
> Show status.

**ls**
> List apps.

**delete**
> Remove app.

**logs**
> View logs.

**exec**
> Run command.

# DESCRIPTION

**vela** is the command-line client for KubeVela, an application delivery platform built on the Open Application Model (OAM). It manages the full lifecycle of applications on Kubernetes, from deployment and scaling to monitoring and rollback.

Applications are defined with components, traits, and policies that abstract away infrastructure complexity. The platform supports multi-cluster deployment, allowing applications to be distributed across different Kubernetes clusters and cloud providers from a single definition.

# CAVEATS

KubeVela required. Kubernetes knowledge. OAM concepts.

# HISTORY

**vela** is the CLI for **KubeVela**, an application delivery platform based on Open Application Model.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [argocd](/man/argocd)(1)
