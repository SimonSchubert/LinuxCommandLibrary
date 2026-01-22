# TLDR

**Start NeoMutt**

```neomutt```

**Open specific mailbox**

```neomutt -f [/path/to/mailbox]```

**Send email**

```echo "[body]" | neomutt -s "[subject]" [recipient@example.com]```

**Send with attachment**

```neomutt -s "[subject]" -a [file.pdf] -- [recipient@example.com]```

**Use alternate config**

```neomutt -F [~/.neomuttrc]```

**Check for new mail**

```neomutt -Z```

# SYNOPSIS

**neomutt** [_options_] [_address_]

# PARAMETERS

_ADDRESS_
> Email recipient.

**-f** _MAILBOX_
> Open mailbox.

**-s** _SUBJECT_
> Email subject.

**-a** _FILE_
> Attach file.

**-F** _FILE_
> Config file.

**-Z**
> Check for mail.

**--help**
> Display help information.

# DESCRIPTION

**neomutt** is a terminal email client. It's a feature-rich fork of Mutt.

The tool adds modern features. Supports IMAP, POP3, SMTP, and local mail.

neomutt is enhanced Mutt fork.

# CAVEATS

Configuration required. Vim-like keybindings. Steeper learning curve.

# HISTORY

NeoMutt forked from **Mutt** in 2016 to integrate community patches and add new features.

# SEE ALSO

[mutt](/man/mutt)(1), [alpine](/man/alpine)(1), [mailx](/man/mailx)(1)

