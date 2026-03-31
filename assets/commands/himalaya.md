# TAGLINE

CLI to manage emails

# TLDR

**List email envelopes** in the inbox

```himalaya envelope list```

**Read a specific email**

```himalaya message read [id]```

**Compose and send a new email**

```himalaya message write```

**Reply to an email**

```himalaya message reply [id]```

**Forward an email**

```himalaya message forward [id]```

**List folders**

```himalaya folder list```

**Download attachments**

```himalaya attachment download [id]```

**Use a specific account**

```himalaya -a [account_name] envelope list```

# SYNOPSIS

**himalaya** [_options_] _command_ _subcommand_ [_arguments_]

# DESCRIPTION

**himalaya** is a command-line interface for managing emails. Unlike TUI email clients like **mutt** or **aerc**, himalaya is a pure CLI with no event loop — you interact with your emails using shell commands in a stateless way. This makes it composable with pipes and scripts, and freely integrable with other CLI tools.

It supports multiple backends including **IMAP**, **SMTP**, **Maildir**, and **Notmuch**, with features like multi-account support, **PGP encryption**, and **OAuth 2.0** authentication. Himalaya is designed to extract email logic into a simple CLI API that can be used directly from the terminal, from scripts, and from UIs.

# PARAMETERS

**-a**, **--account** _name_
> Use a specific email account.

**envelope list**
> List email envelopes in the current folder.

**envelope watch**
> Watch for new envelope changes in real time.

**message read** _id_
> Read a specific email message.

**message write**
> Compose a new email message.

**message reply** _id_
> Reply to an email message.

**message forward** _id_
> Forward an email message.

**message delete** _id_
> Delete an email message.

**folder list**
> List mail folders.

**folder create** _name_
> Create a new mail folder.

**attachment download** _id_
> Download attachments from a message.

# CONFIGURATION

Configuration is stored in **$XDG_CONFIG_HOME/himalaya/config.toml** (or **~/.config/himalaya/config.toml**) and defines accounts with backend settings for IMAP, SMTP, Maildir, or Notmuch. Run **himalaya account configure** for an interactive setup wizard.

# CAVEATS

Initial configuration requires manual setup of mail accounts. OAuth 2.0 setup may require additional steps depending on the provider. PGP encryption requires GPG to be installed and configured.

# HISTORY

**himalaya** was created by **Clément DOUIN** as part of the **Pimalaya** project and is written in **Rust**. It was designed as a Unix-philosophy approach to email, providing simple composable commands rather than a monolithic TUI application.

# SEE ALSO

[mutt](/man/mutt)(1), [aerc](/man/aerc)(1), [neomutt](/man/neomutt)(1), [mail](/man/mail)(1)
