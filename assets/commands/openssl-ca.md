# TAGLINE

minimal certificate authority application

# TLDR

**Sign certificate request**

```openssl ca -in [request.csr] -out [certificate.crt]```

**Sign with specific CA**

```openssl ca -config [ca.cnf] -cert [ca.crt] -keyfile [ca.key] -in [request.csr] -out [cert.crt]```

**Revoke certificate**

```openssl ca -revoke [certificate.crt]```

**Generate CRL**

```openssl ca -gencrl -out [crl.pem]```

**List issued certificates**

```openssl ca -status [serial_number]```

# SYNOPSIS

**openssl ca** [_options_] [**-in** _csr_] [**-out** _cert_] [**-infiles** _csr_...]

# PARAMETERS

**-in** _file_
> Input CSR (PEM-encoded). Use **-infiles** instead to sign multiple CSRs in one invocation.

**-infiles** _file_...
> Sign every CSR listed after this option (must be the last option on the line).

**-out** _file_
> Output certificate file (default: stdout).

**-config** _file_
> OpenSSL configuration file (defaults to **/etc/ssl/openssl.cnf**).

**-cert** _file_
> CA certificate used for signing.

**-keyfile** _file_
> CA private key (PEM, ENGINE URI, or PKCS#11 URI).

**-days** _n_
> Certificate validity in days from today.

**-startdate** _YYMMDDHHMMSSZ_, **-not_before** _date_
> Explicit certificate start date.

**-enddate** _YYMMDDHHMMSSZ_, **-not_after** _date_
> Explicit certificate expiry date.

**-md** _alg_
> Message digest algorithm (e.g. **sha256**, **sha384**).

**-policy** _name_
> CA policy section in the config file (controls which DN fields must match the CA).

**-extensions** _section_
> Config section containing certificate extensions to add.

**-extfile** _file_
> Read extensions from an extra file (combined with **-extensions**).

**-subj** _dn_
> Override the subject name from the CSR (e.g. `/CN=example/O=Acme`).

**-batch**
> Non-interactive mode — sign without prompting for confirmation.

**-notext**
> Do not include a human-readable text dump in the output.

**-noemailDN**
> Strip the **emailAddress** RDN from the certificate Subject.

**-create_serial**
> Create a fresh random serial if the serial file is missing.

**-revoke** _file_
> Mark the given certificate as revoked in the CA database.

**-crl_reason** _reason_
> Reason for revocation (**unspecified**, **keyCompromise**, **CACompromise**, **affiliationChanged**, **superseded**, **cessationOfOperation**, **certificateHold**, **removeFromCRL**).

**-status** _serial_
> Print the revocation status of the certificate with the given serial.

**-gencrl**
> Generate a CRL using the current database.

**-crldays** _n_, **-crlhours** _n_
> Validity period until the next CRL is expected.

# DESCRIPTION

**openssl ca** is a minimal certificate authority application. It signs certificate requests (CSRs), maintains a flat-file database (**index.txt**) of issued certificates, tracks the next serial number (**serial**), and generates X.509 Certificate Revocation Lists.

By default the command reads its configuration from the **[ca]** section of **openssl.cnf**, which selects a default-CA section (**default_ca**) describing where to find the CA cert/key, the database, the serial file, the directory of issued certs (**newcerts/**), the policy, and which extensions to apply. Most options can be set there instead of on the command line.

# CA SETUP

```
# Initialize CA
mkdir -p demoCA/{certs,crl,newcerts,private}
touch demoCA/index.txt
echo '01' > demoCA/serial
```

# CAVEATS

Use proper CA software for production. Database format is proprietary. Configuration complex for beginners.

# HISTORY

The openssl ca command has been part of OpenSSL since early versions, providing basic CA functionality.

# INSTALL

```apt: sudo apt install openssl```

```dnf: sudo dnf install openssl```

```pacman: sudo pacman -S openssl```

```apk: sudo apk add openssl```

```zypper: sudo zypper install openssl```

```brew: brew install openssl```

```nix: nix profile install nixpkgs#openssl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[openssl-req](/man/openssl-req)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-crl](/man/openssl-crl)(1)
