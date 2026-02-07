# TAGLINE

GitOps continuous delivery CLI for Kubernetes

# TLDR

**Login** to Argo CD server

```argocd login [argocd.example.com]```

**List** applications

```argocd app list```

**Create** application

```argocd app create [app-name] --repo [https://github.com/user/repo] --path [k8s/] --dest-server [https://kubernetes.default.svc]```

**Sync** application

```argocd app sync [app-name]```

**Get** application details

```argocd app get [app-name]```

# SYNOPSIS

**argocd** _command_ [_options_]

# DESCRIPTION

**argocd** is the CLI for Argo CD, a declarative GitOps continuous delivery tool for Kubernetes. It manages applications, clusters, repositories, and projects through the Argo CD server.

The tool enables GitOps workflows where Git repositories are the source of truth for Kubernetes application definitions.

# PARAMETERS

**login** _server_
> Authenticate with Argo CD server

**app** _command_
> Application management commands

**cluster** _command_
> Cluster management commands

**repo** _command_
> Repository management commands

**proj** _command_
> Project management commands

**account** _command_
> Account management commands

**--server** _url_
> Argo CD server address

**--auth-token** _token_
> Authentication token

**--grpc-web**
> Use gRPC-Web for communication

**--insecure**
> Skip TLS verification

# CONFIGURATION

**~/.config/argocd/config**
> Stores authentication contexts for Argo CD servers including server addresses and auth tokens.

# CAVEATS

Requires running Argo CD server. Server must have access to Git repositories and Kubernetes clusters. RBAC controls access to applications.

# HISTORY

**Argo CD** was created by Intuit and open-sourced in **2018**. It became a CNCF incubating project, establishing itself as a leading GitOps solution for Kubernetes.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [flux](/man/flux)(1)
