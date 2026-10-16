# TAGLINE

Causal perplexity evaluator for NInfer artifacts

# TLDR

Score the **quick** subset of the bundled corpus

```ninfer-perplexity [model.ninfer] --corpus [eval/corpora/perplexity-1m/manifest.json] --quick```

Score a **UTF-8 file**

```ninfer-perplexity [model.ninfer] --text [notes.txt] --context [16384] --stride [8192]```

Use **INT8 KV** on two GPUs

```ninfer-perplexity [model.ninfer] --corpus [manifest.json] --quick --tp 2 --devices [0,1] --kv-dtype int8```

Write the machine report to a **directory**

```ninfer-perplexity [model.ninfer] --text [notes.txt] --output [./ppl-out]```

Print **usage**

```ninfer-perplexity --help```

# SYNOPSIS

**ninfer-perplexity** _model.ninfer_ (**--corpus** _manifest.json_ [**--quick**] | **--text** _file_) [_options_]

**ninfer-perplexity** **--help**

# DESCRIPTION

**ninfer-perplexity** measures fixed-window truncated-context causal perplexity of a v3 `.ninfer` artifact. It loads Text weights only: Vision and speculative components are not required. It is an offline evaluator, not an HTTP server and not a logits-export API.

Exactly one of **--corpus** or **--text** is required. The repository corpus `ninfer-ppl-1m-v1` is 16 UTF-8 streams (English reference, English long-form, Chinese reference, and NInfer C++/CUDA). **--quick** keeps one stream per domain; omit it for the full set. **--text** scores a single UTF-8 file.

Default protocol is **--context 4096** and **--stride 2048**. Every token after the first is scored once. Each window starts from empty state, so tokens before the window origin are excluded. Reported metric:

```
mean_nll = -sum(logprob) / scored_tokens
perplexity = exp(mean_nll)
```

Startup, corpus, and scoring progress go to stderr. The domain/overall table is stdout. A full-precision `report.json` is written under `profiles/perplexity/` unless **--output** names an empty directory.

**--tp 2 --devices** _A,B_ scores a model that does not fit one GPU. Tensor-parallel KV types are **bf16**, **int8**, and **nvfp4**; the evaluator's default **fp8** is rejected at **--tp 2**. Split projections round partials in a different order, so compare **--tp 2** runs with other **--tp 2** runs.

# PARAMETERS

**--corpus** _manifest.json_
> JSON manifest of evaluation streams. Mutually exclusive with **--text**.

**--text** _file_
> One UTF-8 file to score. Mutually exclusive with **--corpus**.

**--quick**
> Score one stream per domain. Requires **--corpus**.

**--context** _N_
> Window length in tokens (default **4096**). Must be at least 2.

**--stride** _N_
> Target tokens advanced per window (default **2048**). Must satisfy **1 <= stride < context**.

**--device** _N_
> CUDA device (default **0**).

**--tp** **1**|**2** / **--devices** _A,B_
> Tensor parallel. **--devices** is required with **--tp 2**.

**--kv-dtype** **bf16**|**int8**|**fp8**|**nvfp4**|**k8v4**
> KV-cache storage (default **fp8**). **--tp 2** accepts **bf16**, **int8**, or **nvfp4**.

**--embedding-host**
> Read the token embedding table from one pinned host copy instead of a copy per GPU. Scores match.

**--output** _directory_
> Empty directory for `report.json` instead of `profiles/perplexity/`.

**--log-level** **trace**|**debug**|**info**|**warning**|**error**|**critical**|**off**
> stderr verbosity (default **info**).

# CAVEATS

The first argument is a `.ninfer` artifact. Compare runs with the same corpus, context, stride, and execution flags except the variable under test. Compare **--tp 2** runs with other **--tp 2** runs. Token counts in the corpus name are a scale label; exact scored counts come from the artifact tokenizer and are stored in the report.

# HISTORY

Part of **NInfer** / **capy-flash** (`apps/perplexity`). Apache License 2.0. Status with capy-flash **v0.5.4** (2026-10-16).

# SEE ALSO

[ninfer](/man/ninfer)(1), [ninfer-serve](/man/ninfer-serve)(1), [llama-cli](/man/llama-cli)(1), [llama.cpp](/man/llama.cpp)(1), [vllm](/man/vllm)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/ValerioDolci/capy-flash)```

```[Documentation](https://github.com/ValerioDolci/capy-flash/blob/main/docs/perplexity.md)```

<!-- verified: 2026-10-17 -->
