# TAGLINE

utility for managing the Linux kernel keyring facility

# TLDR

**List** keys in a keyring

```keyctl list @us```

**Add** a key to a keyring

```keyctl add user keyname "keyvalue" @us```

Add key value from **stdin**

```echo -n "value" | keyctl padd user keyname @us```

**Read** a key value

```keyctl read keyid```

**Pipe** key value (raw output)

```keyctl pipe keyid```

Set **timeout** on a key

```keyctl timeout keyid 3600```

**Revoke** a key

```keyctl revoke keyid```

**Clear** all keys from keyring

```keyctl clear @us```

# SYNOPSIS

**keyctl** _command_ [_options_] [_arguments_]

# DESCRIPTION

**keyctl** is a utility for managing the Linux kernel keyring facility. It allows creating, modifying, and querying keys and keyrings that can store authentication tokens, encryption keys, and other security-related data.

# PARAMETERS

**add TYPE NAME DATA KEYRING**
> Create a new key and attach it to a keyring

**padd TYPE NAME KEYRING**
> Add a key with payload from stdin

**request TYPE NAME [DEST_KEYRING]**
> Request a key from the kernel

**update KEY DATA**
> Update a key's payload

**newring NAME KEYRING**
> Create a new keyring

**revoke KEY**
> Revoke a key, preventing further operations

**clear KEYRING**
> Remove all keys from a keyring

**unlink KEY KEYRING**
> Remove a key from a keyring

**search KEYRING TYPE DESCRIPTION [DEST_KEYRING]**
> Search for a key in a keyring

**read KEY**
> Read and display a key's payload

**pipe KEY**
> Output a key's payload without formatting

**list KEYRING**
> List keys in a keyring

**describe KEY**
> Display key attributes

**timeout KEY SECONDS**
> Set a key's expiration time

**setperm KEY MASK**
> Set key permissions

# CAVEATS

Special keyring identifiers: @t (thread), @p (process), @s (session), @u (user), @us (user-default session). Keys expire and are garbage collected automatically. Proper permissions are required to access keys.

# HISTORY

**keyctl** is part of the **keyutils** package, providing user-space access to the Linux kernel key management facility introduced in kernel 2.6.

# SEE ALSO

[request-key](/man/request-key)(8), [keyctl](/man/keyctl)(2), [keyrings](/man/keyrings)(7)
