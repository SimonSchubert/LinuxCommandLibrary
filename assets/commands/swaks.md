# TLDR

Send **test email** to a server

```swaks -t [user@example.com] -s [mail-server.example.com]```

Send with **authentication**

```swaks -t [user@example.com] -f [me@example.com] -a CRAM-MD5 -au [me@example.com]```

Send with **custom header**

```swaks -t [user@example.com] --header-X-Test "[test_value]"```

Send with **attachment**

```swaks -t [user@example.com] --attach [path/to/file]```

Test via **UNIX socket** with LMTP

```swaks -t [user@example.com] --socket [/var/lda.sock] --protocol LMTP```

Send with **TLS**

```swaks -t [user@example.com] -s [server] --tls```

**Suppress** data output

```swaks -t [user@example.com] -n```

# SYNOPSIS

**swaks** [_OPTIONS_]

# PARAMETERS

**-t, --to** _address_
> Recipient email address

**-f, --from** _address_
> Sender email address

**-s, --server** _host_
> SMTP server hostname or IP

**-p, --port** _port_
> SMTP port (default: 25)

**-a, --auth** _type_
> Authentication type (PLAIN, LOGIN, CRAM-MD5, etc.)

**-au, --auth-user** _user_
> Authentication username

**-ap, --auth-password** _pass_
> Authentication password

**--tls**
> Use STARTTLS

**--tlsc**
> Use implicit TLS (SMTPS)

**--socket** _path_
> Connect via UNIX domain socket

**--protocol** _proto_
> Protocol: SMTP, ESMTP, LMTP

**--attach** _file_
> Attach file to message

**--body** _file_
> Use file as message body

**--header-_Name_** _value_
> Add custom header

**-n, --suppress-data**
> Don't show DATA portion

**-q, --quiet**
> Minimize output

**--timeout** _seconds_
> Connection timeout

# DESCRIPTION

**swaks** (Swiss Army Knife SMTP) is a comprehensive SMTP testing tool for diagnosing mail server configurations, testing authentication, and verifying email delivery. It supports SMTP, ESMTP, and LMTP protocols over various transports including TCP sockets, UNIX sockets, and TLS connections.

The tool is invaluable for testing spam filters (using GTUBE), virus scanners (using EICAR), authentication mechanisms, and TLS configurations. It provides detailed transaction logging for troubleshooting.

# CAVEATS

Requires Perl. Passwords on command line are visible in process listings; use config files for sensitive data. Some authentication methods require additional Perl modules. Test emails may trigger spam filters.

# HISTORY

**swaks** was created by **John Jetmore** and has been actively maintained since the early **2000s**. It has become a standard tool for mail server administrators and is available in most Linux distribution repositories. The tool is written in Perl and released under GPLv2.

# SEE ALSO

[sendmail](/man/sendmail)(8), [postfix](/man/postfix)(1), [openssl](/man/openssl)(1), [telnet](/man/telnet)(1)
