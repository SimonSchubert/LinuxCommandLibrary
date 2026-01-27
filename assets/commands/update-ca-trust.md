# TLDR

**Update CA certificate trust store**

```sudo update-ca-trust extract```

**Update trust store (short form)**

```sudo update-ca-trust```

**Check current trust configuration**

```update-ca-trust check```

# SYNOPSIS

**update-ca-trust** [_command_]

# COMMANDS

**extract**: Rebuild the consolidated CA certificate files.

**check**: Verify trust configuration consistency.

# CERTIFICATE LOCATIONS

**Add trusted certificates:**
> /etc/pki/ca-trust/source/anchors/

**Blacklist certificates:**
> /etc/pki/ca-trust/source/blacklist/

**Output directory:**
> /etc/pki/ca-trust/extracted/

# DESCRIPTION

**update-ca-trust** manages the system's CA certificate trust store on Red Hat-based distributions. It consolidates certificates from multiple sources into unified files that applications use for SSL/TLS verification.

Certificates placed in the anchors directory are added to the trust store. Certificates in the blacklist directory are explicitly distrusted. Both PEM and DER formats are supported.

After adding or removing certificates, run update-ca-trust extract to rebuild the consolidated trust files. Applications reading from /etc/pki/ca-trust/extracted/ will then use the updated certificates.

# CAVEATS

Changes require running extract to take effect. Some applications cache certificates and need restart. Debian-based systems use update-ca-certificates instead. Incorrect certificates can break SSL connections.

# HISTORY

**update-ca-trust** is part of the ca-certificates package on Red Hat Enterprise Linux, Fedora, and CentOS. It replaced older certificate management methods to provide a unified approach to trust configuration that works with both OpenSSL and NSS libraries.

# SEE ALSO

[update-ca-certificates](/man/update-ca-certificates)(8), [openssl](/man/openssl)(1), [trust](/man/trust)(1), [p11-kit](/man/p11-kit)(8)
