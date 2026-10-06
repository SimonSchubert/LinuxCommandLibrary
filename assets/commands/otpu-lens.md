# TAGLINE

Record and inspect openTPU hardware or simulator profiles in the Lens profiler

# TLDR

**Record** a card run and write a profile

```otpu-lens record --dev [/dev/xdma0] --model [models/Qwen3-0.6B] --prompt "[Hi]" --tokens [2] -o [card.otpuprof]```

Record on the **Verilator** board model

```otpu-lens record --sim --workload [mlp-small] -o [sim.otpuprof]```

**Open** a profile in the browser app

```otpu-lens open [card.otpuprof]```

Write **standalone HTML** with the profiles embedded

```otpu-lens html [card.otpuprof] -o [card.html]```

**Summarize** a profile file

```otpu-lens info [card.otpuprof]```

**List** simulator workloads

```otpu-lens list```

Record and **open** immediately

```otpu-lens record --sim -o [sim.otpuprof] --open```

# SYNOPSIS

**otpu-lens** **record** **-o** _file_ [_options_]

**otpu-lens** **open** [_file_] [**--port** _N_] [**--no-browser**]

**otpu-lens** **html** _file_ **-o** _out_

**otpu-lens** **info** _file_

**otpu-lens** **list**

# DESCRIPTION

**otpu-lens** is the host frontend for **Lens**, the openTPU profiler. **record** runs decode (or a kernel workload) with the hardware trace buffer enabled, reads 64-bit TRACE records back, rebuilds them into the same profile JSON the RTL/ISA path produces, and writes an `.otpuprof` file. **open**, **html**, **info**, and **list** are passed through to `python -m opentpu.lens`.

On the card, **record** tokenizes a prompt, prefills, then traces **--tokens** decode steps starting at **--pos** (default: the last prompt token). Each traced step becomes one profile (`kind` **hw**). If the bitstream has no trace buffer (register map 1), the profile is counters-only (`kind` **board**). **--sim** does the same on the Verilator board model: a kernel workload from **list** (default **mlp-small**) or **qwen-tiny**.

Lost events are reported in each profile's **hwtrace** metadata, as notes, and on stdout: **TRACE_DROP** (capture queue drops) and records that did not fit the buffer. **--keep first** (default) stops when the buffer is full so the tail is missing; **--keep last** uses a ring and drops the head. The web UI shows a roofline, a timeline, and per-instruction tables, including a floorplan replay of what each unit is doing each cycle.

# PARAMETERS

**record** **-o**, **--out** _file_
> Profile file to write (required for **record**).

**record** **--dev** _path_
> XDMA device prefix (default `/dev/xdma0`).

**record** **--sim**
> Use the Verilator board model instead of a card.

**record** **--model** _path_
> Hugging Face checkpoint for a card recording (default `models/Qwen3-0.6B` in the repository).

**record** **--prompt** _text_
> Prompt to tokenize (default `What is the capital of France?`).

**record** **--prompt-ids** _ids_
> Comma-separated token ids instead of **--prompt** (no tokenizer).

**record** **--tokens** _N_
> Number of steps to trace; one profile each (default **1**).

**record** **--pos** _N_
> Position of the first traced step (default: last prompt token; **qwen-tiny** default 3).

**record** **--keep** _first_|_last_
> When the trace buffer fills: keep the first records or the last (ring).

**record** **--workload** _name_
> With **--sim**: a kernel name from **list**, or **qwen-tiny** (default **mlp-small**).

**record** **--open**
> Serve the profile in the Lens app after writing.

**record** **--wformat** / **--head-format**
> Weight format of the layers / LM head (`int8`, `fp4`, `int4`, and `mix` for layers).

**open** **--port** _N_
> Listen port (default **0**, ephemeral).

**open** **--no-browser**
> Do not launch a browser.

# CAVEATS

**record** on a card needs XDMA, a bitstream with a trace buffer for full timelines, and the device lock (it will not run beside **otpu-chat**). A map-1 bitstream yields counters only. Dropped or wrapped traces make the timeline incomplete. Card **record** uses **transformers** unless **--prompt-ids** is given. **open** / **html** start a small local HTTP server that serves the profiler page. The command is installed only via `pip install -e .` in the openTPU tree.

# HISTORY

**Lens** is the openTPU profiler: first an RTL/ISA recorder (`python -m opentpu.lens`), then **otpu-lens** to capture the same profiles from the card's TRACE_CTRL buffer so a run on hardware can be inspected with the same roofline and floorplan views.

# SEE ALSO

[otpu-chat](/man/otpu-chat)(1), [otpu-smi](/man/otpu-smi)(1), [perf](/man/perf)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/docs/lens.md)```

<!-- verified: 2026-10-06 -->
