# TLDR

**Initialize git-crypt**

```yadm git-crypt init```

**Unlock repository**

```yadm git-crypt unlock```

**Add GPG key**

```yadm git-crypt add-gpg-user [key-id]```

# SYNOPSIS

**yadm** **git-crypt** _command_ [_args_...]

# DESCRIPTION

**yadm git-crypt** wraps git-crypt for transparent encryption. Files matching .gitattributes patterns are encrypted on push, decrypted on pull. Alternative to yadm encrypt for per-file encryption.

# SEE ALSO

[yadm](/man/yadm)(1), [git-crypt](/man/git-crypt)(1)

