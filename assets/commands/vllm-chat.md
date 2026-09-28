# TAGLINE

Interactive chat client for a running vLLM OpenAI-compatible server

# TLDR

Start an **interactive** chat against localhost

```vllm chat```

Send **one prompt** and exit

```vllm chat --quick "[hi]"```

Pick a **model** from a multi-model server

```vllm chat --model-name [Qwen/Qwen2.5-1.5B-Instruct] --quick "[hi]"```

Set a **system prompt**

```vllm chat --system-prompt "[You are a terse assistant.]" --quick "[hi]"```

Point at a **custom** API base URL

```vllm chat --url [http://127.0.0.1:8080/v1] --quick "[hi]"```

Pass an **API key**

```vllm chat --api-key [token-abc123] --quick "[hi]"```

Print **TTFT and tokens/s** after the reply

```vllm chat --stats --quick "[hi]"```

# SYNOPSIS

**vllm chat** [**--url** _url_] [**--model-name** _name_] [**--api-key** _key_] [**--system-prompt** _text_] [**-q**|**--quick** _message_] [**--stats**]

# PARAMETERS

**--url** _url_
> OpenAI-compatible base URL. Default **http://localhost:8000/v1** (the **vllm serve** default).

**--model-name** _name_
> Model id sent in chat completions. Default: first id from **GET /v1/models**.

**--api-key** _key_
> Bearer token for the client. Overrides **OPENAI_API_KEY**. If neither is set, the client uses **EMPTY**. Must match **vllm serve --api-key** / **VLLM_API_KEY** when the server requires a key.

**--system-prompt** _text_
> Optional system message inserted at the start of the conversation (for models that honor one).

**-q**, **--quick** _message_
> Send one user message, print the streamed reply, exit. Without **-q**, reads lines from the terminal (**> ** prompt) until EOF.

**--stats**
> After each reply, print time to first token (ms) and tokens per second. Enables **stream_options.include_usage** on the request.

# DESCRIPTION

**vllm chat** is the **vllm** subcommand that talks to an already running OpenAI-compatible HTTP server (**vllm serve**). It uses the official OpenAI Python client: **chat.completions.create** with **stream=True**. Reasoning deltas print inside **<think>** ... **</think>** when the server sends them.

It does not load weights. Start **vllm serve** first, then **vllm chat**. **vllm complete** is the matching non-chat completions client.

# CAVEATS

Subcommand of **vllm**. Requires a reachable **/v1** server; connection errors mean **serve** is not listening on **--url**. **--api-key** on this client only authenticates the OpenAI routes the CLI calls. On **serve**, **--api-key** still does not cover every HTTP path (see **vllm**). Interactive mode keeps the full transcript in memory for follow-ups. Default URL assumes port **8000**.

# INSTALL

```nix: nix profile install nixpkgs#vllm```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [huggingface-cli](/man/huggingface-cli)(1)

# RESOURCES

```[Source code](https://github.com/vllm-project/vllm)```

```[Homepage](https://vllm.ai)```

```[Documentation](https://docs.vllm.ai)```

<!-- verified: 2026-09-28 -->
