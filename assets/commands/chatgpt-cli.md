# TAGLINE

command-line interface for ChatGPT

# TLDR

**Start interactive chat**

```chatgpt```

**Send a single prompt**

```chatgpt "[Your question here]"```

**Chat with specific model**

```chatgpt -m [gpt-4] "[prompt]"```

**Set system prompt**

```chatgpt -s "[You are a helpful assistant]" "[prompt]"```

**Pipe input to ChatGPT**

```cat [file.txt] | chatgpt "[Summarize this]"```

**Use with specific temperature**

```chatgpt -t [0.7] "[prompt]"```

**Stream response**

```chatgpt --stream "[prompt]"```

# SYNOPSIS

**chatgpt** [_options_] [_prompt_]

# PARAMETERS

**-m**, **--model** _name_
> Model to use (gpt-4, gpt-3.5-turbo, etc.).

**-s**, **--system** _prompt_
> System prompt to set context.

**-t**, **--temperature** _value_
> Sampling temperature (0-2, default 1).

**--max-tokens** _n_
> Maximum tokens in response.

**--stream**
> Stream response tokens as generated.

**-c**, **--continue**
> Continue previous conversation.

**--api-key** _key_
> OpenAI API key (or set OPENAI_API_KEY).

**--no-markdown**
> Disable markdown rendering.

**-o**, **--output** _file_
> Write response to file.

**-i**, **--interactive**
> Start interactive mode.

# DESCRIPTION

**chatgpt-cli** provides command-line access to OpenAI's ChatGPT models. It enables conversational AI interactions from the terminal, supporting both interactive sessions and single-query scripting.

The tool handles conversation context, allowing multi-turn dialogues in interactive mode. Input can come from arguments, stdin (pipes), or interactive prompts. Responses are rendered with markdown formatting by default for better readability.

Integration with shell pipelines enables powerful workflows: analyzing files, transforming text, generating code, and automating content creation. The streaming option shows responses as they're generated.

# CONFIGURATION

**OPENAI_API_KEY**
> Environment variable for the OpenAI API key, used when --api-key is not provided.

# CAVEATS

Requires an OpenAI API key with available credits. API usage is billed per token. Large context windows may incur significant costs. Response quality varies by model; GPT-4 is more capable but more expensive than GPT-3.5. Rate limits may apply to API calls.

# HISTORY

Various **chatgpt-cli** implementations emerged after OpenAI released the ChatGPT API in **March 2023**. These community tools filled the gap for users wanting terminal access to ChatGPT without using the web interface. Multiple implementations exist in different languages (Python, Go, Rust), each with similar goals but varying features.

# SEE ALSO

[llm](/man/llm)(1), [ollama](/man/ollama)(1), [sgpt](/man/sgpt)(1)
