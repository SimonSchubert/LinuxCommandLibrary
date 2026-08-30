# TAGLINE

AI coding assistant using DeepSeek Coder models

# TLDR

Open an **interactive session**

```deepseek```

Send a **single prompt** and print the answer

```deepseek chat "[write a binary search in Python]"```

Choose **which model** answers

```deepseek --model [deepseek-coder:6.7b]```

Prepare the **local Ollama backend**

```deepseek setup```

Insist on the **local model** rather than the hosted API

```deepseek --local```

Combine a local model with a **one-off prompt**

```deepseek --local --model [deepseek-coder:6.7b] chat "[explain this regex]"```

Show the **available options**

```deepseek --help```

# SYNOPSIS

**deepseek** [_command_] [_options_]

# PARAMETERS

**chat** _prompt_
> Send a single prompt and print the response.

**setup**
> Set up the local Ollama environment and models.

**--model** _model_
> Model to use (e.g., deepseek-coder:6.7b, deepseek-coder:1.3b).

**--local**
> Force the CLI to use local Ollama models instead of the cloud API.

**--help**
> Display help information.

# DESCRIPTION

**deepseek** is a command-line AI coding assistant that leverages DeepSeek Coder models to assist with code completion, generation, refactoring, debugging, and code review across many programming languages.

It can run in two modes. The recommended local mode uses **Ollama** to run DeepSeek Coder models on your own machine, keeping code private and avoiding API costs. Cloud mode uses the DeepSeek API and requires an API key.

Without arguments it launches an interactive session; the **chat** subcommand runs a single prompt and exits, which is convenient for scripting.

# CONFIGURATION

**DEEPSEEK_API_KEY** (environment variable)
> API key used in cloud mode.

**DEEPSEEK_USE_LOCAL** (environment variable)
> Set to true/false to select local or cloud mode.

# CAVEATS

Local mode requires Ollama and a downloaded DeepSeek Coder model (sizes range from ~1GB to ~19GB). Cloud mode requires a DeepSeek API key and may incur costs. Installed via npm as the `run-deepseek-cli` package (requires Node.js 18+); this is a community project, not an official DeepSeek release.

# SEE ALSO

[ollama](/man/ollama)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/holasoymalva/deepseek-cli)```

<!-- verified: 2026-07-11 -->
