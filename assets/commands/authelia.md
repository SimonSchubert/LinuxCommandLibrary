# TLDR

**Validate configuration file**

```authelia validate-config --config [config.yml]```

**Generate password hash**

```authelia crypto hash generate argon2```

**Generate random secret**

```authelia crypto rand --length [64]```

**Generate RSA keypair**

```authelia crypto pair rsa generate```

**Generate TOTP secret**

```authelia crypto totp generate --issuer [MyApp]```

**Hash a password interactively**

```authelia crypto hash generate argon2 --password```

**Show version**

```authelia --version```

**Run the server**

```authelia --config [/etc/authelia/config.yml]```

# SYNOPSIS

**authelia** [_global-options_] _command_ [_options_]

# COMMANDS

**crypto** hash|pair|rand|certificate|totp
> Cryptographic utilities for generating secrets and hashes.

**validate-config**
> Validate configuration file syntax and values.

**storage** migrate|schema-info|user|encryption
> Database storage management and migrations.

**access-control** check-policy
> Test access control rules against requests.

**build-info**
> Display build information.

# CRYPTO SUBCOMMANDS

**crypto hash generate** argon2|pbkdf2|sha2crypt|bcrypt
> Generate password hash using specified algorithm.

**crypto pair** rsa|ecdsa|ed25519
> Generate cryptographic key pairs.

**crypto rand**
> Generate random bytes or strings.

**crypto certificate** rsa|ecdsa|ed25519
> Generate self-signed certificates.

**crypto totp generate**
> Generate TOTP secret and QR code.

# PARAMETERS

**--config**, **-c** _path_
> Path to configuration file(s).

**--password**
> Read password interactively.

**--length** _n_
> Length for random generation.

**--issuer** _name_
> TOTP issuer name.

**--algorithm** _algo_
> Hashing or encryption algorithm.

**--help**, **-h**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**authelia** is the CLI for Authelia, an open-source authentication and authorization server. It provides multi-factor authentication and single sign-on for applications behind a reverse proxy.

The **crypto** commands generate secrets, password hashes, certificates, and TOTP configurations needed for Authelia setup. Use **crypto hash generate argon2** to create password hashes for the user database.

Configuration validation with **validate-config** checks YAML syntax and setting values before deployment. This catches common configuration errors.

The **storage** commands manage the user database, including migrations between versions and encryption key rotation. Authelia stores user credentials, TOTP secrets, and session data.

Authelia integrates with reverse proxies like Nginx, Traefik, and HAProxy to protect web applications with authentication portals and access policies.

# CAVEATS

Authelia runs as a service behind a reverse proxy; the CLI is for configuration and utilities. Requires proper reverse proxy configuration for authentication flow. User database and session storage must be configured. Some features require Redis for session storage in HA deployments.

# HISTORY

Authelia was created by **Clement Michaud** in **2016** as a simple authentication portal. The project evolved to support multiple second-factor methods (TOTP, WebAuthn, Duo) and advanced access control. Version 4 brought major architectural improvements and became widely adopted for self-hosted authentication. The project emphasizes security, privacy, and ease of deployment with container-first design.

# SEE ALSO

[authentik](/man/authentik)(1), [keycloak](/man/keycloak)(1), [nginx](/man/nginx)(1), [traefik](/man/traefik)(1)
