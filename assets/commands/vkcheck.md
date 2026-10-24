# TAGLINE

Check whether this GPU can run Janas-LLM's Vulkan backend

# TLDR

**Run** the backend check (from a Janas build)

```vkcheck```

Name a **Vulkan library** instead of the default loader

```vkcheck [/usr/lib/x86_64-linux-gnu/libvulkan.so.1]```

**Build it alone**, then run (Linux, Vulkan headers present)

```cc -O2 tools/vkcheck.c -o vkcheck -ldl -lm```

```vkcheck```

# SYNOPSIS

**vkcheck** [_library_]

# DESCRIPTION

**vkcheck** reports whether this machine's GPU can run **Janas-LLM**'s GPU backend, and how. For every Vulkan device it prints each requirement with the driver's answer, then the decision the engine would take (the same rules as `src/llm/gpu.c`). If a device is taken, it runs three short tests on that device:

**zero-copy**: this process's memory imported by the GPU (the host-allocation import extension), read and written by a shader, with the CPU seeing the result and no copy. An integrated GPU (Apple's under MoltenVK too) is taken only this way.

**dot**: the integer dot product of four signed bytes against the CPU's, plus a rough rate. Janas-LLM's quantized products are made of that operation; a driver may emulate it.

**float**: fused multiply-add rounded once, a precise a times b plus c twice, and a precise sum in the order written (what keeps the GPU's results the CPU's to the bit, and what a fast-math compiler breaks). Whether subnormals survive is printed for information.

The engine's choice is a discrete GPU first, then an integrated one. The optional _library_ is loaded instead of the usual search (`libvulkan.so.1` then `libvulkan.so` on Linux; the Vulkan loader or MoltenVK on macOS; `vulkan-1.dll` on Windows).

`./build.sh` writes the program to `bin/` from `tools/vkcheck.c`, next to **janas-chat**. It is also meant to be compiled on its own where Janas does not build yet.

# PARAMETERS

_library_
> Path to a Vulkan loader or MoltenVK. With none, the platform defaults are tried in order.

# CONFIGURATION

**JANAS GPU DEVICE**
> `discrete` or `integrated`: restrict which kind of GPU the engine (and this tool) would pick. Same meaning as in Janas-LLM.

**JANAS GPU SG**
> Wanted subgroup size (default **8**). Used when the device lets the size be chosen.

# CAVEATS

Exit **0** when the engine would take a GPU and every test passes. Exit **1** when there is no Vulkan library, no instance, no GPU, no GPU the engine would take, or a test failed (the last case prints `some test FAILED: tell the project, with this output`). Exit **2** when the binary was compiled without the Vulkan headers (`vkcheck: built without the Vulkan headers`). The Vulkan library is loaded at run time. Built into `bin/` by Janas's `./build.sh`. It is not a separate package. Attach the output to a Janas hardware report.

# HISTORY

**vkcheck** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). `docs/hardware.md` names it as the check for whether a GPU can run the GPU backend, including on machines where the rest of Janas does not build.

# SEE ALSO

[gpu_check](/man/gpu_check)(1), [janas-bench](/man/janas-bench)(1), [janas-chat](/man/janas-chat)(1), [vulkaninfo](/man/vulkaninfo)(1), [janas-get](/man/janas-get)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/hardware.md)```

<!-- verified: 2026-10-24 -->
