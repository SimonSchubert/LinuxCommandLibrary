# TAGLINE

manages Kubernetes secrets from the command line

# TLDR

**List** all secrets with decoded values

```k8sec list```

**Show** the keys and values of one secret

```k8sec list [secret-name]```

Show values **base64-encoded**

```k8sec list --base64 [secret-name]```

**Set** one or more keys in a secret

```k8sec set [secret-name] [key1=value1] [key2=value2]```

**Remove** keys from a secret

```k8sec unset [secret-name] [key1] [key2]```

**Load** keys from a dotenv file

```k8sec load -f [.env] [secret-name]```

**Dump** a secret as a dotenv file

```k8sec dump -f [.env] [secret-name]```

Work in a specific **namespace and context**

```k8sec list -n [namespace] --context [context]```

# SYNOPSIS

**k8sec** _command_ [_options_] [_arguments_]

# COMMANDS

**list** [**--base64**] [_NAME_]
> List secrets with their keys and decoded values.

**set** [**--base64**] _NAME_ _KEY=VALUE_...
> Set keys in a secret. With **--base64**, values are taken as already base64-encoded.

**unset** _NAME_ _KEY_...
> Remove keys from a secret.

**load** [**-f** _FILE_] _NAME_
> Load keys from dotenv (key=value) text, read from a file or stdin.

**dump** [**-f** _FILE_] [**--noquotes**] [_NAME_]
> Print secrets in dotenv format, optionally to a file and without quotes around values.

# PARAMETERS

**-n**, **--namespace** _NAMESPACE_
> Kubernetes namespace (default: default).

**--context** _CONTEXT_
> Kubernetes context to use.

**--kubeconfig** _PATH_
> Path to kubeconfig (default: ~/.kube/config).

**-h**, **--help**
> Display help information.

# DESCRIPTION

**k8sec** manages Kubernetes secrets from the command line. It shows secret values decoded from base64 and lets you set, unset, import and export keys without writing YAML manifests.

The **load** and **dump** commands convert between secrets and dotenv files, which is handy for syncing application environment variables with a cluster.

# CAVEATS

Requires a working kubeconfig and RBAC permissions to read and modify secrets. Secrets are only base64-encoded, not encrypted, unless encryption at rest is enabled in the cluster. Dumped files contain plaintext credentials.

# HISTORY

k8sec was written in **Go** by **dtan4** to make Kubernetes secret management easier than raw kubectl commands.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeseal](/man/kubeseal)(1), [vault](/man/vault)(1)

# RESOURCES

```[Source code](https://github.com/dtan4/k8sec)```

<!-- verified: 2026-09-29 -->
