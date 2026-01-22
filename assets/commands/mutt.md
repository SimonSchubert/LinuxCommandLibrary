# TLDR

**Start Mutt**

```mutt```

**Send email from command line**

```echo "[body]" | mutt -s "[subject]" [recipient@example.com]```

**Send with attachment**

```mutt -s "[subject]" -a [file.pdf] -- [recipient@example.com]```

**Open specific mailbox**

```mutt -f [/path/to/mailbox]```

**Send with CC**

```mutt -s "[subject]" -c [cc@example.com] [to@example.com]```

**Use alternate config**

```mutt -F [~/.muttrc.alt]```

# SYNOPSIS

**mutt** [_options_] [_address_]

# PARAMETERS

_ADDRESS_
> Email recipient address.

**-s** _SUBJECT_
> Email subject.

**-a** _FILE_
> Attach file.

**-c** _ADDRESS_
> CC address.

**-f** _MAILBOX_
> Open mailbox.

**-F** _FILE_
> Config file.

**--help**
> Display help information.

# DESCRIPTION

**mutt** is a text-based email client. It's highly configurable with Vim-like keybindings.

The tool supports IMAP, POP3, and local mail. Features threading, PGP, and MIME.

mutt is terminal email client.

# CAVEATS

Configuration required. Learning curve for keybindings. Text-based interface.

# HISTORY

Mutt was created by **Michael Elstrøm** in 1995 as a fork of EstrøM, becoming a popular terminal mail client.

# SEE ALSO

[neomutt](/man/neomutt)(1), [alpine](/man/alpine)(1), [mailx](/man/mailx)(1)

