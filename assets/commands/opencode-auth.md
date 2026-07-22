# TAGLINE

Manage OpenCode credentials

# TLDR

**Log in** to an AI provider

```opencode auth login```

**Show** current authentication status

```opencode auth status```

# SYNOPSIS

**opencode auth** _subcommand_ [_options_]

# DESCRIPTION

**opencode auth** manages credentials and login sessions for AI providers used by OpenCode. Credentials are stored in **~/.local/share/opencode/auth.json**. Supports authentication with providers including OpenAI, Anthropic, Google, AWS Bedrock, and GitHub Copilot.

# INSTALL

```pacman: sudo pacman -S opencode```

```brew: brew install opencode```

```nix: nix profile install nixpkgs#opencode```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-models](/man/opencode-models)(1)
