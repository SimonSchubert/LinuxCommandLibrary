# TAGLINE

Transparent encryption for yadm files

# TLDR

**Initialize git-crypt**

```yadm git-crypt init```

**Unlock repository**

```yadm git-crypt unlock```

**Lock repository**

```yadm git-crypt lock```

**Add GPG key**

```yadm git-crypt add-gpg-user [key-id]```

**Show encryption status** of files

```yadm git-crypt status```

# SYNOPSIS

**yadm** **git-crypt** _command_ [_args_...]

# DESCRIPTION

**yadm git-crypt** passes its options directly to git-crypt, with the environment configured to use the yadm repository. Files matching patterns in **.gitattributes** are encrypted when committed and decrypted on checkout. It is a separate alternative to **yadm encrypt**, which stores files in a single archive.

# CAVEATS

**git-crypt** must be installed separately.

# SEE ALSO

[yadm](/man/yadm)(1), [git-crypt](/man/git-crypt)(1), [yadm-transcrypt](/man/yadm-transcrypt)(1), [yadm-encrypt](/man/yadm-encrypt)(1)

# RESOURCES

```[Source code](https://github.com/yadm-dev/yadm)```

```[Homepage](https://yadm.io)```

```[Documentation](https://yadm.io/docs/encryption)```

<!-- verified: 2026-11-09 -->
