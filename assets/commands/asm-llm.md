# TAGLINE

Run a small Qwen model with a static assembly binary

# TLDR

Generate a **reply**

```asm-llm -m [model.asmbin] -p "[prompt]" -n 128 -t 16```

Start an **interactive** chat

```asm-llm -m [model.asmbin] --chat -t 16```

Turn on **reasoning** before the answer

```asm-llm -m [model.asmbin] -p "[prompt]" -n 512 --think```

Sample with **temperature**

```asm-llm -m [model.asmbin] -p "[prompt]" --temp 0.6 --topp 0.95 --seed 1337```

# SYNOPSIS

**asm-llm** -m _file_ [_options_]

# PARAMETERS

**-m** _file_
> Weight file in the project's asmbin format. Required.

**-p** _text_
> User prompt, as UTF-8. The default is a built-in prompt.

**-n** _count_
> Maximum number of tokens to generate. The default is 128.

**-t** _count_
> Worker threads. The default is 32.

**-c** _length_
> Context length for the key-value cache. The default is 2048.

**--chat**
> Interactive multi-turn chat on standard input and output. The cache is kept across turns. Slash commands clear the conversation, toggle reasoning, or quit.

**--think**
> Ask the model to reason before the answer.

**--raw**
> Skip the chat template and encode the prompt bytes directly.

**--tokens** _csv_
> Feed comma-separated token ids instead of text.

**--temp** _float_
> Sampling temperature. 0 is greedy. The default is 0.

**--topp** _float_
> Nucleus sampling cutoff. The default is 0.95.

**--seed** _integer_
> Seed for sampling. The default is 42.

**--dump-logits** _file_
> Write the final prefill logits to a file.

**--print-tokens**
> Print prompt and generated token ids on standard error.

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**asm-llm** is a static Linux executable, written in x86-64 assembly, that runs inference for Qwen3-0.6B. It has no C library and no dynamic linker. A weight file in the project's own format is required. The binary in a build tree is **build/asm-llm** until you copy it onto PATH.

The same repository also builds a bare-metal image, which is not a host command, and the trainer **asm-gpt-train**. This command is the Linux ELF described in the inference readme.

It needs an x86-64 CPU with AVX2, FMA, and F16C. Build it with nasm and binutils from the inference directory.

# CAVEATS

There is no distro package. The weight file is not inside the 15 KB executable; **-m** has to point at one you exported. The chat slash commands are read from the terminal, not from a config file. Output is greedy unless **--temp** is above zero.

# SEE ALSO

[nasm](/man/nasm)(1), [llama-cli](/man/llama-cli)(1), [asm-gpt-train](/man/asm-gpt-train)(1)

# RESOURCES

```[Source code](https://github.com/alesha-pro/llm.asm)```

```[Documentation](https://github.com/alesha-pro/llm.asm/blob/main/01-qwen3-inference/README.md)```

<!-- verified: 2026-11-26 -->
