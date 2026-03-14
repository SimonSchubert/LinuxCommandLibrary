# TAGLINE

Enhanced mail command for sending and receiving Internet mail

# TLDR

**Send email** (type body, end with Ctrl+D)

```mailx -s "[Subject]" [recipient@example.com]```

**Send with body** from pipe

```echo "[message]" | mailx -s "[Subject]" [recipient@example.com]```

**Send from file**

```mailx -s "[Subject]" [recipient@example.com] < [message.txt]```

**Send with attachment**

```mailx -s "[Subject]" -a [file.pdf] [recipient@example.com]```

**Send with CC and BCC**

```mailx -s "[Subject]" -c [cc@example.com] -b [bcc@example.com] [recipient@example.com]```

**Read mail**

```mailx```

**Read mail from a specific mailbox file**

```mailx -f [path/to/mbox]```

**Use SMTP server**

```mailx -S smtp=[smtp://mail.example.com] -s "[Subject]" [recipient@example.com]```

# SYNOPSIS

**mailx** [_options_] [_recipients_]

# PARAMETERS

_RECIPIENTS_
> Email addresses.

**-s** _SUBJECT_
> Email subject.

**-a** _FILE_
> Attach file.

**-c** _ADDR_
> CC recipients.

**-b** _ADDR_
> BCC recipients.

**-r** _ADDR_
> Set From address.

**-S** _VAR=VALUE_
> Set internal variable (e.g., smtp, from, smtp-auth).

**-t**
> Read recipients from To/Cc/Bcc headers in the message.

**-f** _FILE_
> Read from mailbox file.

**-N**
> Inhibit reading system-wide startup file.

**-H**
> Print header summary and exit.

**--help**
> Display help information.

# DESCRIPTION

**mailx** is an enhanced mail command for sending and receiving Internet mail. It is POSIX-compatible with extensions for MIME support, SMTP connectivity, S/MIME, attachments, and more features than basic mail.

It handles both sending and reading email. When called without arguments, it reads the user's mailbox. When given recipients, it enters compose mode.

# CAVEATS

Multiple implementations exist (heirloom-mailx, s-nail, BSD mailx) with differing feature sets. SMTP configuration and attachment syntax varies between implementations. The **-a** flag means "attach file" in heirloom-mailx/s-nail but "set header" in BSD mailx.

# HISTORY

mailx evolved from the original **Unix mail** command through Berkeley Mail. Modern implementations include **s-nail** (successor to heirloom-mailx) which adds MIME, SMTP, POP3, and IMAP support.

# SEE ALSO

[mail](/man/mail)(1), [mutt](/man/mutt)(1), [sendmail](/man/sendmail)(8)

