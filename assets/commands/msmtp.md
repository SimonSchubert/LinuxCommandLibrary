# TLDR

**Send email**

```echo "[message]" | msmtp [recipient@example.com]```

**Send email with subject**

```echo -e "Subject: [Hello]\n\n[Body]" | msmtp [recipient@example.com]```

**Send from specific account**

```msmtp -a [account_name] [recipient@example.com]```

**Test configuration**

```msmtp --serverinfo```

**Check account configuration**

```msmtp --configure [account_name]```

**Send file as message**

```msmtp [recipient@example.com] < [message.txt]```

**Print configuration**

```msmtp -P```

# SYNOPSIS

**msmtp** [_-a account_] [_--serverinfo_] [_options_] [_recipients_]

# PARAMETERS

**-a** _ACCOUNT_, **--account** _ACCOUNT_
> Use specified account.

**-f** _ADDRESS_, **--from** _ADDRESS_
> Set From address.

**-C** _FILE_, **--file** _FILE_
> Use configuration file.

**--serverinfo**
> Print server information.

**-P**, **--pretend**
> Print configuration, don't send.

**--configure** _ACCOUNT_
> Show account configuration.

**-d**, **--debug**
> Debug mode.

**-t**, **--read-recipients**
> Read recipients from message.

**-X** _FILE_, **--logfile** _FILE_
> Log to file.

**--tls**
> Use TLS encryption.

**--tls-starttls**
> Use STARTTLS.

**--host** _HOST_
> SMTP server host.

**--port** _PORT_
> SMTP server port.

**--user** _USER_
> Authentication username.

**--passwordeval** _CMD_
> Get password from command.

# DESCRIPTION

**msmtp** is a lightweight SMTP client for sending email from the command line. It works as a sendmail replacement, enabling scripts and applications to send mail through external SMTP servers.

Configuration in ~/.msmtprc defines accounts with server settings, authentication, and TLS options. Multiple accounts can be configured for different mail servers or identities.

Password handling supports several methods: plaintext (not recommended), passwordeval to run a command (e.g., password manager), or system keyring integration.

TLS is supported via STARTTLS or direct TLS connection. Certificate verification can be configured to use system CA certificates or specific files.

As a sendmail replacement, msmtp can be symlinked to /usr/sbin/sendmail, making it the default mail transport for the system. Many applications use sendmail for outgoing mail.

Integration with mutt, git, and other tools is straightforward - they just need to know the sendmail path or can use msmtp directly.

# CAVEATS

Requires SMTP server access. Password storage needs consideration. Some providers require app-specific passwords. TLS certificate issues may occur. Queue/offline sending requires msmtpd or msmtp-queue.

# HISTORY

**msmtp** was written by **Martin Lambers** starting around **2000** as a simple sendmail replacement. It focused on being lightweight and configurable, supporting modern SMTP with authentication and TLS. The project remains actively maintained.

# SEE ALSO

[sendmail](/man/sendmail)(1), [mutt](/man/mutt)(1), [mailx](/man/mailx)(1), [ssmtp](/man/ssmtp)(1)
