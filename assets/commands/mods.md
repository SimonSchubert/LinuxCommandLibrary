# TAGLINE

AI assistant for the command line by Charm

# TLDR

**Ask a one-off question**

```mods "[explain what SIGPIPE does]"```

**Pipe file contents into a prompt**

```cat [file.py] | mods "[review this code for bugs]"```

**Select a specific model**

```mods -m [gpt-4o] "[summarise this]"```

**Continue the last conversation**

```mods -C "[and how would I test that?]"```

**Resume a named conversation**

```mods -c [refactor] "[next step]"```

**Format the response as Markdown**

```mods -f "[write release notes from these commits]"```

**List saved conversations**

```mods -l```

**Apply a custom role / system prompt**

```mods --role [shell] "[find large files in /var]"```

# SYNOPSIS

**mods** [_options_] [_prompt_]

# PARAMETERS

_PROMPT_
> Text passed to the model. Combined with any data read from STDIN.

**-m**, **--model** _NAME_
> Use the named model (for example `gpt-4o`, `claude-3-5-sonnet`, a local Ollama model).

**-M**, **--ask-model**
> Prompt interactively to choose a model.

**-f**, **--format**
> Ask the model for formatted (Markdown) output and render it in the terminal.

**--format-as** _FORMAT_
> Specify the output format (for example `markdown`, `json`).

**-r**, **--raw**
> Print the raw, unformatted response.

**-q**, **--quiet**
> Suppress non-error output.

**-P**, **--prompt**
> Include the prompt from the command arguments and STDIN in the response.

**-p**, **--prompt-args**
> Include the CLI prompt arguments in the response.

**--max-tokens** _N_
> Limit the response length.

**--no-limit**
> Do not restrict the response length.

**--word-wrap** _WIDTH_
> Wrap output at the given column (default: 80).

**-t**, **--title** _NAME_
> Title the current conversation for later retrieval.

**-l**, **--list**
> List saved conversations.

**-c**, **--continue** _NAME_
> Resume a saved conversation by name.

**-C**, **--continue-last**
> Resume the most recent conversation.

**-s**, **--show** _NAME_
> Print a saved conversation.

**--no-cache**
> Do not persist the conversation to the cache.

**--role** _NAME_
> Apply a custom role / system prompt defined in the config.

**--temp** _FLOAT_
> Sampling temperature.

**--topp** _FLOAT_, **--topk** _INT_
> Top-p / top-k sampling parameters.

**--theme** _NAME_
> UI theme (`charm`, `catppuccin`, `dracula`, `base16`).

**-x**, **--http-proxy** _URL_
> Route requests through an HTTP proxy.

**--settings**
> Open the settings file in `$EDITOR`.

# DESCRIPTION

**mods** is a command-line AI companion that turns STDIN and arguments into a prompt, sends it to a configured LLM, and streams the response back to the terminal. It supports OpenAI, Anthropic, Cohere, Groq, Google Gemini, Azure, and local providers such as Ollama and LocalAI, selected per-request via **--model** or in the YAML configuration.

Conversations are cached to disk so they can be resumed by name or continued from the last turn, and Markdown rendering via Glamour lets replies display with syntax highlighting and headings when **--format** is set.

# CAVEATS

Requires an API key (or local endpoint) configured for the chosen provider; commercial providers incur per-token costs. Prompts sent from the shell are stored in plain text in the cache directory unless **--no-cache** is used.

As of **March 2026** the upstream project is archived; Charm recommends **Crush** as its successor, though existing mods installations continue to work.

# HISTORY

**mods** was created by **Charm** as part of their suite of terminal tools (alongside gum, glow, and charm). It was archived in March 2026 in favour of Charm's newer Crush CLI.

# SEE ALSO

[llm](/man/llm)(1), [ollama](/man/ollama)(1), [glow](/man/glow)(1), [gum](/man/gum)(1), [charm](/man/charm)(1)
