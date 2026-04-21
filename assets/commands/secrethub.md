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

**write** _path_
> Store a secret at the given path (reads value from stdin or prompt).

**read** _path_
> Retrieve and print a secret value.

**ls** _path_
> List secrets, directories, or repositories at a path.

**run** **--** _command_
> Execute a command with secrets injected as environment variables.

**inject** **-i** _template_ **-o** _output_
> Render a template, substituting secret references with actual values.

**repo init** _path_
> Initialize a new repository.

**generate** _path_
> Generate and store a random secret at the given path.

**--clip**
> Copy the secret to the clipboard instead of printing it (with **read**).

**--env-file** _file_
> Load environment variable references from a file (with **run**).

# DESCRIPTION

**secrethub** was a secret management service CLI that provided secure credential storage with end-to-end encryption and a zero-knowledge architecture. Secrets were organized in repositories using a path-based hierarchy (org/repo/secret) and encrypted client-side before transmission.

The **run** command injected secrets into environment variables for a child process, keeping credentials out of config files and shell history. Template injection via **inject** generated configuration files with secrets substituted from references, enabling secure deployment workflows.

Built-in access control allowed team sharing of secrets with granular permissions. The service was acquired by 1Password and has been discontinued; users should migrate to alternatives like 1Password, HashiCorp Vault, or similar tools.

# CAVEATS

Service discontinued. Use alternatives. Account required.

# HISTORY

**SecretHub** was a secret management service founded in the Netherlands. It was **acquired by 1Password in April 2021** and subsequently **discontinued**, with service end-of-life on **January 1, 2022**. Functionality was absorbed into 1Password Secrets Automation and the 1Password CLI (**op**). Existing users were provided migration guides for Python, Go, JavaScript, Terraform, and the Kubernetes operator.

# SEE ALSO

[op](/man/op)(1), [vault](/man/vault)(1), [pass](/man/pass)(1)
