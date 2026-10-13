# TAGLINE

Serve a Janas-LLM model over an OpenAI-compatible HTTP API

# TLDR

**Listen** on 127.0.0.1:8080 with a catalog model

```janas-server [qwen3-4b]```

Serve a **.jns** file

```janas-server [models/qwen3-next.jns]```

Open the listener to the **network**

```janas-server [qwen3-4b] --host [0.0.0.0] --port [8080]```

Require an **API key**

```janas-server [qwen3-4b] --api-key [secret]```

Serve the built-in **test chat** at `/test`

```janas-server [qwen3-4b] --test```

Load an **embedding** model beside the chat model

```janas-server [qwen3-4b] --embedding-model [qwen3-embedding-0.6b.jns]```

Turn default **reasoning** off (helps Open WebUI titles)

```janas-server [qwen3-4b] --think [off]```

Send a **chat** request

```curl http://127.0.0.1:8080/v1/chat/completions -H "Content-Type: application/json" -d '{"messages":[{"role":"user","content":"[Hello]"}]}'```

# SYNOPSIS

**janas-server** _model.jns_ [_options_]

# DESCRIPTION

**janas-server** puts a **Janas-LLM** model behind an HTTP API that follows OpenAI's, on `http://127.0.0.1:8080/v1` by default, so SDKs, chat front ends, and editors written for that API can use a model running on this machine.

_model_ is a `.jns` file (or a catalog name resolved the same way as **janas-chat**). It takes the model options the chat takes (**--ctx**, **--cache**, **--reserve**, **--mtp**, **--draft**, **--mode**, **--no-gpu**) plus listen, auth, FIM, and store flags.

Routes that answer:

- `GET /v1/models` and `GET /v1/models/{model}`
- `POST /v1/chat/completions` (tools, JSON output, log-probabilities, streaming)
- stored completions under `/v1/chat/completions/{id}`
- `POST /v1/completions` (raw continuation, including a `suffix` for fill-in-the-middle)
- `POST /infill` (llama.cpp's route, which llama.vscode asks)
- `POST /v1/responses` and `/v1/conversations`
- `POST /v1/embeddings` when **--embedding-model** is set
- `POST /v1/moderations` (asked of the chat model)
- `GET /health` (`{"status":"ok"}`)

Every other OpenAI operation answers **501**. Default bind is loopback. **--api-key** (or **JANAS_API_KEY**) requires `Authorization: Bearer KEY`. **--test** serves *Janas-Chat Web* at `/test`, a page inside the program that talks only to this server.

A client that resends the same messages plus a new one pays for the new tokens alone; `usage.prompt_tokens_details.cached_tokens` says how much was already computed. Conversations kept in memory (**--keep**) and on disk (**--keep-disk**, **--store**) outlive a single request. Tools of type `mcp` in `/v1/responses` make the server reach the MCP server the request names; **--no-mcp** turns that off.

# PARAMETERS

_model.jns_
> Chat model to load.

**--host** _ADDR_
> Listen address (default **127.0.0.1**; **0.0.0.0** opens it to the network).

**--port** _N_
> Port (default **8080**).

**--api-key** _KEY_
> Require this bearer key (**JANAS_API_KEY** sets it too).

**--name** _ID_
> Model id for clients (default: the file's name without `.jns`).

**--ctx** _N_
> Context in tokens (default **16384**).

**--cache** _GiB_, **--reserve** _GiB_
> Expert-cache size, and memory left to other programs when the cache is automatic.

**--mtp** _FILE_, **--no-mtp**, **--draft** _FILE_
> Prediction file, none, or a small draft model of the same family.

**--mode** _auto_|_eco_|_max_
> Power mode (default **auto**).

**--no-gpu**
> Never give the GPU work.

**--embedding-model** _FILE_
> Second model for `/v1/embeddings` (for example Qwen3-Embedding-0.6B).

**--think** _on_|_off_
> Reasoning when a request does not say (default: the model's own).

**--keep** _N_
> Extra conversations kept computed besides the one in use (default **8**; **0**: none).

**--keep-memory** _GiB_, **--keep-disk** _GiB_
> Memory and disk for those conversations (disk default **8** GiB under `~/.cache/janas`).

**--store** _DIR_
> Where stored completions, responses, and conversations live (default `~/.local/share/janas/server`).

**--no-store**
> Keep them in memory only until the process stops.

**--queue** _N_
> Requests allowed to wait (default **16**).

**--max-body** _MiB_
> Largest request body (default **32**).

**--connections** _N_
> Open connections at most (default **64**).

**--max-input** _N_
> Longest input in tokens; longer requests get HTTP 400. Nothing is cut to fit.

**--warn-input** _N_
> Longer inputs are taken and logged on stderr.

**--fim-prefix** _N_, **--fim-suffix** _N_, **--fim-max** _N_
> Fill-in-the-middle window for editor completions (defaults **2048** tokens before the cursor, **8** lines after, **256** tokens written).

**--metrics** _FILE_
> JSON lines of what every reply costs (never the text).

**--progress** _S_
> A line on stderr every _S_ seconds while a long prompt is read.

**--no-mcp**
> Refuse tools of type `mcp` in `/v1/responses`.

**--test**
> Serve the built-in chat page at `/test`.

**--verbose**
> One line per request on stderr.

# CAVEATS

Default listen is loopback; do not bind **0.0.0.0** without **--api-key**. **--no-mcp** is the switch that stops a reachable server from opening outbound MCP connections a request names. OpenAI's `max_completion_tokens` counts reasoning; the older `max_tokens` of a chat is taken for the answer alone. Models with a recurrent state (Qwen3-Next, Qwen3.5, Qwen3.6) re-read a conversation from the start when earlier turns differ. The process is experimental, x86-64 Linux or Windows, and hard on RAM and disk like the rest of Janas.

# HISTORY

**janas-server** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). It is the only Janas program that compiles in GNU libmicrohttpd and yyjson.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-mcp](/man/janas-mcp)(1), [janas-get](/man/janas-get)(1), [janus](/man/janus)(1), [ollama](/man/ollama)(1), [vllm](/man/vllm)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/serving.md)```

<!-- verified: 2026-10-13 -->
