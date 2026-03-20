# TAGLINE

Simplified CLI for HashiCorp Vault

# TLDR

**Write a secret**

```safe set [secret/path] [key]=[value]```

**Read a secret**

```safe get [secret/path]```

**List all secret paths as a tree**

```safe tree```

**Delete a secret**

```safe rm [secret/path]```

**Target a Vault server**

```safe target [https://vault-url] [alias]```

**Authenticate against the current Vault**

```safe auth [ldap|token|github]```

**Copy a secret to a new path**

```safe cp [secret/old/path] [secret/new/path]```

**Generate a random password**

```safe gen [secret/path] [key]```

# SYNOPSIS

**safe** _command_ [_options_] [_args_]

# PARAMETERS

**set** (alias: **write**)
> Write or update a secret at a path.

**get** (alias: **read**)
> Read and display a secret.

**rm** (alias: **delete**)
> Delete one or more secret paths.

**tree**
> Print a tree listing of all reachable keys.

**paths**
> Print a flat listing of all reachable keys.

**target**
> Set or list Vault targets.

**auth**
> Authenticate against the currently targeted Vault.

**export**
> Export secrets to a backup file.

**import**
> Import secrets from a backup file.

**cp** (alias: **copy**)
> Copy a secret from one path to another.

**mv** (alias: **move**)
> Move a secret from one path to another.

**gen**
> Generate a random secret.

**ssh**
> Generate a new SSH RSA keypair.

**rsa**
> Generate a new RSA keypair.

# DESCRIPTION

**safe** is a user-friendly command-line interface for HashiCorp Vault that simplifies common secret management operations. It wraps the Vault API with intuitive commands for reading, writing, and organizing secrets without needing to understand the full Vault CLI syntax.

The tool supports multiple authentication methods including LDAP, GitHub tokens, and direct token authentication. Once targeted and authenticated against a Vault server, secrets can be managed using simple commands like **set**, **get**, and **rm**. The **tree** command provides a hierarchical view of all secret paths for easy browsing.

Secrets can be exported and imported for backup purposes or migration between Vault instances. The **target** command manages connections to multiple Vault servers, allowing quick switching between environments.

# CAVEATS

Requires Vault access. Authentication needed. Permissions vary.

# HISTORY

**safe** was created by Stark & Wayne as a user-friendly CLI for HashiCorp Vault, simplifying secret management operations.

# SEE ALSO

[vault](/man/vault)(1), [pass](/man/pass)(1), [aws](/man/aws)(1)
