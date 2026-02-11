# TAGLINE

AI-powered shell assistant using ChatGPT

# TLDR

**Ask a question**

```sgpt "[How do I list files?]"```

**Generate shell command**

```sgpt -s "[list all PDF files]"```

**Execute shell command**

```sgpt -se "[find large files]"```

**Generate code**

```sgpt -c "[python function to sort list]"```

**Chat mode**

```sgpt --chat [session_name] "[message]"```

**Use specific role**

```sgpt --role [code] "[question]"```

**Pipe input**

```cat [file.txt] | sgpt "[summarize this]"```

# SYNOPSIS

**sgpt** [_-s_] [_-c_] [_--chat name_] [_options_] _prompt_

# PARAMETERS

**-s**, **--shell**
> Generate shell command.

**-se**
> Shell and execute.

**-c**, **--code**
> Generate code.

**--chat** _NAME_
> Chat session.

**--role** _ROLE_
> Use role.

**--model** _MODEL_
> Specify model.

**--temperature** _TEMP_
> Response randomness.

**--no-cache**
> Disable caching.

# DESCRIPTION

**sgpt** (Shell GPT) is a command-line interface for interacting with OpenAI's ChatGPT models, optimized for developer and system administration workflows. It operates in several modes: general queries for quick answers, shell mode (**-s**) for generating executable commands with explanations, and code mode (**-c**) for producing programming solutions with automatic language detection.

Chat sessions maintain conversation context across multiple invocations, allowing follow-up questions and iterative refinement. Roles customize the AI's behavior for specific tasks, with predefined roles for common scenarios and support for user-defined custom roles.

The tool integrates naturally with Unix pipelines, accepting input via stdin to process file contents, command output, or any streamed data through AI analysis. This makes it useful for tasks like summarizing logs, explaining error messages, or generating documentation from code.

# CONFIGURATION

**OPENAI_API_KEY**
> Environment variable providing the OpenAI API key for authentication.

**~/.config/shell_gpt/.sgptrc**
> Configuration file for default model, temperature, cache settings, and other preferences.

**~/.config/shell_gpt/roles/**
> Directory containing custom role definitions as text files.

# CAVEATS

Requires OpenAI API key. Costs per token. Internet connection needed.

# HISTORY

**sgpt** was created by **Farkhod Sadykov** for AI-assisted shell usage. It brings ChatGPT capabilities directly to the command line.

# SEE ALSO

[chatgpt](/man/chatgpt)(1), [github-copilot-cli](/man/github-copilot-cli)(1)
