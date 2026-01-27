# TLDR

**List all keys** (accepted, pending, and rejected)

```salt-key -L```

**Accept a specific minion key**

```salt-key -a [minion_id]```

**Accept all pending keys**

```salt-key -A```

**Reject a specific minion key**

```salt-key -r [minion_id]```

**Delete a specific minion key**

```salt-key -d [minion_id]```

**Print the fingerprint** of a specific key

```salt-key -f [minion_id]```

**Print fingerprints of all keys**

```salt-key -F```

# SYNOPSIS

**salt-key** [_options_]

# PARAMETERS

**-L**, **--list-all**
> List all accepted, pending, and rejected minion keys

**-l** _ARG_, **--list**=_ARG_
> List keys: pre/un/unaccepted, acc/accepted, rej/rejected, or all

**-a** _KEY_ID_, **--accept**=_KEY_ID_
> Accept the specified minion key

**-A**, **--accept-all**
> Accept all pending minion keys

**-r** _KEY_ID_, **--reject**=_KEY_ID_
> Reject the specified minion key

**-R**, **--reject-all**
> Reject all pending minion keys

**-d** _KEY_ID_, **--delete**=_KEY_ID_
> Delete the specified minion key

**-D**, **--delete-all**
> Delete all keys

**-f** _KEY_ID_, **--finger**=_KEY_ID_
> Print the fingerprint of the specified key

**-F**, **--finger-all**
> Print fingerprints of all keys

**-y**, **--yes**
> Answer yes to all questions (use with caution)

**-c** _DIR_, **--config-dir**=_DIR_
> Specify Salt configuration directory (default: /etc/salt)

**--gen-keys**=_NAME_
> Generate a keypair with the specified name

**--gen-keys-dir**=_DIR_
> Directory to save generated keypair

**--keysize**=_SIZE_
> Key size for generated keys (minimum 2048)

# DESCRIPTION

**salt-key** manages Salt minion public keys on a Salt master server. In SaltStack's architecture, minions use public-key cryptography to authenticate with the master. When a minion first connects, it sends its public key to the master, which must be explicitly accepted before communication can occur.

Keys exist in three states: unaccepted (pending), accepted, or rejected. The salt-key command allows administrators to list, accept, reject, and delete keys. Fingerprint verification enables secure identification of minions before accepting their keys.

# CAVEATS

Always verify minion identity before accepting keys by comparing fingerprints. Deleting keys is permanent and prevents the minion from connecting until its key is regenerated. The **-y** flag bypasses confirmation prompts and should be used cautiously, especially with **-A**, **-D**, or **-R**. Requires root privileges or appropriate permissions on /etc/salt/pki/master/.

# HISTORY

salt-key is part of **SaltStack** (now Salt Project), an open-source configuration management and remote execution tool created by Thomas Hatch in **2011**. The key management system provides the security foundation for Salt's master-minion architecture.

# SEE ALSO

[salt](/man/salt)(1), [salt-master](/man/salt-master)(8), [salt-minion](/man/salt-minion)(8), [salt-call](/man/salt-call)(1)
