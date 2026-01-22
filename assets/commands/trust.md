# TLDR

**List** trust policy store items

```trust list```

List information about **specific items** in the trust policy store

```trust list --filter=[blocklist|ca-anchors|certificates|trust-policy]```

**Store** a trust anchor in the trust policy store

```trust anchor [path/to/certificate.crt]```

**Remove** an anchor from the trust policy store

```trust anchor --remove [path/to/certificate.crt]```

**Extract** trust policy to a directory

```trust extract --format=x509-directory --filter=ca-anchors [path/to/directory]```

Display **help** for a subcommand

```trust [subcommand] --help```

# SYNOPSIS

**trust** _command_ [_options_]

# PARAMETERS

**list**
> List trust policy store items

**anchor** _file_
> Add a trust anchor to the store

**anchor** **--remove** _file_
> Remove a trust anchor

**extract** **--format=**_format_ _path_
> Extract trust anchors in specified format

**--filter=**_type_
> Filter by type (ca-anchors, blocklist, certificates, trust-policy)

**--format=**_format_
> Output format (x509-file, x509-directory, pem-file, etc.)

**--purpose=**_purpose_
> Filter by purpose (server-auth, client-auth, email, code-signing)

# DESCRIPTION

**trust** manages the shared system trust policy store, which contains trusted CA certificates, blocklisted certificates, and trust policies. It allows administrators to add, remove, and extract trust anchors used for TLS/SSL verification across the system.

Changes made with trust affect all applications that use the p11-kit trust module, providing a unified way to manage certificates rather than configuring each application individually.

# CAVEATS

Requires root privileges to modify system trust store. Changes may require applications to be restarted to take effect. The store format and location varies by distribution.

# HISTORY

Part of **p11-kit**, developed as part of the FreeDesktop.org project to provide a standard way to manage trust anchors across Linux distributions. Replaces distribution-specific methods like update-ca-certificates.

# SEE ALSO

[update-ca-trust](/man/update-ca-trust)(8), [openssl](/man/openssl)(1), [p11-kit](/man/p11-kit)(8)
