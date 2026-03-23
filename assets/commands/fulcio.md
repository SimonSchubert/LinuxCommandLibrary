# TAGLINE

certificate authority for keyless code signing

# TLDR

**Start Fulcio server** with a config file

```fulcio serve --config-path [config.yaml]```

**Start server** with file-based CA

```fulcio serve --ca fileca --fileca-cert [ca.pem] --fileca-key [ca-key.pem]```

**Start server** on a specific host and port

```fulcio serve --host [0.0.0.0] --port [8080]```

# SYNOPSIS

**fulcio** _command_ [_options_]

# PARAMETERS

**serve**
> Start Fulcio server.

**--ca** _type_
> Certificate authority type: googleca, fileca, kmsca, tinkca, pkcs11ca, ephemeralca.

**--config-path** _file_
> Path to Fulcio config YAML (default: /etc/fulcio-config/config.yaml).

**--host** _addr_
> HTTP server listen address (default: 0.0.0.0).

**--port** _num_
> HTTP server port (default: 8080).

**--grpc-port** _num_
> gRPC server port (default: 8081).

**--fileca-cert** _file_
> Path to CA certificate (fileca only).

**--fileca-key** _file_
> Path to CA encrypted private key (fileca only).

**--ct-log-url** _url_
> Certificate transparency log URL.

**version**
> Show version.

# CONFIGURATION

**/etc/fulcio-config/config.yaml**
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

[cosign](/man/cosign)(1), [rekor-cli](/man/rekor-cli)(1)
