# TAGLINE

List and configure models available to the llm CLI

# TLDR

**List** installed and plugin models

```llm models list```

Filter by a **query** string

```llm models list -q [gpt]```

List models that support **tools**

```llm models list --tools```

List models that support **schemas**

```llm models list --schemas```

Show each model's **options**

```llm models list --options```

Show the **default** model

```llm models default```

**Set** the default model

```llm models default [gpt-4o]```

Set a default **option** for a model

```llm models options set [gpt-4o] temperature 0.5```

# SYNOPSIS

**llm models** [_options_] [_command_]

**llm models list** [_options_]

**llm models default** [_model_]

**llm models options** {**list**|**show** _model_|**set** _model_ _key_ _value_|**clear** _model_ [_key_]}

# PARAMETERS

**list**
> Print available models (built-in OpenAI plus plugins). Default subcommand (**llm models**).

**-q**, **--query** _text_
> Keep models whose id or metadata match. Repeatable.

**-m**, **--model** _id_
> Restrict to specific model ids. Repeatable.

**--options**
> Include per-model option names (temperature, and so on).

**--tools**
> Only models that can call tools.

**--schemas**
> Only models that support structured output schemas.

**--async**
> List async model implementations.

**--json**
> JSON instead of text.

**default** [_model_]
> With no argument, print the current default. With _model_ (id or alias), store that default for **llm** when **-m** is omitted.

**options list**
> Default option values set for every model.

**options show** _model_
> Defaults for one model.

**options set** _model_ _key_ _value_
> Persist a default option (example: **temperature 0.5**).

**options clear** _model_ [_key_]
> Clear one option, or all defaults for that model.

**-h**, **--help**
> Help for **llm models** or a subcommand.

# DESCRIPTION

**llm models** is how **llm** shows which model ids you can pass to **llm -m** / **--model**. Out of the box the list is OpenAI chat models. **llm install** plugins add vendors and local runtimes (Claude, Gemini, Ollama, llama.cpp, and others). Aliases are managed separately with **llm aliases**.

The default model is used when a prompt has no **-m**. Official docs currently default that to an OpenAI chat model; **llm models default** changes it.

**llm models options** stores per-model defaults so you do not repeat **-o key value** on every prompt.

# CAVEATS

Subcommand of **llm**. A model in the list still needs a working key or local backend. Plugin model ids are not available until the plugin is installed. **--query** matching is substring-style across the list output, not a full metadata search API.

# INSTALL

```brew: brew install llm```

```nix: nix profile install nixpkgs#llm```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[llm](/man/llm)(1), [llm-keys](/man/llm-keys)(1), [llm-logs](/man/llm-logs)(1), [ollama](/man/ollama)(1), [chatgpt](/man/chatgpt)(1)

# RESOURCES

```[Source code](https://github.com/simonw/llm)```

```[Homepage](https://llm.datasette.io)```

```[Documentation](https://llm.datasette.io/en/stable/help.html)```

<!-- verified: 2026-09-28 -->
