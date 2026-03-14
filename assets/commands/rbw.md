# TAGLINE

Unofficial Bitwarden CLI password manager

# TLDR

**Login to vault**

```rbw login```

**Unlock vault**

```rbw unlock```

**Get password**

```rbw get [entry-name]```

**Get full entry (username, password, notes)**

```rbw get --full [entry-name]```

**Get a specific field**

```rbw get --field username [entry-name]```

**Get TOTP code**

```rbw code [entry-name]```

**List entries**

```rbw list```

**Search entries**

```rbw search [pattern]```

**Sync vault**

```rbw sync```

**Add entry**

```rbw add [entry-name]```

**Generate password and store it**

```rbw generate [entry-name] [username]```

# SYNOPSIS

**rbw** _command_ [_options_] [_args_]

# PARAMETERS

**config**
> Get or set configuration options.

**register**
> Register this device with the Bitwarden server.

**login**
> Log in to the Bitwarden server.

**unlock**
> Unlock the local vault database.

**lock**
> Lock the vault database.

**sync**
> Update the local copy of the Bitwarden database.

**get** _NAME_
> Display the password for a given entry.

**search** _TERM_
> Search for entries in the vault.

**code** _NAME_
> Display the TOTP authenticator code for a given entry.

**list**
> List all entries.

**add** _NAME_
> Add a new entry.

**edit** _NAME_
> Modify an existing entry.

**remove** _NAME_
> Delete an entry.

**generate** _NAME_ _USER_
> Generate a new password and store it.

**history** _NAME_
> View password history for an entry.

**stop-agent**
> Terminate the background agent.

**--full**
> Output username, password, and notes.

**--field** _FIELD_
> Output a specific field.

**--folder** _FOLDER_
> Restrict to a specific folder.

# DESCRIPTION

**rbw** is an unofficial command-line Bitwarden client designed for Unix-style workflows, outputting passwords directly to stdout for easy integration with scripts, dmenu, rofi, and other tools. It communicates with Bitwarden servers through a background agent daemon (**rbw-agent**) that caches the decrypted vault locally for fast retrieval.

The **get** command retrieves passwords by entry name, while the **--field** flag accesses specific fields like usernames, TOTP codes, or custom notes. The **generate** command creates random passwords and stores them directly in the vault. Vault synchronization with **rbw sync** keeps the local cache current with the server.

# CONFIGURATION

**~/.config/rbw/config.json**
> Client configuration specifying the Bitwarden server URL, email address, lock timeout, and pinentry program for master password entry.

**rbw-agent**
> Background daemon that maintains the decrypted vault in memory. Started automatically on first rbw command and locks after the configured timeout.

# CAVEATS

Unofficial client. Some Bitwarden features not supported. Requires rbw-agent daemon.

# HISTORY

**rbw** was created by **Jesse Luehrs** as a command-line Bitwarden client optimized for Unix workflows. It uses a background agent (similar to ssh-agent or gpg-agent) to hold decryption keys in memory, emphasizing scriptability and speed over feature completeness.

# SEE ALSO

[pass](/man/pass)(1), [bw](/man/bw)(1), [gopass](/man/gopass)(1)
