# TAGLINE

Convert a GGUF model into Janas-LLM's JNS file format

# TLDR

Convert a **GGUF** into a **.jns** file

```gguf2jns [model.gguf] [model.jns]```

Convert a **split** GGUF (give the first part)

```gguf2jns [models/gguf/Qwen3-Next-80B-A3B-Instruct-Q4_K_M-00001-of-00002.gguf] [models/qwen3-next.jns]```

# SYNOPSIS

**gguf2jns** _model.gguf_ _model.jns_

# DESCRIPTION

**gguf2jns** converts a **GGUF** checkpoint into Janas-LLM's **JNS** file (version 2). Routed experts are rewritten one slot per (layer, expert), with gate, up, and down back to back, so the engine can read an expert with a single aligned direct I/O request. Every other tensor is copied unchanged into the resident region. A dense model has no experts to route: its feed-forward becomes the single slot of each layer, written the same way.

A model split into several GGUF files (`name-00001-of-0000N.gguf`) is read from all of them; pass the first file. Data is copied in streaming. The model is never held in memory. The file written is the one the Python converter this tool replaced wrote, byte for byte, so the fingerprints in **MODELS.md** still hold.

**janas-get --from-gguf** runs this command (then **jns_planes** when the catalog fingerprint is the plane-cut file). A feed-forward whose width is not a multiple of 256 is widened with zeros to the next multiple, except **qwen4exp** experts (Qwen3.8-Flash-Next), which keep their width. Gate and up fused in one expert tensor are split into the two matrices of the slot. A resident tensor in **MXFP4** is written as **Q8_0**; routed experts in MXFP4 stay MXFP4.

Wrong usage prints a short help and exits **2**. Failures print `gguf2jns:` and exit **1**. Success prints architecture, layer and expert counts, sizes, copy progress, and `written` with the output size.

# PARAMETERS

_model.gguf_
> Input GGUF. For a split model, the first part (`-00001-of-`). At most **256** parts.

_model.jns_
> Output JNS path. Created or truncated.

# CAVEATS

Conversion needs room for both the GGUF and the **.jns** at once, about twice the model. Keep **.jns** files on an NVMe SSD: experts are read from disk while the model answers. Only models with routed experts in every layer, or dense ones, are supported. The output is JNS version 2; **jns_planes** rewrites Q6-K expert downs into version 3 bit planes. Built into `bin/` by Janas's `./build.sh` from `tools/gguf2jns.c`. It is not a separate package.

# HISTORY

**gguf2jns** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). It replaced an earlier Python converter and is required to match **MODELS.md** fingerprints.

# SEE ALSO

[janas-get](/man/janas-get)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [jns_planes](/man/jns_planes)(1), [janas-chat](/man/janas-chat)(1), [janas-bench](/man/janas-bench)(1), [huggingface-cli](/man/huggingface-cli)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/INSTALL.md)```

<!-- verified: 2026-10-24 -->
