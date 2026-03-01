# TAGLINE

Manage OpenCode agents

# TLDR

**List** all available agents

```opencode agent list```

**Create** a new agent with a custom system prompt

```opencode agent create [name]```

# SYNOPSIS

**opencode agent** _subcommand_ [_options_]

# DESCRIPTION

**opencode agent** manages agents in OpenCode, a terminal-based AI coding assistant. Agents are configurations with custom system prompts and tool settings that tailor the AI's behavior for specific tasks. You can create new agents, list available ones, and configure their tool access.

# CAVEATS

Agents are project-specific and stored in the local OpenCode configuration. Custom agents inherit the base model configuration but override the system prompt and available tools.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-session](/man/opencode-session)(1), [opencode-models](/man/opencode-models)(1)
