# TAGLINE

LLM assistant for suggesting and searching shell commands

# TLDR

**Suggest** a command from a natural-language prompt

```magic-cli suggest "[Resize image to 300x300 with ffmpeg]"```

**Search** shell history semantically

```magic-cli search "[zellij attach]"```

**Ask** the agent to figure out a multi-step task

```magic-cli ask "[Set up the dev environment from the README]"```

**Configure** the LLM provider

```magic-cli config set llm [ollama]```

**List** configuration

```magic-cli config list```

# SYNOPSIS

**magic-cli** *command* [*args*]

# DESCRIPTION

**magic-cli** uses large language models to help at the shell: **suggest** turns a rough intent into a concrete command, **search** finds similar commands in your history via embeddings, and **ask** interactively works toward a goal (may request running commands for context). Providers include Ollama (local), OpenAI, and Anthropic depending on version.

Config file: **~/.config/magic_cli/config.json** (manage with **magic-cli config**). Early-stage project—expect breaking changes.

# PARAMETERS

**suggest** *PROMPT*

> Propose a command for the described task.

**search** *PROMPT*

> Semantic search over shell history (experimental; remote embeddings can be costly on large histories).

**ask** *PROMPT*

> Agent-style command generation with optional follow-up tool runs.

**config** **set**|**get**|**list**|**reset**|**path**

> Manage configuration (**llm**, Ollama base URL/models, OpenAI settings, etc.).

# CAVEATS

Never blindly execute suggested commands—review for destructive flags. Cloud LLMs send prompts (and possibly history snippets) off-machine. Project is early development.

# SEE ALSO

[tldr](/man/tldr)(1), [navi](/man/navi)(1), [sgpt](/man/sgpt)(1)

# RESOURCES

```[Source code](https://github.com/guywaldman/magic-cli)```

```[Homepage](https://guywaldman.com/posts/introducing-magic-cli)```

<!-- verified: 2026-07-19 -->
