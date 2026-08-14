# TAGLINE

Quantize a GGUF model to fill available VRAM, then run it with llama.cpp

# TLDR

**Fit** a Hugging Face BF16 GGUF to this machine and **serve** it

```shoehorn fit [unsloth/Qwen3-4B-GGUF] --serve```

**Print** detected GPU working-set size (Metal)

```shoehorn vram```

**Preview** the per-tensor mix without writing a file

```shoehorn plan -m [model-bf16.gguf] -i [model.imatrix] --ctx [4096] --budget [8GiB]```

**Quantize** to a given envelope and write a GGUF

```shoehorn quantize -m [model-bf16.gguf] -i [model.imatrix] --ctx [4096] --budget [1.75GiB] -o [fitted.gguf]```

**Run** a fitted model via llama-server (extra args after **--**)

```shoehorn run -m [fitted.gguf] --ctx [4096] -- --port [8080]```

**Budget** for another Mac by RAM size

```shoehorn quantize -m [model-bf16.gguf] --target [16GB] -o [fitted.gguf]```

# SYNOPSIS

**shoehorn** **fit** _path_|_owner/repo_|_url_ [**-i** _imatrix_] [fit-flags] [**-o** _out.gguf_] [**--serve**]

**shoehorn** **plan** **-m** _model.gguf_ [**-i** _imatrix_] [fit-flags]

**shoehorn** **quantize** **-m** _model.gguf_ [**-i** _imatrix_] [fit-flags] **-o** _out.gguf_

**shoehorn** **run** **-m** _model.gguf_ [**--ctx** _N_] [**--kv** _type_] [**--** _llama-server-args_...]

**shoehorn** **vram**

# DESCRIPTION

**shoehorn** quantizes a BF16 (or F16/F32) **GGUF** so the weights fill a memory envelope instead of using a fixed preset such as **Q4_K_M**. It subtracts KV-cache and estimated compute-buffer cost from the target VRAM, then solves a per-tensor mixed-precision assignment (Lagrangian knapsack plus a greedy top-up) that minimizes imatrix-weighted error under that byte budget. The encoder is implemented in this project; output is standard GGUF v3 that any llama.cpp build can load.

**fit** is the one-shot path: resolve a local file, Hugging Face repo id, or URL, download the BF16 GGUF into **~/.cache/shoehorn** (resumable), pick up a published imatrix or generate one with **llama-imatrix**, solve and write **<stem>-fit.gguf**, and optionally exec **llama-server**. **plan** prints the mix only. **quantize** writes the file. **run** execs **llama-server -m** _model_ **-c** _ctx_ **-ngl 99**. **vram** prints the Metal **recommendedMaxWorkingSetSize**.

On Apple Silicon the default envelope is the Metal working-set probe. Elsewhere (or to target a different machine) pass **--budget** or **--target**. Inference and imatrix generation are delegated to **llama.cpp** tools on **PATH**.

# COMMANDS

**fit** _source_

> Fetch or open _source_, obtain an imatrix, quantize to the envelope, write the GGUF. **--serve** launches **llama-server** on the result.

**plan**

> Solve and print the per-tensor table, type rollup, budget utilization, and projected VRAM. Does not write a file.

**quantize**

> Same solve as **plan**, then encode and write **-o** _out.gguf_.

**run**

> Exec **llama-server** with full GPU offload. Arguments after **--** are passed through.

**vram**

> Print the detected Metal device and usable working-set size. Prints **no Metal device found** when the probe is unavailable.

# PARAMETERS

**-m**, **--model** _path_
> Source GGUF (BF16/F16/F32, or an already-quantized file decoded in-process). Required for **plan**, **quantize**, and **run**.

**-i**, **--imatrix** _path_
> Importance matrix (legacy binary or GGUF **llama-imatrix** output). If omitted, **fit** may generate one; **plan**/**quantize** fall back to activation-agnostic weights and warn.

**-o**, **--output** _path_
> Output GGUF. **quantize** requires it. **fit** defaults to **<model-stem>-fit.gguf** in the current directory.

**--ctx** _N_
> Context length used for the KV budget and for **run** (default **8192**).

**--budget** _size_
> Total memory envelope (**18GiB**, **800MB**, **4.5G**, or bytes). Overrides the Metal probe.

**--target** _size_
> Envelope for another Mac approximated as **74%** of the given RAM. Conflicts with **--budget**.

**--kv** _type_
> KV cache type to budget and run with: **f16** (default), **q8_0**, or **q4_0**.

**--reserve** _size_
> Safety margin subtracted from the envelope (default **512MiB**, or **160MiB** with **--calibrate**).

**--calibrate**
> After the first write, load the model in **llama-cli**, read real KV/compute sizes, re-solve, and rewrite reused tensors.

**--exact-errors**
> Score every row instead of a 128-row sample per tensor.

**--serve**
> With **fit**, exec **llama-server** on the written file.

# CAVEATS

The Metal VRAM probe is Apple Silicon only; without a device you must pass **--budget** (or **--target**). The **metal** crate is a build dependency, so a Linux **cargo install** may fail even though **--budget** is documented to work anywhere.

**fit** refuses split GGUFs when fetching from Hugging Face. The compute-buffer term is a heuristic; **--reserve** and **--calibrate** absorb the error. Serving and automatic imatrix generation need **llama-server** / **llama-imatrix** / **llama-cli** on **PATH**. IQ1 formats are not implemented (floor is **IQ2_XXS**). **token_embd.weight** and **output.weight** are floored at 4-bit.

# SEE ALSO

[llama.cpp](/man/llama.cpp)(1), [llama-cli](/man/llama-cli)(1), [auto-round](/man/auto-round)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/notactuallytreyanastasio/shoehorn)```

<!-- verified: 2026-08-14 -->
