# TAGLINE

chat completion

# TLDR

**Chat completion**

```openai api chat.completions.create -m gpt-4 -g user "[prompt]"```

**Create embedding**

```openai api embeddings.create -m text-embedding-ada-002 -i "[text]"```

**List models**

```openai api models.list```

**Generate image**

```openai api images.generate -p "[description]"```

# SYNOPSIS

**openai** [_command_] [_options_]

# PARAMETERS

**api** _ENDPOINT_
> API command.

**-m** _MODEL_
> Model name.

**-g** _ROLE_ _MESSAGE_
> Message with role.

**-i** _INPUT_
> Input text.

**-p** _PROMPT_
> Prompt text.

**--help**
> Display help information.

# DESCRIPTION

**openai** is the OpenAI CLI. Interacts with GPT models and other APIs.

The tool provides command-line API access. Requires API key.

# CAVEATS

Requires OPENAI_API_KEY. API usage billed. Rate limits apply.

# HISTORY

openai CLI was created by **OpenAI** for command-line API access.

# SEE ALSO

[curl](/man/curl)(1), [ollama](/man/ollama)(1)

