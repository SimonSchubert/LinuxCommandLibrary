# TAGLINE

Terminal email client based on Mutt

# TLDR

**Start NeoMutt**

```neomutt```

**Open a specific mailbox**

```neomutt -f [/path/to/mailbox]```

**Send an email**

```echo "[body]" | neomutt -s "[subject]" [recipient@example.com]```

**Send with an attachment** (must be the last option before the address)

```neomutt -s "[subject]" -a [file.pdf] -- [recipient@example.com]```

**Use an alternate config file**

```neomutt -F [~/.neomuttrc]```

**Open the first mailbox** with new messages, or exit if none

```neomutt -Z```

**Open mailbox in read-only mode**

```neomutt -R -f [/path/to/mailbox]```

# SYNOPSIS

**neomutt** [_options_] [_address_ ...]

# PARAMETERS

**-a** _FILE_
> Attach one or more files to a message. Must be the last option before **--** and addresses.

**-b** _ADDRESS_
> Specify a blind carbon copy (BCC) recipient.

**-c** _ADDRESS_
> Specify a carbon copy (CC) recipient.

**-d** _LEVEL_
> Log debugging output at the specified level (1-5); level 2 is recommended.

**-e** _COMMAND_
> Execute a configuration command after reading config files.

**-f** _MAILBOX_
> Open the specified mailbox.

**-F** _FILE_
> Use the specified file as the configuration file instead of the default.

**-H** _DRAFT_
> Use a draft file containing headers and body to compose a message.

**-i** _FILE_
> Specify a file to be embedded in the message body.

**-l** _FILE_
> Write debugging output to this file instead of the default.

**-m** _TYPE_
> Set the default mailbox format (mbox, MMDF, MH, or Maildir).

**-n**
> Do not read the system-wide configuration file.

**-p**
> Resume a prior postponed message.

**-Q** _VARIABLE_
> Query a configuration variable and print its value, then exit.

**-R**
> Open the mailbox in read-only mode.

**-s** _SUBJECT_
> Specify the subject of the message.

**-v**
> Print version and compile-time definitions, then exit.

**-y**
> Start with a listing of all defined mailboxes.

**-Z**
> Open the first mailbox with new messages, or exit with code 1 if none.

**-z**
> Open the specified or first mailbox only if it contains messages, otherwise exit.

# DESCRIPTION

**neomutt** is a small but powerful terminal email client supporting color terminals, MIME, OpenPGP/GnuPG, S/MIME, and threaded message sorting. It is a community-driven fork of Mutt that integrates long-standing patches and adds new features.

Supported protocols include IMAP, POP3, SMTP, NNTP, and local mailbox formats (mbox, Maildir, MH, MMDF). NeoMutt is highly configurable via `~/.neomuttrc` and uses Vim-like key bindings by default.

# CAVEATS

Initial configuration requires setting up accounts, folders, and key bindings in `~/.neomuttrc`. For sending mail, an SMTP server or local MTA must be configured. The **-a** flag must appear as the last option before **--** and the recipient addresses.

# HISTORY

**NeoMutt** was forked from **Mutt** in 2016 by Richard Russon to integrate community patches and add new features independently of the Mutt development pace.

# SEE ALSO

[mutt](/man/mutt)(1), [alpine](/man/alpine)(1), [mailx](/man/mailx)(1), [mail](/man/mail)(1), [mbsync](/man/mbsync)(1)

