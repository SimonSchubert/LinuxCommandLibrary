# TAGLINE

Retrain Jeffy classifier heads from Hugging Face datasets

# TLDR

**Retrain every** shipped text head into a model pack

```jeffy-build --out [data/model_pack]```

Retrain **named datasets** only

```jeffy-build --datasets [banking77] [ag_news] --out [data/model_pack]```

Change **regularization**

```jeffy-build --C [0.01] --out [data/model_pack]```

Cap **train and test** sizes (defaults 10000 and 2000)

```jeffy-build --max-train [10000] --max-test [2000] --out [data/model_pack]```

**Serve** the rebuilt pack

```JEFFY_PACK_DIR=[data/model_pack] jeffy-serve```

# SYNOPSIS

**jeffy-build** [**--datasets** _name_ ...] [**--out** _dir_] [**--C** _value_] [**--max-train** _n_] [**--max-test** _n_]

# DESCRIPTION

**jeffy-build** is a console script from the **jeffy-classify** Python package. It downloads the source Hugging Face datasets for Jeffy's text heads, embeds them with **BAAI/bge-large-en-v1.5**, fits a scaler and logistic regression per task, writes artifacts with integrity hashes, and prints train/test accuracy.

The built-in dataset list is **banking77**, **clinc_oos**, **massive_intent**, **ag_news**, **dbpedia**, **sst2**, **emotion**, **imdb**, **sms_spam**, **snli**, **tweet_eval_sentiment**, **tweet_eval_emotion**, and **tweet_eval_offensive**. **doom_fire** is not in this list (it is a numeric-feature head, not a Hugging Face text dataset).

Each artifact lands under `--out`/_task_id_/ with a `manifest.json`. A pack-level `pack_manifest.json` records encoder identity, classifier settings, and per-dataset scores. The README times a full rebuild at about **40 minutes** and **~5 GB** of dataset downloads.

This command needs the optional **build** extra (`datasets`) on top of the core package: `pip install 'jeffy-classify[build]'` or `uv pip install -e ".[build]"` from a clone.

# PARAMETERS

**--datasets** _name_ ...
> Dataset ids to train. Default is every key in the built-in table. Unknown names are printed and skipped.

**--out** _dir_
> Output directory. Default `data/model_pack`.

**--C** _value_
> Logistic-regression inverse regularization. Default `0.01`.

**--max-train** _n_
> Maximum training examples per dataset (random subsample, seed 42). Default `10000`.

**--max-test** _n_
> Maximum test examples per dataset (random subsample, seed 42). Default `2000`.

# CAVEATS

A full run downloads several gigabytes from Hugging Face and loads the 1.2 GB encoder. Network, disk, and RAM requirements are those of **sentence-transformers** plus the **datasets** library.

**sst2** evaluates on the `validation` split (official test labels are not public). **sms_spam** uses a random 80/20 split. **snli** drops unlabeled (`-1`) rows and joins premise and hypothesis with ` [SEP] `. **massive_intent** is English only.

Dataset licenses vary (CC BY, CC BY-SA, academic, Twitter TOS). Redistribution of retrained heads is not independently cleared for every source. See `ATTRIBUTION.md`.

This rebuilds **text** heads only. It does not produce **doom_fire**.

# HISTORY

**jeffy-build** shipped with **Jeffy** on GitHub in **October 2026** (package **jeffy-classify**, MIT license, author Nico Brenner).

# SEE ALSO

[jeffy-serve](/man/jeffy-serve)(1), [jeffy-evaluate](/man/jeffy-evaluate)(1), [jeffy-train](/man/jeffy-train)(1), [python](/man/python)(1), [uv](/man/uv)(1), [pip](/man/pip)(1), [hf](/man/hf)(1)

# RESOURCES

```[Source code](https://github.com/nicobrenner/jeffy)```

<!-- verified: 2026-10-04 -->
