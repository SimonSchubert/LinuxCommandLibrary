# TAGLINE

Rewrite a JNS model so Q6-K expert downs are stored as bit planes

# TLDR

Cut expert **down** matrices into three two-bit planes

```jns_planes [model.flat.jns] [model.jns]```

# SYNOPSIS

**jns_planes** _in.jns_ _out.jns_

# DESCRIPTION

**jns_planes** rewrites a **JNS** model so each expert's **down** matrix that is Q6-K is stored as three two-bit planes (JNS version 3). With all three planes every weight is the original Q6-K value, bit for bit. The bytes inside an expert slot are reordered so a machine short of memory can read a prefix of the slot: the base plane alone (two bits per weight), or two planes (four), instead of the whole slot.

Gate and up are copied as they are. Layers whose down matrix is not Q6-K are copied unchanged. Resident tensors are copied; their file offsets move if the layer table grows. Expert slots keep the order they had on disk (co-activation). Each level of a rewritten slot is padded to a whole number of pages.

**janas-get --from-gguf** runs **gguf2jns** first, then this command when the catalog fingerprint is the plane-cut file (the intermediate flat file is removed). Wrong usage prints `usage: jns_planes <in.jns> <out.jns>` and exits **2**. Read, write, or open failures exit **1**. Progress goes to stderr; a summary of layers, how many were planed, file size, and per-slot level sizes goes to stdout.

# PARAMETERS

_in.jns_
> Input JNS (typically the version 2 file **gguf2jns** wrote).

_out.jns_
> Output JNS. Created or truncated. The header version is JNS version 3 (the current version in the tool's source).

# CAVEATS

This is a layout rewrite, not a requantize: Q6-K downs stay Q6-K values. Other down types are left packed as they were, so a mixed file can have some layers planed and some not. The output is a different file from **gguf2jns**; **MODELS.md** fingerprints for catalog models that go through this step are the plane-cut result. Built into `bin/` by Janas's `./build.sh` from `tools/jns_planes.c`. It is not a separate package.

# HISTORY

**jns_planes** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). **janas-get** uses it on the conversion path that matches catalog SHA-256 fingerprints after plane-cutting.

# SEE ALSO

[gguf2jns](/man/gguf2jns)(1), [janas-get](/man/janas-get)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [janas-chat](/man/janas-chat)(1), [janas-bench](/man/janas-bench)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/INSTALL.md)```

<!-- verified: 2026-10-24 -->
