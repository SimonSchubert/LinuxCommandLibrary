# TAGLINE

GitHub Copilot agent task executor

# TLDR

**Run agent task**

```gh agent task "[task description]"```

**Run with specific agent**

```gh agent task -a [agent_name] "[task]"```

# SYNOPSIS

**gh** **agent** **task** [_options_] [_task_]

# PARAMETERS

**-a**, **--agent** _name_
> Specify agent to use.

# DESCRIPTION

**gh agent task** runs a task using GitHub Copilot agents. Agents can perform specialized tasks based on their capabilities, such as code analysis, refactoring suggestions, documentation generation, or domain-specific problem solving.

Tasks are processed by the specified agent, which applies its specialized knowledge to provide relevant assistance. This allows developers to leverage agent expertise without leaving the command line interface.

# SEE ALSO

[gh-agent](/man/gh-agent)(1), [gh-copilot](/man/gh-copilot)(1)

