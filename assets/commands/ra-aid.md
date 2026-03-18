# TAGLINE

AI-powered autonomous development companion

# TLDR

**Run with a task description**

```ra-aid -m "[add unit tests for auth module]"```

**Run in research mode** to gather information first

```ra-aid -m "[understand the caching strategy]" --research-only```

**Use a specific provider and model**

```ra-aid -m "[fix the bug]" --provider [openai] --model [gpt-4]```

**Run with a specific tool** enabled

```ra-aid -m "[optimize queries]" --tool [shell]```

# SYNOPSIS

**ra-aid** [_options_] **-m** _message_

# PARAMETERS

**-m**, **--message** _MESSAGE_
> Task description for the agent.

**--provider** _PROVIDER_
> AI provider to use (openai, anthropic, etc.).

**--model** _MODEL_
> Specific model to use.

**--research-only**
> Only gather information without making changes.

**--tool** _TOOL_
> Enable specific tools (shell, editor, browser).

**--verbose**
> Enable verbose output.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**ra-aid** is an autonomous AI development companion built on LangChain that operates in three distinct stages: research, planning, and implementation. It analyzes codebases, formulates strategies, and executes multi-step development tasks with minimal human intervention.

The tool uses a structured workflow where it first researches the codebase and task requirements, then creates a detailed plan, and finally implements changes. This staged approach provides transparency and allows developers to review plans before execution.

ra-aid supports multiple AI providers and integrates with shell commands, file editing, and web browsing capabilities to accomplish complex development tasks.

# CAVEATS

Requires API keys for AI providers. Python 3.8 or newer required. Complex autonomous tasks may consume significant API tokens. Always review changes made in autonomous mode before committing.

# HISTORY

**ra-aid** was created as an open-source autonomous coding agent built on **LangChain** and **LangGraph**. It differentiates itself through its three-stage research-plan-implement workflow, offering more transparency than single-pass coding agents.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [forge](/man/forge)(1)
