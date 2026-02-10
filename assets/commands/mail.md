# TAGLINE

sends and reads email

# TLDR

**Send email**

```mail -s "[Subject]" [recipient@example.com]```

**Send with body**

```echo "[message]" | mail -s "[Subject]" [recipient@example.com]```

**Send file contents**

```mail -s "[Subject]" [recipient@example.com] < [message.txt]```

**Send with attachment**

```mail -s "[Subject]" -A [file.pdf] [recipient@example.com]```

**Read mail**

```mail```

**Check specific mailbox**

```mail -f [/var/mail/user]```

# SYNOPSIS

**mail** [_options_] [_recipients_]

# PARAMETERS

_RECIPIENTS_
> Email addresses.

**-s** _SUBJECT_
> Email subject.

**-A** _FILE_
> Attach file.

**-c** _ADDR_
> CC recipients.

**-b** _ADDR_
> BCC recipients.

**-f** _FILE_
> Read from mailbox.

**--help**
> Display help information.

# DESCRIPTION

**mail** sends and reads email. It's a basic command-line mail user agent.

The tool can send quick emails from scripts. It reads mail from local mailboxes.

# CAVEATS

Requires MTA configured. Various implementations. May need mailutils package.

# HISTORY

mail dates back to early **Unix** systems, providing basic email functionality for users and scripts.

# SEE ALSO

[mailx](/man/mailx)(1), [sendmail](/man/sendmail)(8), [mutt](/man/mutt)(1)

