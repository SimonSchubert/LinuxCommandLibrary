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

# SYNOPSIS

**git secret** _command_ [_options_]

# PARAMETERS

**init**
> Initialize git-secret in repo.

**tell** _EMAIL_
> Add GPG user.

**add** _FILE_
> Add file to secrets.

**hide**
> Encrypt secret files.

**reveal**
> Decrypt secret files.

**remove** _FILE_
> Remove file from secrets.

**list**
> List secret files.

**--help**
> Display help information.

# DESCRIPTION

**git secret** encrypts sensitive files for safe storage in git. Files are encrypted with GPG for specified recipients, allowing secrets to be version-controlled safely.

The tool manages encryption/decryption, recipient lists, and the integration with git. Encrypted files (.secret) are tracked while originals are gitignored.

git secret enables secure storage of secrets in repositories.

# CAVEATS

Requires GPG. Recipients need GPG keys. Separate tool from gh secret.

# HISTORY

git secret was created to solve the problem of storing secrets in git repositories, using GPG encryption to protect sensitive configuration.

# SEE ALSO

[gpg](/man/gpg)(1), [gh-secret](/man/gh-secret)(1)
