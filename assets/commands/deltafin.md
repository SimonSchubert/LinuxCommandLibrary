# TAGLINE

Run full Kimi K3 locally from a single native binary

# TLDR

Download the **full 1.7 TB expert corpus** (fastest inference)

```deltafin setup --full```

Install the resident spine and **stream experts on demand** (~215 GB to start)

```deltafin setup --stream```

**Chat** with K3's audited chat template

```deltafin run --chat --prompt "[What are the three largest moons of Saturn?]"```

Raw **completion** with a generated-token cap

```deltafin run --prompt "[The capital of France is]" --max-new [17]```

Print **throughput and transaction stats** while generating

```deltafin run --prompt "[The largest planet in our solar system is]" --max-new [17] --stats```

Start an **OpenAI-compatible** local server

```deltafin serve --host [127.0.0.1] --port [8000]```

**Audit** the host, binary, and providers without opening model data

```deltafin doctor --runtime-only```

**Rebuild** the binary and fetch runtime updates (leaves models and caches alone)

```deltafin upgrade```

Install the optional **Qwen draft models** for faster raw completions

```deltafin setup-qwen```

# SYNOPSIS

**deltafin** [**run**] [_options_]

**deltafin** **serve** [_options_]

**deltafin** **setup** [**--full** | **--stream**] [_options_]

**deltafin** **doctor** [**--runtime-only** | **--model-root** _path_]

**deltafin** **upgrade**

**deltafin** **benchmark** [_options_]

**deltafin** **setup-dspark** | **setup-k3** | **setup-qwen** [_options_]

**deltafin** **fetch-weights** | **warm-expert-cache** | **pack-spine** | **convert-spine-int8** | **convert-experts-scale4** [_options_]

# PARAMETERS

**run** (default)
> Generate text. Omitting a subcommand is the same as **run**. Default prompt is **The capital of France is**.

**--prompt** _text_
> Text to continue (raw completion) or the user message (with **--chat**).

**--chat**
> Apply K3's audited chat template and stop at the model's end marker. Raw completion has no chat end boundary and should normally use **--max-new**.

**--max-new** _n_
> Stop after at most _n_ generated tokens. Does not alter the prompt or context.

**--reasoning-effort** {**low**|**high**|**max**}
> Chat thinking depth. Falls back to **K3_REASONING_EFFORT**. Template default is **max**.

**--stats**
> Print a live cumulative throughput line per token instead of streaming generated text.

**--layer-profile**
> Print a per-layer, per-chunk phase breakdown (~93 lines per token). Independent of **--stats**.

**--device** _device_
> **auto**, **cpu**, **mps**, **cuda**, or **cuda:**_N_. Falls back to **K3_DEV**.

**--expert-backend** _name_
> Routed-expert backend: **auto**, **cpu**, **metal**, or **cuda**. Falls back to **K3_MOE**.

**--spine** {**auto**|**int8**|**bf16**}
> Resident spine format. **auto** and **int8** use the quantized row-int8 default; **bf16** keeps the original weights. Falls back to **K3_SPINE**.

**--model-root** _path_
> Install and model root (default: current directory, or **DELTAFIN_ROOT** for setup/doctor).

**--router-trace** _path_
> Append native expert-route JSONL (relative to the model root).

**serve**
> OpenAI-compatible HTTP server implementing **/v1/chat/completions**, **/v1/completions**, and **/v1/models**, including SSE streaming.

**--host** _address_
> Listen address (default **127.0.0.1**).

**--port** _n_
> Listen port (default **8000**).

**--max-tokens** _n_
> Per-response ceiling (default **1000000**).

**--queue** _n_
> Concurrent requests allowed to wait for the single generation slot (default **0** = immediate 429; max **64**). Falls back to **K3_SERVER_QUEUE**.

**--max-request-bytes** _n_
> Bounded JSON request size (default **134217728**, max **1073741824**).

**setup**
> One-shot install of K3 weights and the DSpark draft checkpoint. With neither **--full** nor **--stream**, chooses full when disk allows, else stream.

**--full**
> Require the complete local expert pool (fastest inference; about **1.7 TB**).

**--stream**
> Install the resident spine; fetch exact experts on demand (about **215 GB** to start). Mutually exclusive with **--full**.

**--include-qwen**
> Also install the optional Qwen 0.6B/1.7B proposal-only models used for raw completions.

**--dry-run**
> Plan exact downloads and peak disk use without network or writes. Mutually exclusive with **--check**.

**--check**
> Audit that the capacity-selected installation is complete, without network access.

**--workers** _n_
> Parallel HTTPS transfers (default **8**, maximum **16**).

**setup-qwen**
> Install (or **--check**) the optional Qwen draft models used only for raw **/v1/completions** and **run --prompt**.

**setup-dspark**
> Install or verify Inferact's Kimi-K3-DSpark checkpoint. **--check** is network-free; **--audit-only** inspects pinned remote metadata without the tensor payload.

**setup-k3**
> Requires exactly one of **--meta-only** (pinned inert K3 metadata) or **--check**.

**doctor**
> Read-only installation audit. **--runtime-only** validates the host, compiled executable, provider ABI, and native canaries without opening model data.

**upgrade**
> Fetch runtime updates and rebuild the binary. Leaves models, converted weights, and caches alone. Accepts no arguments. Reuses the recorded build profile (CPU vs CUDA); it ignores build environment variables.

**benchmark**
> Interleaved A/B runs with optional token-id or text oracles. Default **--max-new** is **4**, **--reps** is **3**, timeout is **3600** seconds.

**fetch-weights**
> Download selected tensors. **--spine-only** and **--experts-only** are mutually exclusive; **--layers** _1-40,45,92_ selects routed expert layers.

**warm-expert-cache**
> Rank and optionally fetch missing experts from router traces. **--convert-npz** losslessly migrates legacy six-member NPZ experts to raw **.bin**.

**pack-spine** / **convert-spine-int8** / **convert-experts-scale4**
> Pack the resident spine into contiguous DFSP files, convert the spine to row-int8 (quantized, not weight-exact), or build lossless scale4 expert sidecars.

**-h**, **--help**
> Print the full help document.

**-V**, **--version**
> Print the binary version.

# DESCRIPTION

**deltafin** is a single native Rust binary that runs Moonshot AI's **Kimi K3**, a 2.8-trillion-parameter mixture-of-experts model, on one consumer machine. It keeps all 16 routed experts and uses K3 itself as the sole authority for every token. Small draft models (DSpark for chat, optional Qwen for raw completion) may guess ahead; K3 verifies every guess before text is emitted.

The runtime is in-process: Rust core, C-ABI providers, native tokenization, and expert streaming from disk. It does not prune, requantize the expert bank to a few bits, or skip experts. Setup downloads pinned K3 weights (full local corpus or on-demand streaming), the DSpark checkpoint (~6.6 GiB on disk), and optionally Qwen (~4.3 GiB). Converted resident storage defaults to a row-int8 spine. The original BF16 checkpoint stays on disk as the conversion source and verification authority, and is used for inference only with **--spine bf16**.

**serve** exposes a deliberately small, strictly checked subset of the OpenAI API: text-only, one generation at a time, always greedy and reproducible. Fields it cannot honor exactly are refused with an OpenAI-shaped error rather than silently ignored. Point a client at **http://127.0.0.1:8000/v1** with any non-empty local API key the client requires. The advertised model name is **deltafin-kimi-k3**.

Deltafin ships as a Git source tree, not crates.io packages. Build with **cargo build --locked --release**; the binary lands at **target/release/deltafin**. The default model root is the current working directory.

# CONFIGURATION

Normal operation needs no environment overrides. Flags win over environment values.

**--device** / **K3_DEV**
> **auto**, **mps**, **cuda**, **cuda:**_N_, or **cpu**. Capability-gated auto selection.

**--expert-backend** / **K3_MOE**
> **auto**, **metal**, **cuda**, or **cpu**.

**--spine** / **K3_SPINE**
> **auto** and **int8** select the quantized row-int8 default (not weight-exact). **bf16** keeps the original weights. If the int8 spine is missing, **auto** fails rather than silently substituting BF16.

**K3_DSPARK**
> **auto**, **off**, or force-qualified **on**. K3 verification is never bypassed.

**K3_DSPARK_MAX_CONTEXT**
> Bounded auxiliary draft-state context (default **8192**); full K3 continues above it.

**K3_UAG_DRAFT**
> Optional Qwen raw-completion policy: **auto**, **off**, or **on**.

**--reasoning-effort** / **K3_REASONING_EFFORT**
> Chat thinking depth: **low**, **high**, or **max**. On the server, the per-request **reasoning_effort** field overrides it.

**K3_TRACE** / **K3_TRACE_PATH**
> Native router trace mode and path; CLI **--router-trace** flags are preferred.

**K3_EXPERT_SCALE4**
> **auto**, **off**, or **require** for complete lossless scale4 sidecars.

**K3_PILOT_GATE**
> Adaptive admission for speculative expert reads: **on**, **measure**, or **off** (default).

**K3_EXPERT_PIN_GB**
> Decimal GB budget for a permanent learned-expert RAM tier on CPU/Metal (**0** keeps it off).

**K3_SERVER_QUEUE**
> Fallback for **serve --queue** when the flag is omitted.

**DELTAFIN_ROOT**
> Default install/model root for **setup** and **doctor** when **--model-root** is omitted.

**DELTAFIN_TORCH_ROOT** / **LIBTORCH**
> Absolute path to a CUDA-enabled LibTorch tree. Used only when building NVIDIA/CUDA (or ROCm) binaries; **upgrade** ignores these and rebuilds with the recorded profile.

The quality guard rejects fewer than 16 experts, non-fp32 target activations, and approximation switches.

# CAVEATS

Full K3 is extreme on home hardware. A complete expert corpus is about **1.7 TB**; streaming still needs about **215 GB** plus growing on-disk expert cache. Decode on an M1 Max laptop is on the order of **0.3 token/s**; even a four-SSD Apple Silicon setup is around **1 token/s**. Prefill (time to first token) can be minutes. Long chats are much slower than short completions.

Supported hosts are **macOS 14+ on Apple Silicon** and **Linux with glibc 2.28+** on x86-64 or aarch64. Windows is not supported. macOS needs full Xcode plus the Metal toolchain (**xcodebuild -downloadComponent MetalToolchain**); Command Line Tools are not enough. CUDA builds require a user-supplied CUDA LibTorch tree and NVCC; the pinned CPU runtime is not CUDA-capable. ROCm/HIP expert kernels exist but have no hardware evidence; default AMD expert path is CPU MXFP4.

**serve** has no authentication. Keep it on loopback unless you add your own network boundary. It is greedy-only and single-generation. **upgrade** refuses unexpected git state and will not switch CPU/CUDA/HIP configuration by itself. **convert-spine-int8** is quantized and not weight-exact. Model weights, DSpark, and Qwen retain their upstream licenses; only Deltafin's tracked project code is MIT.

# HISTORY

**deltafin** is an independent MIT-licensed project under the **gavamedia** GitHub organization, first published in **July 2026**. It began as a Python prototype and was rewritten as a Python-free native Rust runtime so full Kimi K3 could run on a single device without pruning the expert bank. Kimi K3 itself is released by **Moonshot AI**; Deltafin is not affiliated with Moonshot. Community Linux/CUDA work landed via pull request, and later forks (including ARGODRIVE streaming layouts) reuse the same CLI.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [llama-cli](/man/llama-cli)(1), [llamafile](/man/llamafile)(1), [vllm](/man/vllm)(1), [kimi](/man/kimi)(1)

# RESOURCES

```[Source code](https://github.com/gavamedia/deltafin)```

```[Documentation](https://github.com/gavamedia/deltafin/tree/main/docs)```

<!-- verified: 2026-09-09 -->
