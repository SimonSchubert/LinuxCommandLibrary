# TLDR

**Scan server**

```sslscan [example.com]```

**Scan specific port**

```sslscan [example.com:8443]```

**Show only supported ciphers**

```sslscan --no-ciphersuites [example.com]```

**Show certificate details**

```sslscan --show-certificate [example.com]```

**No color output**

```sslscan --no-colour [example.com]```

**Use STARTTLS**

```sslscan --starttls-smtp [mail.example.com:25]```

**XML output**

```sslscan --xml=[output.xml] [example.com]```

**Check specific protocol**

```sslscan --tlsall [example.com]```

# SYNOPSIS

**sslscan** [_--show-certificate_] [_--starttls-protocol_] [_--xml file_] [_options_] _host_[:_port_]

# PARAMETERS

**--show-certificate**
> Show certificate details.

**--no-ciphersuites**
> Skip cipher listing.

**--no-colour**
> Disable colors.

**--xml** _FILE_
> XML output.

**--starttls-smtp**
> STARTTLS for SMTP.

**--starttls-imap**
> STARTTLS for IMAP.

**--starttls-pop3**
> STARTTLS for POP3.

**--starttls-ftp**
> STARTTLS for FTP.

**--ssl2**, **--ssl3**, **--tls10**, **--tls11**, **--tls12**, **--tls13**
> Test specific versions.

**--tlsall**
> Test all TLS versions.

**--no-fallback**
> No version fallback.

**--sni** _HOST_
> SNI hostname.

**--bugs**
> Enable SSL bug workarounds.

# DESCRIPTION

**sslscan** tests SSL/TLS services for configuration issues. It identifies supported ciphers, protocols, and certificate problems.

The scan shows which TLS versions are enabled. Legacy protocols (SSLv2, SSLv3, TLS 1.0, TLS 1.1) are security concerns.

Cipher testing reveals weak algorithms. Export-grade, NULL, and RC4 ciphers are flagged. Color coding highlights problems.

Certificate inspection shows expiry, chain, and trust issues. It identifies self-signed, expired, or incorrectly configured certificates.

STARTTLS support enables testing mail servers and other services that upgrade connections to TLS.

Results help remediate server configurations. Compare against security standards and best practices.

# CAVEATS

Requires network access to target. Some servers rate-limit scans. Results depend on client capabilities. Cannot test client certs.

# HISTORY

**sslscan** was originally written by **Ian Ventura-Whiting** around **2007**. It was later forked and actively maintained by **rbsec** to support modern TLS features and protocols.

# SEE ALSO

[nmap](/man/nmap)(1), [openssl](/man/openssl)(1), [testssl](/man/testssl)(1), [sslyze](/man/sslyze)(1)
