# TAGLINE

Certificate and key management CLI

# TLDR

**Create CA**

```step ca init```

**Generate certificate**

```step ca certificate [hostname] [cert.pem] [key.pem]```

**Inspect certificate**

```step certificate inspect [cert.pem]```

**Create CSR**

```step certificate create --csr [hostname] [csr.pem] [key.pem]```

**Verify certificate**

```step certificate verify [cert.pem] --roots [ca.pem]```

**Get CA fingerprint**

```step certificate fingerprint [ca.pem]```

**Bootstrap CA client**

```step ca bootstrap --ca-url [https://ca:9000] --fingerprint [fingerprint]```

# SYNOPSIS

**step** _command_ [_subcommand_] [_options_]

# PARAMETERS

**ca**
> Certificate authority commands.

**certificate**
> Certificate operations.

**crypto**
> Cryptographic operations.

**ssh**
> SSH certificate commands.

**oauth**
> OAuth operations.

**--ca-url** _URL_
> CA server URL.

**--fingerprint** _FP_
> CA fingerprint.

# DESCRIPTION

**step** is a comprehensive command-line toolkit for working with certificates, keys, and cryptographic operations. It serves as both a standalone utility for inspecting and creating certificates and as the client interface for the step-ca private certificate authority server.

The tool provides subcommands for the full certificate lifecycle: creating certificate signing requests, requesting signed certificates from a CA, inspecting certificate details, verifying certificate chains, and managing SSH certificates. It supports modern cryptographic standards including ECDSA, EdDSA, and RSA keys, and can work with ACME protocol for automated certificate issuance.

When paired with a step-ca server, step enables automated PKI workflows including bootstrapping client trust, requesting short-lived certificates, and managing provisioners for different authentication methods such as OIDC, JWK, and ACME. It also supports SSH certificate management as an alternative to traditional long-lived SSH keys.

# CONFIGURATION

**~/.step/**
> Default step path containing CA configuration, certificates, and keys.

**~/.step/config/defaults.json**
> Default settings including CA URL, fingerprint, and provisioner.

**STEPPATH**
> Environment variable to override the default step configuration directory.

# CAVEATS

CA setup requires planning. Certificate lifetimes matter. Key security essential.

# HISTORY

**step** and **step-ca** were created by **Smallstep** for modern PKI. They simplify certificate management for developers and DevOps.

# SEE ALSO

[openssl](/man/openssl)(1), [cfssl](/man/cfssl)(1), [certbot](/man/certbot)(1)
