# TAGLINE

terminal-based Google Hangouts client (defunct: Hangouts was shut down in 2022)

# TLDR

**Start hangups** (prompts an OAuth login on first run, then caches the refresh token)

```hangups```

**Use the manual (copy-paste) OAuth login flow**

```hangups --manual-login```

**Use a custom configuration file**

```hangups --config [hangups.conf]```

**Enable verbose debug logging** to a file

```hangups --debug --log [hangups.log]```

**Rebind a keyboard shortcut**, e.g. quit

```hangups --key-quit [ctrl q]```

**Show the installed version**

```hangups --version```

# SYNOPSIS

**hangups** [_options_]

# PARAMETERS

**-c**, **--config** _FILE_
> Configuration file path.

**-d**, **--debug**
> Log detailed debugging messages.

**--manual-login**
> Use the manual (copy-paste) OAuth login flow instead of opening a browser.

**--token-path** _PATH_
> Path used to store the cached OAuth refresh token.

**--log** _FILE_
> Log file path.

**-D**, **--discreet-notifications**
> Hide message details in desktop notifications.

**--notification-type** _TYPE_
> Type of desktop notifications to create.

**--key-quit**, **--key-next-tab**, **--key-prev-tab**, **--key-close-tab**, **--key-menu** _KEY_
> Rebind the corresponding action's key (defaults: ctrl e, ctrl d, ctrl u, ctrl w, ctrl n).

**--col-scheme** _NAME_
> Colour scheme to use.

**--keep-emoticons**
> Don't replace emoticons with corresponding emoji.

**-v**, **--version**
> Print the installed hangups version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**hangups** was the first third-party instant messaging client for Google Hangouts, providing a Python library plus a terminal (urwid-based) reference client. It worked by reverse-engineering Google's proprietary Hangouts protocol, which let it support features like group messaging that weren't available to XMPP-based clients.

# CAVEATS

Google shut down consumer Hangouts in **November 2022** and decommissioned the API hangups depended on; the client can no longer log in or connect, and the project has seen no functional release since (last PyPI release was 0.4.18, April 2022). It is kept online for reference only, not as a usable chat client.

# HISTORY

hangups was created by **Tom Dryer**, with its first release in **2014**, as an unofficial Google Hangouts client for terminal users. Several bots and bridges (HangupsBot, telepathy-hangups) were built on top of its protocol library before Hangouts itself was retired.

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1), [finch](/man/finch)(1)

# RESOURCES

```[Source code](https://github.com/tdryer/hangups)```

```[Documentation](https://hangups.readthedocs.io/)```

<!-- verified: 2026-07-17 -->
