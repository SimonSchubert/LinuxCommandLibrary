# TAGLINE

PKI/TLS certificate authority toolkit

# TLDR

**Initialize a new CA**

```cfssl gencert -initca [ca-csr.json] | cfssljson -bare [ca]```

**Generate certificate signed by CA**

```cfssl gencert -ca [ca.pem] -ca-key [ca-key.pem] [csr.json] | cfssljson -bare [cert]```

**Sign a CSR**

```cfssl sign -ca [ca.pem] -ca-key [ca-key.pem] [request.csr]```

**Generate self-signed certificate**

```cfssl selfsign [hostname] [csr.json] | cfssljson -bare [cert]```

**Start API server**

```cfssl serve -ca [ca.pem] -ca-key [ca-key.pem]```

**Bundle certificates**

```cfssl bundle -cert [cert.pem]```

**Print default configuration**

```cfssl print-defaults config```

# SYNOPSIS

**cfssl** _command_ [_options_] [_arguments_]

# DESCRIPTION

**cfssl** is CloudFlare's PKI/TLS toolkit for signing, verifying, and bundling TLS certificates. It provides both a command-line tool and an HTTP API server for running a complete certificate authority.

The toolkit handles the full certificate lifecycle: generating root and intermediate CAs, signing certificate requests, creating self-signed certificates, and building certificate bundles for deployment. Configuration files define signing profiles with specific expiry periods, key usages, and authentication requirements.

The companion tool cfssljson extracts certificates and keys from cfssl's JSON output into PEM files. The multirootca component allows running a CA server with multiple signing keys for different purposes.

# COMMANDS

**gencert**
> Generate new key and signed certificate

**sign**
> Sign a certificate signing request

**selfsign**
> Generate self-signed certificate

**bundle**
> Build certificate bundle

**genkey**
> Generate private key and CSR

**serve**
> Start HTTP API server

**info**
> Get info about remote signer

**print-defaults**
> Print default configurations

**version**
> Print version

# PARAMETERS

**-ca** _file_
> CA certificate file (default: ca.pem)

**-ca-key** _file_
> CA private key file (default: ca_key.pem)

**-config** _file_
> Path to configuration file

**-hostname** _names_
> Comma-separated hostnames for SAN

**-initca**
> Initialize new CA

**-remote** _host_
> Remote CFSSL server address

# API SERVER

Default address: 127.0.0.1:8888

```cfssl serve -address [0.0.0.0] -port [8888] -ca [ca.pem] -ca-key [ca-key.pem]```

# COMPANION TOOLS

**cfssljson**
> Write certificates/keys from JSON output

**multirootca**
> Multi-signing-key CA server

**mkbundle**
> Build certificate bundles

# CONFIGURATION

**ca-csr.json**
> Certificate Signing Request defaults (key algorithm, size, names, hosts).

**config.json**
> Signing profiles defining certificate expiry, usages, and auth keys for the CA.

# CAVEATS

Requires Go 1.20+ to build from source. Private keys should be protected. Use configuration files for complex signing policies.

# SEE ALSO

[openssl](/man/openssl)(1), [certbot](/man/certbot)(1)
