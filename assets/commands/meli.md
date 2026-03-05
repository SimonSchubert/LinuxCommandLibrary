# TAGLINE

Configurable and extensible terminal email client

# TLDR

**Launch the email client**

```meli```

# SYNOPSIS

**meli** [_options_]

# DESCRIPTION

**meli** is a terminal email client with sane defaults, aimed at both new and power users. It supports multiple accounts and integrates email storage, SMTP, contact management, and an embedded terminal editor.

Supported protocols and formats include **Maildir**, **mbox**, **notmuch**, **IMAP**, **JMAP**, and **NNTP** (Usenet). It features powerful search, custom themes, and the option to run an external editor inside meli via an embedded xterm-compatible terminal emulator.

# CONFIGURATION

**${XDG_CONFIG_HOME}/meli/config.toml**
> Main configuration file for accounts, keybindings, themes, and behavior.

# CAVEATS

Requires Rust 1.65+ to build from source. Initial configuration of mail accounts is required before use.

# HISTORY

**meli** is written in **Rust** and supports BSD, Linux, and macOS.

# SEE ALSO

[mutt](/man/mutt)(1), [neomutt](/man/neomutt)(1), [himalaya](/man/himalaya)(1)
