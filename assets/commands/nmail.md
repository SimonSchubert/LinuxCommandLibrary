# TAGLINE

Terminal email client for Linux and macOS

# TLDR

**Launch the email client**

```nmail```

**Set up a Gmail account**

```nmail -s gmail```

**Set up an Outlook account**

```nmail -s outlook```

# SYNOPSIS

**nmail** [_options_]

# PARAMETERS

**-s** _SERVICE_
> Run the setup wizard for a specific service (gmail, outlook).

# DESCRIPTION

**nmail** is a console-based email client for Linux and macOS with a user interface similar to Alpine/Pine. It supports IMAP and SMTP, multiple accounts, email threading, searching and filtering, viewing HTML emails (converted to text or opened in an external browser), composing HTML emails with Markdown, draft messages, offline composition, and attachment handling.

Setup wizards are provided for Gmail and Outlook/Hotmail. External text editors like vim or emacs can be used for composing.

# CAVEATS

Gmail requires an app-specific password when two-factor authentication is enabled.

# HISTORY

**nmail** was created by **d99kris** and is written in **C++**.

# SEE ALSO

[mutt](/man/mutt)(1), [alpine](/man/alpine)(1), [meli](/man/meli)(1)
