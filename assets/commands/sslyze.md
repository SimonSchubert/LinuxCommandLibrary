# TLDR

**Scan a server** for SSL/TLS configuration

```sslyze [www.example.com]```

**Scan multiple servers**

```sslyze [www.example.com] [www.google.com]```

**Test for specific SSL/TLS versions**

```sslyze --sslv2 --sslv3 --tlsv1 --tlsv1_1 --tlsv1_2 --tlsv1_3 [server]```

**Test for Heartbleed vulnerability**

```sslyze --heartbleed [server]```

**Test for all vulnerabilities**

```sslyze --heartbleed --robot --openssl_ccs --compression [server]```

**Check against Mozilla TLS configuration**

```sslyze --mozilla_config=[intermediate] [server]```

**Use STARTTLS** for mail server

```sslyze --starttls [smtp] [mail.example.com]```

**Output to JSON**

```sslyze --json_out=[results.json] [server]```

# SYNOPSIS

**sslyze** [_options_] _target_ [_target_...]

# PARAMETERS

**--sslv2**, **--sslv3**
> Test for SSL 2.0 or SSL 3.0 support.

**--tlsv1**, **--tlsv1_1**, **--tlsv1_2**, **--tlsv1_3**
> Test for specific TLS version support.

**--certinfo**
> Retrieve and analyze server certificate.

**--heartbleed**
> Test for OpenSSL Heartbleed vulnerability.

**--robot**
> Test for ROBOT vulnerability.

**--openssl_ccs**
> Test for OpenSSL CCS Injection vulnerability (CVE-2014-0224).

**--compression**
> Test for TLS compression support (CRIME attack vector).

**--reneg**
> Test for insecure TLS renegotiation.

**--fallback**
> Test for TLS_FALLBACK_SCSV downgrade prevention.

**--early_data**
> Test for TLS 1.3 early data support.

**--starttls** _protocol_
> Use STARTTLS handshake. Protocols: auto, smtp, xmpp, pop3, imap, ftp, ldap, rdp, postgres.

**--sni** _hostname_
> Server Name Indication hostname for TLS 1.0+.

**--mozilla_config** _level_
> Check compliance: **old**, **intermediate**, or **modern**.

**--json_out** _file_
> Output results to JSON file.

**--targets_in** _file_
> Read targets from file (one per line).

**--quiet**
> Suppress output except errors.

# DESCRIPTION

**SSLyze** is a fast SSL/TLS scanning tool that analyzes server configurations to identify security weaknesses. It tests for protocol support, cipher suites, certificate validity, and known vulnerabilities like Heartbleed, ROBOT, and CRIME.

The tool connects directly to servers and performs real protocol handshakes to verify configurations. It supports STARTTLS for protocols that upgrade to TLS (SMTP, IMAP, etc.) and Server Name Indication for virtual hosting.

SSLyze can check configurations against Mozilla's recommended TLS settings, returning non-zero exit codes for non-compliant servers. This makes it suitable for CI/CD pipeline integration.

# CAVEATS

Scanning servers you don't own may be considered unauthorized testing. Some scans may trigger security alerts on monitored systems. The tool requires network connectivity to target servers. Vulnerability tests are point-in-time assessments; retest after server changes.

# HISTORY

**SSLyze** was created by Alban Diquet (nabla-c0d3) and released as open source. It has become a standard tool for TLS security assessment, used to scan hundreds of thousands of servers. The project is actively maintained with support for new TLS features and vulnerabilities. It's distributed under the GNU Affero General Public License (AGPL).

# SEE ALSO

[testssl.sh](/man/testssl.sh)(1), [nmap](/man/nmap)(1), [openssl](/man/openssl)(1), [sslscan](/man/sslscan)(1)
