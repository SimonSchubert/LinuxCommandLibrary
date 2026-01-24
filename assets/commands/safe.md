# TLDR

**Write secret**

```safe set [secret/path] [key]=[value]```

**Read secret**

```safe get [secret/path]```

**List secrets**

```safe tree```

**Delete secret**

```safe rm [secret/path]```

**Target Vault**

```safe target [vault-url] [alias]```

**Authenticate**

```safe auth [ldap|token|github]```

# SYNOPSIS

**safe** _command_ [_options_] [_args_]

# PARAMETERS

**set**
> Write secret.

**get**
> Read secret.

**rm**
> Delete secret.

**tree**
> List paths.

**target**
> Set Vault target.

**auth**
> Authenticate.

**export**
> Export secrets.

# DESCRIPTION

**safe** manages Vault secrets. It provides a friendly CLI.

Simplified Vault operations. Easy secret management.

Multiple auth methods. LDAP, token, GitHub.

Tree view of secrets. Browse hierarchy.

Export and import. Backup secrets.

# CAVEATS

Requires Vault access. Authentication needed. Permissions vary.

# HISTORY

**safe** was created as a user-friendly CLI for HashiCorp Vault, simplifying secret management operations.

# SEE ALSO

[vault](/man/vault)(1), [pass](/man/pass)(1), [aws](/man/aws)(1)
