# TAGLINE

Simple terminal user interface for Signal messenger

# TLDR

**Launch the Signal TUI**

```scli```

**Start with conversation history saving**

```scli -s```

**Link scli with an existing Signal account**

```scli link --name "[my-laptop]"```

# SYNOPSIS

**scli** [_options_]

# PARAMETERS

**-s**, **--save-history**
> Enable conversation history saving.

**--enable-notifications**
> Turn on desktop notifications.

**--color**
> Colorize messages with standard or 256-color mode.

**--wrap-at** _NUM_
> Text wrapping width.

**--editor-command** _CMD_
> Custom editor command for composing messages.

# DESCRIPTION

**scli** is a TUI for Signal messenger that uses **signal-cli** as its backend and urwid for the interface. It features Vim-like navigation, emoji reactions, remote message deletion, desktop notifications with sender avatars, and external editor support for composing messages.

# CAVEATS

Requires **signal-cli** to be installed and registered. Cannot quote messages or add mentions due to signal-cli limitations. Voice calls and read receipts are unsupported. Data is stored unencrypted; full-disk encryption is recommended.

# HISTORY

**scli** was created by **isamert** and is written in **Python**.

# SEE ALSO

[signal-cli](/man/signal-cli)(1), [nchat](/man/nchat)(1), [toot](/man/toot)(1)
