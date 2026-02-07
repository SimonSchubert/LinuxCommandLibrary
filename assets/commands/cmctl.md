# TAGLINE

cert-manager CLI for Kubernetes

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

**cmctl** is the official command-line tool for interacting with cert-manager, the Kubernetes certificate management controller. It provides commands for checking API readiness, inspecting certificate status, triggering renewals, and approving or denying certificate requests.

The tool can also be installed as a kubectl plugin, making it available as **kubectl cert-manager**. It simplifies common cert-manager operations that would otherwise require manually creating or editing Kubernetes resources with kubectl.

cmctl is particularly useful for debugging certificate issues, as the **status** and **inspect** commands provide detailed information about certificate chains, expiration dates, and issuance conditions that are not easily visible through standard kubectl output.

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
