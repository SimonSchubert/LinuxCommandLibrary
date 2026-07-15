# TAGLINE

AI-powered command suggestions and explanations

# TLDR

**Ask Copilot a question**

```gh copilot suggest "[how to find large files]"```

**Explain a command**

```gh copilot explain "[git rebase -i HEAD~3]"```

**Get shell command suggestions**

```gh copilot suggest -t shell "[task description]"```

**Get gh CLI suggestions**

```gh copilot suggest -t gh "[task description]"```

# SYNOPSIS

**gh** **copilot** _command_ [_options_]

# SUBCOMMANDS

**suggest**
> Get command suggestions.

**explain**
> Explain a command.

**config**
> Configure Copilot.

# PARAMETERS

**-t**, **--target** _type_
> Target type (shell, gh, git).

# DESCRIPTION

**gh copilot** provides AI-powered assistance using GitHub Copilot for the command line. It helps users discover and understand commands through natural language interactions.

The suggest subcommand generates shell, git, or gh commands based on task descriptions, making it easier to find the right command syntax. The explain subcommand breaks down complex commands into understandable explanations, helping users learn what commands do before executing them.

This integration brings GitHub Copilot's AI capabilities directly into the terminal workflow, requiring an active GitHub Copilot subscription.

# CAVEATS

Deprecated. The **gh copilot** extension was archived in **October 2025** in favor of the standalone, agentic **GitHub Copilot CLI** (invoked as **copilot**). Existing installations still work, but new users should install the replacement instead.

# SEE ALSO

[gh](/man/gh)(1), [gh-agent](/man/gh-agent)(1)

# RESOURCES

```[Source code](https://github.com/github/gh-copilot)```

```[Documentation](https://docs.github.com/copilot/github-copilot-in-the-cli)```

<!-- verified: 2026-07-15 -->

