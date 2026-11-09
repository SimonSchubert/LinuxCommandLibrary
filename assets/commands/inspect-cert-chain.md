# TAGLINE

Inspect and debug TLS certificate chains without OpenSSL

# TLDR

**Inspect certificate chain** of a remote host

```inspect-cert-chain --host [example.com]```

**Inspect with interactive TUI**

```inspect-cert-chain --host [example.com] -i```

**Inspect a local PEM file**

```inspect-cert-chain --file [path/to/cert.pem]```

**Inspect a specific port**

```inspect-cert-chain --host [example.com] --port [8443]```

**Connect to an IP** with a different TLS server name

```inspect-cert-chain --host [192.0.2.10] --server-name [staging.example.com]```

**Check expiry** with thresholds for monitoring

```inspect-cert-chain --host [example.com] --check --warn-within [30d] --critical-within [7d]```

**Print selected fields** as JSON

```inspect-cert-chain --host [example.com] --json --fields [subject,not_after]```

**Read a chain** from stdin

```cat [path/to/chain.pem] | inspect-cert-chain --file -```

# SYNOPSIS

**inspect-cert-chain** **--host** _host_ [_options_]

**inspect-cert-chain** **--file** _path_ [_options_]

# PARAMETERS

**--host** _host_
> Hostname or IP address to download the certificate chain from

**--port** _port_
> Port to use with **--host** (default: 443)

**--server-name** _name_
> TLS server name (SNI); defaults to **--host**

**--timeout** _duration_
> Overall time limit for remote fetching, such as 500ms or 2m (default: 10s)

**--dump** _path_
> Write the downloaded chain to a file in PEM format

**--file** _path_
> Inspect a local certificate chain in PEM format, or **-** for stdin

**-i**, **--interactive**
> View the chain in the TUI. Cannot be combined with **--json**, **--fields**, **--check** or **--file -**

**--json**
> Write structured JSON to stdout

**--fields** _list_
> Comma-separated fields to show; can be repeated. One of: subject, issuer, version, serial_number, signature_algorithm, not_before, not_after, expires_in_seconds, subject_alt_names, public_key, extensions, signature, status

**--check**
> Check the validity dates of every certificate and report through the exit code

**--warn-within** _duration_
> With **--check**: warn if a certificate expires within this duration, such as 30d

**--critical-within** _duration_
> With **--check**: report critical if a certificate expires within this duration, such as 7d

**-v**, **--verbose**
> Increase log verbosity; can be repeated

**-h**, **--help**
> Show help

**-V**, **--version**
> Show the version

# DESCRIPTION

**inspect-cert-chain** is a CLI and TUI tool for probing and reading TLS certificate chains without relying on **OpenSSL**. It fetches the chain from the TLS handshake of a remote server, or reads a PEM file or stdin, and prints OpenSSL-style text for every certificate.

The tool decodes subject, issuer, serial number, validity windows, algorithms, key sizes, X.509 extensions, SCT lists, CRL distribution points, and key-usage bits. The interactive TUI mode (**-i**) lists certificates on the left and shows scrollable detail on the right.

# EXIT CODES

With **--check**: **0** when all certificates are valid and outside the thresholds, **1** for a warning, **2** for critical (expired, not yet valid, or within the critical threshold), **3** for unknown (invalid options, empty chain, or a read, parse, fetch or output error).

Without **--check**: inspection errors exit with **1** and invalid options with **3**.

# CAVEATS

**--check** only examines validity dates; it does not verify signatures, hostname matches, trust roots or revocation. Services that need a plaintext exchange before TLS, such as STARTTLS, are not supported.

# HISTORY

**inspect-cert-chain** was designed for sysadmins, pentesters, and developers who need quick certificate inspection without installing or depending on OpenSSL.

# SEE ALSO

[openssl](/man/openssl)(1), [curl](/man/curl)(1), [sslscan](/man/sslscan)(1), [step](/man/step)(1)

# RESOURCES

```[Source code](https://github.com/x52dev/inspect-cert-chain)```

<!-- verified: 2026-11-09 -->
