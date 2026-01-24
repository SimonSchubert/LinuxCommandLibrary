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

**secrethub** manages secrets. It provides secure credential storage.

End-to-end encryption. Zero-knowledge architecture.

Environment injection. Run commands with secrets.

Template injection. Generate config files.

Access control built-in. Team sharing.

# CAVEATS

Service discontinued. Use alternatives. Account required.

# HISTORY

**SecretHub** was a secret management service. It was acquired by **1Password** and integrated into their platform.

# SEE ALSO

[vault](/man/vault)(1), [pass](/man/pass)(1), [aws-secrets](/man/aws-secrets)(1)
