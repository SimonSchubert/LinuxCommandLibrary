# TAGLINE

Factory.ai terminal coding agent

# TLDR

**Start an interactive session**

```droid```

**Execute a single prompt** non-interactively (read-only by default)

```droid exec "[analyze the auth system and propose a plan]"```

**Allow safe file edits**

```droid exec --auto low "[add JSDoc comments to all functions]"```

**Full autonomy**, including commits and pushes

```droid exec --auto high "[fix the bug, run tests, commit and push]"```

**Read the prompt from a file**

```droid exec -f [prompt.txt]```

**Get JSON output** for scripting

```droid exec -o json "[your prompt]"```

**Continue an existing session**

```droid exec -s [session_id] "[keep going]"```

**Work in an isolated git worktree**

```droid exec --worktree "[refactor the parser]"```

# SYNOPSIS

**droid** [_options_]

**droid** **exec** [_options_] [_prompt_]

**droid** _subcommand_ [_options_]

# COMMANDS

**droid**
> Start the interactive REPL.

**exec**
> Run a task non-interactively. This is the scripting entry point.

**search**, **find**
> Search across local sessions: messages, documents, and tool results.

**mcp**
> Manage Model Context Protocol servers.

**plugin**
> Install, uninstall, and update plugins, and manage marketplaces.

**computer**
> Register and manage Bring-Your-Own-Machine computers.

**daemon**
> Run the Factory daemon server.

**update**
> Update the CLI to the latest version.

# EXEC OPTIONS

**--auto** _LEVEL_
> Autonomy level: **low**, **medium**, or **high**. Omitting it leaves the agent read-only.

**-f**, **--file** _PATH_
> Read the prompt from a file.

**-m**, **--model** _ID_
> Select a specific model.

**-r**, **--reasoning-effort** _LEVEL_
> Override reasoning effort: `off`, `none`, `low`, `medium`, or `high`.

**-o**, **--output-format** _FORMAT_
> Output format: `text` (default), `json`, `stream-json`, or `stream-jsonrpc`.

**--input-format** _FORMAT_
> Input format. `stream-jsonrpc` enables multi-turn sessions.

**-s**, **--session-id** _ID_
> Continue an existing session.

**--fork**
> Fork an existing session into a new copy and resume that.

**-w**, **--worktree**
> Run the session in an isolated git worktree, leaving the working tree untouched.

**--cwd** _PATH_
> Execute from a specific working directory.

**--use-spec**
> Start in specification mode: plan before executing.

**--spec-model** _ID_ / **--spec-reasoning-effort** _LEVEL_
> Use a different model or reasoning effort for the planning phase.

**--enabled-tools** _IDS_ / **--disabled-tools** _IDS_ / **--list-tools**
> Force-enable tools, disable them for this run, or print the available ones and exit.

**--mission**
> Run in mission mode, orchestrating multiple agents. **--worker-model** and **--validator-model**, with their matching reasoning-effort flags, control the sub-agents.

**--append-system-prompt** _TEXT_ / **--append-system-prompt-file** _PATH_
> Append custom instructions to the system prompt.

**--tag** _TAG_
> Attach a session tag. Repeatable.

**--skip-permissions-unsafe**
> Skip every permission prompt. Dangerous; see CAVEATS.

**-v**, **--version** / **-h**, **--help**
> Print the version, or show help.

# CONFIGURATION

**.factory/droids/**
> Custom sub-agent definitions, as markdown files with YAML frontmatter.

# DESCRIPTION

**droid** is Factory.ai's coding agent for the terminal. It runs in two shapes: an interactive REPL, and **droid exec**, which takes a prompt, works until the task is done, and exits, which is what makes it usable from scripts and CI.

Permissions are graduated rather than all-or-nothing. Without **--auto** the agent is effectively read-only: it can inspect the codebase and produce a plan, but not change it. **--auto low** permits file edits and little else. **--auto medium** additionally auto-approves reversible actions such as installing dependencies and running tests, while still asking before anything risky. **--auto high** hands over everything, including commits and pushes. The sensible progression is to start low on an unfamiliar repository, see what the agent actually proposes to touch, and raise the level once you trust it.

**--use-spec** inverts the flow: the agent writes a specification first and only then implements against it, optionally using a stronger model for the planning step via **--spec-model**. **--mission** goes further, orchestrating several agents and splitting work between worker and validator roles.

Custom sub-agents ("Custom Droids") are markdown files with YAML frontmatter under `.factory/droids/`, so a repository can ship its own specialised agents alongside its code.

# CAVEATS

**--skip-permissions-unsafe** disables every safety check, including the confirmations before destructive commands. It is meant for throwaway containers, and running it on a machine you care about, or with live credentials in the environment, is exactly the mistake its name warns about.

**--auto high** can rewrite history, force-push, and run arbitrary commands without asking. Combining it with a session that has push access to a shared branch is a real risk, and **--worktree** is the cheap mitigation, since it isolates the agent's changes from your working tree.

The tool needs a Factory.ai account, and prompts, code context, and tool results are sent to Factory's service and to the underlying model providers. That has obvious implications for proprietary code and is worth checking against your organisation's policy before pointing it at a private repository.

# HISTORY

**droid** is the CLI of **Factory.ai**, a company building agent tooling aimed at enterprise engineering teams rather than individual developers, which shows in its emphasis on session management, worktree isolation, multi-agent missions, and model choice. It is one of a crowded field of terminal coding agents that appeared from 2024 onward, alongside Claude Code, Codex CLI, Aider, and others.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [aider](/man/aider)(1), [opencode](/man/opencode)(1), [gemini](/man/gemini)(1)

# RESOURCES

```[Homepage](https://factory.ai)```

```[Documentation](https://docs.factory.ai/reference/cli-reference)```

<!-- verified: 2026-07-14 -->
