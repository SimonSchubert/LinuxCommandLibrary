# TAGLINE

Tiny pure-C engine to run large MoE LLMs (e.g. GLM-5.2 744B) from disk on modest hardware

# TLDR

**Build** the engine

```cd c && ./setup.sh```

**Convert** (or point at pre-converted model) and chat

```COLI_MODEL=/path/to/glm52_i4 ./coli chat```

**Benchmark** quality

```./coli bench```

# SYNOPSIS

**coli** <command> [options]

# DESCRIPTION

coli (colibrì) is a minimal, zero-dependency C inference engine (single-file core) for running very large Mixture-of-Experts models such as GLM-5.2 by keeping only the dense portion resident in RAM and streaming the routed experts from disk on demand, with aggressive caching and optional MTP speculative decoding.

It is intentionally disk-bound on small machines and is designed for experimentation and local use of frontier-scale models on consumer hardware.

# COMMANDS

**chat**
> Interactive chat (supports sampling, MTP, thinking mode).

**convert**
> One-time FP8→int4 conversion of the model shards.

**bench**
> Run quality benchmarks (HellaSwag, ARC, MMLU).

**run**, **info**
> Additional modes for single prompts and model info.

# PARAMETERS

Environment variables and flags control temperature, topp, draft depth (MTP), RAM budget, autopin, etc. See the project README for the full set (COLI_MODEL is required for most operations).

# CAVEATS

- Requires a large amount of fast local storage (~370 GB for the example model) and benefits enormously from fast random-read NVMe.
- Currently specialized for the GLM-5.2 architecture; not a general-purpose LLM runner.
- Cold performance is low; warm cache + MTP dramatically improves responsiveness.

# RESOURCES

```[Source code](https://github.com/JustVugg/colibri)```
```[Documentation](https://github.com/JustVugg/colibri#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

llama.cpp(1)