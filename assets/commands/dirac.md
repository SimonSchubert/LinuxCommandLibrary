# TAGLINE

Efficient AI coding agent CLI

# TLDR

**Start an interactive coding task** with a prompt

```dirac "[describe the task]"```

**Authenticate** with your AI provider

```dirac auth```

**View and resume** previous tasks

```dirac history```

**Run in plan mode** to display the strategy before execution

```dirac -p "[refactor the authentication module]"```

**Auto-approve** all actions without confirmation (Yolo mode)

```dirac -y "[fix all lint errors]"```

**Pipe input** into Dirac for review

```git diff | dirac "Review these changes"```

# SYNOPSIS

**dirac** [_options_] [_command_] [_prompt_]

# PARAMETERS

**-p**, **--plan**
> Plan Mode: display the strategy before executing any actions.

**-y**, **--yes**
> Yolo Mode: auto-approve all actions without confirmation prompts.

**auth**
> Authenticate against the configured AI provider.

**history**
> List previous tasks and resume any of them.

# DESCRIPTION

**dirac** is a terminal-based AI coding agent designed for context efficiency and reduced API cost. It operates with an approval-based workflow, letting it read and write files, execute terminal commands, and drive a headless browser while keeping the user in control.

The agent emphasises hash-anchored edits, AST manipulation, and massively parallel operations to minimise tokens spent per change. According to the project, this lowers API spend by 50–80% versus comparable agents while maintaining or improving code quality.

Dirac supports multiple model providers, selectable via environment variables, so it can be paired with Anthropic, OpenAI, Google, xAI, Mistral, Groq, OpenRouter, or self-hosted backends.

# CONFIGURATION

API keys are read from the environment:

```
ANTHROPIC_API_KEY
OPENAI_API_KEY
OPENROUTER_API_KEY
GEMINI_API_KEY
GROQ_API_KEY
MISTRAL_API_KEY
XAI_API_KEY
HF_TOKEN
```

Set the variable for the provider you want to use before launching **dirac**. The active provider is chosen based on the keys present.

# CAVEATS

Approval prompts can be skipped with **-y**, but doing so allows file writes and shell execution without confirmation. Use only in disposable environments or trusted projects. AI agents may misinterpret intent on large refactors; always review diffs before committing.

# HISTORY

Dirac is distributed via npm as **dirac-cli**. It positions itself as a more cost-efficient alternative to other terminal coding agents by combining hash-anchored edits, AST-aware operations, and aggressive context curation.

# INSTALL

```zypper: sudo zypper install dirac```

```brew: brew install dirac```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[claude](/man/claude)(1), [vtcode](/man/vtcode)(1), [aider](/man/aider)(1)
