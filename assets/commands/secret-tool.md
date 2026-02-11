# TAGLINE

Store and retrieve secrets via desktop keyring

# TLDR

**Store** a secret with label

```secret-tool store --label=label key value```

**Retrieve** a secret

```secret-tool lookup key key_name```

**Search** for information about a secret

```secret-tool search key key_name```

**Delete** a stored secret

```secret-tool clear key key_name```

# SYNOPSIS

**secret-tool** _command_ [_options_] _attributes_

# PARAMETERS

**store**
> Store a new secret

**--label** _label_
> Label for the secret

**lookup**
> Retrieve a secret

**search**
> Get information about secrets

**clear**
> Delete a secret

# DESCRIPTION

**secret-tool** stores and retrieves passwords using the Freedesktop Secret Service API. It communicates with keyring implementations like gnome-keyring or KWallet.

Secrets are identified by key-value attribute pairs for flexible organization.

# CAVEATS

Requires a secret service provider to be running. Secrets are stored encrypted but accessible to applications using the Secret Service.

# HISTORY

Part of **libsecret** package, providing command-line access to the Freedesktop Secret Service.

# SEE ALSO

[gnome-keyring](/man/gnome-keyring)(1), [pass](/man/pass)(1)
