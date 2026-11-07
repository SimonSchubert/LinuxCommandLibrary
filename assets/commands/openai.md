# TAGLINE

official command-line client for the OpenAI API

# TLDR

**Send a request** to the Responses API

```openai responses create --model [gpt-5.5] --input "[prompt]"```

**Read the prompt from a file**

```openai responses create --model [gpt-5.5] --input @[prompt.txt]```

**Generate an image** and save it locally

```openai images generate --prompt "[description]"```

**List available models** as JSON lines

```openai models list --format jsonl```

**Upload a file**

```openai files upload [report.txt] --purpose user_data```

**Extract a field** from the response

```openai files get [file-id] --transform filename```

**Search commands** interactively in plain words

```openai explore```

**Show help** for a command

```openai images generate --help```

# SYNOPSIS

**openai** _resource_ [_subresource_...] _command_ [_flags_]

# PARAMETERS

**--api-key** _KEY_
> API key to use (default: **OPENAI_API_KEY**).

**--organization** _ID_
> Organization ID (default: **OPENAI_ORG_ID**).

**--project** _ID_
> Project ID (default: **OPENAI_PROJECT_ID**).

**--base-url** _URL_
> Custom API backend (default: https://api.openai.com/v1). HTTPS is required except for loopback addresses.

**-H**, **--header** _"Name: Value"_
> Add a request header; repeatable.

**--format** _FORMAT_
> Output format: auto, text, explore, json, jsonl, pretty, raw, yaml.

**--transform** _PATH_
> Transform the output using GJSON syntax.

**--debug**
> Log redacted HTTP headers and timing to stderr.

**-v**, **--version**
> Show the CLI version.

**--help**
> Show usage for any command.

# DESCRIPTION

**openai** is the official command-line tool for the OpenAI REST API. Commands map to API resources such as **responses**, **images**, **files**, **batches**, **models** and **admin**, in the form _openai resource command --flags_.

Arguments that take JSON values accept **@file** to read local file contents, and request bodies can also be passed as JSON or YAML on stdin. **openai explore** offers a searchable command picker, and in zsh the chosen command can be inserted back at the prompt.

# CAVEATS

API usage is billed and rate limited. An API key is needed for requests; run **openai help setup** to configure one. When piping JSON from an untrusted source, set **OPENAI_UNTRUSTED_STDIN=1** so **@file** references are not expanded. Interactive installs enable automatic updates; set **OPENAI_CLI_NO_UPDATE_CHECK** to disable update checks.

# HISTORY

The original **openai** command shipped with the **openai** Python package and used the syntax _openai api chat.completions.create_. That legacy CLI was removed in openai-python **2.35.0** (May 2026) and replaced by a standalone Go CLI, released by **OpenAI** in 2026.

# SEE ALSO

[codex](/man/codex)(1), [curl](/man/curl)(1), [jq](/man/jq)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/openai/openai-cli)```

```[Documentation](https://github.com/openai/openai-cli/blob/main/docs/cli-reference.md)```

<!-- verified: 2026-11-07 -->
