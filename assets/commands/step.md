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

**step** manages certificates and keys. It's the CLI for step-ca certificate authority.

CA initialization creates root and intermediate certificates. Sets up the CA infrastructure.

Certificate generation issues signed certificates. Automatic enrollment with ACME support.

Inspection shows certificate details. Validity, subject, extensions displayed.

SSH certificates provide short-lived authentication. Better than traditional SSH keys.

# CAVEATS

CA setup requires planning. Certificate lifetimes matter. Key security essential.

# HISTORY

**step** and **step-ca** were created by **Smallstep** for modern PKI. They simplify certificate management for developers and DevOps.

# SEE ALSO

[openssl](/man/openssl)(1), [cfssl](/man/cfssl)(1), [certbot](/man/certbot)(1)
