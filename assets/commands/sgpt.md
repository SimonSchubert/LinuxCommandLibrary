# TAGLINE

AI-powered shell assistant using large language models

# TLDR

**Ask a question**

```sgpt "[How do I list files?]"```

**Generate shell command**

```sgpt -s "[list all PDF files]"```

**Print a shell command without the interactive prompt**

```sgpt -s --no-interaction "[find large files]"```

**Describe a shell command**

```sgpt -d "[ls -la]"```

**Generate code**

```sgpt -c "[python function to sort list]"```

**Chat mode**

```sgpt --chat [session_name] "[message]"```

**Interactive REPL session**

```sgpt --repl [temp]```

**Use specific role**

```sgpt --role [code] "[question]"```

**Pipe input**

```cat [file.txt] | sgpt "[summarize this]"```

# SYNOPSIS

**sgpt** [_-s_] [_-c_] [_--chat name_] [_options_] _prompt_

# PARAMETERS

**-s**, **--shell**
> Generate a shell command, then prompt to execute, describe or abort.

**--no-interaction**
> With **--shell**, print the command to stdout without prompting.

**-d**, **--describe-shell**
> Describe a shell command.

**-c**, **--code**
> Generate only code.

**--chat** _ID_
> Continue a conversation; use **temp** for a quick session.

**--repl** _ID_
> Start a REPL session.

**--show-chat** _ID_
> Show all messages of a conversation.

**-lc**, **--list-chats**
> List existing conversations.

**--role** _ROLE_
> Use a system role.

**--create-role** _NAME_
> Create a custom role.

**--show-role** _NAME_
> Show a role.

**-lr**, **--list-roles**
> List roles.

**--model** _MODEL_
> Specify model.

**--temperature** _TEMP_
> Response randomness, from 0.0 to 2.0.

**--top-p** _VALUE_
> Limit the highest probable tokens, from 0.0 to 1.0.

**--no-md**
> Disable markdown prettifying.

**--editor**
> Open **$EDITOR** to write the prompt.

**--no-cache**
> Disable caching.

**--install-integration**
> Add the Ctrl+L shell integration to **.bashrc** or **.zshrc**.

**--install-functions**
> Install the default function calls.

# DESCRIPTION

**sgpt** (Shell GPT) is a command-line interface for interacting with OpenAI GPT models and, through LiteLLM, local models such as Ollama, optimized for developer and system administration workflows. It operates in several modes: general queries for quick answers, shell mode (**-s**) for generating executable commands with explanations, and code mode (**-c**) for producing code without commentary.

Chat sessions maintain conversation context across multiple invocations, allowing follow-up questions and iterative refinement. Roles customize the AI's behavior for specific tasks, with predefined roles for common scenarios and support for user-defined custom roles.

The tool integrates naturally with Unix pipelines, accepting input via stdin to process file contents, command output, or any streamed data through AI analysis. This makes it useful for tasks like summarizing logs, explaining error messages, or generating documentation from code.

# CONFIGURATION

**OPENAI_API_KEY**
> Environment variable providing the OpenAI API key for authentication.

**~/.config/shell_gpt/.sgptrc**
> Configuration file for default model, temperature, cache settings, and other preferences.

**~/.config/shell_gpt/roles/**
> Directory containing role definitions as JSON files.

# CAVEATS

Requires an OpenAI API key or a compatible backend; local models work through LiteLLM (**USE_LITELLM=true**). Hosted APIs charge per token and need an internet connection. Review generated shell commands before executing them.

# HISTORY

**sgpt** was created by **Farkhod Sadykov** for AI-assisted shell usage. It brings ChatGPT capabilities directly to the command line.

# SEE ALSO

[chatgpt](/man/chatgpt)(1), [github-copilot-cli](/man/github-copilot-cli)(1)

# RESOURCES

```[Source code](https://github.com/TheR1D/shell_gpt)```

<!-- verified: 2026-11-08 -->
