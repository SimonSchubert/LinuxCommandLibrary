# TAGLINE

High-throughput LLM inference engine and OpenAI-compatible API server

# TLDR

**Start** an OpenAI-compatible server for a Hugging Face model

```vllm serve [Qwen/Qwen2.5-1.5B-Instruct]```

Listen on a **custom host and port**

```vllm serve [Qwen/Qwen2.5-1.5B-Instruct] --host [0.0.0.0] --port [8080]```

Split a large model across **GPUs** with tensor parallelism

```vllm serve [meta-llama/Llama-3.1-8B-Instruct] --tensor-parallel-size [4]```

Cap **context length** and GPU memory use

```vllm serve [mistralai/Mistral-7B-v0.1] --max-model-len [8192] --gpu-memory-utilization [0.92]```

**Chat** with a running local server

```vllm chat --quick "[hi]"```

Run **offline batch** jobs from a JSONL file

```vllm run-batch -i [requests.jsonl] -o [results.jsonl] --model [Qwen/Qwen2.5-1.5B-Instruct]```

Print **environment** details for bug reports

```vllm collect-env```

# SYNOPSIS

**vllm** **serve** [_model_] [_options_]

**vllm** **chat** [**--url** _url_] [**--quick** _prompt_] [**--stats**]

**vllm** **complete** [**--url** _url_] [**--quick** _prompt_] [**--stats**]

**vllm** **launch** _component_ [_model_] [_options_]

**vllm** **bench** {**latency**|**serve**|**throughput**} [_options_]

**vllm** **run-batch** **-i** _input_ **-o** _output_ **--model** _model_ [_options_]

**vllm** **collect-env**

**vllm** **--help**

# PARAMETERS

**serve** [_model_]
> Load a Hugging Face model id or local path and start an OpenAI-compatible HTTP server (default **http://localhost:8000**). The model may also be given as **--model**.

**--host** _host_
> Bind address for **serve**. Default is unset (localhost-style bind). Use **0.0.0.0** to listen on all interfaces.

**--port** _port_
> TCP port for **serve** (default **8000**). Ignored when **--uds** is set.

**--uds** _path_
> Serve over a Unix domain socket instead of TCP.

**--api-key** _key_
> Require this key in the HTTP header for **/v1**, **/v2**, and **/inference**. Repeatable. Also accepted from **VLLM_API_KEY**. Does not protect every path on the process; see CAVEATS.

**--tensor-parallel-size**, **-tp** _n_
> Number of tensor-parallel ranks (typically one GPU per rank). Default **1**.

**--pipeline-parallel-size**, **-pp** _n_
> Number of pipeline-parallel groups. Default **1**.

**--data-parallel-size**, **-dp** _n_
> Number of data-parallel groups. Default **1**.

**--max-model-len** _n_
> Maximum context length in tokens (prompt plus output). If omitted, taken from the model config. Accepts suffixes such as **8k** (8000) and **8K** (8192).

**--gpu-memory-utilization** _frac_
> Fraction of GPU memory to use for the model executor (default **0.92**). Per vLLM instance, not shared across processes on the same GPU.

**--quantization**, **-q** _method_
> Weight quantization method. If omitted, vLLM reads **quantization_config** from the model when present.

**--dtype** _type_
> Weight/activation dtype: **auto** (default), **half**/**float16**, **bfloat16**, **float**/**float32**.

**--trust-remote-code**
> Allow executing custom Python from the model/tokenizer repository.

**--generation-config** {**auto**|**vllm**|_path_}
> Sampling defaults. **auto** (default) loads **generation_config.json** from the model; **vllm** uses vLLM's own defaults.

**--attention-backend** _name_
> Attention kernel. **auto**/unset picks a backend for the platform. CUDA examples: **FLASH_ATTN**, **FLASHINFER**.

**--config** _file_
> Load **serve** options from a YAML file. Command-line flags override the file, which overrides defaults.

**--help=**_topic_
> On **serve**, **all** lists every flag, a config class name lists that group, and a flag name or keyword searches the help.

**chat**
> Interactive (or **--quick**) chat completions against a running **serve** instance. Default URL is the local **/v1** endpoint. **--stats** prints TTFT and throughput after each reply.

**complete**
> Text completions against a running **serve** instance. Same **--url**, **--quick**, and **--stats** flags as **chat**.

**launch** _component_
> Start a single vLLM component (for example **render**) instead of the full API server.

**bench** {**latency**|**serve**|**throughput**}
> Benchmarks. Requires extra deps: **pip install 'vllm[bench]'**. **latency** times a single batch; **serve** measures online throughput against a running server; **throughput** measures offline generation.

**run-batch** **-i** _input_ **-o** _output_ **--model** _model_
> Run OpenAI-style batch requests from a local JSONL file or HTTP URL and write results to _output_.

**collect-env**
> Print software, GPU, and environment information for bug reports.

Integer **serve** flags such as **--max-model-len** and **--kv-cache-memory-bytes** accept human-readable sizes: **1k**/**1m**/**1g** are decimal; **1K**/**1M**/**1G** are binary (1024-based).

# DESCRIPTION

**vllm** is the command-line entry point for **vLLM**, a high-throughput inference engine for large language models. The same process can run as an OpenAI-compatible HTTP server (**serve**), talk to that server (**chat**, **complete**), run batch jobs (**run-batch**), or measure latency and throughput (**bench**). Offline Python use goes through the **LLM** class, not this binary.

**serve** implements OpenAI **completions** and **chat completions** (and related endpoints such as model listing) so existing OpenAI clients can point **base_url** at **http://localhost:8000/v1**. Models are loaded from Hugging Face by default. **PagedAttention** pages the KV cache so many concurrent sequences share GPU memory without contiguous reservation for the full context of each request. Continuous batching, prefix caching, quantization, speculative decoding, tensor/pipeline/data/expert parallelism, and multimodal models are supported.

Hardware backends include NVIDIA CUDA, AMD ROCm, Intel GPUs, and x86/ARM/PowerPC CPUs, with plugins for other accelerators (TPU, Ascend, Apple Silicon via vLLM-Metal, and others). Install the wheel that matches the platform (for CUDA, **uv pip install vllm --torch-backend=auto** is the documented path).

# CONFIGURATION

**--config** _file.yaml_
> YAML mapping of **serve** flag names (hyphenated) to values. Example keys: **model**, **host**, **port**, **tensor-parallel-size**.

**VLLM_API_KEY**
> API keys accepted by **serve**, same as repeated **--api-key**.

**VLLM_USE_MODELSCOPE**
> When set to a true value, download models from ModelScope instead of Hugging Face.

**HF_TOKEN** / **--hf-token**
> Hugging Face token for gated or private weights.

# CAVEATS

Serving large models needs enough GPU (or CPU) memory; OOM at startup is usually **--max-model-len**, **--gpu-memory-utilization**, or tensor-parallel size. **--api-key** authenticates only some URL prefixes; other paths on the same process can still run inference. **--trust-remote-code** executes third-party Python from the model repo. Default sampling may come from the model's **generation_config.json**, which can surprise callers expecting vLLM defaults. **bench** is not in the base extra set. Official wheels target Linux; macOS GPU use is a separate Metal plugin.

# HISTORY

vLLM started in the **Sky Computing Lab** at **UC Berkeley**. The 2023 SOSP paper *Efficient Memory Management for Large Language Model Serving with PagedAttention* (Kwon, Li, Zhuang, and others) introduced the paged KV cache. The project is Apache-2.0 and is maintained by a large multi-institution community. The CLI script is **vllm** (**vllm.entrypoints.cli.main:main**).

# INSTALL

```nix: nix profile install nixpkgs#vllm```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [llama-cli](/man/llama-cli)(1), [llamafile](/man/llamafile)(1), [huggingface-cli](/man/huggingface-cli)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/vllm-project/vllm)```

```[Homepage](https://vllm.ai)```

```[Documentation](https://docs.vllm.ai)```

<!-- verified: 2026-08-30 -->
