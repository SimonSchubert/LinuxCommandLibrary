# TAGLINE

Train and run a GPT-2-scale language model from scratch in C/CUDA

# TLDR

**Train** the small CPU showcase model (~1M parameters)

```nanoeuler train```

**Train** the larger CPU model (~10M parameters)

```nanoeuler train big```

**Chat** with a trained checkpoint in a terminal REPL

```nanoeuler chat```

**Verify** the hand-written backward pass with a gradient check

```make check```

**Pretrain** the ~116M GPU model from scratch

```./nanoeuler_cuda t```

# SYNOPSIS

**nanoeuler** _subcommand_ [_options_]

# PARAMETERS

**train** [_big_]
> Run the training loop on CPU. Without arguments, trains the small showcase model; **big** selects the larger configuration intended for GPU-class hardware.

**chat**
> Start an interactive REPL: type a prompt and the model continues it from **nanoeuler.bin** or **nanoeuler_chat.bin**.

**make check**
> Build and run the double-precision gradient check that validates every analytic backward pass against finite differences.

**./nanoeuler_cuda t**
> Pretrain the full GPU pipeline (~116M parameters) and checkpoint to **nanoeuler.bin** every 5000 steps.

**./nanoeuler_cuda tr**
> Resume GPU pretraining from the latest checkpoint.

**./nanoeuler_cuda s**
> Supervised fine-tune the pretrained base on Alpaca instruction data; writes **nanoeuler_chat.bin**.

**./nanoeuler_cuda c**
> Interactive chat with the fine-tuned model on GPU.

**./nanoeuler_cuda i** _"prompt"_
> Run one-shot autoregressive generation on GPU.

# DESCRIPTION

**nanoeuler** is a **GPT-2-class decoder-only transformer** built entirely from scratch in **C** and **CUDA** — no PyTorch, no autograd, no ML frameworks. Both forward and backward passes are written and verified by hand. The project includes a byte-level **BPE tokenizer**, a full **pretraining** pipeline on a books-and-web corpus, and **supervised fine-tuning** into a chat-shaped assistant.

The CPU binary (**nanoeuler.c**) is a self-contained showcase for small models. The CUDA engine (**cuda/nanoeuler_cuda.cu**) adds **cuBLAS** matmuls, hand-written **FlashAttention**, and trains a **~116M-parameter** model on a single consumer GPU. Architecture blocks follow modern practice: **RMSNorm**, **RoPE**, **SwiGLU** feed-forward, **grouped-query attention**, and **multi-token prediction** heads.

The name references the **forward-Euler** view of residual networks: each block **x = x + f(x)** is one integration step of **dx/dt = f(x)**. This is a research and educational artifact — at this scale the model produces fluent-looking English with little real world knowledge, not a capable assistant.

# CAVEATS

GPU training requires an **NVIDIA GPU**, **nvcc**, and **cuBLAS**; builds target **sm_89** (RTX 40-series) by default. Data scripts download large corpora from Project Gutenberg and Hugging Face. The chat model demonstrates the pretrain→SFT pipeline; quality depends heavily on compute and data scale. **DPO** alignment is planned but not yet implemented.

# HISTORY

Created by **JustVugg** as a public from-scratch LLM engineering project, demonstrating end-to-end training with manually derived gradients and a complete, auditable codebase rather than framework abstractions.

# SEE ALSO

[make](/man/make)(1), [nvcc](/man/nvcc)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/JustVugg/nanoeuler)```

<!-- verified: 2026-07-01 -->