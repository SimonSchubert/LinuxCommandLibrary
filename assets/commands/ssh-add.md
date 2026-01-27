# TLDR

**Add the default SSH keys** to the agent

```ssh-add```

**Add a specific key** to the agent

```ssh-add [~/.ssh/id_ed25519]```

**List fingerprints** of loaded keys

```ssh-add -l```

**List public keys** of loaded identities

```ssh-add -L```

**Remove a specific key** from the agent

```ssh-add -d [~/.ssh/id_rsa]```

**Remove all keys** from the agent

```ssh-add -D```

**Add a key with a lifetime** (seconds)

```ssh-add -t [3600] [~/.ssh/id_rsa]```

# SYNOPSIS

**ssh-add** [_-cDdKkLlqvXx_] [_-E fingerprint_hash_] [_-S provider_] [_-t life_] [_file ..._]

# PARAMETERS

**-l**
> List fingerprints of all identities in the agent

**-L**
> List public key parameters of all identities

**-d**
> Remove specified identity from the agent

**-D**
> Remove all identities from the agent

**-t** _life_
> Set maximum lifetime for added keys (in seconds or sshd_config time format)

**-x**
> Lock the agent with a password

**-X**
> Unlock the agent

**-K**
> Load resident keys from a FIDO authenticator

**-c**
> Require confirmation before using the key

**-v**
> Verbose mode for debugging

# DESCRIPTION

**ssh-add** adds private key identities to the ssh-agent authentication agent. Without arguments, it attempts to add ~/.ssh/id_rsa, ~/.ssh/id_ecdsa, ~/.ssh/id_ed25519, and corresponding FIDO keys.

Once keys are added to the agent, SSH can authenticate without requiring the passphrase for each connection. The agent must be running and the SSH_AUTH_SOCK environment variable must be set.

If a key requires a passphrase, ssh-add prompts from the terminal. The SSH_ASKPASS environment variable can specify a graphical password prompt program.

# CAVEATS

Keys remain in memory while the agent runs; lock with **-x** on shared systems. The agent socket (SSH_AUTH_SOCK) must be protected from other users. Use **-t** to auto-expire keys for enhanced security.

# HISTORY

ssh-add is part of **OpenSSH**, developed by the OpenBSD project. The SSH agent concept allows secure key management without repeatedly entering passphrases, originating from the SSH1 implementation in the 1990s.

# SEE ALSO

[ssh-agent](/man/ssh-agent)(1), [ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [ssh-copy-id](/man/ssh-copy-id)(1)
