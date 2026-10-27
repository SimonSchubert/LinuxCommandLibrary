# TAGLINE

Convert a Llama 3 Hugging Face checkpoint into a GGUF file

# TLDR

Convert a **Hugging Face** Llama 3 directory to **GGUF**

```hf2gguf [models/hf/llama3] [models/gguf/llama3.gguf]```

Merge a **PEFT LoRA** adapter while converting

```hf2gguf [models/hf/llama3] [models/hf/adapter] [models/gguf/llama3-lora.gguf]```

Then convert that GGUF into Janas **JNS**

```gguf2jns [models/gguf/llama3.gguf] [models/llama3.jns]```

# SYNOPSIS

**hf2gguf** _model-dir_ _out.gguf_

**hf2gguf** _model-dir_ _adapter-dir_ _out.gguf_

# DESCRIPTION

**hf2gguf** reads a **Llama 3** Hugging Face checkpoint (safetensors, bf16) and writes a **GGUF** file of llama.cpp's `llama` architecture, with matrices in bf16. From there llama.cpp can quantize the file, and **gguf2jns** can turn it into Janas-LLM's JNS so both engines share the same weights.

The model directory must hold `config.json`, `tokenizer.json`, and one or more safetensors files. `config.json` must have `model_type` **llama**. An optional adapter directory is a PEFT LoRA: `adapter_config.json` (`r`, `lora_alpha`, `target_modules`) and `adapter_model.safetensors`. The adapter's `lora_A` and `lora_B` are merged as PEFT's `merge_and_unload` does on a bf16 model (scale `lora_alpha / r`). If the adapter trained the token embeddings or output head whole, those tensors replace the model's. If it ships `tokenizer.json`, that file replaces the model's too.

What is written follows llama.cpp's `convert_hf_to_gguf.py` for Llama: query and key rows permuted head by head for llama.cpp's rotation of adjacent pairs (**gguf2jns** turns them back for Janas-LLM); `rope_freqs.weight` for Llama 3 rope scaling; norms in f32; the output head taken from the token embeddings when they are tied and the adapter has no head of its own; the tokenizer as GPT-2 byte-level BPE with Llama 3's pre-tokenizer (`tokenizer.ggml.pre` `llama-bpe`), special tokens as control tokens, BOS added.

Wrong usage prints `usage: hf2gguf <model dir> [<adapter dir>] <out.gguf>` and exits **2**. Failures print `hf2gguf:` and exit **1**. Success prints the output path, tensor count, token count, merge count, and `, adapter merged` when a LoRA was applied. Progress is a carriage-return line every 16 tensors.

# PARAMETERS

_model-dir_
> Hugging Face model directory: `config.json`, `tokenizer.json`, and bf16 safetensors.

_adapter-dir_
> Optional PEFT LoRA directory. `peft_type` must be **LORA**.

_out.gguf_
> Output GGUF path. Created or truncated.

# CAVEATS

Only **Llama 3** (`model_type` llama). Weights must be **bf16** safetensors. **rsLoRA** and **DoRA** are rejected. There are no flags: three arguments mean a LoRA merge, two mean a plain convert.

The GGUF is unquantized bf16. Quantize it (llama.cpp's quantizer) before **gguf2jns** if you want Q4-K or similar. Built into `bin/` by Janas's `./build.sh` from `tools/hf2gguf.c`. It is not a separate package. Janas's usual install path starts from an already quantized GGUF and **gguf2jns**; this tool is the Hugging Face safetensors step before that.

# HISTORY

**hf2gguf** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later).

# SEE ALSO

[gguf2jns](/man/gguf2jns)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [janas-get](/man/janas-get)(1), [huggingface-cli](/man/huggingface-cli)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/INSTALL.md)```

<!-- verified: 2026-10-27 -->
