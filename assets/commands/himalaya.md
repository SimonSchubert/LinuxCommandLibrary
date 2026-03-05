# TAGLINE

CLI to manage emails

# TLDR

**List emails** in the inbox

```himalaya list```

**Read a specific email**

```himalaya read [id]```

**Compose and send a new email**

```himalaya write```

**Reply to an email**

```himalaya reply [id]```

**Search emails**

```himalaya search "[query]"```

**List folders**

```himalaya folders```

**Download an attachment**

```himalaya attachment download [id]```

# SYNOPSIS

**himalaya** [_options_] _command_ [_arguments_]

# DESCRIPTION

**himalaya** is a command-line interface for managing emails. Unlike TUI email clients like **mutt** or **aerc**, himalaya is a pure CLI with no event loop — you interact with your emails using shell commands in a stateless way. This makes it composable with pipes and scripts, and freely integrable with other CLI tools.

It supports multiple backends including **IMAP**, **SMTP**, **Maildir**, and **Notmuch**, with features like multi-account support, **PGP encryption**, and **OAuth 2.0** authentication. Himalaya is designed to extract email logic into a simple CLI API that can be used directly from the terminal, from scripts, and from UIs.

# PARAMETERS

**list**
> List emails in the current folder

**read** _id_
> Read a specific email

**write**
> Compose a new email

**reply** _id_
> Reply to an email

**forward** _id_
> Forward an email

**search** _query_
> Search emails

**folders**
> List mail folders

**attachment download** _id_
> Download attachments

# CONFIGURATION

Configuration is stored in **$XDG_CONFIG_HOME/himalaya/config.toml** and defines accounts with backend settings for IMAP, SMTP, Maildir, or Notmuch.

# CAVEATS

Initial configuration requires manual setup of mail accounts. OAuth 2.0 setup may require additional steps depending on the provider. PGP encryption requires GPG to be installed and configured.

# HISTORY

**himalaya** was created by **Clément DOUIN** as part of the **Pimalaya** project and is written in **Rust**. It was designed as a Unix-philosophy approach to email, providing simple composable commands rather than a monolithic TUI application.

# SEE ALSO

[mutt](/man/mutt)(1), [aerc](/man/aerc)(1), [neomutt](/man/neomutt)(1), [mail](/man/mail)(1)
