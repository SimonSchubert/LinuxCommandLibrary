# TLDR

**Seal secret**

```kubeseal < [secret.yaml] > [sealed-secret.yaml]```

**Seal with controller name**

```kubeseal --controller-name=[sealed-secrets] < [secret.yaml]```

**Seal specific namespace**

```kubeseal --namespace=[namespace] < [secret.yaml]```

**Fetch certificate**

```kubeseal --fetch-cert > [cert.pem]```

**Seal from literal**

```kubectl create secret generic [name] --dry-run=client -o yaml | kubeseal```

# SYNOPSIS

**kubeseal** [_options_]

# PARAMETERS

**--controller-name** _NAME_
> Sealed Secrets controller name.

**--controller-namespace** _NS_
> Controller namespace.

**--namespace** _NS_
> Target namespace.

**--fetch-cert**
> Fetch public certificate.

**--format** _FMT_
> Output format (yaml, json).

**--help**
> Display help information.

# DESCRIPTION

**kubeseal** encrypts Kubernetes secrets for safe storage. It creates SealedSecrets that only the cluster can decrypt.

The tool enables GitOps with secrets. Sealed secrets can be committed to version control safely.

kubeseal encrypts K8s secrets.

# CAVEATS

Requires Sealed Secrets controller. Cluster-specific encryption. Backup keys carefully.

# HISTORY

kubeseal is part of **Sealed Secrets** by Bitnami for secure secret management in GitOps workflows.

# SEE ALSO

[kubectl](/man/kubectl)(1), [sops](/man/sops)(1), [vault](/man/vault)(1)
