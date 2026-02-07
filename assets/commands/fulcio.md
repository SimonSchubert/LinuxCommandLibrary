# TAGLINE

certificate authority for keyless code signing

# TLDR

**Start Fulcio server**

```fulcio serve --config [config.yaml]```

**Create root certificate**

```fulcio createca --out [root.pem]```

# SYNOPSIS

**fulcio** _command_ [_options_]

# PARAMETERS

**serve**
> Start Fulcio server.

**--config** _file_
> Configuration file.

**--port** _num_
> Server port.

**createca**
> Create root CA certificate.

**--out** _file_
> Output file.

**version**
> Show version.

# CONFIGURATION

**/etc/fulcio/config.yaml**
> Server configuration including OIDC provider settings, certificate policies, and CA parameters.

# DESCRIPTION

**Fulcio** is a certificate authority for code signing, part of the Sigstore project. It issues short-lived certificates tied to OIDC identities (GitHub, Google, Microsoft), enabling keyless code signing.

Fulcio eliminates the need for developers to manage long-term signing keys. Certificates are logged in the transparency log (Rekor) for verification.

# WORKFLOW

```
1. Developer authenticates via OIDC
2. Fulcio issues short-lived certificate
3. Developer signs artifact
4. Signature logged in Rekor
5. Verifier checks Rekor and certificate chain
```

# CAVEATS

Requires OIDC provider integration. Certificates are short-lived by design. Production requires proper CA management. Part of larger Sigstore ecosystem.

# HISTORY

Fulcio is part of **Sigstore**, initiated by **Google**, **Red Hat**, and **Purdue University** in **2021** to make code signing accessible. Named after a Roman consul, it provides the CA component of the keyless signing infrastructure.

# SEE ALSO

[cosign](/man/cosign)(1), [rekor-cli](/man/rekor-cli)(1), [sigstore](/man/sigstore)(1)
