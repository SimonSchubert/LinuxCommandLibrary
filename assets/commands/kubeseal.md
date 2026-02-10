# TAGLINE

encrypts Kubernetes secrets for safe storage

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

**kubeseal** is a client-side tool for encrypting Kubernetes Secret resources into SealedSecret objects that are safe to store in version control. It uses asymmetric encryption with a public key fetched from the Sealed Secrets controller running in the cluster, ensuring that only that specific controller can decrypt the data back into a usable Secret.

The tool reads a standard Kubernetes Secret from stdin or a file, encrypts it, and outputs a SealedSecret custom resource in YAML or JSON format. This enables GitOps workflows where all cluster configuration, including secrets, can be committed to a Git repository without exposing sensitive values. Each SealedSecret is scoped to a specific namespace and cluster by default, preventing re-use of encrypted data across environments.

# CAVEATS

Requires Sealed Secrets controller. Cluster-specific encryption. Backup keys carefully.

# HISTORY

kubeseal is part of **Sealed Secrets** by Bitnami for secure secret management in GitOps workflows.

# SEE ALSO

[kubectl](/man/kubectl)(1), [sops](/man/sops)(1), [vault](/man/vault)(1)
