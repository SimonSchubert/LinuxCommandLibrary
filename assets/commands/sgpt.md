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

**sgpt** (Shell GPT) provides CLI access to ChatGPT. It specializes in command-line tasks.

Shell mode generates executable commands. Describes what the command does.

Code mode produces programming solutions. Language detected from context.

Chat sessions maintain conversation context. Continue discussions across calls.

Roles customize AI behavior. Predefined and custom roles available.

Piping integrates with Unix workflows. Process file contents with AI.

# CAVEATS

Requires OpenAI API key. Costs per token. Internet connection needed.

# HISTORY

**sgpt** was created by **Farkhod Sadykov** for AI-assisted shell usage. It brings ChatGPT capabilities directly to the command line.

# SEE ALSO

[chatgpt](/man/chatgpt)(1), [github-copilot-cli](/man/github-copilot-cli)(1)
