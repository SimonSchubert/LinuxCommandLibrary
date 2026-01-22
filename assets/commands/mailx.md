# TLDR

**Send email**

```mailx -s "[Subject]" [recipient@example.com]```

**Send with body**

```echo "[message]" | mailx -s "[Subject]" [recipient@example.com]```

**Send file**

```mailx -s "[Subject]" [recipient@example.com] < [message.txt]```

**Send with attachment**

```mailx -s "[Subject]" -a [file.pdf] [recipient@example.com]```

**Read mail**

```mailx```

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

**-S** _VAR=VALUE_
> Set variable.

**-f** _FILE_
> Read from mailbox.

**--help**
> Display help information.

# DESCRIPTION

**mailx** is an enhanced mail command. It supports SMTP, attachments, and more features than basic mail.

The tool is POSIX-compatible with extensions. It handles both sending and reading email.

mailx sends and reads email.

# CAVEATS

Multiple implementations exist. SMTP config varies. May need s-nail or heirloom-mailx.

# HISTORY

mailx evolved from the original **Unix mail** command, adding features like MIME support and SMTP.

# SEE ALSO

[mail](/man/mail)(1), [mutt](/man/mutt)(1), [sendmail](/man/sendmail)(8)

