# TAGLINE

Terminal email client with tabs and embedded terminal

# TLDR

**Launch aerc**

```aerc```

**Open with a specific account only**

```aerc -a [account_name]```

**Compose a new email** to an address

```aerc mailto:[user@example.com]```

**Open an mbox file**

```aerc mbox:[path/to/file.mbox]```

**Use a custom configuration file**

```aerc -C [path/to/aerc.conf]```

# SYNOPSIS

**aerc** [**-h**] [**-v**] [**-a** _name_] [**-C** _file_] [**-A** _file_] [**-B** _file_] [**-I**] [_mailto:..._|_mbox:file_|_:command_]

# PARAMETERS

**-h**, **--help**
> Show usage help and exit

**-v**, **--version**
> Print the installed version and exit

**-a** _name_, **--account** _name_
> Load only the named account(s); comma-separated or repeated

**-C** _path_, **--aerc-conf** _path_
> Use a custom aerc.conf configuration file

**-A** _path_, **--accounts-conf** _path_
> Use a custom accounts.conf file

**-B** _path_, **--binds-conf** _path_
> Use a custom key bindings configuration file

**-I**, **--no-ipc**
> Run commands directly instead of over IPC to an existing instance

# DESCRIPTION

**aerc** is a terminal-based email client written in Go, designed for power users and developers. It features a tabbed interface allowing multiple accounts and emails to be open simultaneously, an embedded terminal emulator for running shell commands alongside email tasks, and vim-style keybindings with an ex-command system.

aerc supports IMAP, JMAP, Maildir, Notmuch, and Mbox backends with SMTP and sendmail for sending. It handles email threading, PGP signing and encryption via GnuPG, HTML email rendering through external filters, syntax-highlighted patches and diffs, CardDAV contact lookups, and template-based composition. The UI never locks up due to network issues thanks to asynchronous IMAP and JMAP support.

# CONFIGURATION

Configuration files are stored in **$XDG_CONFIG_HOME/aerc/** (typically ~/.config/aerc/):

**aerc.conf** -- Main application configuration (UI, logging, filters)
**accounts.conf** -- Email account definitions (server, credentials, backend type)
**binds.conf** -- Key binding customizations

# CAVEATS

HTML email rendering requires **w3m** to be installed. Homebrew builds on macOS do not include notmuch support; compile from source if needed. The project uses a mailing-list-based patch submission workflow via git-send-email rather than pull requests.

# HISTORY

**aerc** was originally created by **Drew DeVault** (sircmpwn) with the first commit in **January 2018** and the 0.1.0 pre-release announced in **June 2019**. After the original project became unmaintained, **Robin Jarry** forked and took over active maintenance. The project is hosted on SourceHut and licensed under the MIT license.

# SEE ALSO

[mutt](/man/mutt)(1), [alpine](/man/alpine)(1), [neomutt](/man/neomutt)(1), [notmuch](/man/notmuch)(1)
