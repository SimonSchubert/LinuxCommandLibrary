# TAGLINE

Sample TypeSafe's Jev decision model as a terminal chatbot

# TLDR

Start an **interactive chat** (the default)

```jevchat```

Answer **one question** and exit

```jevchat ask "[do people need water?]"```

List the **built-in alphabets**

```jevchat alphabets```

Greedy sampling over **letters and space** only

```jevchat -a lower26 -t 0 ask "[what is 2+2?]"```

One **choice question** over the whole alphabet

```jevchat -s choice ask "[how many eyes do people have?]"```

**Buckets** over a 1k-word alphabet (needed once the alphabet exceeds 255 symbols)

```jevchat -a words1k -s buckets ask "[what colour is snow?]"```

**Refine**: bucket winners, then rescore a nucleus

```jevchat -a words1k -s refine ask "[where do fish live?]"```

Keep **three candidate replies** alive (beam search)

```jevchat -b 3 ask "[what is the opposite of hot?]"```

Stream **raw text** instead of the live panel (suitable for pipes)

```jevchat --no-live ask "[what colour is grass?]"```

Score the same continuations in **every mode** (hits the API)

```jevchat bench```

# SYNOPSIS

**jevchat** [_options_] [_command_]

# PARAMETERS

**(no command)**, **chat**
> Interactive chat. Type a question at the `you ›` prompt. Slash commands: `/help`, `/alphabet [name]`, `/temp` _value_, `/stop-bias` _value_, `/reset`, `/stats`, `/exit`. Ctrl-C stops the current reply; Ctrl-D quits.

**ask** _question_...
> Answer one question and exit. Remaining arguments are joined with spaces. Exit 130 if generation is cancelled.

**alphabets**
> Print a table of built-in alphabets (name, size, description). Does not call the API.

**bench**
> Score the same continuations in every sampling mode and print a comparison table. Hits the API. **--mode** _name_ (repeatable) limits which modes run. **--cases** is `char` (default) or `word`.

**-a**, **--alphabet** _name_|_path_
> Alphabet to sample from: a built-in name (`lower26`, `ascii`, `tokens`, `words1k`, `bpe2k`, `bpe5k`, `bpe50k`) or a path to a `.json` file. Default `words1k`.

**-s**, **--strategy** `choice`|`bisect`|`buckets`|`refine`
> How the next-symbol distribution is obtained. `choice` asks one question over the whole alphabet (Jev caps a single question at 255 options). `bisect` asks earlier/later questions down to **--bisect-cutoff** (default 20). `buckets` splits the alphabet across many questions with an OTHER escape (the only strategy that can hold more than 255 symbols, aside from `refine`). `refine` is buckets without OTHER, then a question over the winners, then nucleus rescoring. Default `buckets`.

**-p**, **--presentation** `hypothesis`|`symbol`
> How options are worded. `hypothesis` (default) offers the resulting texts so Jev ranks finished strings. `symbol` offers the bare symbols.

**-t**, **--temperature** _value_
> 0 is greedy (always the top-scored symbol); higher is more random. Default 0.4. Ignored when **--beam-width** is greater than 1.

**--top-p** _value_
> Nucleus filter in (0, 1]. Default 0.9. Ignored when **--beam-width** is greater than 1.

**--top-k** _n_
> Keep only the _n_ best symbols. 0 disables (default). Ignored when **--beam-width** is greater than 1.

**--stop-bias** _value_
> Multiplier on STOP: less than 1 gives longer replies, greater than 1 shorter. Default 0.5.

**-b**, **--beam-width** _n_
> Candidate replies kept alive at once. 1 (default) samples one symbol at a time. More costs one score per live beam per step. Above 1, temperature / top-p / top-k no longer apply: beams are ranked by probability.

**--ensemble** _n_
> Score _n_ re-orderings per step as parallel questions in one request and average them. Default 1.

**--model** _id_
> Jev model id. Default `jev-latest`.

**--seed** _n_
> Seed the sampler for a reproducible reply.

**--max-steps** _n_ / **--max-chars** _n_ / **--min-steps** _n_
> Hard cap on sampled symbols (default 400), hard cap on reply length (default 1500), and symbols that must be drawn before STOP is allowed (default 3).

**--live** / **--no-live**
> Live Rich panel with rate and top-scored symbols, or raw streaming suitable for pipes. Default live.

**--show-dist** _n_
> Show the top _n_ scored symbols each step. 0 hides them. Default 3.

**--config** _path_
> Path to `jevchat.toml`. Without this, the file is searched from the current directory upward.

**--env-file** _path_
> Path to the `.env` holding the API key.

**-h**, **--help**
> Show help for the CLI or a subcommand.

# DESCRIPTION

**jevchat** turns TypeSafe's **Jev** decision model into a chat model. At every step it asks Jev which symbol comes next, given the user's question and the reply written so far. The options are an alphabet plus STOP. Jev returns a probability for each option; the sampler draws the next symbol from that normalised distribution, appends it, and repeats until STOP is drawn.

Jev is not a language model: it scores a finite set of choices. Alphabets larger than 255 options cannot be asked as a single question, so `buckets` and `refine` split the vocabulary across many API calls. Generation is therefore many requests per character or word, which is slow and expensive compared with a normal chat API.

The CLI is a Python 3.11+ Click program (`jevchat.cli:main`). After `poetry install` the `jevchat` console script is on the virtualenv PATH. It is not published on PyPI. The HTTP API default is `https://api.typesafe.ai/v1`.

# CONFIGURATION

**jevchat.toml**
> Optional TOML file. Looked up from the current directory and its parents, or given with **--config**. Keys live under a `[jevchat]` table (or at the top level). Every key is optional; CLI flags override the file. A copy with comments ships in the repository.

**.env**
> API key. Put `api_key="..."` next to `pyproject.toml` (git-ignored). Values in `.env` win over already-exported variables, so editing the file is enough to switch keys. **--env-file** selects a different path.

**JEV_API_KEY** / **TYPESAFE_API_KEY** / **API_KEY**
> Environment variables also accepted, in that order after `api_key`. Used when `.env` does not set a value.

Precedence for sampling settings: command line, then `jevchat.toml`, then the alphabet's declared preferences, then strategy requirements, then the built-in defaults.

# CAVEATS

Requires a TypeSafe Jev API key and network access. Each generated symbol can be one or many API calls, so a short reply is much more expensive than a normal LLM completion. The author describes the cost as somewhat impractical.

Not packaged for Linux distributions or PyPI: install from the GitHub repository with Poetry (`poetry install`, then `poetry run jevchat` or the venv's `jevchat`).

`choice` cannot hold more than 255 options. Use `buckets` or `refine` for `words1k`, `bpe2k`, `bpe5k`, and `bpe50k`. `bpe50k` is the full GPT-2 BPE vocabulary and is particularly slow and token-heavy.

The first Ctrl-C waits for the in-flight request and keeps a partial reply; a second press aborts immediately. In chat, the partial reply stays in history.

Sensitive prompts are sent to TypeSafe's API.

# HISTORY

**jevchat** was published on GitHub in **September 2026** by **kyle-pena-nlp** as a demonstration that TypeSafe's Jev decision model can drive a chatbot by sampling one symbol at a time.

# SEE ALSO

[llm](/man/llm)(1), [aichat](/man/aichat)(1), [chatgpt](/man/chatgpt)(1), [claude](/man/claude)(1), [ollama](/man/ollama)(1), [poetry](/man/poetry)(1), [python](/man/python)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/kyle-pena-nlp/jevchat)```

```[Documentation](https://docs.typesafe.ai/api)```

<!-- verified: 2026-09-20 -->
