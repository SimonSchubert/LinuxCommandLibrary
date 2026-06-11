# TAGLINE

Low-bit quantization toolkit for LLMs and VLMs

# TLDR

**Quantize a model** with the default recipe

```auto-round --model [Qwen/Qwen3-0.6B] --scheme "[W4A16]" --format "[auto_round]"```

**Use the best recipe** (slower, higher accuracy)

```auto-round-best --model [model_id] --scheme "[W4A16]"```

**Use the light recipe** (faster)

```auto-round-light --model [model_id] --scheme "[W4A16]"```

**Quantize to 4-bit** with multiple export formats

```auto-round --model [model_id] --bits 4 --group_size 128 --format "[auto_round,auto_awq,auto_gptq]" --output_dir [path/to/output]```

**Calibration-free** RTN mode

```auto-round --model [model_id] --bits 4 --iters 0```

**Multi-GPU** quantization

```auto-round --model [model_id] --device_map "[0,1,2,3]"```

**Evaluate** an already-quantized model

```auto-round --model [path/to/quantized] --eval --tasks [mmlu,lambada_openai]```

# SYNOPSIS

**auto-round** **--model** _MODEL_ [_options_]

**auto-round-best** **--model** _MODEL_ [_options_]

**auto-round-light** **--model** _MODEL_ [_options_]

# DESCRIPTION

**auto-round** is a weight-only post-training quantization (PTQ) toolkit for **LLMs** and **VLMs**, developed by **Intel**. It uses signed gradient descent to jointly optimize weight rounding and clipping ranges, achieving high accuracy at ultra-low bit widths (down to 2 bits) with minimal calibration time.

The toolkit supports CPU, Intel GPU (XPU), HPU, and CUDA back-ends and exports to several popular quantization formats including **auto_round**, **auto_awq**, **auto_gptq**, and **gguf**, so models can be served via Transformers, vLLM, SGLang, or llm-compressor without re-quantization.

Three recipes are provided: **auto-round** (default balance), **auto-round-best** (slowest, highest accuracy, 4–5× slower), and **auto-round-light** (fastest, 2–3× speedup).

# PARAMETERS

**--model** _MODEL_
> Model identifier or local path (e.g. _Qwen/Qwen3-0.6B_).

**--scheme** _SCHEME_
> Quantization scheme such as _W4A16_, _W2A16_, _W8A16_.

**--bits** _N_
> Weight bit width: 2, 3, 4, or 8.

**--group_size** _N_
> Quantization group size (e.g. 32, 64, 128).

**--format** _FORMAT_
> Export format(s), comma-separated: _auto_round_, _auto_gptq_, _auto_awq_, _gguf:q4_k_m_, etc.

**--output_dir** _PATH_
> Directory where the quantized model is written.

**--dataset** _SPEC_
> Calibration data (local path or HuggingFace dataset). Supports _name:num=N_, _:concat=True_, _:apply_chat_template_, and comma-separated lists.

**--iters** _N_
> Tuning iterations (_0_ for RTN, default _200_, up to _1000_ for best accuracy).

**--bs** _N_
> Batch size (default 8).

**--seqlen** _N_
> Calibration sequence length (default 2048).

**--nsamples** _N_
> Number of calibration samples (default 128, up to 512 for best).

**--lr** _RATE_
> Learning rate.

**--device_map** _SPEC_
> GPU assignment, e.g. _auto_ or _0,1,2,3_.

**--low_gpu_mem_usage**
> Reduce VRAM at the cost of more time.

**--enable_torch_compile**
> Use **torch.compile** (requires PyTorch 2.6+).

**--quant_lm_head**
> Also quantize the language-model head (auto_round format only).

**--adam**
> Use the **AdamW** optimizer instead of signed gradient descent.

**--eval**
> Evaluate the model after quantization.

**--eval_backend** _BACKEND_
> Evaluation engine, _vllm_ or default Hugging Face.

**--tasks** _LIST_
> Comma-separated lm-eval-harness tasks (e.g. _mmlu,lambada_openai_).

# DESCRIPTION OF FORMATS

**auto_round**
> Native AutoRound format, supports lm-head quantization.

**auto_gptq**
> GPTQ-compatible format.

**auto_awq**
> AWQ-compatible format.

**gguf:q4_k_m**, **gguf:q2_k_s**
> GGUF formats for llama.cpp / Ollama-style runtimes.

# CAVEATS

Calibration is sensitive to dataset quality and length; using domain-mismatched calibration data can degrade accuracy. Lower bit widths (2-3 bits) may need the **best** recipe to recover accuracy. Some export formats restrict feature combinations (e.g. **--quant_lm_head** only works with the auto_round format).

# HISTORY

**AutoRound** was introduced by **Intel** as part of its LLM quantization stack. It distinguishes itself from older PTQ methods such as **GPTQ** and **AWQ** by jointly optimizing rounding and clipping with signed gradient descent, narrowing the accuracy gap to QAT at low bit widths while remaining a calibration-only method.

# SEE ALSO

[python](/man/python)(1), [llama.cpp](/man/llama.cpp)(1)
