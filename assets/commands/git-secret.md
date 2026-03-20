# TAGLINE

Encrypt and store secrets in a Git repository

# TLDR

**Initialize git-secret**

```git secret init```

**Add user by email**

```git secret tell [user@email.com]```

**Add file to encrypt**

```git secret add [secret.txt]```

**Encrypt secrets**

```git secret hide```

**Decrypt secrets**

```git secret reveal```

**List users who can access secrets**

```git secret whoknows```

**Decrypt and print a single file to stdout**

```git secret cat [secret.txt]```

# SYNOPSIS

**git secret** _command_ [_options_]

# PARAMETERS

**init**
> Initialize git-secret in repo.

**tell** _EMAIL_
> Add a GPG key holder who can decrypt secrets. Use **-m** to use git config user.email.

**add** _FILE_
> Add a file to be encrypted. The plaintext file is automatically added to .gitignore.

**hide**
> Encrypt all added secret files. Use **-m** to delete plaintext after encrypting.

**reveal**
> Decrypt all secret files. Use **-p** _PASSWORD_ for non-interactive passphrase input.

**remove** _FILE_
> Remove a file from the secret list.

**list**
> List all secret files.

**whoknows**
> List users who have access to secrets.

**changes** _FILE_
> Show diff between plaintext and decrypted version of a file.

**cat** _FILE_
> Decrypt and print a single secret file to stdout.

**removeperson** _EMAIL_
> Remove a person from the secret access list.

**--help**
> Display help information.

# DESCRIPTION

**git secret** encrypts sensitive files for safe storage in Git repositories. Files are encrypted with GPG for specified recipients, allowing secrets to be version-controlled safely.

The tool manages encryption, decryption, and recipient lists. Encrypted files (`.secret`) are tracked by Git while the original plaintext files are automatically added to `.gitignore`.

# CONFIGURATION

**.gitsecret/**
> Directory storing git-secret configuration, key rings, and file mappings.

# ENVIRONMENT

**SECRETS_VERBOSE**
> Sets verbose flag to show additional output for all commands.

**SECRETS_GPG_COMMAND**
> Sets an alternative to gpg (default: gpg).

**SECRETS_GPG_ARMOR**
> Enables gpg --armor mode for ASCII-armored output.

# CAVEATS

Requires GPG. Recipients need GPG keys. This is a separate tool from **gh secret** (GitHub CLI secrets).

# HISTORY

git secret was created to solve the problem of storing secrets in git repositories, using GPG encryption to protect sensitive configuration.

# SEE ALSO

[gpg](/man/gpg)(1), [gh-secret](/man/gh-secret)(1), [git](/man/git)(1)
