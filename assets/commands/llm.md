# TAGLINE

CLI for interacting with large language models

# TLDR

**Chat with default model**

```llm "[prompt]"```

**Use specific model**

```llm -m [gpt-4o] "[prompt]"```

**Interactive chat session**

```llm chat```

**Continue most recent conversation**

```llm -c "[follow up]"```

**List models** (built-in and from plugins)

```llm models```

**Pipe input** to a model

```cat [file.txt] | llm "[summarize this]"```

**Use a system prompt**

```llm -s "[Reply as a pirate]" "[Hi there]"```

**Set an API key**

```llm keys set [openai]```

**Install a plugin** (e.g. Claude support)

```llm install [llm-claude-3]```

# SYNOPSIS

**llm** [_options_] [_prompt_]

**llm** _subcommand_ [_options_]

# PARAMETERS

_PROMPT_
> Text prompt for the model.

**-m** _MODEL_, **--model** _MODEL_
> Model to use (e.g. **gpt-4o**, **claude-3-5-sonnet**, **llama2**).

**-c**, **--continue**
> Continue the most recent conversation.

**--cid** _ID_
> Continue a specific conversation by id.

**-s** _PROMPT_, **--system** _PROMPT_
> Set a system prompt.

**-t** _NAME_, **--template** _NAME_
> Use a named prompt template.

**-o** _KEY_ _VALUE_, **--option** _KEY_ _VALUE_
> Pass a model-specific option (e.g. **-o temperature 0**).

**-a** _PATH_, **--attachment** _PATH_
> Attach a file (image, PDF, audio) to the prompt for models that support attachments.

**--no-stream**
> Disable token streaming and only print the final answer.

**--key** _KEY_
> Use a specific API key for this call.

# SUBCOMMANDS

**chat**
> Open an interactive chat session.

**models** [**list** | **default** _name_]
> List available models or set the default model.

**keys** [**set** _key_]
> Manage API keys.

**logs**
> Show or query the persistent log of prompts and responses.

**templates**
> Manage reusable prompt templates.

**install** _package_ / **uninstall** _package_
> Install or remove an llm plugin (e.g. **llm-claude-3**, **llm-ollama**).

**embed**, **embed-multi**, **similar**
> Generate and search text embeddings.

# DESCRIPTION

**llm** is a CLI and Python library for interacting with large language models. Out of the box it talks to OpenAI's API; through plugins it also supports Anthropic Claude, Google Gemini, Mistral, local **Ollama**, **llama.cpp** / GGUF, and many other providers and self-hosted models.

Every prompt and response is logged to a local **SQLite** database (under **~/.config/io.datasette.llm/** on Linux or **~/Library/Application Support/io.datasette.llm/** on macOS) so previous conversations can be searched, exported, and replayed. The tool also supports prompt templates, system prompts, embeddings, similarity search, and pluggable backends.

# CAVEATS

Cloud models require API keys stored via **llm keys set**. Conversation logs are stored in plaintext SQLite, so be mindful of secrets in prompts. Provider support beyond OpenAI requires installing additional plugins (e.g. **llm install llm-claude-3**).

# HISTORY

**llm** was created by **Simon Willison** to provide unified CLI access to language model APIs and local models, and to make it easy to log and query past prompts.

# INSTALL

```brew: brew install llm```

```nix: nix profile install nixpkgs#llm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ollama](/man/ollama)(1), [chatgpt](/man/chatgpt)(1)
