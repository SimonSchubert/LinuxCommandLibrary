# TAGLINE

Deterministic symbolic regression from CSV or TSV tables

# TLDR

Recover a **closed-form law** for a named target column

```keplearn --target [force] --top-k 1 --pretty --out [laws.json] < [gravity.tsv]```

Cap a **hard search** at 60 seconds

```keplearn --target [Tc] --timeout 60000 < [superconductors.csv]```

Emit the **three best candidates**

```keplearn --top-k 3 < [data.tsv]```

Screen a large table on **more training rows**

```keplearn --target [y] --sample 1000 < [big.tsv]```

Pretty-print JSON to **stdout** (diagnostics stay on stderr)

```keplearn --target [force] --pretty < [gravity.tsv]```

Print the **flag list and output schema**

```keplearn --help```

Print the **version**

```keplearn --version```

# SYNOPSIS

**keplearn** [**--target** _NAME_] [**--top-k** _N_] [**--sample** _N_] [**--quick-n** _N_] [**--timeout** _MS_] [**-o** _FILE_] [**--pretty**] [**--max-depth** _D_] [**--trace** _FILE_] [**--dump-candidates** _FILE_] **<** _table_

# DESCRIPTION

**keplearn** is a single-binary symbolic regression engine. It reads a TSV or CSV table with a header row on stdin, treats one named column as the quantity to explain, and searches for a compact closed-form expression of that column in terms of the others. The delimiter is taken from the header: tab if a tab is present, otherwise comma.

The search is deterministic best-first recursive reduction: the same input produces the same output. Exact laws often finish in milliseconds. Fitted constants snap to nearby rationals and to multiples of pi, e, and sqrt(2), and a snap is kept only when a verification pass still scores as well. The reported r2 comes from evaluating the printed model string on the supplied data, not from an internal fitting stage.

Stdout is always one JSON object (parse from the first `{`). Diagnostics go to stderr. Feature columns are named x1..xN in file order with the target excluded. Candidates arrive best-first: the first result's model field is the answer. The stopped-by field is one of exact-exit, frontier-exhausted, or timeout.

The engine targets analytic laws (ratios, powers, trig, exp/log). On noisy black-box tables the best model may still carry a low r2; that is the intended trade-off, not a crash. Input larger than 1 GiB is rejected. If stdin is a terminal, keplearn prints a usage hint and exits 2.

# PARAMETERS

**--target** _NAME_
> Target column to predict. Default: `target`. Every other column is a feature.

**--top-k** _N_
> Number of candidate models to emit, best-first (default: 10, minimum: 1).

**--sample** _N_
> Maximum training rows used by the search (default: 500, minimum: 1).

**--quick-n** _N_
> Rows for the quick pre-probe (default: 50, minimum: 1).

**--timeout** _MS_
> Wall-clock budget in milliseconds. On expiry the best-so-far result is emitted. Default: 0 (unbounded).

**-o**, **--out** _FILE_
> Write the result JSON to _FILE_ instead of stdout.

**--pretty**
> Indent the result JSON for reading.

**--max-depth** _D_
> Clamp search depth downward. Default is the compiled maximum.

**--trace** _FILE_
> Append a JSONL event trace to _FILE_.

**--dump-candidates** _FILE_
> Write the full scored candidate list to _FILE_.

**--seed** _N_, **--max-evals** _N_
> Accepted for compatibility. Unused. Output is deterministic; `--seed` has no effect.

**-h**, **--help**
> Print help, including the output schema, and exit.

**-V**, **--version**
> Print `keplearn` and the package version, then exit.

# CAVEATS

keplearn expects a headered table on stdin. Piping is required; running it with no redirect on a terminal exits 2.

Base any downstream decision on r2 or holdout r2 rather than the internal search r2. On noisy data the search score can sit far above the score of the printed string.

With many columns, run subsets of 2-5 at a time. Irrelevant columns often fit to exponent 0 and drop out, but conditioning worsens as they accumulate. Column order has no effect.

`--timeout 0` is unbounded. For batch runs the help text recommends `--timeout 60000`.

`--seed` and `--max-evals` are parsed and ignored. Several other legacy flags (`--pool`, `--reject`, `--prune-cols`, `--reeval-cap`, `--max-arity`, `--compose`) are also accepted and discarded.

# HISTORY

**Keplearn** is a MIT-licensed Rust program by Chandler Freeman (owls-on-wires). The name refers to Johannes Kepler recovering planetary laws from Tycho Brahe's tables. Version **0.1.2** is the crate version at the time of this page. The method is included in SRBench, the standard symbolic regression benchmark.

# SEE ALSO

[mlr](/man/mlr)(1), [jq](/man/jq)(1), [csvstat](/man/csvstat)(1), [datamash](/man/datamash)(1)

# RESOURCES

```[Source code](https://github.com/owls-on-wires/keplearn)```

<!-- verified: 2026-10-29 -->
