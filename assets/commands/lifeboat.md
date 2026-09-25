# TAGLINE

Serve open-weight language models on local hardware behind an OpenAI-compatible API

# TLDR

Download the **GGUF engine** after installing the Python package

```lifeboat engine install```

Report **what this machine can run** before pulling weights

```lifeboat doctor```

Start the **console, registry, load balancer, and API** (http://127.0.0.1:8001)

```lifeboat up```

Serve **one model** without the web console

```lifeboat serve [model]```

From a **desktop tarball** install, inspect the same hardware limits

```lifeboat-core doctor```

# SYNOPSIS

**lifeboat** _command_ [_args_]

# PARAMETERS

**engine install**
> Download and install the bundled GGUF inference engine used by the pip package. Required once after `pip install lifeboat` before **up** or **serve**.

**up**
> Start the web console, model registry, load balancer, and the OpenAI-compatible API. The console listens on **http://127.0.0.1:8001**.

**serve** _MODEL_
> Serve a single model over the API without starting the console.

**doctor**
> Print this machine's cores, memory, GPU, and the largest model it can serve, without downloading weights. The desktop/headless binary exposes the same check as **lifeboat-core doctor**.

# DESCRIPTION

**lifeboat** is the command from Iterate.ai's Lifeboat inference stack. It runs open-weight language models on hardware you control — a laptop, workstation, GPU server, or cluster — and exposes **OpenAI-** and **Anthropic-compatible** HTTP APIs so existing clients can point at localhost. A load balancer and a browser console sit in front of the engines. Weights and requests stay on the machine; nothing is sent to Iterate.ai's cloud as part of inference.

The **pip** package (`pip install lifeboat`, Python 3.10–3.13) is the CLI documented here. It ships the **GGUF** engine only and is published for macOS Apple Silicon, Linux x86-64 and ARM64, and Windows x64. After `lifeboat engine install`, `lifeboat up` brings up the console on port 8001. `lifeboat serve` is the same stack without the UI. `lifeboat doctor` reports whether a given board (including Raspberry Pi 4/5 and NVIDIA Jetson, which get a CUDA build automatically) can load a model before any download.

GPU and cluster features beyond GGUF live in the **container** images (`iterateai/lifeboat:latest` for NVIDIA, `:amd` / `:amd-mi300x` / `:amd-mi355x` for AMD Instinct, `:lite` for CPU-only) and in the **desktop** builds. A Linux desktop or tarball install puts **lifeboat-core** (headless server and CLI) and **lifeboat-tray** on `PATH` under `/opt/lifeboat`.

# CAVEATS

The pip wheel does **not** include the container engine's extra throughput path: safetensors weights, FP8 KV cache, speculative decoding, and the advertised multi-session scaling stay with the Docker/Kubernetes images. Use those images on Intel Macs (no pip wheel) and on RHEL 9 rebuilds (Rocky, AlmaLinux, Oracle Linux), whose system C++ runtime is older than the prebuilt engine and whose `python3` is often 3.9.

Desktop Linux needs **glibc 2.31+**. GPU offload on the desktop build uses **Vulkan** (`libvulkan1` plus a vendor driver); NPUs and Intel XPU are unused. The public GitHub repository is downloads and install instructions only — the engine source is not published.

**lifeboat** is a generic name. Other projects use it for unrelated tools; this page is Iterate.ai's inference CLI, not live-build's **lb** and not the various backup or GUI programs also called Lifeboat.

# HISTORY

**Lifeboat** is developed by **Iterate.ai** (GitHub org **IterateAI**). Desktop builds are versioned in the **2.2.x** line (2.2.52 published 23 September 2026). The pip CLI, desktop apps, and container images are distributed from the `IterateAI/lifeboat-releases` GitHub repository; the inference engine itself is closed source.

# SEE ALSO

[ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [llamafile](/man/llamafile)(1), [vllm](/man/vllm)(1)

# RESOURCES

```[Source code](https://github.com/IterateAI/lifeboat-releases)```

```[Homepage](https://iterate.ai/lifeboat)```

```[Documentation](https://docs.iterate.ai/lifeboat)```

<!-- verified: 2026-09-25 -->
