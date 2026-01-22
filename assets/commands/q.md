# TLDR

**Start an interactive chat session**

```q chat```

**Ask a question directly**

```q chat "[How do I list EC2 instances?]"```

**Translate natural language to shell commands**

```q translate "[find all Python files modified in the last week]"```

**Run in non-interactive mode with auto-approval**

```q chat --no-interactive --trust-all-tools "[create a hello world script]"```

**Resume a previous chat session**

```q chat --resume```

**Use a specific agent**

```q chat --agent [my-agent] "[help with AWS CLI]"```

**Diagnose and fix common issues**

```q doctor```

# SYNOPSIS

**q** [_command_] [_options_] [_prompt_]

# COMMANDS

**chat**
> Start an interactive chat session (default command)

**translate**
> Convert natural language to shell commands

**doctor**
> Diagnose and fix common issues

# CHAT OPTIONS

**--no-interactive**
> Run in non-interactive mode

**--trust-all-tools**
> Trust all tools for execution without prompting

**--resume**
> Resume a previous chat session

**--agent** _NAME_
> Use a specific agent configuration

**--help**
> Display help information

# IN-SESSION COMMANDS

**/save**
> Save the current chat session

**/load**
> Recover a previous chat history

**/quit**
> Exit the chat (or use Ctrl+D)

# DESCRIPTION

**Amazon Q Developer CLI** is an AI-powered terminal assistant from AWS that provides agentic chat, command autocompletion, and natural language code generation. The enhanced CLI agent, powered by Anthropic's Claude, can read and write files locally, query AWS resources, run bash commands, and help debug issues.

The tool offers two assistance features: an autocomplete dropdown menu showing available command options, and inline suggestions appearing as gray ghost text as you type. It supports natural language translation to shell commands via **q translate** and interactive coding sessions via **q chat**.

Available for macOS and Linux, it integrates with terminals including macOS Terminal, iTerm2, and VS Code's built-in terminal.

# CAVEATS

Requires AWS authentication and an Amazon Q Developer subscription (Free or Pro tier). The enhanced CLI agent is available in all AWS regions where Q Developer is available. Set **Q_LOG_LEVEL** environment variable to **debug** for troubleshooting.

# HISTORY

Amazon Q Developer CLI was released by **AWS** as part of the Amazon Q Developer suite. The enhanced CLI agent with agentic coding capabilities was announced in **March 2025**, powered by Anthropic's Claude 3.7 Sonnet. In 2025, users can upgrade to the Kiro CLI for additional features while retaining Q Developer functionality.

# SEE ALSO

[aws](/man/aws)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1)
