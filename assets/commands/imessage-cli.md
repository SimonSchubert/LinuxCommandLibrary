# TAGLINE

Provider-neutral CLI for sending and managing iMessage via third-party APIs

# TLDR

**Send a text message** through a configured provider

```imessage-cli send --provider blooio --to +15551234567 --text 'Hello'```

**List available providers** and their capabilities

```imessage-cli provider list```

**Save a named connection** (credentials go in the OS keychain)

```imessage-cli connection add support --provider blooio```

**Send using a saved connection**

```imessage-cli send --connection support --to +15551234567 --text 'Hello'```

**Dry-run a send** with machine-readable JSON output

```imessage-cli send --provider blooio --to +15551234567 --text 'Hello' --dry-run --json```

**Show agent input schema** for the send command

```imessage-cli schema send --json```

**Install globally** (requires Node.js 20.19+, 22.13+, or 24+)

```npm install --global imessage-cli```

# SYNOPSIS

**imessage-cli** \<command\> [_options_]

# DESCRIPTION

**imessage-cli** is a command-line interface for iMessage-style messaging through provider-neutral APIs. It is part of the **imessage-sdk** project and is intended for local users and AI agents. It does not talk to Apple's Messages.app or iCloud directly; instead it routes through official bundled providers such as **blooio**, **photon**, and **sendblue**, each of which requires its own account and credentials.

Commands cover sending messages (text, replies, attachments), reading conversations and messages, reactions, typing indicators, attachment download, and provider-specific extensions. Input can be flags or validated JSON (**--input** / stdin). With **--json**, successes go to stdout and structured errors to stderr, with stable exit codes for automation.

Credentials can be stored as named connections in the OS credential store (macOS Keychain, Windows Credential Manager, Linux Secret Service), supplied via environment variables, or passed as one-time flags. Environment and flag values override saved connections for the current process and are never written back to disk. An experimental local signed-webhook server (**webhook serve --experimental**) can emit normalized events as JSON Lines for agent pipelines.

# PARAMETERS

**send**
> Send a message. Common flags: **--provider**, **--connection**, **--to**, **--conversation**, **--text**, **--reply-to**, **--image**, **--video**, **--file**, **--input**, **--dry-run**, **--json**.

**provider list** / **provider show** _name_
> List bundled providers or show one provider's normalized capabilities.

**connection add** / **list** / **show** / **doctor** / **remove**
> Manage named saved connections and keychain-backed credentials.

**schema** [_command_]
> Print agent-facing input schemas.

**webhook serve**
> Experimental local signed-webhook receiver (requires **--experimental**).

**completion** _shell_
> Emit shell completion scripts (**bash**, **zsh**, **fish**, **powershell**).

**--json**
> Emit machine-readable success/error objects.

**--help**
> Show help for the CLI or a subcommand.

# CAVEATS

Requires a third-party provider account and API credentials; it is not a free bridge to personal iMessage via a local Mac. Group messaging may be disabled depending on the provider. Provider limits differ (for example Blooio requires public attachment URLs; Sendblue allows one attachment per message). Local attachments are limited to 100 MiB total per command. Passing secrets on the command line can expose them in process lists and shell history—prefer saved connections or environment variables. On headless Linux without a Secret Service daemon, keychain-backed connections may be session-scoped. The webhook server is experimental and not a production queue or HA endpoint.

# HISTORY

**imessage-cli** is published as part of the **imessage-sdk** monorepo by **jmisilo**. The SDK core, providers, Chat SDK adapter, and CLI are independently installable packages under a provider-neutral conversation API.

# SEE ALSO

[wacli](/man/wacli)(1), [matrix-commander](/man/matrix-commander)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/jmisilo/imessage-sdk)```

```[Homepage](https://imessage-sdk.dev)```

```[Documentation](https://github.com/jmisilo/imessage-sdk/blob/main/packages/cli/README.md)```

<!-- verified: 2026-07-20 -->
