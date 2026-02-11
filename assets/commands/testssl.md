# TAGLINE

Test TLS/SSL server configurations

# TLDR

**Test server**

```testssl [example.com]```

**Test specific port**

```testssl [example.com:8443]```

**Quick test**

```testssl --fast [example.com]```

**Show all ciphers**

```testssl -E [example.com]```

**Check vulnerabilities only**

```testssl -U [example.com]```

**HTML output**

```testssl --html [example.com]```

**JSON output**

```testssl --jsonfile [output.json] [example.com]```

**Quiet mode**

```testssl --quiet [example.com]```

# SYNOPSIS

**testssl** [_-E_] [_-U_] [_--fast_] [_--html_] [_--jsonfile file_] [_options_] _target_

# PARAMETERS

**-E**, **--each-cipher**
> Test each cipher.

**-e**, **--cipher-per-proto**
> Ciphers per protocol.

**-U**, **--vulnerable**
> Vulnerability checks.

**-S**, **--server-defaults**
> Server defaults.

**-P**, **--protocols**
> Protocol support.

**-H**, **--headers**
> HTTP headers.

**--fast**
> Quick check.

**--html**
> HTML output.

**--jsonfile** _FILE_
> JSON output.

**--csvfile** _FILE_
> CSV output.

**--quiet**
> Minimal output.

**--color** _N_
> Color mode (0-3).

**--connect-timeout** _SEC_
> Connection timeout.

**--openssl** _PATH_
> Custom OpenSSL path.

# DESCRIPTION

**testssl** checks TLS/SSL encryption on servers. It identifies vulnerabilities, weak ciphers, and configuration problems.

Protocol testing shows which TLS versions are enabled. Old protocols (SSLv3, TLS 1.0, TLS 1.1) are security risks.

Vulnerability scanning checks for BEAST, POODLE, Heartbleed, ROBOT, and other known attacks.

Cipher analysis reveals weak encryption. Export ciphers, NULL encryption, and RC4 are flagged.

Certificate inspection shows validity, chain, and trust issues. It identifies expiring, self-signed, or misconfigured certificates.

The tool is a bash script requiring OpenSSL. It works on any Unix-like system without installation.

# CAVEATS

Thorough scans take time. Some checks may trigger IDS. Depends on OpenSSL version for some tests. Not all vulnerabilities detectable remotely.

# HISTORY

**testssl.sh** was created by **Dirk Wetter** starting around **2012**. It provides comprehensive TLS testing without requiring complex setup, becoming a standard tool for security assessments.

# SEE ALSO

[sslscan](/man/sslscan)(1), [nmap](/man/nmap)(1), [openssl](/man/openssl)(1), [sslyze](/man/sslyze)(1)
