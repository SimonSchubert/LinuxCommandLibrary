# TAGLINE

Store and retrieve secrets via desktop keyring

# TLDR

**Store** a secret (reads value from stdin) with a label and attribute pair

```secret-tool store --label="[My password]" [attribute] [value]```

**Look up** a stored secret by attribute

```secret-tool lookup [attribute] [value]```

**Search** for secrets matching attributes (metadata only)

```secret-tool search [attribute] [value]```

**Search and unlock** with all matching secrets shown

```secret-tool search --all --unlock [attribute] [value]```

**Clear** all secrets matching attributes

```secret-tool clear [attribute] [value]```

# SYNOPSIS

**secret-tool store** **--label**=_label_ [_attribute_ _value_]...

**secret-tool lookup** [_attribute_ _value_]...

**secret-tool search** [**--all**] [**--unlock**] [_attribute_ _value_]...

**secret-tool clear** [_attribute_ _value_]...

# COMMANDS

**store**
> Store a secret. The password is read from stdin. Requires **--label** and one or more attribute/value pairs to identify the entry.

**lookup**
> Print the password of a secret matching the given attribute/value pairs.

**search**
> List secrets matching the attribute/value pairs. By default shows only the first match without unlocking.

**clear**
> Remove all secrets that match the given attribute/value pairs.

# PARAMETERS

**--label** _label_
> Human-readable label for the secret (required for **store**).

**--all**
> Show all matching secrets, not just the first (search only).

**--unlock**
> Unlock locked collections during the search.

# DESCRIPTION

**secret-tool** stores and retrieves passwords using the Freedesktop Secret Service API. It communicates with running keyring daemons such as gnome-keyring or KWallet over D-Bus.

Secrets are not addressed by name but by arbitrary attribute/value pairs (for example `service mybackup user alice`). The same pairs used to store a secret must be supplied to look it up or remove it.

# CAVEATS

Requires a running Secret Service provider (gnome-keyring-daemon or kwalletd). Stored secrets are encrypted on disk but accessible to any application running as the user. Passwords are read from stdin during **store** to avoid leaking them via process listings.

# HISTORY

Part of **libsecret**, the GNOME library implementing the Freedesktop Secret Service specification. **secret-tool** was added as a convenience CLI so the keyring could be scripted without writing D-Bus code.

# SEE ALSO

[gnome-keyring](/man/gnome-keyring)(1), [pass](/man/pass)(1)
