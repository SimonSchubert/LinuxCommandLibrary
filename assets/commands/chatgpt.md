# TAGLINE

command-line interface for OpenAI language models

# TLDR

**Start an interactive chat** session

```chatgpt```

**Send a single prompt** and get a response

```chatgpt "[What is the capital of France?]"```

**Pipe input** to ChatGPT

```cat [file.txt] | chatgpt "[Summarize this text]"```

**Use a specific model**

```chatgpt --model [gpt-4] "[prompt]"```

**Continue a previous conversation**

```chatgpt --continue "[follow-up question]"```

**Set system prompt** for context

```chatgpt --system "[You are a helpful coding assistant]" "[prompt]"```

**Output response to a file**

```chatgpt "[prompt]" > [response.txt]```

**Set temperature** for response creativity

```chatgpt --temperature [0.7] "[prompt]"```

# SYNOPSIS

**chatgpt** [_options_] [_prompt_]

# PARAMETERS

**--model**, **-m** _model_
> Specify the model to use (gpt-4, gpt-3.5-turbo, etc.).

**--system**, **-s** _prompt_
> Set a system prompt to define assistant behavior.

**--continue**, **-c**
> Continue the previous conversation.

**--temperature**, **-t** _value_
> Control randomness (0.0-2.0, default: 1.0).

**--max-tokens** _n_
> Maximum tokens in the response.

**--top-p** _value_
> Nucleus sampling parameter.

**--stream**
> Stream the response as it's generated.

**--no-stream**
> Wait for complete response before displaying.

**--api-key** _key_
> OpenAI API key (or set OPENAI_API_KEY environment variable).

**--config** _file_
> Path to configuration file.

**--list-models**
> List available models.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**chatgpt** is a command-line interface for interacting with OpenAI's ChatGPT models. It provides terminal-based access to the GPT language models for text generation, coding assistance, analysis, and general conversation.

The tool supports both interactive mode for back-and-forth conversation and single-prompt mode for quick queries. Input can be piped from other commands or files, making it useful in shell pipelines for text processing tasks.

Configuration can be set via command-line flags, environment variables, or a config file. The **OPENAI_API_KEY** environment variable is commonly used for authentication. Different models offer varying capabilities, speed, and pricing.

System prompts allow customizing the assistant's behavior and expertise area. Temperature controls response creativity - lower values produce more focused responses while higher values increase variety. The streaming option displays responses token-by-token as they're generated.

# CONFIGURATION

**OPENAI_API_KEY**
> Environment variable for API authentication.

# CAVEATS

Requires an OpenAI API key with active billing. API usage incurs costs based on token consumption. Response quality and capabilities vary by model. Network connectivity required. Context length is limited by model constraints. Sensitive data should not be sent without considering privacy implications.

# HISTORY

Command-line interfaces for ChatGPT emerged shortly after OpenAI released the ChatGPT API in **March 2023**. Multiple CLI implementations exist across languages (Python, Go, Rust, etc.) with varying feature sets. These tools brought GPT capabilities to terminal-centric workflows, enabling integration with shell scripts and development pipelines.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [claude](/man/claude)(1), [ollama](/man/ollama)(1)
