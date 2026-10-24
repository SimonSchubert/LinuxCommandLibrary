# TAGLINE

Check a Janas-LLM JNS model file, and optionally every expert checksum

# TLDR

Print the **header** of a model

```jns_check [model.jns]```

Read **every expert** and check its checksum

```jns_check [model.jns] --verify```

# SYNOPSIS

**jns_check** _model.jns_ [**--verify**]

# DESCRIPTION

**jns_check** opens a **JNS** model and prints what the header and metadata say: architecture, layer count, expert count and how many are used, model width, resident size and tensor count, expert-region size, RMS epsilon, RoPE base, attention head counts, tokenizer name, and the first layer's slot size with the gate, up, and down types and shapes.

**--verify** then reads every expert slot the way the engine does (one direct I/O read per slot) and compares each CRC-32 with the file's expert checksum table. It prints how many disagree, how much was read, and the rate (one read at a time, the checksum on one core).

If some layers still have their level sizes written as zero, the way **hf2jns_mtp** did before issue 6, the tool says so: those layers are read as the whole slot and the file works as it is. Converting it again with the current **hf2jns_mtp** is optional.

Wrong usage prints `usage: jns_check <model.jns> [--verify]` and exits **2**. A file that will not open exits **1**. **--verify** exits **1** on a read error or when any checksum disagrees, and **0** when every expert matches. Without **--verify** a file that opens exits **0**.

# PARAMETERS

_model.jns_
> JNS file to open. The flag, when used, comes after this path.

**--verify**
> Read every expert slot with direct I/O and compare its CRC-32 with the table.

# CAVEATS

**--verify** walks the whole expert region, which is most of a large model, and needs a filesystem that allows direct I/O on that file. It does not change the file. Built into `bin/` by Janas's `./build.sh` from `tests/jns_check.c`, next to the other tools. It is not a separate package.

# HISTORY

**jns_check** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). The tool list in `docs/tools.md` names it as the checker for a model file.

# SEE ALSO

[gguf2jns](/man/gguf2jns)(1), [jns_planes](/man/jns_planes)(1), [jns_neurons](/man/jns_neurons)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [janas-get](/man/janas-get)(1), [janas-chat](/man/janas-chat)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/tools.md)```

<!-- verified: 2026-10-24 -->
