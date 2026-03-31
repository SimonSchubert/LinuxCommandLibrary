# TAGLINE

AI-powered autonomous development companion

# TLDR

**Run with a task description**

```ra-aid -m "[add unit tests for auth module]"```

**Run in research mode** to gather information first

```ra-aid -m "[understand the caching strategy]" --research-only```

**Use a specific provider and model**

```ra-aid -m "[fix the bug]" --provider [openai] --model [gpt-4]```

**Run in chat mode** for interactive collaboration

```ra-aid -m "[help me design the API]" --chat```

**Run with cowboy mode** to skip shell command approval prompts

```ra-aid -m "[fix the linting errors]" --cowboy-mode```

# SYNOPSIS

**ra-aid** [_options_] **-m** _message_

# PARAMETERS

**-m**, **--message** _MESSAGE_
> Task description for the agent.

**--provider** _PROVIDER_
> AI provider to use (anthropic, openai, openrouter, openai-compatible, makehub, gemini).

**--model** _MODEL_
> Specific model to use (required for non-Anthropic providers).

**--research-only**
> Only gather information without making changes.

**--chat**
> Enable interactive chat mode with direct human interaction (implies --hil).

**--hil**
> Enable human-in-the-loop mode for interactive approval.

**--cowboy-mode**
> Skip interactive approval for shell commands.

**--auto-test**
> Automatically run tests after each code change.

**--test-cmd** _COMMAND_
> Custom command to run tests.

**--recursion-limit** _N_
> Maximum recursion depth for agent operations (default: 100).

**--show-cost**
> Display cost information as the agent works.

**--max-cost** _USD_
> Set a maximum cost threshold in USD.

**--verbose**
> Enable verbose output.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**ra-aid** is an autonomous AI development companion built on LangGraph that operates in three distinct stages: research, planning, and implementation. It analyzes codebases, formulates strategies, and executes multi-step development tasks with minimal human intervention.

The tool uses a structured workflow where it first researches the codebase and task requirements, then creates a detailed plan, and finally implements changes. This staged approach provides transparency and allows developers to review plans before execution.

ra-aid supports multiple AI providers (Anthropic, OpenAI, OpenRouter, Gemini, and others) and integrates with shell commands, file editing, and web browsing capabilities to accomplish complex development tasks. The --chat mode enables interactive collaboration where you can guide the agent through tasks conversationally.

# CAVEATS

Requires API keys for AI providers. Complex autonomous tasks may consume significant API tokens. Use --show-cost to monitor spending and --max-cost to set limits. Always review changes made in autonomous mode before committing.

# HISTORY

**ra-aid** was created as an open-source autonomous coding agent built on **LangGraph**'s agent-based task execution framework. It differentiates itself through its three-stage research-plan-implement workflow, offering more transparency than single-pass coding agents.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [forge](/man/forge)(1)
