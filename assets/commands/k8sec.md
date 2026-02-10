# TAGLINE

manages Kubernetes secrets from the command line

# TLDR

**List secrets**

```k8sec list```

**Get secret value**

```k8sec get [secret-name]```

**Set secret**

```k8sec set [secret-name] [key=value]```

**Delete secret key**

```k8sec unset [secret-name] [key]```

**List in namespace**

```k8sec list -n [namespace]```

**Dump secret as env**

```k8sec dump [secret-name]```

# SYNOPSIS

**k8sec** _command_ [_options_]

# PARAMETERS

**list**
> List secrets.

**get** _NAME_
> Get secret values.

**set** _NAME_ _KEY=VALUE_
> Set secret key.

**unset** _NAME_ _KEY_
> Remove secret key.

**dump** _NAME_
> Export as env vars.

**-n** _NAMESPACE_
> Kubernetes namespace.

**--help**
> Display help information.

# DESCRIPTION

**k8sec** manages Kubernetes secrets from the command line. It simplifies viewing and editing secret values.

The tool decodes base64 automatically. It provides an easier interface than kubectl for secret management.

# CAVEATS

Requires kubeconfig. Secrets stored base64. Consider RBAC permissions.

# HISTORY

k8sec was created to simplify Kubernetes secret management with a more intuitive command-line interface.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeseal](/man/kubeseal)(1), [vault](/man/vault)(1)
