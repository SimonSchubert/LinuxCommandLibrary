# TAGLINE

Minimal terminal AI coding agent with pluggable LLM providers

# TLDR

**Start the agent** in the current directory

```keen```

**Run without a global install** via npx

```npx keen-code```

**Check the installed version**

```keen --version```

**Switch to a different LLM provider mid-session** (inside the agent)

```/model```

**Adjust the extended-reasoning effort level** (inside the agent)

```/thinking```

**Compress the conversation** when nearing the context limit (inside the agent)

```/compact```

# SYNOPSIS

**keen** [_options_]

# DESCRIPTION

**keen** (distributed as the **keen-code** npm package) is a small, terminal-based coding agent written in Go. It treats the AI model as a generic backend and ships a deliberately tiny tool surface: **read_file**, **write_file**, **edit_file**, **glob**, **grep**, and **bash**. That is the entire toolbox the agent uses to navigate, edit, and run code, by design favouring simplicity over feature breadth.

Invoking **keen** with no arguments drops you into an interactive session anchored at the current working directory. The agent reads files, edits them in place, and runs shell commands on your behalf, conversing through the terminal. Slash commands such as **/model**, **/thinking**, and **/compact** control provider selection, reasoning depth, and context compaction without leaving the session.

The agent is provider-agnostic: it can drive Anthropic, OpenAI (including ChatGPT OAuth), Google AI (Gemini), DeepSeek, Kimi, GLM, MiniMax, Codex, and the Go port of OpenCode. Switching providers is done at runtime with **/model** rather than via separate CLI flags, so a single **keen** install covers every supported backend.

A notable trait of the project: every line of code in the repository is reported to have been written by an AI agent, with the prompts and design decisions archived under **.ai-interactions/**.

# PARAMETERS

**--version**

> Print the **keen-code** version and exit. Also reachable as **npx keen-code --version** for users who skip the global install.

# SLASH COMMANDS

**/model**

> Switch between configured LLM providers without restarting the session.

**/thinking**

> Adjust the extended-reasoning effort level for providers that support it.

**/compact**

> Compress the running conversation when the context window fills up.

# INSTALLATION

**Via npm** (recommended, installs the **keen** binary on **PATH**):

```
npm install -g keen-code
```

**Via the install script** (drops the binary in **/usr/local/bin** or **$HOME/.local/bin**):

```
curl -fsSL https://raw.githubusercontent.com/mochow13/keen-code/main/scripts/install.sh | bash
```

**One-off run** without installing:

```
npx keen-code
```

# CAVEATS

The minimal six-tool design is intentional and means **keen** does not expose specialised helpers other agents bake in (web fetching, structured planning tools, sub-agents). Workflows that depend on such features may need a different agent.

Each LLM provider must be configured with its own credentials. Costs and rate limits accrue against whichever provider is currently selected via **/model**.

# HISTORY

**keen-code** is a 2026 project (latest release v0.20.3 as of June 2, 2026) published under the **MIT** license by **mochow13** on GitHub. It is part of the broader wave of minimalist terminal coding agents inspired by Claude Code, Codex, and OpenCode, distinguishing itself by limiting the tool surface and by being entirely AI-authored.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [paseo](/man/paseo)(1)
