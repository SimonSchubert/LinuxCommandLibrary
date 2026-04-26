# TAGLINE

Local API-key vault and dotenv runner

# TLDR

**Initialize** a project vault in the current directory

```obscura init```

**Initialize** a global vault for the current user

```obscura init --global```

**Add** a secret to the active vault

```obscura add [openai_key]```

**Read** a secret to stdout

```obscura get [openai_key]```

**List** every entry in the vault

```obscura list```

**Remove** a single secret without confirmation

```obscura remove [openai_key] --yes```

**Import** a dotenv file into the vault

```obscura import [.env]```

**Export** the vault as a dotenv file

```obscura export --dotenv --output [.env]```

**Run** a command with all vault secrets injected as environment variables

```obscura run -- [npm start]```

**Cache** the vault key for 30 minutes so subsequent calls do not prompt for the passphrase

```obscura unlock --timeout [30]```

# SYNOPSIS

**obscura** _command_ [_options_] [_args_]

# PARAMETERS

**init** [**--global**]
> Create a project vault, or a global vault when **--global** is passed.

**add** _alias_ [**--global**|**--project**|**--from-global**]
> Store a secret under _alias_, optionally pulling its value from the global vault.

**get** _alias_
> Print the secret stored under _alias_ to stdout.

**list**, **ls** [**--json**] [**--global**|**--project**]
> Display the entries of the active vault.

**remove** _alias_ [**--yes**]
> Delete a secret. **--yes** skips the confirmation prompt.

**delete** **--global**|**--project** **--yes**
> Destroy an entire vault. Both flags are required.

**rotate** _alias_
> Replace the secret value under _alias_ while preserving its timestamps.

**import** _file_
> Import key/value pairs from a dotenv file into the active vault.

**export** **--dotenv** [**--output** _file_]
> Export secrets in dotenv format, either to stdout or to _file_.

**run** **--** _command_ [_args_...]
> Execute _command_ with vault entries injected as environment variables.

**unlock** [**--timeout** _MINUTES_]
> Cache the derived vault key for _MINUTES_ (default 60).

**lock**
> Discard any cached vault keys.

# DESCRIPTION

**obscura** is a single-binary, cross-platform vault for the API keys, tokens, and other secrets that pile up during local development. Secrets are encrypted on disk with a key derived from a user passphrase via Argon2 and unlocked on demand, so nothing is left in plain text in **.env** files, shell history, or process environments.

Two scopes are supported: a per-project vault stored alongside the repository, and a global vault for the current user. The **add --from-global** flag copies entries between them, and **import** / **export --dotenv** make it easy to migrate from existing dotenv-based workflows. The **run** subcommand spawns a child process with the vault decrypted into its environment and re-locks afterwards, making obscura a drop-in replacement for ad-hoc **export FOO=...** shell commands.

# CONFIGURATION

Vault files are stored in well-known per-platform locations:

```
macOS    ~/Library/Application Support/Obscura/vault.enc
Linux    $XDG_CONFIG_HOME/obscura/vault.enc (defaults to ~/.config/obscura/vault.enc)
Windows  %APPDATA%\Obscura\vault.enc
```

Project vaults live next to the repository they belong to. Behavior is tuned through environment variables:

> **OBSCURA_PASSPHRASE** — non-interactive passphrase, useful for CI.
> **OBSCURA_KDF_MEM_KIB** — Argon2 memory cost in KiB.
> **OBSCURA_KDF_TIME** — Argon2 iterations.

# EXIT CODES

```
0   Success
1   General error
2   Alias not found
```

# CAVEATS

obscura is intended for **local development only**: it has no team-sharing, audit log, rotation policy, or hardware-backed key storage. Production secrets should live in a managed secret store (Vault, AWS Secrets Manager, GCP Secret Manager, 1Password CLI, etc.). The vault file is only as strong as the passphrase chosen at **init** time; losing the passphrase makes secrets unrecoverable.

# HISTORY

**obscura** is developed by the **obscura-os** project and published at **github.com/obscura-os/obscura-cli**. The repository is named **obscura-cli** but the installed binary is simply **obscura**.

# SEE ALSO

[gpg](/man/gpg)(1), [pass](/man/pass)(1), [age](/man/age)(1), [vault](/man/vault)(1), [op](/man/op)(1)
