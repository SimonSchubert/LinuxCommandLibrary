# TAGLINE

End-to-end encrypted secret manager for developers

# TLDR

**Authenticate** with Relic via browser

```relic login```

**Initialize** Relic for the current project

```relic init```

**Open the interactive TUI** to manage secrets

```relic```

**Run a command** with secrets injected as environment variables

```relic run -e [production] -- [npm run deploy]```

**Run a command** with secrets from a specific folder and scope

```relic run -e [staging] -f [api] -s [server] -- [node server.js]```

**List all projects** with their environments and folders

```relic projects```

**Show the currently authenticated user**

```relic whoami```

**Disable anonymous telemetry**

```relic telemetry disable```

# SYNOPSIS

**relic** [_command_] [_options_]

# PARAMETERS

**login**
> Authenticate with Relic via browser using device authorization flow.

**logout**
> Clear stored authentication session, cached keys, and password.

**init**
> Initialize Relic for the current project by selecting a project and writing a relic.toml config file.

**projects**
> List all owned and shared projects with environments and folders in a tree view.

**whoami**
> Show the currently authenticated user's name, email, and plan.

**mcp**
> Start the Relic MCP server for AI assistant integration.

**telemetry** _status|enable|disable_
> Manage anonymous usage data collection.

**run** **-e** _name_ [**-f** _folder_] [**-s** _scope_] [**-p** _id_] **--** _command..._
> Run a command with decrypted secrets injected as environment variables.

**-e**, **--environment** _name_
> Environment name to load secrets from (required).

**-f**, **--folder** _name_
> Folder within the environment (optional).

**-s**, **--scope** _scope_
> Scope filter: **client**, **server**, or **shared** (optional).

**-p**, **--project** _id_
> Project ID. Defaults to relic.toml or **RELIC_PROJECT_ID** env var.

**--version**
> Show version information.

**--help**
> Show available commands and options.

# DESCRIPTION

**relic** is a CLI-first secret management layer that encrypts secrets on-device before transmitting them to the server. The server only stores ciphertext, ensuring zero-knowledge security.

When running **relic run**, the CLI fetches encrypted secrets from the server, decrypts them locally using **AES-256** and **Argon2id**, and injects them into the target process through a Rust-based runner that clears memory after use. No secrets are written to disk during injection.

Relic supports team collaboration where each member's secrets are encrypted with their own keys. It also works in CI/CD pipelines using API keys set via the **RELIC_API_KEY** and **RELIC_PASSWORD** environment variables.

The interactive TUI (invoked with bare **relic**) provides a visual interface for creating, editing, and organizing secrets across projects, environments, and folders. An MCP server mode enables integration with AI coding assistants.

# CONFIGURATION

Project configuration is stored in **relic.toml** in the project root, containing the project ID:

```
project_id = "your-project-id"
```

A **.relic/** directory is created alongside relic.toml for local caching (cache.db). Add **.relic/** to .gitignore.

**Environment variables:**

**RELIC_API_KEY** — API key for CI/CD authentication (bypasses interactive login)
**RELIC_PASSWORD** — Password for decryption in API key mode
**RELIC_PROJECT_ID** — Override project ID without relic.toml

# CAVEATS

The interactive TUI is not available in standalone binary installations; use CLI commands instead. Secrets require an active internet connection to fetch from the server, though results are cached locally for faster subsequent runs. The Rust-based runner is platform-specific and requires prebuilt binaries for each target architecture.

# HISTORY

Relic was created by **Can Vardar** at **Cupola** as an open-source, CLI-first alternative to cloud secret managers. It is written in **TypeScript** (CLI) with a **Rust** runtime component for secure secret injection. The project is licensed under the **BSL 1.1** (Business Source License) and hosted on GitHub.

# SEE ALSO

[doppler](/man/doppler)(1), [vault](/man/vault)(1), [sops](/man/sops)(1), [age](/man/age)(1), [gpg](/man/gpg)(1)
