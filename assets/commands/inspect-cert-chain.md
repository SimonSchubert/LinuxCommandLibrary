# TAGLINE

Inspect and debug TLS certificate chains without OpenSSL

# TLDR

**Inspect certificate chain** of a remote host

```inspect-cert-chain [example.com]```

**Inspect with interactive TUI**

```inspect-cert-chain -i [example.com]```

**Inspect a local PEM file**

```inspect-cert-chain --file [path/to/cert.pem]```

**Inspect a specific port**

```inspect-cert-chain [example.com:8443]```

# SYNOPSIS

**inspect-cert-chain** [**-i**] [**--file** _path_] _host_[_:port_]

# DESCRIPTION

**inspect-cert-chain** is a CLI and TUI tool for probing and reading TLS certificate chains without relying on **OpenSSL**. It fetches the full chain from a remote server with SNI support, or parses PEM/DER input from local files, and prints concise OpenSSL-style text for every certificate.

The tool decodes subject, issuer, serial number, validity windows, algorithms, key sizes, X.509 extensions, SCT lists, CRL distribution points, and key-usage bits. The interactive TUI mode (**-i**) lists certificates on the left and shows scrollable detail on the right with Vim-like navigation and mouse support.

# CAVEATS

Does not perform full certificate validation or revocation checking. TUI mode requires a terminal with sufficient width for the split-pane layout.

# HISTORY

**inspect-cert-chain** was designed for sysadmins, pentesters, and developers who need quick certificate inspection without installing or depending on OpenSSL.

# SEE ALSO

[openssl](/man/openssl)(1), [curl](/man/curl)(1)
