# TAGLINE

Build a one-layer JNS file from a model's multi-token prediction block

# TLDR

Convert the **MTP** block from a Hugging Face shard

```hf2jns_mtp [models/qwen3-next.jns] [models/hf/model-00041-of-00041.safetensors] [models/qwen3-next-mtp.jns]```

Fetch only the **mtp.** tensors from a Hugging Face repo

```hf2jns_mtp [model.jns] [hf:Qwen/Qwen3-Next-80B-A3B-Instruct] [model-mtp.jns]```

Copy the last block of a **GGUF draft head**

```hf2jns_mtp [model.jns] [head.gguf] [model-mtp.jns]```

# SYNOPSIS

**hf2jns_mtp** _main.jns_ _shard.safetensors_... _out.jns_

**hf2jns_mtp** _main.jns_ **hf:**_owner_/_repo_[**@**_revision_] _out.jns_

**hf2jns_mtp** _main.jns_ _head.gguf_ _out.jns_

# DESCRIPTION

**hf2jns_mtp** writes a one-layer **JNS** file that holds a model's **multi-token prediction** (MTP) block. GGUF conversions of Qwen3-Next and similar models drop that block. The original checkpoint keeps it under `mtp.*` (bf16). This tool quantizes those matrices to Q4-K with Janas's quantizer, writes routed experts as expert slots (or a dense feed-forward as the one slot, as **gguf2jns** does), and everything else as resident tensors named like the main model's layer tensors (`blk.0.*`) plus `mtp.*` for the block's own parts.

The metadata region is copied from the main model's JNS: hyperparameters match. Whether the model is dense, and how many experts it has, comes from the main file; the shapes come from the checkpoint.

Three input forms:

1. One or more **safetensors** shards that contain the block (or a file holding only those tensors). Give every shard that has a part of it. At most **64** shard arguments.
2. **hf:**_owner_/_repo_[**@**_revision_]: the block's tensors alone are read from Hugging Face with range requests into a temporary file named the output path plus `.mtp.safetensors`, then converted and deleted. One `hf:` repository per run.
3. A **GGUF draft head** whose last block is the prediction block (block count minus the nextn predict layers). Tensors are copied in their types (`blk.N.*` as `blk.0.*`, `blk.N.nextn.*` as `mtp.*`). Token embeddings and the output head are left out; the engine uses the main model's. The head's architecture, expert count, and width must match the main file.

**janas-get** runs this command when a catalog model has an MTP extra. Wrong usage prints a short help (the safetensors and GGUF forms) and exits **2**. Failures print `hf2jns_mtp:` and exit **1**. Success prints each tensor mapping, expert progress every 64 experts, and `written` with sizes.

Checkpoint RMS norms are treated as zero-centred (the effective scale is 1 + w): they are stored plus one, matching GGUF. Only **BF16** safetensors tensors are accepted.

# PARAMETERS

_main.jns_
> Already converted trunk model. Its architecture and expert layout are required.

_shard.safetensors_
> Hugging Face shard (or a file of only the block's tensors). Repeat for every shard that holds `mtp.*`.

**hf:**_owner_/_repo_[**@**_revision_]
> Fetch `mtp.*` tensors from that repository. Optional **@**_revision_ selects a git revision.

_head.gguf_
> Draft-head GGUF whose last block is the prediction block. Detected when there are exactly three arguments and this path ends in `.gguf`.

_out.jns_
> Output one-layer JNS path.

# CAVEATS

The stderr usage line omits the **hf:** form; it still works. Qwen3.5 and Qwen3.6 keep their prediction block inside the main GGUF, so **gguf2jns** converts it with no extra step. Qwen3-Next still needs this tool (or a catalog file from **janas-get**). The GGUF-head path copies types as they are; the safetensors path requantizes to Q4-K. Built into `bin/` by Janas's `./build.sh` from `tools/hf2jns_mtp.c`. It is not a separate package.

# HISTORY

**hf2jns_mtp** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later).

# SEE ALSO

[gguf2jns](/man/gguf2jns)(1), [janas-get](/man/janas-get)(1), [jns_planes](/man/jns_planes)(1), [janas-chat](/man/janas-chat)(1), [janas-bench](/man/janas-bench)(1), [huggingface-cli](/man/huggingface-cli)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/INSTALL.md)```

<!-- verified: 2026-10-24 -->
