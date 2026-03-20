# TAGLINE

GitHub Copilot CLI custom agent invocation

# TLDR

**Start interactive Copilot CLI session with a custom agent**

```gh copilot --agent [agent_name]```

**Run a custom agent with a prompt non-interactively**

```gh copilot --agent [security-auditor] --prompt "[Check /src/app/validator.go]"```

**Invoke an agent interactively using the slash command**

```/agent [agent_name]```

**Delegate a task to Copilot coding agent**

```/delegate [task description]```

# SYNOPSIS

**gh** **copilot** **--agent** _name_ [**--prompt** _text_] [_options_]

# PARAMETERS

**--agent** _name_
> Specify the custom agent to use (matches the .agent.md filename).

**--prompt** _text_
> Provide a prompt for programmatic (non-interactive) usage.

**--allow-tool** _tool_
> Specify tools the agent can use (shell, write, url, MCP server tools).

# DESCRIPTION

**gh agent** functionality is provided through GitHub Copilot CLI's custom agent system, accessible via `gh copilot --agent` or the `/agent` slash command in an interactive session. Agents are defined by Markdown files with an `.agent.md` extension that specify the agent's name, description, prompt instructions, and available tools.

Custom agents can be defined at user level (~/.copilot/agents/), repository level (.github/agents/), or organization level ({org}/.github/agents/). In case of naming conflicts, user-level agents override repository-level, which override organization-level.

The `/delegate` slash command commits unstaged changes to a new branch and delegates the task to the Copilot coding agent, which opens a draft pull request and works in the background.

# SEE ALSO

[gh-copilot](/man/gh-copilot)(1), [gh](/man/gh)(1)

