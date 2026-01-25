# TLDR

**Connect to HTTPS server**

```openssl s_client -connect [example.com]:443```

**Connect with SNI**

```openssl s_client -connect [example.com]:443 -servername [example.com]```

**Show certificate chain**

```openssl s_client -connect [example.com]:443 -showcerts```

**Connect to SMTP with STARTTLS**

```openssl s_client -connect [mail.example.com]:587 -starttls smtp```

**Verify certificate**

```openssl s_client -connect [example.com]:443 -verify_return_error```

**Test specific protocol**

```openssl s_client -connect [example.com]:443 -tls1_3```

# SYNOPSIS

**openssl s_client** [_options_] -connect _host:port_

# PARAMETERS

**-connect** _host:port_
> Server to connect to.

**-servername** _name_
> SNI hostname.

**-showcerts**
> Show certificate chain.

**-starttls** _proto_
> STARTTLS protocol.

**-verify** _depth_
> Verify depth.

**-CAfile** _file_
> CA certificates.

**-tls1_2**, **-tls1_3**
> Specific TLS version.

**-cipher** _list_
> Cipher list.

# DESCRIPTION

**openssl s_client** is a TLS/SSL client for testing and debugging connections. It establishes SSL/TLS connections and displays certificate and connection information.

After connecting, you can type protocol commands (HTTP, SMTP, etc.).

# EXAMPLE

```bash
# Test HTTPS
openssl s_client -connect example.com:443 <<< "GET / HTTP/1.1\r\nHost: example.com\r\n\r\n"
```

# CAVEATS

Interactive by default; use <<< or EOF for scripting. Certificate verification may fail without CAfile.

# HISTORY

s_client has been part of OpenSSL since early versions, essential for SSL/TLS testing and debugging.

# SEE ALSO

[openssl-s_server](/man/openssl-s_server)(1), [openssl-verify](/man/openssl-verify)(1), [curl](/man/curl)(1)
