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

**Research and plan** without implementing

```ra-aid -m "[migrate to the new API]" --research-and-plan-only```

**Read the task** from a file

```ra-aid --msg-file [task.txt]```

**Launch the web interface**

```ra-aid --server --server-port [1818]```

**Show cost and token usage** for the latest session

```ra-aid last-cost```

# SYNOPSIS

**ra-aid** [_options_] **-m** _message_

**ra-aid** _command_ [_options_]

# PARAMETERS

**-m**, **--message** _MESSAGE_
> Task description for the agent. Cannot be combined with --msg-file.

**--msg-file** _FILE_
> Read the task description from a text file.

**--provider** _PROVIDER_
> AI provider to use (anthropic, openai, openrouter, openai-compatible, deepseek, gemini, ollama, fireworks, groq, bedrock, makehub).

**--model** _MODEL_
> Specific model to use (required for non-Anthropic providers).

**--research-only**
> Only perform research, without implementation.

**--research-and-plan-only**, **-rap**
> Run research and planning, then exit.

**--research-provider**, **--planner-provider**, **--expert-provider** _PROVIDER_
> Use a different provider for research, planning, or expert queries. Matching **--research-model**, **--planner-model**, and **--expert-model** options select the model.

**--chat**
> Enable interactive chat mode with direct human interaction (implies --hil).

**--hil**
> Enable human-in-the-loop mode for interactive approval.

**--cowboy-mode**
> Skip interactive approval for shell commands.

**--use-aider**
> Use aider for code modifications instead of the built-in file tools.

**--auto-test**
> Automatically run tests before completing tasks.

**--test-cmd** _COMMAND_
> Test command to run before completing tasks (e.g. `pytest tests/`).

**--recursion-limit** _N_
> Maximum recursion depth for agent operations (default: 100).

**--show-cost**
> Display cost information as the agent works.

**--track-cost**, **--no-track-cost**
> Enable or disable tracking of token usage and costs (default: off).

**--max-cost** _USD_
> Set a maximum cost threshold in USD.

**--max-tokens** _N_
> Set a maximum token threshold.

**--exit-at-limit**
> Exit without prompting when a cost or token limit is reached.

**--server**
> Launch the web interface (**--server-host** default: 0.0.0.0, **--server-port** default: 1818).

**--project-state-dir** _DIR_
> Directory for the project database and logs (default: `.ra-aid` in the working directory).

**--wipe-project-memory**
> Delete the project database before starting.

**--log-mode** _console|file_
> Show all logs on the console, or log to file with only warnings on the console (default: file).

**--log-level** _LEVEL_
> Logging level (default: debug).

**--help**
> Display help information.

**--version**
> Display version information.

**last-cost**, **all-costs**
> Display cost and token usage for the latest session or for all sessions.

**extract-plan** [_SESSION_ID_], **extract-last-plan**, **extract-last-research-notes**
> Print the stored plan or research notes of a session.

# DESCRIPTION

**ra-aid** is an autonomous AI development companion built on LangGraph that operates in three distinct stages: research, planning, and implementation. It analyzes codebases, formulates strategies, and executes multi-step development tasks with minimal human intervention.

The tool uses a structured workflow where it first researches the codebase and task requirements, then creates a detailed plan, and finally implements changes. This staged approach provides transparency and allows developers to review plans before execution.

ra-aid supports multiple AI providers (Anthropic, OpenAI, OpenRouter, Gemini, and others) and integrates with shell commands, file editing, and web browsing capabilities to accomplish complex development tasks. The --chat mode enables interactive collaboration where you can guide the agent through tasks conversationally.

# CAVEATS

Requires API keys for AI providers. Complex autonomous tasks may consume significant API tokens. Use --show-cost to monitor spending (currently supported only on Claude model agents) and --max-cost to set limits. Always review changes made in autonomous mode before committing.

# HISTORY

**ra-aid** was created as an open-source autonomous coding agent built on **LangGraph**'s agent-based task execution framework. It differentiates itself through its three-stage research-plan-implement workflow, offering more transparency than single-pass coding agents. The latest tagged release is v0.30.2 (May 2025).

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [forge](/man/forge)(1)

# RESOURCES

```[Source code](https://github.com/ai-christianson/RA.Aid)```

```[Homepage](https://ra-aid.ai)```

```[Documentation](https://docs.ra-aid.ai)```

<!-- verified: 2026-11-09 -->
