# TLDR

Generate a **private key**

```certtool -p --outfile [path/to/private.key]```

Generate a **self-signed certificate**

```certtool -s --load-privkey [path/to/private.key] --template [path/to/info.template] --outfile [path/to/certificate.crt]```

Generate a **certificate signing request** (CSR)

```certtool -q --load-privkey [path/to/private.key] --template [path/to/info.template] --outfile [path/to/request.csr]```

Generate a **CA certificate**

```certtool -s --load-privkey [path/to/ca.key] --template [path/to/ca.template] --outfile [path/to/ca.crt]```

**Verify** a certificate against a CA

```certtool --verify --infile [path/to/certificate.crt] --load-ca-certificate [path/to/ca.crt]```

# SYNOPSIS

**certtool** [_options_]

# DESCRIPTION

**certtool** generates and manages X.509 certificates, keys, and PKI structures using GnuTLS. It is an alternative to OpenSSL's certificate tools with a different command-line interface.

Template files define certificate attributes like organization name, validity period, and key usage.

# PARAMETERS

**-p, --generate-privkey**
> Generate a private key

**-s, --generate-self-signed**
> Generate a self-signed certificate

**-q, --generate-request**
> Generate a certificate signing request

**--generate-certificate**
> Generate a certificate from CSR

**--load-privkey** _file_
> Load private key from file

**--template** _file_
> Use template file for certificate info

**--outfile** _file_
> Output file path

**--verify**
> Verify certificate chain

**-i, --certificate-info**
> Display certificate information

# CAVEATS

Template file format differs from OpenSSL configuration. Some features may require specific GnuTLS version. Certificate templates must specify all required fields.

# SEE ALSO

[openssl](/man/openssl)(1), [gnutls-cli](/man/gnutls-cli)(1)
