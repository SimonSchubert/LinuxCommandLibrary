# TAGLINE

Profiling launcher for AI inference workloads

# TLDR

**Install** the profiler with CUDA 12 support

```pip install 'graphsignal[cu12]'```

**Profile** a vLLM server by wrapping its launch command

```GRAPHSIGNAL_API_KEY=[key] graphsignal-run vllm serve [model] --port [8001]```

**Profile** any inference command

```GRAPHSIGNAL_API_KEY=[key] graphsignal-run [command] [args...]```

**Attach** an arbitrary tag to the recorded data

```GRAPHSIGNAL_TAG_DEPLOYMENT=[us-prod] GRAPHSIGNAL_API_KEY=[key] graphsignal-run [command]```

# SYNOPSIS

**graphsignal-run** _COMMAND_ [_ARGS_...]

# DESCRIPTION

**graphsignal-run** is the launcher CLI of **Graphsignal**, a production-scale inference profiling platform. You prefix your normal model-serving or inference command with **graphsignal-run** and it attaches as a sidecar process, profiling the wrapped workload without code changes.

It captures continuous, high-resolution timelines that expose operation durations and resource utilization: CUDA kernel activity, GPU and system-level metrics, per-step LLM generation tracing, token throughput, and error monitoring. The collected signals are sent to the Graphsignal platform, where the timelines can be inspected to find performance bottlenecks across models, engines, and accelerators.

It supports common inference stacks including **PyTorch**, **vLLM**, and **SGLang**.

# CONFIGURATION

**GRAPHSIGNAL_API_KEY**

> Account API key used to authenticate and upload profiling data. Required.

**GRAPHSIGNAL_TAG_**_KEY_**=**_VALUE_

> Attach an arbitrary tag to the recorded signals (for example **GRAPHSIGNAL_TAG_DEPLOYMENT=us-prod**). May be set multiple times with different keys.

# CAVEATS

The profiler uploads telemetry to Graphsignal's hosted service and requires a valid API key, so it is not a fully offline tool. The installed extra must match the host CUDA version: use **graphsignal[cu12]** for CUDA 12.x and **graphsignal[cu13]** for CUDA 13.x.

# HISTORY

Developed by **Graphsignal** and released in **2026** as the command-line entry point to its inference profiler. It is distributed on PyPI as part of the **graphsignal** package under the Apache-2.0 license.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [py-spy](/man/py-spy)(1), [perf](/man/perf)(1)

# RESOURCES

```[Source code](https://github.com/graphsignal/graphsignal-profiler)```

```[Homepage](https://graphsignal.com)```

<!-- verified: 2026-06-24 -->
