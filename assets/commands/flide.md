# TAGLINE

Inference engine for decision models

# TLDR

**Serve a model** on port 8000

```flide serve --model [organization/model]```

Serve **on the local machine only**

```flide serve --model [organization/model] --host 127.0.0.1 --port [8000]```

Keep earlier request states in a **session cache**

```flide serve --model [organization/model] --session-cache-gb [40]```

Get **identical results** at any load

```flide serve --model [organization/model] --batch-invariant```

Answer a **file of requests** offline

```flide run --model [organization/model] --rows [requests.jsonl] --out [path/to/output]```

**Verify** exact forking and load invariance on your own requests

```flide verify --model [organization/model] --requests [requests.jsonl]```

**List** installed model families

```flide formats```

# SYNOPSIS

**flide** **serve** **--model** _model_ [_options_]

**flide** **run** **--model** _model_ **--rows** _file_... **--out** _dir_ [_options_]

**flide** **verify** **--model** _model_ **--requests** _file_ [_options_]

**flide** **kernels** _subcommand_ [_arguments_]

**flide** **formats**

# COMMANDS

**serve**
> Load a checkpoint and start the System One API server.

**run**
> Answer a file of requests offline, without a server.

**verify**
> Check exact forking, load invariance and the session cache on your own requests. Exits with status 1 if any check fails.

**kernels export** **--model** _model_ **--out** _file_
> Warm models in a fresh cache and pack the compiled kernels. Also accepts **--sessions**, **--no-weights**, **--quantize**, **--format**, **--device** and **--dtype**.

**kernels seed** _bundle_
> File a bundle's kernels into this machine's kernel cache.

**kernels merge** _out_ _bundles_...
> Unite bundles made with the same Triton on the same GPU.

**kernels info** _bundle_
> Show what a bundle holds.

**formats**
> List installed model families.

# COMMON PARAMETERS

**--model** _M_
> Hugging Face repository id, downloaded on first use, or a local directory. Required.

**--format** _F_
> Model family. Default: detected from the checkpoint.

**--format-arg** _KEY=VALUE_
> An option for the model family. Repeatable.

**--device** _D_
> GPU to run on. Default: **cuda:0**.

**--batch-invariant**
> Give a request the same bits whatever it is batched with, at some cost in speed.

**--quantize** _fp8_
> Store Qwen3.5 decoder weights in FP8. Requires compute capability 8.9 or newer (not available for **verify**).

# SERVE PARAMETERS

**--name** _N_
> Model name reported by the API. Default: taken from **--model**.

**--calibration** _FILE_
> Calibration file. Default: the one next to the weights.

**--dtype** _T_
> Dtype for weights and activations. Default: **bfloat16**.

**--media-root** _DIR_
> Directory that local media paths resolve against. Without it, only base64 media is accepted.

**--allow-media-urls**
> Fetch media that requests give as http(s) URLs.

**--max-media-mb** _N_
> Largest image or video per request, in MiB after decoding. Default: **64**.

**--max-branch-tokens** _N_
> Maximum length of state plus question, in tokens. Default: **32768**.

**--max-request-tokens** _N_
> Maximum total request length, in tokens. Default: **65536**.

**--session-cache-gb** _G_
> GPU memory for the states of earlier requests, so that a request extending one resumes from it. Default: **0**.

**--session-min-tokens** _N_
> Shortest state the session cache stores. Default: **2048**.

**--no-cuda-graphs**
> Run every request eagerly.

**--planners** _N_
> CPU threads that render and tokenize requests. Default: **4**.

**--frontends** _N_
> HTTP front-end processes, each with its own planners. **0** serves from the GPU process. Default: **0**.

**--batch-window-ms** _MS_
> Wait this long after the first request for more to join its GPU round. Default: **0**.

**--gather-ms** _MS_
> Wait up to this long for requests still being planned to join a round. Default: **2**.

**--host** _H_
> Interface to listen on. Default: **0.0.0.0**.

**--port** _P_
> Port to listen on. Default: **8000**.

**--access-log**
> Log every request.

# RUN PARAMETERS

**--rows** _FILE_...
> One or more JSON lines input files, optionally gzip compressed. Required.

**--out** _DIR_
> Directory where results are written. Required.

**--plan-arg** _KEY=VALUE_
> An option applied to every request.

**--name** _N_
> Model name written into each response. Default: **flide**.

**--every** _N_
> Keep every n-th row. Default: **1**.

**--limit** _N_
> Stop after N rows.

**--budget** _N_
> Tokens per micro-batch. Default: **65536**.

**--workers** _N_
> Processes that render and tokenize requests. Default: CPU count minus 2.

**--dtype** _T_
> Dtype for weights and activations. Default: **bfloat16**.

**--warmup** _N_
> Micro-batches run once before the timed forward. Default: **0**.

**--stream-block** _N_
> Rows per GPU block while planning continues. **0** plans everything first. Default: **20000**.

# VERIFY PARAMETERS

**--requests** _FILE_
> JSON lines file with one request per line. Required.

**--limit** _N_
> Number of requests to read. Default: **32**.

**--session-cache-gb** _G_
> Also check the session cache at this size.

# DESCRIPTION

**Flide** is an inference engine for Jev-style decision models. Instead of generating free text, these models answer a set of questions about a shared state, and each answer comes with the probability of every option. Flide computes the state once and forks it exactly for each question, which avoids repeating that work per question.

**flide serve** exposes the **POST /v1/systemone** endpoint, which takes a **state**, a **questions** object and optional **media**. **flide run** takes the same requests as JSON lines and writes **results.jsonl**, **timing.json** and **environment.json** to the output directory.

**flide verify** compares each question against the same question asked alone, compares requests alone against the same requests batched under load, and with **--session-cache-gb** compares answers with the session cache on and off.

# CAVEATS

Flide runs on Linux with an NVIDIA GPU, Python 3.10 or newer and PyTorch 2.12 or newer. PyPI's PyTorch is built for CUDA 13, so a machine whose driver supports only CUDA 12 needs the CUDA 12.6 PyTorch build installed first. **torchvision** is needed only for images and video.

**flide serve** listens on all interfaces by default. **--allow-media-urls** lets requests make the server fetch any address it can reach, so avoid it on exposed servers.

On GPUs without precompiled kernels, the first server start compiles them once.

# HISTORY

Flide was first released on **PyPI** as version **0.1.0** in **October 2026** by **OmniJev**, under the Apache-2.0 license.

# SEE ALSO

[vllm](/man/vllm)(1), [ollama](/man/ollama)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/OmniJev/Flide)```

```[Homepage](https://flide.org)```

```[Documentation](https://docs.flide.org)```

<!-- verified: 2026-11-09 -->
