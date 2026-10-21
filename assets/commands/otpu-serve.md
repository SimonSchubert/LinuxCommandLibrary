# TAGLINE

OpenAI-style HTTP API server for one model on the openTPU card or simulator

# TLDR

Serve **Qwen3-0.6B** on the FPGA card

```otpu-serve --model qwen3 --backend board```

Listen on a **different port**

```otpu-serve --model lfm2 --backend board --port [8001]```

Keep saved contexts in **host RAM and on disk**

```otpu-serve --model qwen3 --backend board --kv-ram-gb [8] --kv-disk-gb [32] --kv-dir [/data/kv]```

Require an **API key**

```otpu-serve --model qwen3 --backend board --api-key [secret]```

Run on the **ISA simulator** (no card)

```otpu-serve --model qwen3 --backend isa```

Enable **Qwen3 thinking** by default

```otpu-serve --model qwen3 --backend board --think --reasoning-parser qwen3```

Serve a **streamed MoE** from an expert pool

```otpu-serve --model qwen35-35b --backend board --pool [/path/to/pool]```

# SYNOPSIS

**otpu-serve** [**--model** _name_] [**--backend** _isa_|_board_|_board-sim_] [**--host** _addr_] [**--port** _N_] [_options_]

# DESCRIPTION

**otpu-serve** is the OpenAI-compatible HTTP server of **openTPU**. It loads one model and serves it to any number of clients over the standard library's HTTP server (no extra dependency beyond the chat stack). After `pip install -e .` in the FeSens/openTPU tree it is installed as a console script.

The default bind is **http://127.0.0.1:8000/v1**. Routes include **POST /v1/chat/completions**, **POST /v1/completions**, SGLang's **POST /generate**, **GET /v1/models**, **GET /v1/stats**, **GET /health**, and **POST /flush_cache**. Chat templates match **otpu-chat**. Sampling defaults come from the checkpoint's `generation_config.json` or the model family; a request's fields override them. A top-k above 64 is capped at 64, the most the card's sampler takes.

Models whose image holds several sequences (Qwen3 and the Llama-likes) decode clients together in KV slots (**--slots**, default **8**). Other models run requests in turns (**--max-running**, **--quantum**). Contexts stay on the card while they run, then in a KV store of host RAM (**--kv-ram-gb**, default **4**) and optional disk (**--kv-disk-gb**, **--kv-dir**). A prompt that continues a saved context feeds only the rest.

**--backend isa** runs on the Python ISA simulator. **board** talks to an Inspur YPCB-00338 Kintex-7 card through XDMA (**--dev**, default `/dev/xdma0`). **board-sim** uses the Verilator board model.

A model with a vision side (MiniCPM-V) accepts image URL parts in chat completions (data URLs by default; **--image-fetch** also fetches http(s)). **--api-key** or the OTPU API KEY environment variable requires `Authorization: Bearer`. Tools, logprobs, and images on a model without a vision side are not supported.

# PARAMETERS

**--model** _name_
> Short name from the repository's `models/` directory, or a checkpoint directory (default **qwen3**). Known short names include **qwen3**, **lfm2**, **qwen35**, **lfm2-2.6b**, **smollm3**, **phi4-mini**, **qwen35-2b**, **qwen35-4b**, **gemma4**, **gemma4-e4b**, **lfm2-8b**, **qwen35-35b**, **gemma4-26b**, **minicpmv-35b**.

**--backend** _isa_|_board_|_board-sim_
> Where to run (default **isa**).

**--dev** _path_
> XDMA device prefix for **--backend board** (default `/dev/xdma0`).

**--host** _addr_
> Bind address (default **127.0.0.1**).

**--port** _N_
> TCP port (default **8000**).

**--cap** _N_
> Maximum context length in tokens (default **2048**).

**--served-model-name** _name_
> Model id reported in the API (default: the checkpoint directory's name).

**--wformat** _auto_|_int8_|_fp4_|_int4_|_nvfp4_|_mix_
> Weight format of the layers (default **auto**).

**--head-format** _int8_|_fp4_|_int4_|_nvfp4_
> Weight format of the LM head (default: same as **--wformat**).

**--slots** _N_
> KV slots for batched decode on Qwen3 and Llama-likes (default **8**). Other models ignore this and run one sequence.

**--max-running** _N_
> Without slots: how many requests run in turns at once (default **8**); the rest queue.

**--chunked-prefill-size** _N_
> Batched slots: prompt tokens fed per iteration between decode steps (default **64**).

**--mixed**
> Batched slots: feed a waiting prompt in spare matrix-unit rows of a decode step.

**--quantum** _N_
> Tokens a request decodes per turn while others wait (default **32**).

**--max-queue** _N_
> Maximum queued requests (default **256**).

**--kv-ram-gb** _N_
> Host RAM for saved contexts (default **4**).

**--kv-disk-gb** _N_
> Disk for saved contexts past the RAM (default **0**, none).

**--kv-dir** _path_
> Directory for the disk tier, kept across restarts (default `~/otpu-build/kvcache`).

**--think**
> Enable thinking mode by default. A request's enable-thinking chat-template flag overrides it.

**--reasoning-parser** _qwen3_
> Move a reply's think tags into the reasoning content field (also while streaming).

**--api-key** _key_
> Require `Authorization: Bearer` (default: the OTPU API KEY environment variable).

**--pool** _file_
> Expert-pool file for a streamed mixture-of-experts model.

**--mtp**
> Decode every request with Qwen3.5's multi-token prediction drafter on the device.

**--mtp-from** _dir_
> With **--mtp**: checkpoint of the MTP drafter when the model has none.

**--max-slices** _N_
> MiniCPM-V: default extra image slices besides the thumbnail (processor default **9**, at most **36**).

**--image-fetch**
> Fetch http(s) image URLs (default: data URLs only). A request never opens a local file.

**--warm-cap** _SEC_
> Streamed MoE: `/health` returns 503 `warming` while the expert pool is read into the page cache, for at most this many seconds (default **300**; **0** never).

# CAVEATS

Install from the openTPU tree (`pip install -e .`); the scripts are not a separate PyPI distribution. Tokenizers and checkpoints need **transformers** and a Hugging Face download into `models/<name>`. **--backend board** needs the XDMA driver, a loaded bitstream, and typically **otpu-setup**. The process holds the device lock while it runs. Tools and logprobs are not implemented. OpenAI presence and frequency penalty fields are ignored. **--mtp** only accepts sampling the device loop supports (greedy, top-k 1–64, repetition penalty ≥ 1). A streamed MoE's `/health` may report 503 while the pool warms; requests are still served, with misses from disk.

# HISTORY

**otpu-serve** is part of the **openTPU** host tools (Apache-2.0, FeSens). It grew after **otpu-chat** so several clients can share one card: prefix-cached contexts, a RAM/disk KV store, continuous batching on models whose image holds several sequences, and an OpenAI-compatible HTTP API described in `docs/serve.md`.

# SEE ALSO

[otpu-chat](/man/otpu-chat)(1), [otpu-smi](/man/otpu-smi)(1), [otpu-lock](/man/otpu-lock)(1), [vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/docs/serve.md)```

<!-- verified: 2026-10-21 -->
