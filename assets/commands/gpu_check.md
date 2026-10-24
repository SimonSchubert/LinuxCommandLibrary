# TAGLINE

Compare Janas-LLM GPU matvecs with the CPU, bit for bit

# TLDR

**Run** every GPU product against the CPU (from a Janas build)

```gpu_check```

Touch **n GiB** first, like the expert cache

```GPU_CHECK_BIG_GB=[8] gpu_check```

Copy weights through the GPU's **own memory** (discrete-card path)

```JANAS_GPU_COPY=1 gpu_check```

# SYNOPSIS

**gpu_check**

# DESCRIPTION

**gpu_check** runs every kind of product Janas-LLM's GPU backend takes and compares each result with the CPU's, bit for bit. It is the check `docs/hardware.md` asks for when a GPU gives wrong answers while **JANAS GPU=0** is right: the last line says `ok` or `FAILED`, with the shapes that differ above it. A run takes a minute or two.

It walks random matrices in the types the backend implements (Q4-K, Q5-K, Q6-K, Q6-K bit planes at three levels, Q8-0, the 32- and 64-weight blocks, the 1- and 2-bit IQ types, and bf16 weights on float vectors), several shapes, vector counts, and strides, including rows that end inside a group of 256. The fast prompt is turned off for the run so rounding does not hide a mismatch. When **JANAS GPU COPY** is set, weights go through the GPU's own memory, as on a card that does not share host RAM.

With no usable GPU it prints `gpu_check: no GPU (...), skipped` and exits **0**. Import or comparison failures exit **1**.

`./build.sh` writes the program to `bin/` from `tests/gpu_check.c`. Release packages from **24 October 2026** include it. There are no command-line flags; extra arguments are ignored.

# CONFIGURATION

**JANAS GPU COPY**
> Set to **1** to copy weights onto the GPU as a discrete card does, then compute there.

**GPU CHECK BIG GB**
> If set to a positive integer _n_, allocate and touch _n_ GiB before the tests, similar to the engine's expert cache.

**GPU CHECK ENGINE**
> If set, use a 12-thread pool pinned like the engine (CPUs 0-11). Default is 4 unpinned threads.

**GPU CHECK PIN**
> With **GPU CHECK ENGINE**, also pin the calling thread to CPU 0.

# CAVEATS

Needs a Janas build with GPU support (Vulkan headers and a new enough glslang). No GPU is a skip, not a failure. A failed comparison prints at most ten mismatch lines, then `FAILED` on the summary. The summary also names the GPU and its subgroup size. Built into `bin/` by Janas's `./build.sh`. It is not a separate package. Attach the output to a Janas hardware report.

# HISTORY

**gpu_check** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). It entered the binary packages with the **24 October 2026** release so testers can tell a bad GPU product from some other fault.

# SEE ALSO

[vkcheck](/man/vkcheck)(1), [janas-bench](/man/janas-bench)(1), [janas-chat](/man/janas-chat)(1), [vulkaninfo](/man/vulkaninfo)(1), [jns_check](/man/jns_check)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/hardware.md)```

<!-- verified: 2026-10-24 -->
