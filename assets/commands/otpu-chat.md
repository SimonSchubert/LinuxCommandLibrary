# TAGLINE

Chat with an LLM running on the openTPU simulator or FPGA card

# TLDR

**Chat** on the ISA simulator (default model Qwen3-0.6B)

```otpu-chat```

Chat with **LFM2.5-230M**

```otpu-chat --model lfm2```

**One-shot** prompt and exit

```otpu-chat --prompt "[Why is the sky blue?]"```

**Line-by-line REPL** instead of the full-screen TUI

```otpu-chat --plain```

Run on the **FPGA card** over PCIe

```otpu-chat --backend board```

**Qwen3 thinking** mode

```otpu-chat --think```

**Greedy** decoding

```otpu-chat --greedy```

Qwen3.5 with **4-bit weights** and the MTP drafter

```otpu-chat --model qwen35-2b --wformat fp4 --mtp```

# SYNOPSIS

**otpu-chat** [**--model** _name_] [**--backend** _isa_|_board_|_board-sim_|_rtl_] [_options_]

# DESCRIPTION

**otpu-chat** is the interactive host client of **openTPU**, an open-source AI accelerator (SystemVerilog RTL, bit-exact ISA simulator, kernel compiler, and PCIe FPGA bring-up) in the FeSens/openTPU repository. After `pip install -e .` in that tree it is installed as a console script.

The default **--backend isa** runs the model's programs on the Python ISA simulator and works on a laptop without a card. **board** talks to an Inspur YPCB-00338 Kintex-7 card through XDMA (`--dev`, default `/dev/xdma0`). **board-sim** uses the Verilator board model; **rtl** is the RTL simulator.

The model runs on the device. The host tokenizes, applies the chat template, looks up embedding rows, and samples from streamed logits. The KV cache stays in device DRAM across turns. Interactive mode is a full-screen **Textual** UI (conversation plus a status line with TTFT, prefill/decode tok/s, and KV context). **--plain** and **--prompt** print the same numbers as one line per reply. On the card the process holds the device lock and publishes status for **otpu-smi**.

**--model** is a short name from the repository's `models/` directory, or a Hugging Face checkpoint path. Known short names: **qwen3** (default, Qwen3-0.6B), **lfm2** (LFM2.5-230M), **qwen35** (Qwen3.5-0.8B), **lfm2-2.6b**, **smollm3**, **phi4-mini**, **qwen35-2b**, **qwen35-4b**, **gemma4**.

# PARAMETERS

**--model** _name_
> Short name or checkpoint directory (default **qwen3**).

**--backend** _isa_|_board_|_board-sim_|_rtl_
> Where to run (default **isa**).

**--dev** _path_
> XDMA device prefix for **--backend board** (default `/dev/xdma0`).

**--clock-mhz** _N_
> Core clock used to convert device cycles into tok/s (default: bitstream **CORE_KHZ**, or 100 MHz on register map 1).

**--cap** _N_
> KV cache capacity in tokens (default **2048**).

**--prompt** _text_
> Ask one question and exit (plain output).

**--plain**
> Line-by-line REPL instead of the full-screen interface.

**--think**
> Enable Qwen3 / Qwen3.5 thinking mode.

**--greedy**
> Greedy (argmax) decoding.

**--temperature** _N_, **--top-k** _N_, **--top-p** _N_, **--repetition-penalty** _N_, **--seed** _N_
> Sampling; defaults are per model family (Qwen3: temperature 0.7, top-k 20, top-p 0.8; LFM2: temperature 0.1, top-k 50).

**--max-new** _N_
> Maximum tokens per reply (default **1024**).

**--wformat** _auto_|_int8_|_fp4_|_int4_|_mix_
> Weight format of the layers (default **auto**: the model's recommended mix, else int8). **fp4** needs a bitstream with 4-bit matmul support.

**--head-format** _int8_|_fp4_|_int4_
> Weight format of the LM head (default: same as **--wformat**).

**--mtp**
> Qwen3.5: decode with the model's multi-token prediction drafter on the device.

**--per-position**
> Compile a decode program per position instead of one resident program per 256-token bucket.

**--no-prog-cache**
> Recompile decode-loop bucket programs every process (default: cache on disk).

**--no-prompt-runs**
> Compile each prompt's prefill at its exact positions instead of bucketed run-time-position programs.

# CAVEATS

Install from the openTPU tree (`pip install -e .`); the scripts are not a separate PyPI distribution. Tokenizers and checkpoints need **transformers** and a Hugging Face download into `models/<name>`. **--backend board** needs the XDMA driver, a loaded bitstream, and typically **otpu-setup**. The ISA simulator is much slower than the card (on the order of seconds per token on a laptop). Default **--cap** 2048 bounds context; a full KV cache ends the reply. **--mtp** applies only to Qwen3.5. Interactive `/stats` is a TUI command, not a CLI flag.

# HISTORY

**openTPU** is an Apache-2.0 research accelerator by **FeSens** that pairs a small SystemVerilog design with host tools (`otpu-chat`, **otpu-smi**, **otpu-lens**). The chat client grew with the board bring-up: ISA-only at first, then PCIe, resident decode programs, streamed logits, and later 4-bit weights and Qwen3.5 MTP.

# SEE ALSO

[otpu-smi](/man/otpu-smi)(1), [otpu-lens](/man/otpu-lens)(1), [llama-cli](/man/llama-cli)(1), [ollama](/man/ollama)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/FeSens/openTPU)```

```[Documentation](https://github.com/FeSens/openTPU/blob/main/README.md)```

<!-- verified: 2026-10-06 -->
