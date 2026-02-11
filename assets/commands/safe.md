# TAGLINE

Simplified CLI for HashiCorp Vault

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

**safe** is a user-friendly command-line interface for HashiCorp Vault that simplifies common secret management operations. It wraps the Vault API with intuitive commands for reading, writing, and organizing secrets without needing to understand the full Vault CLI syntax.

The tool supports multiple authentication methods including LDAP, GitHub tokens, and direct token authentication. Once targeted and authenticated against a Vault server, secrets can be managed using simple commands like **set**, **get**, and **rm**. The **tree** command provides a hierarchical view of all secret paths for easy browsing.

Secrets can be exported and imported for backup purposes or migration between Vault instances. The **target** command manages connections to multiple Vault servers, allowing quick switching between environments.

# CAVEATS

Requires Vault access. Authentication needed. Permissions vary.

# HISTORY

**safe** was created as a user-friendly CLI for HashiCorp Vault, simplifying secret management operations.

# SEE ALSO

[vault](/man/vault)(1), [pass](/man/pass)(1), [aws](/man/aws)(1)
