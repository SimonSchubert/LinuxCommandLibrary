# TAGLINE

Team-oriented password manager compatible with pass

# TLDR

**Initialize password store**

```gopass init```

**Generate new password**

```gopass generate [site/username]```

**Show password**

```gopass show [site/username]```

**Copy password to clipboard**

```gopass show -c [site/username]```

**Insert new secret**

```gopass insert [site/username]```

**List all entries**

```gopass ls```

**Search entries**

```gopass find [query]```

**Sync with remote**

```gopass sync```

# SYNOPSIS

**gopass** [_options_] _command_ [_args_]

# PARAMETERS

**init**
> Initialize password store.

**generate** _name_ [_length_]
> Generate new password.

**insert** _name_
> Insert new secret.

**show** _name_
> Display secret.

**ls** [_folder_]
> List entries.

**find** _query_
> Search entries.

**edit** _name_
> Edit existing entry.

**rm** _name_
> Remove entry.

**mv** _old_ _new_
> Move/rename entry.

**sync**
> Sync with git remote.

**-c**, **--clip**
> Copy to clipboard.

# DESCRIPTION

**gopass** is a password manager compatible with pass (the standard Unix password manager). It stores passwords encrypted with GPG in a git repository, enabling version control and synchronization.

The tool supports multiple stores, team sharing, TOTP generation, and integration with browsers and other tools. It adds features like better multi-user handling and mounted substores over standard pass.

# CONFIGURATION

**~/.config/gopass/config**
> gopass configuration file with store locations, mount points, and default settings.

**~/.local/share/gopass/stores/**
> Default storage location for password store data.

# CAVEATS

Requires GPG key setup. Git configuration needed for sync. Clipboard cleared after timeout. Multiple recipients need key exchange.

# HISTORY

**gopass** was created as a pass-compatible password manager written in Go, adding features for team use and better secrets management. It emerged around **2017** as organizations needed shared password management with GPG encryption.

# SEE ALSO

[pass](/man/pass)(1), [gpg](/man/gpg)(1), [git](/man/git)(1), [1password](/man/1password)(1)
