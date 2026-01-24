# TLDR

**Connect to TLS server**

```gnutls-cli [example.com]```

**Connect on specific port**

```gnutls-cli -p [443] [example.com]```

**Show certificate chain**

```gnutls-cli --print-cert [example.com]```

**Test with specific protocol**

```gnutls-cli --priority="NORMAL:-VERS-TLS-ALL:+VERS-TLS1.3" [example.com]```

**Start with STARTTLS**

```gnutls-cli --starttls-proto=[smtp] [mail.example.com]:587```

**Verify certificate only**

```gnutls-cli --tofu [example.com] < /dev/null```

# SYNOPSIS

**gnutls-cli** [_options_] _hostname_

# DESCRIPTION

**gnutls-cli** is a TLS/SSL client for testing and debugging secure connections. It connects to servers, displays certificate information, and allows testing of various TLS configurations.

The tool helps diagnose certificate issues, protocol support, and cipher suite negotiation. It can also serve as a simple secure client for interactive protocols.

# PARAMETERS

**-p** _port_
> Connect to port.

**--print-cert**
> Print server certificate.

**--starttls-proto** _proto_
> Use STARTTLS (smtp, pop3, imap, ftp, xmpp, ldap).

**--priority** _string_
> Priority string for cipher selection.

**-V**, **--verbose**
> Verbose output.

**--tofu**
> Trust on first use.

**--insecure**
> Don't verify certificate.

**-x**, **--x509cafile** _file_
> CA certificate file.

**--benchmark-ciphers**
> Benchmark cipher performance.

**--list**
> List supported algorithms.

# CAVEATS

Certificate verification requires proper CA setup. Priority string syntax complex. Some servers may behave differently with test clients.

# HISTORY

**gnutls-cli** is part of **GnuTLS**, developed by **Nikos Mavrogiannopoulos** and others starting in **2000**. GnuTLS provides an alternative to OpenSSL under the LGPL license, and gnutls-cli serves as its diagnostic and testing tool.

# SEE ALSO

[openssl](/man/openssl)(1), [curl](/man/curl)(1), [certtool](/man/certtool)(1), [nmap](/man/nmap)(1)
