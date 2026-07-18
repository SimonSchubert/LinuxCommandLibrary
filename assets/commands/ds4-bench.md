# TAGLINE

Prefill and generation speed benchmark for DwarfStar

# TLDR

**Sweep prefill/generation speed** across context frontiers

```ds4-bench --prompt-file [long.txt] --ctx-max [32768]```

**Write results as CSV**

```ds4-bench --prompt-file [long.txt] --ctx-max [32768] --csv [speed.csv]```

**Prefill only** (no generation tokens)

```ds4-bench --prompt-file [long.txt] --gen-tokens [0]```

**Measure with reduced GPU power**

```ds4-bench --prompt-file [long.txt] --power [70]```

**Benchmark a chat-rendered prompt**

```ds4-bench --chat-prompt-file [prompt.txt] --ctx-max [16384]```

**SSD-streamed model** on a memory-constrained machine

```ds4-bench -m [ds4flash.gguf] --ssd-streaming --prompt-file [long.txt]```

# SYNOPSIS

**ds4-bench** [_options_]

# PARAMETERS

**-m**, **--model** _FILE_
> Path to the GGUF model. Default: **ds4flash.gguf**.

**--prompt-file** _FILE_
> Raw benchmark text; the token sequence is sliced at each measured frontier.

**--chat-prompt-file** _FILE_
> Render _FILE_ as one no-thinking chat user message instead of raw text.

**-sys**, **--system** _TEXT_
> System prompt used only with **--chat-prompt-file**.

**--ctx-start** _N_
> First measured context frontier. Default: **2048**.

**--ctx-max** _N_
> Last measured context frontier. Default: **32768**.

**--ctx-alloc** _N_
> Allocated context size. Default: **ctx-max + gen-tokens + 1**.

**--step-incr** _N_
> Linear step between frontiers when **--step-mul** is 1. Default: **2048**.

**--step-mul** _F_
> Multiplicative step between frontiers. Default: **1** (linear).

**--gen-tokens** _N_
> Greedy decode tokens per frontier. **0** for pure prefill. Default: **128**.

**--csv** _FILE_
> Write CSV to _FILE_ instead of stdout.

**--power** _N_
> GPU duty-cycle target from 1 to 100.

**--metal** | **--cuda** | **--rocm** | **--cpu**
> Select the inference backend explicitly.

**--ssd-streaming**
> Opt into SSD-backed model streaming for the benchmark run.

# DESCRIPTION

**ds4-bench** measures prefill and generation throughput for the **DwarfStar** (**ds4**) inference engine across a sweep of context lengths. You supply a long prompt file; the tool tokenizes it once, then at each frontier runs prefill (and optional greedy decode) so you can compare tokens/s as context grows.

It is the project's standard speed-bench entry point for Metal, CUDA, and ROCm paths, and for comparing full-resident versus **--ssd-streaming** configurations. Results can be printed to the terminal or written as CSV for charts and regression tracking in **speed-bench/** workflows.

# CAVEATS

Needs a DwarfStar-compatible GGUF and enough memory (or SSD bandwidth) for the chosen **--ctx-alloc**. Timings depend heavily on backend, power limit, thermal state, and cold vs warm expert cache; treat single runs as indicative, not absolute rankings across hardware. Prefill-only mode (**--gen-tokens 0**) does not exercise the decode path.

# HISTORY

**ds4-bench** is part of the **DwarfStar** toolkit by **Salvatore Sanfilippo** (**antirez**) and contributors, used to gate performance work on large MoE models (DeepSeek V4 Flash/PRO and experimental forks) where long-context prefill cost dominates.

# SEE ALSO

[ds4-server](/man/ds4-server)(1), [ds4-eval](/man/ds4-eval)(1), [ds4-agent](/man/ds4-agent)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/antirez/ds4)```

```[Documentation](https://github.com/antirez/ds4/tree/main/speed-bench)```

<!-- verified: 2026-07-18 -->
