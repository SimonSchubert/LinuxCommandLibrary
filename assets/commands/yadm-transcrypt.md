# TAGLINE

Transparent encryption for yadm files

# TLDR

**Initialize transcrypt**

```yadm transcrypt -c aes-256-cbc -p [password]```

**Show the configuration and password**

```yadm transcrypt --display```

**List encrypted files**

```yadm transcrypt --list```

**Change the password** and re-encrypt

```yadm transcrypt --rekey -p [password]```

**Remove credentials** and re-encrypt the working copy

```yadm transcrypt --flush-credentials```

# SYNOPSIS

**yadm** **transcrypt** [_options_]

# PARAMETERS

**-c**, **--cipher=** _cipher_
> Encryption cipher. Defaults to **aes-256-cbc**.

**-p**, **--password=** _password_
> Set the password used to derive the key.

**-d**, **--display**
> Show the configuration and password.

**-l**, **--list**
> List files managed by transcrypt.

**-r**, **--rekey**
> Re-encrypt all files with a new password.

**-f**, **--flush-credentials**
> Remove the stored credentials.

**-y**, **--yes**
> Assume yes for all prompts.

# DESCRIPTION

**yadm transcrypt** passes its options directly to transcrypt, with the environment configured to use the yadm repository. Files matching **.gitattributes** patterns are transparently encrypted when committed and decrypted on checkout. It is a separate alternative to **yadm encrypt**.

# CAVEATS

**transcrypt** must be installed separately. Unlike the **yadm encrypt** archive, it encrypts files individually. See [transcrypt](/man/transcrypt)(1) for all options.

# SEE ALSO

[yadm](/man/yadm)(1), [transcrypt](/man/transcrypt)(1), [yadm-git-crypt](/man/yadm-git-crypt)(1), [yadm-encrypt](/man/yadm-encrypt)(1)

# RESOURCES

```[Source code](https://github.com/yadm-dev/yadm)```

```[Homepage](https://yadm.io)```

```[Documentation](https://yadm.io/docs/encryption)```

<!-- verified: 2026-11-09 -->
