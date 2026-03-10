# TAGLINE

Update SSL certificate authority bundle

# TLDR

**Update** the CA certificates bundle

```sudo update-ca-certificates```

**Perform a fresh update**, removing existing symlinks first

```sudo update-ca-certificates --fresh```

**Update with verbose** output showing details

```sudo update-ca-certificates --verbose```

# SYNOPSIS

**update-ca-certificates** [_options_]

# PARAMETERS

**-h**, **--help**
> Show summary of options.

**-v**, **--verbose**
> Be verbose. Display c_rehash results.

**-f**, **--fresh**
> Fresh update. Remove all symlinks in **/etc/ssl/certs** before regenerating them.

# DESCRIPTION

**update-ca-certificates** updates the directory **/etc/ssl/certs** to hold SSL certificates and generates **ca-certificates.crt**, a concatenated single-file list of trusted certificate authorities. It is used to maintain the system-wide set of CA certificates that applications rely on for verifying TLS/SSL connections.

The program reads **/etc/ca-certificates.conf**, where each line specifies a pathname of a CA certificate under **/usr/share/ca-certificates** that should be trusted. Lines beginning with **#** are comments and are ignored. Lines beginning with **!** deselect a certificate, causing it to be deactivated.

Certificates must have a **.crt** extension to be included. All certificates with a **.crt** extension found under **/usr/local/share/ca-certificates** are also included as implicitly trusted, making this the recommended location for adding custom CA certificates.

After updating, the program executes hooks in **/etc/ca-certificates/update.d** via **run-parts**, passing lists of added (prefixed with **+**) and removed (prefixed with **-**) certificates.

# CONFIGURATION

To **add a custom CA certificate**, place the **.crt** file in **/usr/local/share/ca-certificates/** and run **update-ca-certificates**. The certificate will be automatically trusted.

To **disable a certificate** shipped with the system, edit **/etc/ca-certificates.conf** and prefix the corresponding line with **!**, then run **update-ca-certificates**.

```
# Example /etc/ca-certificates.conf entries
mozilla/DigiCert_Global_Root_G2.crt
!mozilla/Untrusted_CA.crt
```

# CAVEATS

This command is primarily available on **Debian** and **Ubuntu** based distributions. On **Red Hat** and **Fedora** systems, use **update-ca-trust** instead. The command typically requires **root privileges** to modify system certificate directories. Changes only take effect for applications started after the update; running services may need to be restarted to pick up the new certificate bundle.

# HISTORY

**update-ca-certificates** was written for the **Debian** project as part of the **ca-certificates** package, which provides a curated collection of CA root certificates from the **Mozilla NSS** project. The ca-certificates package has been a core component of Debian since the early **2000s**, ensuring that system-wide TLS verification works out of the box. The tool has since been adopted by all Debian derivatives including **Ubuntu** and **Linux Mint**.

# SEE ALSO

[openssl](/man/openssl)(1), [c_rehash](/man/c_rehash)(1)
