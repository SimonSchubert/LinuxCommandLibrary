# TAGLINE

Encrypted secret management service CLI

# TLDR

**Write secret**

```secrethub write [org/repo/secret]```

**Read secret**

```secrethub read [org/repo/secret]```

**List secrets**

```secrethub ls [org/repo]```

**Run with secrets**

```secrethub run -- [command]```

**Initialize repo**

```secrethub repo init [org/repo]```

**Inject secrets to file**

```secrethub inject -i [template.env] -o [.env]```

# SYNOPSIS

**secrethub** _command_ [_options_] [_args_]

# PARAMETERS

**write**
> Store secret.

**read**
> Retrieve secret.

**ls**
> List secrets.

**run**
> Execute with secrets.

**inject**
> Template injection.

**repo**
> Repository management.

**--clip**
> Copy to clipboard.

# DESCRIPTION

**secrethub** was a secret management service CLI that provided secure credential storage with end-to-end encryption and a zero-knowledge architecture. Secrets were organized in repositories using a path-based hierarchy (org/repo/secret) and encrypted client-side before transmission.

The **run** command injected secrets into environment variables for a child process, keeping credentials out of config files and shell history. Template injection via **inject** generated configuration files with secrets substituted from references, enabling secure deployment workflows.

Built-in access control allowed team sharing of secrets with granular permissions. The service was acquired by 1Password and has been discontinued; users should migrate to alternatives like 1Password, HashiCorp Vault, or similar tools.

# CAVEATS

Service discontinued. Use alternatives. Account required.

# HISTORY

**SecretHub** was a secret management service. It was acquired by **1Password** and integrated into their platform.

# SEE ALSO

[vault](/man/vault)(1), [pass](/man/pass)(1), [aws-secrets](/man/aws-secrets)(1)
