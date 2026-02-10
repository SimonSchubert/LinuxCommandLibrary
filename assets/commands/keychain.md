# TAGLINE

manages SSH and GPG agent processes

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

**keychain** is a front-end to ssh-agent and gpg-agent that manages long-running agent processes across login sessions. Rather than starting a new agent each time a shell is opened, keychain checks for an existing agent, reuses it if found, and only starts a new one when necessary, storing the agent's environment variables in files under `~/.keychain` so any shell can inherit them.

This approach means you only need to enter your passphrase once after a reboot, and all subsequent terminal sessions, cron jobs, and scripts can use the cached keys without further prompting. The tool supports managing both SSH and GPG keys simultaneously via the `--agents` flag and outputs shell-evaluable commands that set the appropriate `SSH_AUTH_SOCK` and `GPG_AGENT_INFO` environment variables.

# CAVEATS

Shell integration required. Profile/rc file setup. Funtoo project.

# HISTORY

keychain was created by **Daniel Robbins** (Funtoo) to simplify SSH agent management across sessions.

# SEE ALSO

[ssh-agent](/man/ssh-agent)(1), [ssh-add](/man/ssh-add)(1), [gpg-agent](/man/gpg-agent)(1)
