# TLDR

**List** all applications

```argocd app list```

**Create** new application

```argocd app create [name] --repo [repo_url] --path [path] --dest-server [cluster_url] --dest-namespace [namespace]```

**Sync** application

```argocd app sync [name]```

**Delete** application

```argocd app delete [name]```

Get application **details**

```argocd app get [name]```

**Diff** against Git

```argocd app diff [name]```

# SYNOPSIS

**argocd app** _command_ [_options_]

# DESCRIPTION

**argocd app** manages Argo CD applications, which represent deployed Kubernetes resources synced from Git repositories. Each application links a Git path to a Kubernetes destination.

Applications can be synced manually or automatically, with Argo CD monitoring for drift between desired (Git) and live (cluster) state.

# PARAMETERS

**create** _name_
> Create new application

**list**
> List all applications

**get** _name_
> Get application details

**sync** _name_
> Sync application with Git

**delete** _name_
> Delete application

**diff** _name_
> Show diff with Git state

**history** _name_
> Show deployment history

**rollback** _name_ _id_
> Rollback to previous revision

**set** _name_
> Modify application settings

**--repo** _url_
> Git repository URL

**--path** _path_
> Path within repository

**--dest-server** _url_
> Kubernetes cluster URL

**--dest-namespace** _ns_
> Target namespace

**--sync-policy** _policy_
> Sync policy (manual, automated)

# CAVEATS

Applications require repository and cluster access configured. Automated sync should be used carefully in production. Pruning can delete resources.

# HISTORY

Application management is the core functionality of Argo CD, central to the GitOps workflow since the project's creation in **2018**.

# SEE ALSO

[argocd](/man/argocd)(1), [kubectl](/man/kubectl)(1)
