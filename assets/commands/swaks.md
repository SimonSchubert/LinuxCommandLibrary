# TAGLINE

Swiss Army Knife for SMTP testing

# TLDR

Send a **test email** to a server

```swaks -t [user@example.com] -s [mail.example.com]```

Send with **SMTP authentication**

```swaks -t [user@example.com] -s [mail.example.com] -a LOGIN -au [username] -ap [password]```

Send with a **custom subject and body**

```swaks -t [user@example.com] --header "Subject: [Test]" --body "[Hello World]"```

Send with an **attachment**

```swaks -t [user@example.com] --attach [path/to/file]```

Send using **STARTTLS** encryption

```swaks -t [user@example.com] -s [mail.example.com] --tls```

Send using **implicit TLS** (SMTPS on port 465)

```swaks -t [user@example.com] -s [mail.example.com] --tls-on-connect -p 465```

Test via **UNIX socket** with LMTP protocol

```swaks -t [user@example.com] --socket [/var/lda.sock] --protocol LMTP```

Set a custom **EHLO/HELO** greeting

```swaks -t [user@example.com] -s [mail.example.com] --helo [myhost.example.com]```

# SYNOPSIS

**swaks** [_OPTIONS_]

# PARAMETERS

**-t**, **--to** _address_
> Recipient email address. Can be specified multiple times.

**-f**, **--from** _address_
> Sender email address.

**-s**, **--server** _host_
> SMTP server hostname or IP.

**-p**, **--port** _port_
> SMTP port (default: 25, or 465 with --tls-on-connect).

**-h**, **--helo** _string_
> String to use as the HELO/EHLO greeting.

**-a**, **--auth** _type_
> Authentication type (PLAIN, LOGIN, CRAM-MD5, DIGEST-MD5, NTLM).

**-au**, **--auth-user** _user_
> Authentication username.

**-ap**, **--auth-password** _pass_
> Authentication password.

**--auth-optional**
> Attempt authentication but continue if unavailable.

**-d**, **--data** _data_
> Use argument as the entire DATA portion of the message.

**--body** _text_
> Message body content or file path.

**--header** _header_
> Add a header to the message (e.g., "Subject: Test").

**-ah**, **--add-header** _header_
> Add an additional header without replacing defaults.

**--attach** _file_
> Attach a file to the message. Can be used multiple times.

**--tls**
> Require STARTTLS encryption after connecting.

**--tls-on-connect**
> Use implicit TLS (SMTPS) from the start of the connection.

**--tls-verify**
> Verify the server's TLS certificate.

**--tls-cert** _file_
> Client TLS certificate file.

**--tls-key** _file_
> Client TLS private key file.

**--socket** _path_
> Connect via UNIX domain socket.

**--protocol** _proto_
> Protocol to use: SMTP, ESMTP (default), LMTP.

**-n**, **--suppress-data**
> Don't show the DATA portion in output.

**-q**, **--quit-after** _stage_
> Quit after the specified stage (CONNECT, EHLO, AUTH, MAIL, RCPT).

**--timeout** _seconds_
> Connection and read/write timeout.

**-4**
> Force IPv4 connection.

**-6**
> Force IPv6 connection.

**--dump**
> Display all options as interpreted and exit.

# DESCRIPTION

**swaks** (Swiss Army Knife SMTP) is a featureful, scriptable SMTP test tool for diagnosing mail server configurations, testing authentication, and verifying email delivery. It supports SMTP, ESMTP, and LMTP protocols over various transports including TCP sockets, UNIX sockets, and TLS connections.

The tool is invaluable for testing spam filters (using GTUBE), virus scanners (using EICAR), authentication mechanisms, and TLS configurations. It provides detailed transaction logging showing each step of the SMTP conversation.

# CAVEATS

Requires Perl. Passwords on command line are visible in process listings; use **--auth-password-optional** or a config file for sensitive data. Some authentication methods require additional Perl modules. Test emails may trigger spam filters.

# HISTORY

**swaks** was created by **John Jetmore** and has been actively maintained since the early **2000s**. It has become a standard tool for mail server administrators and is available in most Linux distribution repositories. The tool is written in Perl and released under GPLv2.

# SEE ALSO

[sendmail](/man/sendmail)(8), [postfix](/man/postfix)(1), [openssl](/man/openssl)(1), [curl](/man/curl)(1)
