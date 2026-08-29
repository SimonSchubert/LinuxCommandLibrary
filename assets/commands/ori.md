# TAGLINE

run existing AI coding agents through OpenRouter

# TLDR

**Install** the Ori CLI

```curl -fsSL https://openrouter.ai/labs/ori/install.sh | bash```

**Sign in** with an OpenRouter account (OAuth)

```ori login```

**Start** Claude Code, Codex, or OpenCode on OpenRouter

```ori claude```

```ori codex```

```ori opencode```

**Pick** any OpenRouter model

```ori claude --model [anthropic/claude-sonnet-4.6]```

**Update** Ori

```ori update```

# SYNOPSIS

**ori** _agent_ [**--model** _id_] [_agent-flags_...]

**ori** {**login** | **update**}

# DESCRIPTION

**ori** (Ori Harness) is OpenRouter's CLI wrapper around coding-agent CLIs you already have. It injects OpenRouter credentials, model catalog, and org guardrails, then execs the real agent. You keep the same commands and flags; Ori sits in front.

Supported launchers include **ori claude**, **ori codex**, **ori opencode**, **ori grok**, **ori hermes**, **ori pi**, and **ori prime-agent**. **ori dsh** configures DeepSeek Harness against OpenRouter instead of starting it. Missing agents are offered for install. Omarchy pre-wires **ori** as a lazy-loaded launcher.

Auth is OpenRouter OAuth PKCE (**ori login** or the first agent launch). There is no separate Ori bill: usage lands on the OpenRouter account, including workspace budgets and allowlists.

# PARAMETERS

**login**
> Sign in with OpenRouter. **--no-browser** prints a URL for headless use.

**update**
> Upgrade the **ori** binary.

**--model** _OPENROUTER_MODEL_ID_
> Select a model from the OpenRouter catalog. Remaining flags after Ori's own options are forwarded to the agent unchanged.

# CAVEATS

Needs an OpenRouter account and the target agent CLI on **PATH** (or Ori will try to install it). This is OpenRouter's Ori Harness, not unrelated **ori** TUI projects. Agent-specific flags belong after Ori's flags.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [grok](/man/grok)(1)

# RESOURCES

```[Source code](https://github.com/OpenRouterLabs/ori-releases)```

```[Homepage](https://openrouter.ai)```

```[Documentation](https://openrouter.ai/docs/guides/ori/harness)```

<!-- verified: 2026-08-29 -->
