# TAGLINE

Train and sample a small recurrent language model

# TLDR

**Open the home screen** of commands and local checkpoints

```oxide_ai_pssa```

**Train** a checkpoint on the first slice of a corpus

```oxide_ai_pssa train [data/corpus.txt] -o [data/model.pssa] --max-tokens [200000] -e [1]```

**Continue** that run on the next slice

```oxide_ai_pssa train [data/corpus.txt] -o [data/ck02.pssa] --resume [data/model.pssa] --skip-tokens [200000] --max-tokens [200000] -e [1]```

**Continue a prompt** from a checkpoint

```oxide_ai_pssa generate "[The sun is]" -m [data/model.pssa] --max-new-tokens [64]```

**Chat** with a checkpoint at a fixed temperature

```oxide_ai_pssa chat -m [data/model.pssa] --temperature [0.7]```

**Score** a checkpoint and print one JSON metrics object

```oxide_ai_pssa evaluate [data/heldout.txt] -m [data/model.pssa]```

**Download** a Hugging Face dataset as plain text

```oxide_ai_pssa download [wikimedia/wikipedia] -o [data/downloaded.txt]```

**Clean** a raw WikiText dump into a new file

```oxide_ai_pssa clean-wikitext [wiki.train.raw] -o [data/wikitext-clean.txt]```

**Watch** a training run on a full-screen dashboard

```oxide_ai_pssa train [data/corpus.txt] -o [data/model.pssa] | oxide_ai_pssa tui --chain [chain]```

**Show help** for one command

```oxide_ai_pssa help train```

# SYNOPSIS

**oxide_ai_pssa** [_command_] [_options_] [_arguments_]

# DESCRIPTION

**oxide_ai_pssa** trains and samples PSSA, a plastic state-space language model written in Rust. Text is read one token at a time through a selective state-space recurrence with an episodic memory bank. Checkpoints are **.pssa** files. A decoder-only transformer baseline of the same scale uses the same data and schedule flags and writes **.trfm** files (**train-transformer**, **generate-transformer**, **evaluate-transformer**).

With no arguments the program clears the screen and prints every command, plus **.pssa** checkpoints and text corpora found in the working directory, **data/**, **chain/**, and **data/chain/**. **help** and **-h** / **--help** print usage. **help** _command_, or _command_ **--help**, prints that command's flags.

A training source may be a local file, a directory of text files, an **http** or **https** URL, a Hugging Face repository written **hf:**_owner/name_, or the built-in corpus **science**. When **data/downloaded.txt** exists and no source is given, **train** uses that file. Otherwise it uses **science**.

Build the binary from a checkout. The crate needs a Rust toolchain with **edition 2024**.

```git clone https://github.com/Sparticle62ops/pssa.git```

```cd pssa && cargo build --release && ./target/release/oxide_ai_pssa```

**cargo build --release --features cuda** adds an optional cuBLAS path (CUDA 12.6). The binary still runs on a machine with no CUDA driver. Without that feature, dense matrix work can use a WebGPU device; software WebGPU adapters are refused, and the rest of the work stays on the CPU. **train-transformer** is CPU-only. **--depth** above **1** (extra PSSA blocks, up to **32**) is CPU-only as well.

On failure the program prints **error:** to stderr and exits with status **2**.

# PARAMETERS

**train** [_source_]

> Fit a **.pssa** checkpoint. **-o** / **--out** defaults to **data/model.pssa**. Defaults are latent **256**, recurrent state **16**, memory-key width **32**, memory capacity **512**, depth **1**, chunk length **64**, learning rate **0.001**, seed **42**, **4** epochs, and **8** chunks per optimizer update. **--tokenizer** is **bpe** or **word** (default **bpe**) with a BPE vocabulary ceiling of **2048** (**--vocab-size**). **--max-tokens** caps the tokens used. **--skip-tokens** starts that far into the corpus and wraps at the end of the file, so a chain of short runs can walk a long corpus. **--resume** _path_ continues model and optimizer state. **--loss-csv** _path_ appends a training curve, sampled every **--loss-every** target tokens (default **10000**) on an optimizer-update boundary. **--batch-size** is the number of independent document lanes (default **1**). **--warmup-steps** and **--total-updates** set the learning-rate schedule. **--tokens-seen** offsets a new loss CSV when resuming.

**train-transformer** [_source_]

> Train the decoder-only baseline (1 layer, width 256, 4 heads, FFN 448) to **data/model.trfm**. It shares the data, window, tokenizer, and optimizer flags, and drops **--latent**, **--state**, **--key**, **--memory**, **--batch-size**, and **--depth**. **--tokenizer-from** _pssa-checkpoint_ copies that file's tokenizer so both models see the same vocabulary. Leave **--tokenizer-from** off when **--resume** is set; the resumed checkpoint already stores its tokenizer. Context resets at each chunk.

**generate** _prompt_

> Print a completion of _prompt_. **-m** / **--model** defaults to **data/model.pssa**. **-t** / **--temp** / **--temperature** defaults to **0.70**. Temperature **0** is greedy (top-1, repetition penalty **1**); any higher temperature samples from the top **24** tokens with repetition penalty **1.25**. **--max-new-tokens** defaults to **64** and the cap is **100000**. The prompt is positional or **-p** / **--prompt**, and only one of those forms is accepted. On current BPE checkpoints (**V7** / **V8**) the tokenizer is restored from the file, and **--data** is an error. Older word-tokenizer checkpoints can take **--data** as a vocabulary check.

**generate-transformer** _prompt_

> Same sampler for a **.trfm** checkpoint. The default model path is **data/model.trfm**. **--data** is an error.

**chat**, **repl** [_source_]

> Read a prompt line, print a reply, and repeat, using **data/model.pssa** unless **-m** is set. Temperature is fixed at launch (default **0.70**) with the same sampler defaults as **generate**. An empty line is ignored. **/exit** or **quit** ends the loop. **repl** is an alias of **chat**.

**evaluate** [_source_]

> Print one JSON object of cross-entropy, perplexity, and accuracy. The checkpoint is not updated. **--skip-tokens** and **--max-tokens** select a held-out slice that stops at the end of the file. A source is required, positional or **-d** / **--data**. **evaluate-transformer** scores a **.trfm** file (default **data/model.trfm**).

**download** _repository_

> Save the train split of a Hugging Face dataset as plain text. **-o** / **--out** defaults to **data/downloaded.txt**.

**clean-wikitext** _input_ **-o** _output_

> Stream-clean a local UTF-8 WikiText raw dump into a new file. Headings and **<unk>** tokens are removed, the joins **@-@**, **@.@**, and **@,@** are expanded, punctuation spacing is normalized, and blank lines are collapsed. The output uses LF line endings. The input file is left unchanged. The output path must not already exist.

**status**

> List nearby **.pssa** checkpoints and text corpora larger than 4 KiB, then describe up to six checkpoints (vocabulary, latent width, state width, optimizer steps). Takes no options.

**benchmark**

> Train a tiny word-tokenizer model on one fixed sentence. The run passes when cross-entropy is below **0.8** and a 5-token greedy completion of "the patient scientist" contains **observes**. Takes no options.

**gpu-probe**

> Acquire a GPU compute device and, when one is present, compare a small matrix multiply with the CPU reference. A missing device prints a CPU fallback note and still exits **0**. A numerical mismatch exits **2**. The probe checks that GEMM, not a full training step. Takes no options.

**tui** [**-c** _dir_]

> Draw a read-only dashboard for a training log on stdin: **oxide_ai_pssa train ... | oxide_ai_pssa tui**. Stdin must be a pipe and stdout must be a terminal. **-c** / **--chain** is the directory scanned for **.pssa** files on the chain tab; the default is **/kaggle/working/chain**. Tabs are monitor, chain, and model. **q** or **Esc** restores the terminal.

**help** [_command_]

> Print general usage, or the flags for one command.

# CAVEATS

Published training runs are research-scale, about **1.5 million** parameters on a cleaned WikiText-103 slice. Treat completions as a prototype of the architecture.

The home screen's sample lines are spelled **oxide**. The Cargo binary name is **oxide_ai_pssa**. Some error strings also say **oxide**, including **run oxide help**.

**train** **--skip-tokens** wraps when the window passes the end of the corpus. **evaluate** stops there. Resume a chain on the same corpus the checkpoint was trained on.

**clean-wikitext** opens the output with create-new, so an existing file, symlink, or hard link is refused. Network corpora are saved as downloaded.

# HISTORY

The GitHub repository **Sparticle62ops/pssa** was created in **August 2026** by the account **Sparticle62ops**. The interface described here is crate version **0.4.0**. The program is released under the **GNU GPL v3**.

# SEE ALSO

[llama-cli](/man/llama-cli)(1), [ollama](/man/ollama)(1), [llama.cpp](/man/llama.cpp)(1), [llm](/man/llm)(1)

# RESOURCES

```[Source code](https://github.com/Sparticle62ops/pssa)```

<!-- verified: 2026-09-30 -->
