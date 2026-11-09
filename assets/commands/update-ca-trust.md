# TAGLINE

Manage system CA certificate trust store

# TLDR

**Update CA certificate trust store**

```sudo update-ca-trust extract```

**Update trust store (short form)**

```sudo update-ca-trust```

**Add a trusted CA certificate**

```sudo cp [path/to/cert.pem] /etc/pki/ca-trust/source/anchors/ && sudo update-ca-trust```

**Write the extracted store to another directory**

```update-ca-trust extract --output [path/to/dir]```

# SYNOPSIS

**update-ca-trust** [**extract**] [**-o** _DIR_|**--output**=_DIR_]

# COMMANDS

**extract**: Rebuild the consolidated CA certificate files. This is also the default when no command is given.

# PARAMETERS

**-o** _DIR_, **--output**=_DIR_
> Write the extracted trust store into _DIR_ instead of the default location.

# CERTIFICATE LOCATIONS

**Add trusted certificates:**
> /etc/pki/ca-trust/source/anchors/

**Distrust certificates:**
> /etc/pki/ca-trust/source/blocklist/ (older releases used blacklist/)

**Output directory:**
> /etc/pki/ca-trust/extracted/

# DESCRIPTION

**update-ca-trust** manages the system's CA certificate trust store. It consolidates certificates from multiple sources into unified files that applications use for SSL/TLS verification.

Certificates placed in the anchors directory are added to the trust store. Certificates in the blocklist directory are explicitly distrusted. Both PEM and DER formats are supported.

After adding or removing certificates, run update-ca-trust to rebuild the consolidated trust files. Applications reading from /etc/pki/ca-trust/extracted/ will then use the updated certificates.

# CAVEATS

Changes require running extract to take effect. Some applications cache certificates and need restart. Debian-based systems use update-ca-certificates instead. Arch Linux uses /etc/ca-certificates/trust-source/ and /etc/ca-certificates/extracted/ instead of the paths above. Incorrect certificates can break SSL connections.

# HISTORY

**update-ca-trust** is part of the ca-certificates package on Red Hat Enterprise Linux, Fedora, and CentOS. It replaced older certificate management methods to provide a unified approach to trust configuration that works with both OpenSSL and NSS libraries.

# SEE ALSO

[update-ca-certificates](/man/update-ca-certificates)(8), [openssl](/man/openssl)(1), [trust](/man/trust)(1), [p11-kit](/man/p11-kit)(8)

# RESOURCES

```[Source code](https://src.fedoraproject.org/rpms/ca-certificates)```

<!-- verified: 2026-11-09 -->
