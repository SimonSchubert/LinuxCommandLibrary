# TAGLINE

Manage certificate signing requests in Kubernetes

# TLDR

**Approve a certificate signing request**

```kubectl certificate approve [csr-name]```

**Deny a certificate signing request**

```kubectl certificate deny [csr-name]```

**Approve all pending certificate signing requests**

```kubectl get csr -o name | xargs kubectl certificate approve```

**Approve a CSR with a specific reason**

```kubectl certificate deny [csr-name] --reason="[Expired certificate]"```

**List certificate signing requests**

```kubectl get csr```

# SYNOPSIS

**kubectl** **certificate** _subcommand_ [_options_]

# PARAMETERS

**approve** _name_
> Approve a certificate signing request.

**deny** _name_
> Deny a certificate signing request.

**--reason** _string_
> Reason for approving or denying the CSR, stored in the status condition.

**--force**
> Update the CSR even if it is already approved or denied.

**--allow-missing-template-keys**
> If true, ignore errors in templates when a field or map key is missing. Default true.

**-o, --output** _format_
> Output format. One of: json, yaml, name, go-template, go-template-file, template, templatefile, jsonpath, jsonpath-as-json, jsonpath-file.

# DESCRIPTION

**kubectl certificate** manages certificate signing requests (CSRs) in Kubernetes. Used to approve or deny CSRs for kubelet client certificates and other TLS certificates. Part of the cluster's PKI management. When a new node joins a cluster, it generates a CSR that must be approved before the node can communicate with the API server.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1), [kubectl-auth](/man/kubectl-auth)(1), [kubectl-config](/man/kubectl-config)(1)
