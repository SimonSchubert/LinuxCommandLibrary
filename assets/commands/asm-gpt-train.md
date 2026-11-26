# TAGLINE

Train a tiny transformer with a static assembly binary

# TLDR

Train on a **text** corpus and save a checkpoint

```asm-gpt-train --data [corpus.txt] --steps 400 -t 16 --save [checkpoint]```

Generate from a **saved** checkpoint

```asm-gpt-train --load [checkpoint] --sample-only --prompt "[prompt]" --temp 0.75 --topp 0.92```

Print **plain** logs instead of the live chart

```asm-gpt-train --data [corpus.txt] --plain```

# SYNOPSIS

**asm-gpt-train** [_options_]

# PARAMETERS

**--data** _file_
> UTF-8 text corpus. Required to train. The file is split into train and validation parts.

**--layers** _count_
> Transformer blocks. The default is 6.

**--dim** _width_
> Hidden width. The default is 192. **--heads** must divide this width.

**--heads** _count_
> Attention heads. The default is 6.

**--hidden** _width_
> Feed-forward width. The default is 512.

**--batch** _count_
> Batch size. The default is 16.

**--seq** _length_
> Context length. The default is 128.

**--steps** _count_
> Optimization steps. The default is 1500.

**--lr** _float_
> Peak learning rate. The default is 0.001. The schedule warms up, then decays.

**--wd** _float_
> Weight decay. The default is 0.1.

**--grad-clip** _float_
> Gradient-norm clip. The default is 1. 0 turns clipping off.

**--warmup** _steps_
> Linear warmup length. The default is the smaller of 100 and one tenth of **--steps**.

**--seed** _integer_
> Random seed. The default is 42.

**-t** _count_
> Worker threads. The default is 16.

**--tui**
> Force the live 80-column loss chart.

**--plain**
> Print log lines instead of the chart. On a terminal the chart is the default.

**--log-every** _steps_
> How often plain mode prints a line. The default is 50.

**--eval-every** _steps_
> How often to score the validation split. The default is 100. 0 disables it.

**--eval-batches** _count_
> Validation batches per score. The default is 20.

**--sample-every** _steps_
> How often to print a sample during training. The default is 250. 0 disables it.

**--sample-tokens** _count_
> Characters to generate per sample. The default is 200.

**--prompt** _text_
> Text to continue. The default is ROMEO, then a newline. A backslash-n in the argument is a newline.

**--temp** _float_
> Sampling temperature. 0 is greedy. The default is 0.8.

**--topp** _float_
> Nucleus sampling cutoff. The default is 0.95.

**--save** _file_
> Write a checkpoint after training.

**--load** _file_
> Read a checkpoint, to resume or to sample.

**--sample-only**
> Skip training and generate from **--load**.

**--dump-debug** _directory_
> Write weights and step-zero tensors for a numeric check.

# DESCRIPTION

**asm-gpt-train** is a static Linux executable, written in x86-64 assembly, that trains a small character-level transformer and samples text from a checkpoint. It has no C library and no dynamic linker. The binary in a build tree is **build/asm-gpt-train** until you copy it onto PATH.

It needs an x86-64 CPU with AVX2 and FMA. Build it with nasm and binutils from the training directory of the same repository as **asm-llm**. A text file is the training set. **--sample-only** with **--load** generates without another training run.

On a terminal it draws a live loss chart. **--plain** switches that to log lines, and **--tui** forces the chart.

# CAVEATS

There is no distro package. Linux x86-64 only. The bare-metal image in the same repository is not this command. Checkpoints are the project's own format, not a GGUF file. The default prompt is a Shakespeare speaker name because the published demo trains on that corpus.

# SEE ALSO

[nasm](/man/nasm)(1), [asm-llm](/man/asm-llm)(1)

# RESOURCES

```[Source code](https://github.com/alesha-pro/llm.asm)```

```[Documentation](https://github.com/alesha-pro/llm.asm/blob/main/03-minigpt-train/README.md)```

<!-- verified: 2026-11-26 -->
