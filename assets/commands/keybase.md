# TAGLINE

command-line client for Keybase, providing end-to-end encrypted chat, file

# TLDR

**Login to Keybase**

```keybase login```

**Check status**

```keybase status```

**Search for users**

```keybase search [username]```

**Encrypt file for user**

```keybase encrypt -i [file] -o [file.enc] [username]```

**Decrypt file**

```keybase decrypt -i [file.enc] -o [file]```

**Sign a message**

```keybase sign -m "[message]"```

**Verify signature**

```keybase verify -i [file.sig]```

**Start a chat**

```keybase chat send [username] "[message]"```

# SYNOPSIS

**keybase** [_command_] [_options_]

# PARAMETERS

**login**
> Log in to Keybase.

**signup**
> Create new account.

**status**
> Show account status.

**encrypt**
> Encrypt data for users.

**decrypt**
> Decrypt data.

**sign**
> Sign message or file.

**verify**
> Verify signature.

**chat**
> Keybase chat operations.

**fs**
> Keybase filesystem operations.

**git**
> Keybase git operations.

**pgp**
> Manage PGP keys.

**log send**
> Send logs for debugging.

# DESCRIPTION

**keybase** is a command-line client for Keybase, providing end-to-end encrypted chat, file sharing, and identity verification. Uses public-key cryptography to verify identities across social networks. Includes encrypted filesystem (KBFS) and encrypted git repositories.

# SEE ALSO

[gpg](/man/gpg)(1), [ssh](/man/ssh)(1)

