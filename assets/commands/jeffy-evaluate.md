# TAGLINE

Evaluate frozen Jeffy classifier heads on held-out test sets

# TLDR

**Evaluate** every text head in a model pack

```jeffy-evaluate --pack-dir [data/model_pack] --out [data/eval_results]```

Evaluate **named tasks** only

```jeffy-evaluate --tasks [banking77] [ag_news] --pack-dir [data/model_pack]```

Also run **majority-class and TF-IDF** baselines

```jeffy-evaluate --baselines --pack-dir [data/model_pack]```

Also measure **single-example latency**

```jeffy-evaluate --latency --device [cpu] --pack-dir [data/model_pack]```

Cap **test-set** size (default 2000)

```jeffy-evaluate --max-test [2000] --pack-dir [data/model_pack]```

# SYNOPSIS

**jeffy-evaluate** [**--tasks** _name_ ...] [**--pack-dir** _dir_] [**--out** _dir_] [**--max-test** _n_] [**--baselines**] [**--latency**] [**--device** _cpu_|_mps_|_cuda_]

# DESCRIPTION

**jeffy-evaluate** is a console script from the **jeffy-classify** Python package. It loads **frozen** artifacts from a model pack (no retraining), scores them on the same Hugging Face splits **jeffy-build** used, writes per-example predictions, and prints a summary table.

Default `--pack-dir` is `data/model_pack` and default `--out` is `data/eval_results`. Output includes one `{task}_predictions.jsonl` per task plus `benchmark.json` (scores, optional baselines and latency, hardware info). Accuracy is reported with a bootstrap 95% confidence interval. For **clinc_oos** the table also splits in-scope versus out-of-scope accuracy.

`--baselines` fits a majority-class dummy and a 3-fold CV-tuned TF-IDF plus logistic regression on the training split. `--latency` times single-example inference after a short warmup. Thread counts are pinned (`torch` threads and `OMP_NUM_THREADS`/`MKL_NUM_THREADS`) so latency numbers are comparable.

Tasks without a dataset config are skipped. That includes **doom_fire**. Like **jeffy-build**, this command needs the **build** extra (`datasets`) to download evaluation splits: `pip install 'jeffy-classify[build]'`.

# PARAMETERS

**--tasks** _name_ ...
> Task ids to score. Default is every capability loaded from the pack that also has a dataset config.

**--pack-dir** _dir_
> Model pack to load. Default `data/model_pack`.

**--out** _dir_
> Directory for `benchmark.json` and per-task prediction JSONL. Default `data/eval_results`.

**--max-test** _n_
> Maximum test examples per task (seed 42). Default `2000`.

**--baselines**
> Run majority-class and tuned TF-IDF+LR baselines on the training split.

**--latency**
> Measure per-example total, embedding, and classifier latency.

**--device** _cpu_|_mps_|_cuda_
> Encoder device. Default `cpu`.

# CAVEATS

This does not retrain heads. Scores should match **jeffy-build** test accuracy within about `0.001`; larger gaps are printed as a discrepancy.

`--baselines` is slow: the TF-IDF grid covers analyzers, n-grams, feature caps, and several `C` values with 3-fold CV.

**sst2** uses the `validation` split. **sms_spam** uses a random split. **snli** filters unlabeled rows. Hugging Face downloads and the 1.2 GB encoder apply here the same as for **jeffy-build**.

# HISTORY

**jeffy-evaluate** shipped with **Jeffy** on GitHub in **October 2026** (package **jeffy-classify**, MIT license, author Nico Brenner).

# SEE ALSO

[jeffy-build](/man/jeffy-build)(1), [jeffy-serve](/man/jeffy-serve)(1), [jeffy-train](/man/jeffy-train)(1), [python](/man/python)(1), [uv](/man/uv)(1), [pip](/man/pip)(1), [hf](/man/hf)(1)

# RESOURCES

```[Source code](https://github.com/nicobrenner/jeffy)```

<!-- verified: 2026-10-04 -->
