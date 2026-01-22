# TLDR

**Start SSH agent**

```eval $(keychain --eval [id_rsa])```

**Add multiple keys**

```eval $(keychain --eval [id_rsa] [id_ed25519])```

**Include GPG keys**

```eval $(keychain --eval --agents ssh,gpg [id_rsa] [GPGKEY])```

**Clear cached keys**

```keychain --clear```

**Quiet mode**

```eval $(keychain -q --eval [id_rsa])```

**Show status**

```keychain -l```

# SYNOPSIS

**keychain** [_options_] [_keys_...]

# PARAMETERS

_KEYS_
> SSH or GPG keys to manage.

**--eval**
> Output shell eval commands.

**--agents** _LIST_
> Agent types (ssh, gpg).

**--clear**
> Clear cached keys.

**-q**, **--quiet**
> Suppress output.

**-l**, **--list**
> List cached keys.

**--help**
> Display help information.

# DESCRIPTION

**keychain** manages SSH and GPG agent processes. It reuses agents across login sessions.

The tool starts agents once and inherits them. It avoids repeated passphrase prompts across terminals.

keychain manages SSH/GPG agents.

# CAVEATS

Shell integration required. Profile/rc file setup. Funtoo project.

# HISTORY

keychain was created by **Daniel Robbins** (Funtoo) to simplify SSH agent management across sessions.

# SEE ALSO

[ssh-agent](/man/ssh-agent)(1), [ssh-add](/man/ssh-add)(1), [gpg-agent](/man/gpg-agent)(1)
