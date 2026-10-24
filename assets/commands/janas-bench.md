# TAGLINE

Measure how a Janas-LLM model runs on this machine

# TLDR

**List** catalog models and pick one

```janas-bench```

Benchmark a **catalog name** (downloaded if missing)

```janas-bench [qwen3-4b]```

Benchmark a converted **.jns** file

```janas-bench [models/qwen3-next.jns]```

Match a **llama-bench**-style long prompt

```janas-bench [qwen3-4b] --prompt [1024] --gen [16]```

Average **three** rounds (the default)

```janas-bench [qwen3-4b] --rounds [3]```

Skip the model's **prediction** file

```janas-bench [qwen3-4b] --no-mtp```

# SYNOPSIS

**janas-bench** [_model_] [_options_]

# DESCRIPTION

**janas-bench** measures what this machine does with a **Janas-LLM** model and writes a report. It tries the configurations the engine can use (thread counts, which cores, with and without the GPU) on real passes of the model, keeps the fastest, and stores them in `~/.cache/janas` so **janas-chat** and the other tools start already tuned.

_model_ is taken as **janas-chat** takes it: a `.jns` file, a catalog name (`qwen3-4b`), downloaded after asking if it is not there yet, or nothing, and then the list to choose from. The model's prediction file comes with it unless **--no-mtp**.

Default work is a prompt of **256** tokens then **64** written, averaged over **3** rounds with the order of configurations alternating so warmup and cache fill weigh on each setting alike. Prefill and decode are measured greedily without drafts. Drafts from the prediction block are measured as a chat uses them: an ordinary English question, greedily and sampled the way the chat samples, with the share of drafts that survived.

Close other programs first. The report is `janas-bench-<date>.txt` in the current directory and already carries the CPU name, core layout, GPU if any, RAM, and the speed of every configuration tried. Send that file with hardware feedback.

# PARAMETERS

_model_
> A `.jns` path or catalog name. None: list the catalog and ask.

**--models** _dir_
> Where models live (sets **JANAS_MODELS** for this run).

**--mtp** _file_
> Multi-token prediction file. Without it, the matching file beside the model.

**--no-mtp**
> No prediction file.

**--prompt** _tokens_
> Prefill length (default **256**).

**--gen** _tokens_
> Tokens written after the prompt (default **64**).

**--ctx** _tokens_
> Context length (default **4096**). Prompt plus generation must fit.

**--cache** _GiB_
> Memory for streamed experts.

**--reserve** _GiB_
> Memory left to other programs when the cache is automatic.

**--rounds** _n_
> How many times each configuration is measured (default **3**, capped at 1000).

**--settle** _seconds_
> After warmup, wait up to this long for background expert-cache filling to finish, so later rounds match a chat after its first minutes.

**-h**, **--help**
> Print usage and exit 2.

# CAVEATS

The engine is deliberately hard on the machine: it fills free memory and reads the disk at full speed. Run it on an idle machine; a busy desktop is part of what is measured. Prompt plus twice generation plus 64 must fit **--ctx**. **--mtp** and **--no-mtp** together is an error. Figures vary a few percent between runs; a first run is slower while the cache fills. Developed on one Linux x86-64 laptop; reports from other CPUs, discrete GPUs, slower disks, and 16 GB machines are what the project asks for most.

# HISTORY

**janas-bench** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). Until 26 September 2026 the draft column measured a repeating paragraph that a model copies, which inflated "with MTP" rates; later builds measure a real chat question instead.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [vkcheck](/man/vkcheck)(1), [gpu_check](/man/gpu_check)(1), [janas-get](/man/janas-get)(1), [janas-server](/man/janas-server)(1), [vulkaninfo](/man/vulkaninfo)(1), [llama-cli](/man/llama-cli)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/hardware.md)```

<!-- verified: 2026-10-13 -->
