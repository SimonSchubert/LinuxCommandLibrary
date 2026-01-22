# TLDR

**Check cert-manager status**

```cmctl check api```

**View certificate status**

```cmctl status certificate [cert-name]```

**Renew certificate**

```cmctl renew [cert-name]```

**Approve certificate request**

```cmctl approve [request-name]```

**Deny certificate request**

```cmctl deny [request-name]```

**Inspect certificate**

```cmctl inspect secret [secret-name]```

**Show version**

```cmctl version```

# SYNOPSIS

**cmctl** _command_ [_options_]

# DESCRIPTION

**cmctl** is the cert-manager CLI for Kubernetes. Manages certificates, certificate requests, and cert-manager resources. Can also be used as kubectl plugin (kubectl cert-manager).

# COMMANDS

**check** api
> Verify cert-manager API is ready

**status** certificate _name_
> Show certificate status

**renew** _name_
> Mark certificate for renewal

**approve** _name_
> Approve CertificateRequest

**deny** _name_
> Deny CertificateRequest

**inspect** secret _name_
> Show certificate details

**create** certificaterequest
> Create certificate request

**convert**
> Convert between API versions

**upgrade**
> Upgrade assistance tools

**version**
> Show versions

# PARAMETERS

**-n**, **--namespace** _ns_
> Kubernetes namespace

**--context** _ctx_
> Kubernetes context

**--kubeconfig** _file_
> Kubeconfig file path

# INSTALLATION

```
go install github.com/cert-manager/cmctl/v2@latest
```

Or download from GitHub releases.

# CAVEATS

Requires cert-manager installed in cluster. Tab completion available. Preferred over kubectl plugin for better experience.

# SEE ALSO

[kubectl](/man/kubectl)(1), [openssl](/man/openssl)(1)
