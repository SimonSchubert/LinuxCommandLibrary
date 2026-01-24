# TLDR

**Login to vault**

```rbw login```

**Unlock vault**

```rbw unlock```

**Get password**

```rbw get [entry-name]```

**Get username**

```rbw get --field username [entry-name]```

**List entries**

```rbw list```

**Search entries**

```rbw list | grep [pattern]```

**Sync vault**

```rbw sync```

**Add entry**

```rbw add [entry-name]```

**Generate password**

```rbw generate [entry-name] [username]```

# SYNOPSIS

**rbw** _command_ [_options_] [_args_]

# PARAMETERS

**login**
> Authenticate.

**unlock**
> Unlock vault.

**lock**
> Lock vault.

**sync**
> Sync with server.

**get** _NAME_
> Get password.

**list**
> List entries.

**add** _NAME_
> Add entry.

**edit** _NAME_
> Edit entry.

**remove** _NAME_
> Delete entry.

**generate** _NAME_ _USER_
> Generate password.

**--field** _FIELD_
> Specific field.

**--folder** _FOLDER_
> In folder.

# DESCRIPTION

**rbw** is an unofficial Bitwarden CLI client. It provides fast, Unix-friendly password access.

Vault syncs with Bitwarden servers. Entries are cached locally for speed.

Get command outputs password to stdout. Integrates with scripts and dmenu.

Field selection retrieves username, TOTP, or notes. Full entry data available.

Generation creates and stores passwords. Configurable length and character sets.

# CAVEATS

Unofficial client. Some Bitwarden features not supported. Requires rbw-agent daemon.

# HISTORY

**rbw** was created as a command-line Bitwarden client optimized for Unix workflows. It emphasizes scriptability and speed over feature completeness.

# SEE ALSO

[pass](/man/pass)(1), [bw](/man/bw)(1), [gopass](/man/gopass)(1)
