# TAGLINE

Bash-first CLI wrapper for OpenAI-compatible LLM APIs

# TLDR

**Send a prompt** to the default Groq provider

```bash4llm "[prompt]"```

**Run a prompt from a file**

```bash4llm -f [prompt.txt]```

**Use a specific model** for one request

```bash4llm -m [llama-3.3-70b-versatile] "[prompt]"```

**Start interactive chat** mode

```bash4llm --chat```

**Refresh the model list** from the provider API

```bash4llm --refresh-models```

**Enable contextual memory** across turns in a named session

```bash4llm --session [chat1] "[prompt]"```

# SYNOPSIS

**bash4llm** [_options_] [_prompt_]

# PARAMETERS

**-f** _file_
> Read prompt text from _file_.

**-m**, **--model** _model_
> Use _model_ for this run only.

**--provider** _name_
> Select an installed provider (for example **groq** or **gemini**).

**--system** _text_
> Set the system prompt.

**--temperature**, **--ture** _n_
> Set sampling temperature between **0.0** and **2.0**.

**--max** _n_
> Limit maximum output tokens.

**--session** _id_
> Enable session memory for contextual follow-up prompts.

**--session-window** [_n_]
> Limit how many prior session turns are included (default **10**).

**--stream**, **--no-stream**
> Enable or disable streaming output.

**--chat**
> Start an interactive REPL chat session.

**--dry-run**
> Validate configuration without calling the API.

**--json**, **--pretty**, **--text**, **--raw**
> Control response output format.

**--save**, **--nosave**, **--out** _path_, **--threshold** _bytes_
> Control automatic saving of long responses.

**--refresh-models**, **--list-models**, **--list-providers**
> Manage and inspect provider model lists.

**--set-default** _model_
> Persist the default model for the active provider.

**--install-extras** [_dir_]
> Install optional provider packs, templates, and tools.

**--show-config**, **--diagnostics**
> Print active configuration or run system checks.

**-h**, **--help**
> Show help.

**--version**
> Print version and exit.

# DESCRIPTION

**bash4llm** (Bash4LLM⁺) is a single self-contained Bash script that wraps OpenAI-compatible chat completion APIs, with Groq as the default provider. It is designed to be readable, auditable, and portable across Linux, macOS, WSL, Cygwin, Termux, and BSD systems.

The script fetches model lists dynamically from the provider API rather than hardcoding them, supports streaming and non-streaming responses, and can pipe input from files or standard input. Optional extras add more providers such as Gemini, Hugging Face, and Mistral. Session support stores turn history in NDJSON files when **--session** is used, giving short-term contextual memory without keeping state by default.

Security is a core design goal: the script avoids **eval**, never executes model output, does not use shared **/tmp** directories, and isolates temporary files with restrictive permissions. Provider modules are treated as trusted code and should live in directories owned by the user.

# CONFIGURATION

**$BASH4LLM_CONFIG_DIR/config**
> Local settings such as model, temperature, max tokens, output format, and save threshold.

**$BASH4LLM_CONFIG_DIR/model.$PROVIDER**
> Persistent default model for a provider.

**$BASH4LLM_CONFIG_DIR/ui_state/**
> Atomic JSON metadata for external tools and optional GUI integrations.

**$BASH4LLM_HISTORY_DIR/sessions/<id>.ndjson**
> Session conversation history when **--session** is enabled.

**GROQ_API_KEY**
> API key for the default Groq provider.

**BASH4LLM_TMPDIR**
> Private temporary directory used instead of system **/tmp**.

Model selection precedence is: **-m/--model**, then **model.$PROVIDER**, then provider auto-selection, then the first whitelisted model, then the legacy global config file.

# CAVEATS

Requires **bash**, **curl**, **jq**, **gawk**, and common coreutils on **PATH**. Contextual memory exists only when **--session** is supplied on every related call. Provider extras are executable shell code and must be kept in trusted directories. On Termux, file locking falls back to atomic directory locks because **flock** is often unreliable.

# EXIT CODES

**0**
> Success.

**10**
> Missing API key.

**11**
> Invalid or non-whitelisted model.

**12**
> Network or curl failure.

**14**
> No prompt provided.

**15**
> Filesystem or temporary-file error.

**16**
> Provider HTTP or API error.

# SEE ALSO

[groq](/man/groq)(1), [curl](/man/curl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/kamaludu/bash4llm)```

<!-- verified: 2026-06-28 -->