# TAGLINE

manages certificate signing requests in Kubernetes

# TLDR

**Approve certificate signing request**

```kubectl certificate approve [csr-name]```

**Deny certificate signing request**

```kubectl certificate deny [csr-name]```

**List certificate signing requests**

```kubectl get csr```

# SYNOPSIS

**kubectl** **certificate** _subcommand_ [_options_]

# PARAMETERS

**approve** _name_
> Approve a certificate signing request.

**deny** _name_
> Deny a certificate signing request.

# DESCRIPTION

**kubectl certificate** manages certificate signing requests (CSRs) in Kubernetes. Used to approve or deny CSRs for kubelet client certificates and other TLS certificates. Part of the cluster's PKI management.

# SEE ALSO

[kubectl](/man/kubectl)(1)

