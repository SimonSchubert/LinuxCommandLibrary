# TLDR

**Initialize new CA**

```step ca init```

**Start the CA server**

```step-ca [$(step path)/config/ca.json]```

**Request a certificate**

```step ca certificate [hostname] [host.crt] [host.key]```

**Renew a certificate**

```step ca renew [host.crt] [host.key]```

**Revoke a certificate**

```step ca revoke [host.crt]```

**Add a provisioner**

```step ca provisioner add [name] --type [OIDC] --client-id [id] --configuration-endpoint [url]```

**Get CA health**

```step ca health```

**Get root certificate**

```step ca root```

# SYNOPSIS

**step-ca** [_config_] [_options_]

**step ca** _command_ [_options_]

# STEP-CA OPTIONS

**--password-file** _path_
> Password file for CA key.

**--issuer-password-file** _path_
> Password for issuer key.

**--resolver** _address_
> DNS resolver address.

**--pidfile** _path_
> PID file path.

# STEP CA COMMANDS

**init**
> Initialize a new PKI and CA configuration.

**certificate** _name_ _crt_ _key_
> Request a new certificate.

**renew** _crt_ _key_
> Renew a certificate.

**revoke** [_serial_|_crt_]
> Revoke a certificate.

**sign** _csr_ _crt_
> Sign a certificate signing request.

**provisioner** add|remove|update|list
> Manage provisioners.

**root**
> Download root certificate.

**health**
> Check CA health.

**token** _subject_
> Generate authentication token.

**bootstrap**
> Configure client to trust CA.

# CERTIFICATE OPTIONS

**--san** _name_
> Subject Alternative Name (repeatable).

**--not-after** _time_
> Expiration time or duration.

**--provisioner** _name_
> Provisioner to use.

**--kty** _type_
> Key type: EC, RSA, OKP.

**--size** _bits_
> Key size.

**--force**
> Overwrite existing files.

# DESCRIPTION

**step-ca** is a private certificate authority server. Combined with **step ca** client commands, it provides automated certificate lifecycle management.

**step ca init** creates PKI structure with root and intermediate CAs. The resulting configuration defines provisioners, certificate templates, and policies.

Provisioners authenticate certificate requests. Types include ACME, OIDC, JWK, X5C, and SSHPOP. Each provisioner has specific authentication requirements and certificate constraints.

**step ca certificate** requests certificates using configured provisioners. ACME provisioner enables Let's Encrypt-style automation. Certificates include specified SANs.

Renewal with **step ca renew** extends certificate lifetime. Pair with **step-renewer** daemon for automatic renewal. Revocation invalidates certificates before expiration.

step-ca supports ACME protocol, enabling integration with certbot and other ACME clients for automated certificate issuance.

# CAVEATS

Root key security is critical—compromise enables issuing arbitrary certificates. ACME requires proper DNS or HTTP challenge configuration. Certificate templates require understanding of X.509. Production deployments need proper backup and HSM consideration.

# HISTORY

step-ca was created by **Smallstep** and released in **2018** as part of their open-source PKI toolkit. It was designed to bring modern certificate management to internal infrastructure. The project enables zero-trust security through automated certificate issuance. Smallstep offers commercial products built on the open-source foundation.

# SEE ALSO

[openssl](/man/openssl)(1), [certbot](/man/certbot)(1), [cfssl](/man/cfssl)(1), [vault](/man/vault)(1)
