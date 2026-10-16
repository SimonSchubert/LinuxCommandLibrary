# TAGLINE

One-shot local LLM generation from a NInfer artifact

# TLDR

Generate from a **prompt** (answer on stdout)

```ninfer [model.ninfer] --prompt "[Summarize prefill versus decode.]"```

Load **chat messages** from JSON (text, images, or video)

```ninfer [model.ninfer] --messages [messages.json] --vision```

Split a dense model across **two GPUs**

```ninfer [model.ninfer] --tp 2 --devices [0,1] --prompt "[What is 17*23?]"```

Enable **MTP** speculative decoding

```ninfer [model.ninfer] --prompt "[Explain speculative decoding.]" --spec mtp --draft-tokens [3] --lm-head-draft```

Cap **context** and output length

```ninfer [model.ninfer] --prompt "[Hello]" --max-context [32768] --max-new [512] --kv-dtype fp8```

**Greedy** (argmax) decoding

```ninfer [model.ninfer] --prompt "[Hello]" --greedy```

Print **usage**

```ninfer --help```

# SYNOPSIS

**ninfer** _model.ninfer_ (**--prompt** _text_ | **--messages** _file_) [_options_]

**ninfer** {**-h**|**--help**}

# DESCRIPTION

**ninfer** is the command-line generator of **NInfer** (the **capy-flash** tree, a two-GPU CUDA fork of Neroued/ninfer). It loads one v3 `.ninfer` artifact, runs a single request, streams answer text to stdout, and writes reasoning plus a timing and memory report to stderr.

Exactly one of **--prompt** or **--messages** is required. **--messages** is a JSON array of chat turns, or an object with `messages` and optional `tools`. Content parts may be text, `image`/`image_url`, or `video`/`video_url` (local path, HTTP(S) URL, or base64 data URI). **--vision** must be set before media is accepted; Vision weights stay unloaded otherwise.

GPU layout is frozen at startup. **--tp 2 --devices** _A,B_ splits a dense model across two GPUs of the same compute capability (rank 0 on _A_). Speculative decoding is off unless **--spec** selects **mtp**, **dflash**, or **dflash2**. The CLI does not keep a cross-request context cache: one invocation owns one request.

Requires Linux, CUDA 13.1, and NVIDIA GPUs. The measured capy-flash builds target two sm_120 (RTX 50-series) boards. Apache License 2.0.

# PARAMETERS

**--prompt** _text_
> Single user prompt. Mutually exclusive with **--messages**.

**--messages** _file_
> JSON messages (and optional tools). Mutually exclusive with **--prompt**.

**--max-context** _N_
> Logical context ceiling in tokens (default **2048**).

**--max-new** _N_
> Output-token budget, including inserted thinking-control tokens (default **128**).

**--kv-capacity** _N_|**auto**
> Shared Main Text KV pool. Omitted, it follows **--max-context**. **auto** sizes from remaining GPU memory.

**--vram-headroom-mib** _N_
> MiB left free when **--kv-capacity auto** sizes the pool (default **1024**). Requires **auto**.

**--prefill-chunk** _N_
> Prefill chunk size, a multiple of 128 (default **1024**).

**--device** _N_
> CUDA device (default **0**). With **--tp 2** it must be rank 0.

**--tp** **1**|**2**
> Tensor-parallel width (default **1**).

**--devices** _A,B_
> One CUDA id per rank, rank 0 first. Required with **--tp 2**.

**--kv-dtype** **bf16**|**int8**|**fp8**|**nvfp4**|**k8v4**
> KV-cache storage (default **bf16**). Tensor parallel accepts **bf16**, **int8**, or **nvfp4**.

**--spec** **mtp**|**dflash**|**dflash2**
> Speculative backend. Off when omitted. MTP draft count is **1..5**; DFlash/DFlash2 is **1..15**.

**--draft-tokens** _N_
> Draft positions for **--spec**.

**--lm-head-draft**
> Load the optimized proposal head. Requires a selected **--spec**.

**--vision**
> Enable image and video input and allocate Vision GPU memory.

**--vision-device** _N_
> GPU that holds the Vision tower (default: rank 0). Must be one of **--devices** at **--tp 2**.

**--max-vision-tokens** _N_
> Cap merged Vision tokens per image or video item (**64..16384**, default **16384**).

**--chat-template** _file_
> Local Jinja template instead of the one stored in the artifact.

**--no-thinking**
> Disable thinking mode.

**--thinking-budget** _N_
> Cap model-origin thinking tokens. Cannot combine with **--no-thinking**.

**--reasoning-effort** **none**|**minimal**|**low**|**medium**|**high**|**xhigh**|**max**
> Effort value passed to the chat template.

**--greedy**
> Force temperature 0 (argmax).

**--temperature** _F_ / **--top-p** _F_ / **--top-k** _N_ / **--min-p** _F_
> Sampling overrides. **--top-k** is **0..20**. Unset fields use the loaded model's thinking or non-thinking preset.

**--presence-penalty** _F_ / **--frequency-penalty** _F_ / **--seed** _N_
> Penalty and seed overrides.

**--stop-token-id** _N_ / **--stop** _text_ / **--reasoning-stop** _text_
> Repeatable stop conditions on content or reasoning.

**--raw-output**
> Emit the frontend's raw output stream.

**--print-token-ids**
> Include generated token ids in the stderr report.

**--no-cuda-graph**
> Disable CUDA Graph decode.

**--no-tp-mailbox**
> Keep **--tp 2** all-reduces on cross-device copies instead of the pinned host mailbox.

**--embedding-host**
> Keep one copy of the token embedding table in pinned host memory for every GPU to read.

**--log-level** **trace**|**debug**|**info**|**warning**|**error**|**critical**|**off**
> stderr verbosity (default **info**).

# CONFIGURATION

**NINFER_CUDA_SYNC**
> CUDA wait policy at startup for **ninfer** and **ninfer-serve**: **spin** (default), **blocking**, **yield**, or **auto**. Unrecognized values fail startup.

# CAVEATS

The first argument is a `.ninfer` artifact, not a Hugging Face id or GGUF file. Convert or download a NInfer checkpoint first (capy-flash `install.sh` and `hf download` cover the measured models). **--tp 2** needs two GPUs of the same compute capability; **fp8** and **k8v4** KV are rejected in that mode. Media requests without **--vision** fail. Prefill chunk must be a multiple of 128. One process runs one request; for an HTTP server use **ninfer-serve**.

# HISTORY

**NInfer** is a CUDA inference engine for Qwen3.8 NVFP4 artifacts. **capy-flash** is the two-GPU tensor-parallel fork of Neroued/ninfer, renamed from **ninfer-tp2** at v0.5.0. Status **v0.5.4** (2026-10-16). Apache License 2.0. Not affiliated with Qwen or NVIDIA.

# SEE ALSO

[ninfer-serve](/man/ninfer-serve)(1), [ninfer-perplexity](/man/ninfer-perplexity)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [ollama](/man/ollama)(1), [vllm](/man/vllm)(1), [janus](/man/janus)(1), [koboldcpp](/man/koboldcpp)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/ValerioDolci/capy-flash)```

```[Documentation](https://github.com/ValerioDolci/capy-flash/blob/main/docs/cli.md)```

<!-- verified: 2026-10-17 -->
