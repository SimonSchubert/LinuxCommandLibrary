# TAGLINE

Write and score Natural Semantic Metalanguage explications

# TLDR

Explain **one word** with a model trained for it

```janas-nsm [model.jns] [chair]```

Pass **example sentences** the model should see

```janas-nsm [model.jns] [chair] ["a wooden chair by the window"]```

Explain a **file of words** and keep the JSON

```janas-nsm [model.jns] --batch [words.jsonl] --out [out.jsonl]```

**Score** explications that already exist, with no model

```janas-nsm --score [explications.jsonl]```

Use the **paper's prompt** and the full prime list

```janas-nsm [model.jns] [leg] --prompt paper --lexicon full```

Let the model write **only** primes, function words, and molecules

```janas-nsm [model.jns] [leg] --strict -n [5]```

# SYNOPSIS

**janas-nsm** _model.jns_ _word_ [_example_...] [_options_]

**janas-nsm** _model.jns_ **--batch** _file_ [_options_]

**janas-nsm** **--score** _file_ [_options_]

# DESCRIPTION

**janas-nsm** asks a model trained for the Natural Semantic Metalanguage (NSM) for a word's explication, then counts what that explication is made of. NSM paraphrases a meaning with a small set of semantic primes (someone, something, do, happen, want, know, good, before, and the rest) plus a few simpler words. The model Janas was checked with is DeepNSM (Llama 3.2 1B with a LoRA adapter, [arXiv 2505.11764](https://arxiv.org/abs/2505.11764)), converted with **hf2gguf** and **gguf2jns**. Janas does not ship those weights.

One word prints the explication, then a line of counts. A batch reads JSON lines and writes one JSON line per sample. **--score** only counts: each input line already has the explication, and no model is loaded.

The default prompt is the model card's (`Word:`, `Examples:`, `Paraphrase:`). **--prompt paper** uses the indented prompt from the paper's evaluation script. Sampling follows DeepNSM: temperature **0.7**, top-k **50**, top-p **0.95**, at most **512** tokens. Speculative decoding is off.

Counts use one of two prime lists. **paper** (the default) is the list DeepNSM's published scores were computed with, single words, without "i" and "said". **full** is Goddard and Wierzbicka's 65 primes, their inflected forms, and their phrases. Other words are function words or molecules. Legality is 10 times (primes minus molecules) divided by the number of words, from -10 to 10. An explication is circular when one of its words has the target word's English lemma (suffix rules, not spaCy). On the paper's 1,341 published records, circularity matches spaCy on every record, and primes and molecules match on 1,337.

A batch ends with means and standard errors on the standard error, plus read and write speed when a model ran. Progress prints every 10 words unless **--quiet**.

# PARAMETERS

_model.jns_

> Janas model file. Required unless **--score**.

_word_ [_example_...]

> The word to explain, then optional example sentences. Required for a single word. Ignored when **--batch** or **--score** is set.

**--batch** _file_

> JSON lines. Each object has "word" and "examples" (an array of strings). At most **64** examples from a line are used.

**--score** _file_

> JSON lines with "word" and "explication" (or "text"). Counts them and loads no model.

**--out** _file_

> Where a batch's JSON lines go. Default is the standard output. The summary stays on the standard error.

**-n** _count_

> Explications per word (default **1**). Must be at least 1.

**--seed** _n_

> Sampling seed (default **1**).

**--prompt** _card_|_paper_

> **card** (default) or **paper**. Anything else is an error.

**--lexicon** _paper_|_full_

> Prime list. **full** selects the 65 primes with forms and phrases. Any other value, including **paper**, selects the paper's list.

**--strict**

> The model may write only prime forms, function words, punctuation, and the molecules. The output head computes those tokens alone.

**--molecules** _file_

> Molecules **--strict** allows, one word a line. Default is a built-in list (body parts, physical qualities, nature, people, everyday actions, and things). An empty file allows none.

**--temp** _t_

> Temperature (default **0.7**).

**--top-k** _k_

> Top-k (default **50**).

**--top-p** _p_

> Top-p (default **0.95**).

**--max** _tokens_

> Most tokens in one explication (default **512**). Must be at least 1.

**--quiet**

> No progress on the standard error. A single word still prints its explication.

**-h**, **--help**

> Print usage on the standard error and exit 0.

# CAVEATS

DeepNSM's weights, code, and data are CC BY-NC-SA 4.0. Convert a checkpoint with **hf2gguf** for research; do not expect Janas to include the model.

Context length is fixed at **4096** tokens. **--strict** restricts the output head on the CPU. A pass that runs entirely on the GPU still computes the whole head and applies the vocabulary afterwards. The restricted rows are not used on the GPU or the NPU.

**--strict** can raise legality and speed and still make the explication worse at saying which word it is. On DeepNSM-1B Q8_0, five seeds each way over the paper's 149 benchmark words, legality moved from 5.33 to 5.48 while a second model ranked the target first less often (81.9% down to 75.8%). The default writes freely.

A batch's JSON has "word", "sample", "explication", "legality", "primes", "molecules", "words", "circular", "tokens", and "seconds". **--score** writes "word" plus the counts only. Single-word mode prints the text, then a bracketed summary, not JSON.

Exit **2** is usage (missing arguments, a bad prompt, or a count below 1). Exit **1** is a missing file, bad JSON, or a generation error. Unknown options are exit **2**.

# HISTORY

**janas-nsm** was added on **25 October 2026**, in the same Janas release as Llama 3 and LoRA merge support in **hf2gguf**. It ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later).

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [hf2gguf](/man/hf2gguf)(1), [gguf2jns](/man/gguf2jns)(1), [janas-get](/man/janas-get)(1), [jns_check](/man/jns_check)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/tools.md)```

<!-- verified: 2026-10-27 -->
