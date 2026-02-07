# TAGLINE

AI-powered command-line assistant for shell commands

# TLDR

**Explain a command**

```gh copilot explain "[command]"```

**Suggest a command**

```gh copilot suggest "[what you want to do]"```

**Configure Copilot CLI**

```gh copilot config```

**Get shell alias**

```gh copilot alias [bash|zsh|fish]```

# SYNOPSIS

**gh copilot** _command_ [_args_]

# PARAMETERS

**explain** _command_
> Get explanation of a command.

**suggest** _description_
> Suggest command for task.

**config**
> Configure Copilot CLI.

**alias** _shell_
> Get alias configuration for shell.

# DESCRIPTION

**GitHub Copilot CLI** is an AI-powered command-line assistant that explains commands and suggests shell commands based on natural language descriptions. It is a GitHub CLI extension that helps users understand complex commands and discover the right command for a task without memorizing syntax.

The tool supports various shells and command-line tools, providing interactive suggestions that can be copied or executed directly.

# CAVEATS

Requires GitHub Copilot subscription. Needs internet connection. Suggestions may not always be accurate. Review commands before executing. Privacy considerations for command data.

# HISTORY

GitHub Copilot CLI was released as a GitHub CLI extension after the success of GitHub Copilot for code. It extends AI assistance from code editors to the command line.

# SEE ALSO

[gh](/man/gh)(1), [tldr](/man/tldr)(1), [man](/man/man)(1)
