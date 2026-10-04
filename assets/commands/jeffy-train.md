# TAGLINE

Train a custom Jeffy text classifier from CSV or JSONL

# TLDR

Train the **bundled reviews** example and save the head

```jeffy-train --example --save-dir [my_models]```

Train from a **CSV** (text and label columns)

```jeffy-train --input [data.csv] --text-col [text] --label-col [label] --task-id [reviews] --save-dir [my_models]```

Train from **JSONL**

```jeffy-train --input [data.jsonl] --text-col [text] --label-col [label] --task-id [reviews] --save-dir [my_models]```

Train from a **TSV**

```jeffy-train --input [data.tsv] --text-col [text] --label-col [label] --task-id [reviews] --save-dir [my_models]```

Change **regularization** (smaller is more conservative)

```jeffy-train --example --C [0.001] --save-dir [my_models]```

**Serve** the saved head

```JEFFY_PACK_DIR=[my_models] jeffy-serve```

# SYNOPSIS

**jeffy-train** (**--input** _file_ | **--example**) [**--text-col** _name_] [**--label-col** _name_] [**--task-id** _id_] [**--C** _value_] [**--save-dir** _dir_] [**--test-size** _frac_]

# DESCRIPTION

**jeffy-train** is a console script from the **jeffy-classify** Python package. It embeds labeled texts with **BAAI/bge-large-en-v1.5**, fits a **StandardScaler** plus **LogisticRegression**, prints train/test scores, and optionally writes a model-pack artifact that **jeffy-serve** can load.

Input is **CSV**, **TSV**, or **JSONL**. Column names default to `text` and `label`; `--text-col` and `--label-col` also accept the aliases `--text-key` and `--label-key`. `--example` trains on the 24-row product-review CSV bundled in the package and sets `--task-id` to `reviews` when you leave the default `custom`.

After training, the process always enters an **interactive prompt** (`>`) that classifies typed lines until Ctrl-C or EOF. Use `--save-dir` so the head is written before that loop. Serving a saved pack is `JEFFY_PACK_DIR=_dir_ jeffy-serve`.

The same library exposes `jeffy.train.train_classifier` and `train_feature_classifier` for Python callers. Numeric feature training is not wired to this CLI; the command only reads text columns.

# PARAMETERS

**--input** _file_
> Path to `.csv`, `.tsv`, or `.jsonl`. Required unless **--example** is set.

**--example**
> Train from the bundled `reviews.csv` (24 rows, two classes). Sets **--task-id** to `reviews` when it is still `custom`.

**--text-col**, **--text-key** _name_
> Text column or JSON key. Default `text`.

**--label-col**, **--label-key** _name_
> Label column or JSON key. Default `label`.

**--task-id** _id_
> Name written into the artifact. Default `custom`.

**--C** _value_
> Logistic-regression inverse regularization. Default `0.01`. Lower values keep predictions closer to uniform; higher values fit individual examples more tightly.

**--save-dir** _dir_
> Directory to write `_dir_/_task-id_/` (scaler, classifier, `manifest.json`). Omit to keep the model only in memory for the interactive prompt.

**--test-size** _frac_
> Hold-out fraction. Default `0.2`. Applied only when there are at least 10 examples. The Python API also supports `cv_folds`; this CLI does not expose that flag (the trainer still runs 3-fold CV when the train split is large enough).

# CAVEATS

Needs at least **two** examples. The first run downloads the encoder (about **1.2 GB**). Encoding runs on **CPU**.

The interactive test loop always starts after a successful train, including when `--save-dir` was used. Redirecting stdin or piping a file into the command will feed that loop.

Custom artifacts may include a joblib pickle. Load them only from trusted sources. The CLI does not train feature-based heads such as **doom_fire**.

# HISTORY

**jeffy-train** shipped with **Jeffy** on GitHub in **October 2026** (package **jeffy-classify**, MIT license, author Nico Brenner).

# SEE ALSO

[jeffy-serve](/man/jeffy-serve)(1), [jeffy-build](/man/jeffy-build)(1), [jeffy-evaluate](/man/jeffy-evaluate)(1), [python](/man/python)(1), [uv](/man/uv)(1), [uvx](/man/uvx)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/nicobrenner/jeffy)```

<!-- verified: 2026-10-04 -->
