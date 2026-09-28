# TAGLINE

Manage stored API keys for the llm CLI

# TLDR

**List** stored key names

```llm keys list```

**Save** an OpenAI key (prompts for the secret)

```llm keys set openai```

Save a key **without a prompt**

```llm keys set openai --value [sk-...]```

**Print** a stored key (useful in scripts)

```export OPENAI_API_KEY=$(llm keys get openai)```

Show the **keys.json** path

```llm keys path```

# SYNOPSIS

**llm keys** [_options_] [_command_]

**llm keys list**

**llm keys set** [**--value** _secret_] _name_

**llm keys get** _name_

**llm keys path**

# PARAMETERS

**list**
> Print the names of keys in **keys.json**. Default subcommand if none is given (**llm keys**).

**set** _name_
> Store a key under _name_. Prompts on stdin unless **--value** is given. Common names include **openai**; plugins document their own (for example **anthropic**).

**--value** _secret_
> Pass the secret on the command line instead of prompting. Visible in process listings.

**get** _name_
> Print the stored secret. Typical use: **export OPENAI_API_KEY=$(llm keys get openai)**.

**path**
> Print the absolute path of **keys.json**.

**-h**, **--help**
> Help for **llm keys** or a subcommand.

# DESCRIPTION

**llm keys** stores provider API keys for **llm** in a JSON file in the LLM user directory. After **llm keys set openai**, prompts such as **llm "Five names for a pet pelican"** use that key automatically.

Resolution order for a prompt: **--key** on **llm** / **llm prompt** (raw secret or a stored alias), then **keys.json**, then the provider environment variable (**OPENAI_API_KEY** for OpenAI). **--key personal** uses a stored alias named **personal**.

# CONFIGURATION

**keys.json**
> Default locations: **~/.config/io.datasette.llm/keys.json** on Linux, **~/Library/Application Support/io.datasette.llm/keys.json** on macOS. **llm keys path** prints the resolved file.

**LLM_USER_PATH**
> Override the whole LLM user directory (keys, logs, templates).

# CAVEATS

Subcommand of **llm**. **keys.json** holds secrets in plaintext. **llm keys get** and **--value** expose secrets to the terminal and process table. Homebrew **llm** may lag PyPI; **llm install -U llm** upgrades the tool inside that environment.

# INSTALL

```brew: brew install llm```

```nix: nix profile install nixpkgs#llm```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[llm](/man/llm)(1), [llm-models](/man/llm-models)(1), [llm-logs](/man/llm-logs)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/simonw/llm)```

```[Homepage](https://llm.datasette.io)```

```[Documentation](https://llm.datasette.io/en/stable/setup.html)```

<!-- verified: 2026-09-28 -->
