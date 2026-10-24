# TAGLINE

Rewrite a JNS model so expert down matrices are stored by neuron

# TLDR

Turn **Q6-K** expert downs into rows by neuron

```jns_neurons [model.jns] [model.neurons.jns]```

Also convert **Q4-K** downs

```jns_neurons --q4k [model.jns] [model.neurons.jns]```

Use **8** threads

```jns_neurons --threads [8] [model.jns] [model.neurons.jns]```

# SYNOPSIS

**jns_neurons** [**--q4k**] [**--threads** _N_] _in.jns_ _out.jns_

# DESCRIPTION

**jns_neurons** rewrites a **JNS** model so each expert's **down** matrix is stored by neuron: one row per neuron, that neuron's outputs across the model width, in Q6-K's three bit planes. The engine can then read six, four, or two bits of a neuron (or skip it) according to how much that neuron contributes, instead of reading every column of a row-major matrix.

Output channels are grouped in blocks of 256. Every neuron's block 0 is stored, then every neuron's block 1, because the engine reads one block of outputs for a chunk of neurons at a time. Each output channel is divided by its root mean square over the neurons; that scale is kept as a float in front of the rows and multiplied back after the sum, so a few very large channels do not set the scale of every group they fall in.

Q6-K downs are converted, whether they are already in bit planes or not. **--q4k** also converts Q4-K downs. Those become six-bit values and then take more bytes than the Q4-K they came from. Each converted down is unpacked, transposed, and quantized again with Janas's own Q6-K quantizer: a second rounding, so the weights are close to the originals, not the same bits. Gate and up are copied. Layers that are not converted, and the resident weights, are copied as they are. Expert slots keep their on-disk order.

Wrong usage prints `usage: jns_neurons [--q4k] [--threads N] <in.jns> <out.jns>` and exits **2**. A file with nothing to convert prints `no down matrix to turn into neurons` and exits **1** (Q4-K downs need **--q4k**). Open, read, or write failures exit **1**. Progress (percent, gigabytes, seconds) goes to stderr. Success prints the output path, how many layers were turned, and the file size in gigabytes.

# PARAMETERS

**--q4k**
> Also turn Q4-K down matrices into the by-neuron Q6-K layout.

**--threads** _N_
> Worker threads (default: the number of processors online). Must be at least 1.

_in.jns_
> Input JNS.

_out.jns_
> Output JNS. Created or truncated. The header version is the current JNS version in the tool's source.

# CAVEATS

This requantizes. It is not a bit-exact layout change like **jns_planes**. Q4-K downs converted with **--q4k** grow. A file whose downs are neither Q6-K nor (with the flag) Q4-K, or whose dimensions are not multiples of 256, is left unconverted and the tool exits **1**. The two files must both fit on disk. Built into `bin/` by Janas's `./build.sh` from `tools/jns_neurons.c`. It is not a separate package.

# HISTORY

**jns_neurons** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). It is the by-neuron counterpart of **jns_planes**: planes let a short-of-memory machine read a prefix of a slot; this layout lets the engine read each neuron only as deep as that neuron earns.

# SEE ALSO

[jns_planes](/man/jns_planes)(1), [jns_check](/man/jns_check)(1), [gguf2jns](/man/gguf2jns)(1), [janas-get](/man/janas-get)(1), [janas-chat](/man/janas-chat)(1), [janas-bench](/man/janas-bench)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

<!-- verified: 2026-10-24 -->
