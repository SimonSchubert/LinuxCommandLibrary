# TAGLINE

Encrypted secret management service CLI

# TLDR

**Write secret** from stdin

```echo "[value]" | secrethub write [org/repo/secret]```

**Write secret from a file**

```secrethub write -i [path/to/file] [org/repo/secret]```

**Read secret**

```secrethub read [org/repo/secret]```

**List secrets**

```secrethub ls [org/repo]```

**Run a command with a secret** exposed as an environment variable

```secrethub run --envar [DB_PASSWORD]=[org/repo/db_password] -- [command]```

**Generate a random secret**

```secrethub generate [org/repo/secret]```

**Initialize repo**

```secrethub repo init [org/repo]```

**Inject secrets to file**

```secrethub inject -i [template.env] -o [.env]```

**Plan a migration** of all secrets to 1Password

```secrethub migrate plan```

# SYNOPSIS

**secrethub** _command_ [_options_] [_args_]

# PARAMETERS

**write** _path_
> Store a secret at the given path (reads value from stdin or prompt). **-i** _file_ reads the value from a file, **-m** prompts for multiple lines, **-c** uses clipboard content.

**read** _path_
> Retrieve and print a secret value. **-o** _file_ writes it to a file, **-n** omits the trailing newline.

**ls** _path_
> List secrets, directories, or repositories at a path.

**run** [**-e** _NAME=path_] **--** _command_
> Execute a command with secrets injected as environment variables (alias **exec**). Secrets printed by the command are masked in its output unless **--no-masking** is given.

**inject** **-i** _template_ **-o** _output_
> Render a template, substituting secret references with actual values.

**repo init** _path_
> Initialize a new repository.

**generate** _path_
> Generate and store a random secret at the given path (**-l** sets the length, **--charset** the character set).

**migrate** **plan** | **apply**
> Plan and execute a migration of secrets to 1Password.

**-c**, **--clip**
> With **read** and **generate**, copy the secret to the clipboard (automatically cleared after a timeout) instead of printing it.

**-e**, **--envar** _NAME=path_
> Source an environment variable from a secret (with **run**).

**--env-file** _file_
> Load `NAME=value` environment variable mappings from a file, where template syntax references secrets (with **run**).

**-v**, **--var** _VAR=VALUE_
> Define a template variable (with **run** and **inject**).

# DESCRIPTION

**secrethub** was a secret management service CLI that provided secure credential storage with end-to-end encryption and a zero-knowledge architecture. Secrets were organized in repositories using a path-based hierarchy (org/repo/secret) and encrypted client-side before transmission.

The **run** command injected secrets into environment variables for a child process, keeping credentials out of config files and shell history. Template injection via **inject** generated configuration files with secrets substituted from references, enabling secure deployment workflows.

Built-in access control allowed team sharing of secrets with granular permissions. The service was acquired by 1Password and has been discontinued; users should migrate to alternatives like 1Password, HashiCorp Vault, or similar tools.

# CAVEATS

The SecretHub service has been shut down, so the CLI can no longer authenticate or read secrets. The source repository is archived and read-only. Use **op** (1Password CLI), **vault**, or similar tools instead.

# HISTORY

**SecretHub** was a secret management service founded in the Netherlands. It was **acquired by 1Password in April 2021** and subsequently **discontinued**, with service end-of-life on **January 1, 2022**. Functionality was absorbed into 1Password Secrets Automation and the 1Password CLI (**op**). Existing users were provided migration guides for Python, Go, JavaScript, Terraform, and the Kubernetes operator.

# SEE ALSO

[op](/man/op)(1), [vault](/man/vault)(1), [pass](/man/pass)(1)

# RESOURCES

```[Source code](https://github.com/secrethub/secrethub-cli)```

<!-- verified: 2026-11-23 -->
