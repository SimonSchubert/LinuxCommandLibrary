# TAGLINE

Print the lines a model says yes to

# TLDR

**Keep** lines that match a question

```grev 'is a vegan meal' [menu.txt]```

Say **what the lines are**

```grev --about 'application log' 'shows the process crashed' [app.log]```

Put each line **into a sentence**

```grev 'Does the support ticket {} ask for money back?' [tickets.txt]```

**Number** matches and print the probability

```grev -n -s --about 'nginx error log' 'says an upstream timed out' [error.log]```

**Count** matches

```grev -c --about 'nginx error log' 'was caused by the client, not the server' [error.log]```

Show **one record of context**

```grev -n -C1 --about 'application log' 'shows a failed payment attempt' [app.log]```

Follow a **live log**

```journalctl -fu [myapp] | grev --line-buffered --about 'application log' 'shows the process crashed'```

**Drop** the lines the model accepts

```grev -v --about 'commit messages' 'fixes a bug'```

Print the **names of files** that match

```grev -l --about 'source file' 'handles a payment' [src/a.go] [src/b.go]```

**Ask** before spending

```grev -Q --about 'application log' 'shows the process crashed' [app.log]```

# SYNOPSIS

**grev** [_options_] _query_ [_file_ ...]

# PARAMETERS

_query_

> Yes/no question asked of each record. `{}` stands for the record. With **--delimiter**, `{1}` and `{2}` are fields. A query with no placeholder is read as a predicate about the record (`is a vegan meal`).

_file_

> Input files. With no file, grev reads stdin. `-` is stdin. **--files-from** _FILE_ reads one path per line (`-` for stdin).

**--about** _TEXT_

> What the input is (`application log`, `git commit messages`). The largest accuracy gain.

**-S**, **--reference** _FILE_

> Extra text sent with every question, such as a spec the lines are checked against.

**--yes** _TEXT_, **--no** _TEXT_

> Spell out what counts as yes and what counts as no.

**-v**, **--invert-match**

> Keep records the model answers no to. The decision is one minus P(yes), not a rewritten question.

**-c**, **--count**

> Print a count of selected records per file, instead of the records.

**-n**, **--line-number**

> Prefix each printed record with its record number.

**-H**, **--with-filename**

> Prefix records with the file name. This is already the default when more than one file is given.

**-h**, **--no-filename**

> Never prefix file names.

**-q**, **--quiet**

> Print nothing. Exit 0 at the first selected record.

**-m**, **--max-count** _N_

> Stop after _N_ selected records.

**-A**, **--after-context** _N_

> Print _N_ records after each selected record.

**-B**, **--before-context** _N_

> Print _N_ records before each selected record.

**-C**, **--context** _N_

> Print _N_ records around each selected record.

**-l**, **--files-with-matches**

> Ask about each whole file and print the names of files that match. A file too large for one request is split, and any chunk that answers yes selects the file.

**-L**, **--files-without-match**

> Ask about each whole file and print the names of files that do not match.

**-s**, **--scores**

> Prefix each printed record with P(yes).

**-t**, **--threshold** _P_

> Select when P(yes) is at least _P_. Default 0.5. Inside **--band**, yes means strictly above the high end.

**--band** _LO:HI_

> Treat _LO_ ≤ P(yes) ≤ _HI_ as uncertain: neither selected nor rejected. If only uncertain records remain, the exit status is 3.

**--uncertain** _FILE_

> Write uncertain records to _FILE_. Implies **--band** `0.3:0.7` when **--band** is omitted.

**-W**, **--window** _N_

> Show the model _N_ neighbouring records on each side. With **--line-buffered**, each record waits until _N_ later records have arrived.

**-d**, **--delimiter** _DELIM_

> Split each record on _DELIM_ into fields `{1}`, `{2}`, and so on. Escapes such as `\t` are recognized.

**-z**, **--null-data**

> Records are NUL-terminated instead of lines.

**--para**

> Records are paragraphs separated by blank lines.

**--line-buffered**

> Answer and print records as they arrive. For `tail -f` and `journalctl -f`.

**--flush** _DUR_

> With **--line-buffered**, send a partial request after this duration. Default `250ms`.

**-p**, **--progress** _WHEN_

> Progress, cost, and a projection on stderr. _WHEN_ is `always`, `never`, or `auto`. **--progress** without a value means `always`.

**-Q**, **--quote**

> Print the quote (requests, tokens, cost) and ask before sending anything.

**--confirm-above** _USD_

> Ask first when a run is quoted above this many US dollars. `off` never asks. The built-in default is 1. A quote above the limit with no terminal exits 4.

**-J**, **--jobs** _N_

> How many requests run at once. _N_ is a number, or `max` to follow the server. Default 4.

**--max-cost** _USD_

> Refuse or stop once this run would spend more than _USD_. `off` disables the cap. An explicit cap that covers the quote counts as a yes at the confirm prompt.

**-M**, **--model** _MODEL_

> Model id. Otherwise `api.model`, then **TYPESAFE_DEFAULT_MODEL**, then the built-in **jev-1.13.0**.

# DESCRIPTION

**grev** asks a TypeSafe Jev model one yes/no question per record and prints the records it answers yes to, unchanged and in input order. A record is a line unless **-z** or **--para** says otherwise. The model does not write the output. Probabilities show up only with **-s**, or as the exit status when nothing was selected.

Counting, context, and file names are done in the program, one answer per record. Closing the output pipe (`| head`) stops further requests.

The same install is a set of filters that share this option set, one config file, and one API key. **man grev-tools** and **man grevconfig** ship with the package. Releases, a Go install (`go install github.com/aurorainfra/grev/cmd/...@latest`), and `make && sudo make install` are how the project distributes the binaries.

The default model **jev-1.13.0** is priced by the project at $0.042 per million input tokens. Output tokens are free. **GREV_PRICE_PER_MTOK** overrides the input price. A model the built-in table does not know needs a `price` under `[model "id"]` in the config.

# RELATED TOOLS

**isv** _query_

> One yes/no question about the whole input. Exit 0 is yes, 1 is no. Prints nothing unless **-s**.

**oneof**

> Print which label fits the whole input.

**tagv**

> Label every record. **--split** _DIR_ routes records into one file per label.

**sortv**

> Sort by a pairwise comparison described in words.

**rank**

> Order records by how well they fit, or by named levels.

**pickv**

> Print the one line, or regex match, that best answers a question.

**uniqv**

> Collapse adjacent records that mean the same thing.

**unwrap**

> Rejoin hard-wrapped lines.

**seg**

> Split a stream into topic segments.

**cutv**

> Keep the CSV or TSV columns that match a description.

**seek**

> Walk a directory tree to the path a description names.

**trv**

> Translate, delete, squeeze, or replace only where an instruction applies.

**lookv**

> Find the first place an ordered input's answer flips, in a few rounds.

**probev**

> Print per-record probability columns for **awk**.

**jev**

> API key, config, spend, and one-off requests: **jev key set**, **jev key status**, **jev config set**, **jev spend**.

**-t** does not mean the same thing on every tool. On grev it is P(yes). On tagv it is how sure a label must be. On seek it is a path score.

# CONFIGURATION

grev reads `${XDG_CONFIG_HOME:-~/.config}/grev/config`, then `~/.grevconfig`. Later values win. **GREV_CONFIG=**_PATH_ replaces both files. An empty **GREV_CONFIG** turns config off. `[include] path` reads another file, relative to the one that names it. There is no per-project config: a repository is not allowed to point `api.endpoint` somewhere else.

The syntax is a subset of git config. `[section]` and `[section "subsection"]` headers, `key = value`, `#` and `;` comments, quoted values, and a trailing `\` to continue a line. A bare key means true. Section and key names ignore case and dashes, so `maxCost`, `max-cost`, and `maxcost` are one key.

**jev key set** writes `api.key` into `~/.grevconfig` and keeps the mode 0600. The tools warn if anyone else can read the file. **api.keyCommand** runs a command (for example `pass show typesafe/api`) instead of storing the key. For automation the key is taken from the first of **TYPESAFE_API_KEY**, **TYPESAFE_API_KEY_FILE**, and `$CREDENTIALS_DIRECTORY/typesafe_api_key`. Those beat the file. **jev key import** copies a key from those variables into `~/.grevconfig`.

Precedence on one run is the command-line flag, then the environment, then `[tool "grev"]`, then `[defaults]`, then the built-in. **--no-progress** and **--no-scores** turn a boolean off for one run.

Spend is added to `${XDG_STATE_HOME:-~/.local/state}/grev/spend`. **GREV_LEDGER** moves that file; an empty **GREV_LEDGER** turns the ledger and the daily and monthly caps off. **jev spend** prints today's and this month's spend by tool against `limits.daily` and `limits.monthly`.

```
[api]
	keyCommand = pass show typesafe/api
[defaults]
	progress = auto
	jobs = max
	confirmAbove = 0.25
[limits]
	daily = 5
	monthly = 50
[tool "grev"]
	about = application logs
	threshold = 0.7
```

Unknown keys warn. A syntax error exits 2, except inside **jev config**, so a broken file can still be repaired.

# CAVEATS

Every match is a request to the TypeSafe API. grev does not run offline. The text you pass is what the model sees.

Exit status 0 means a record was selected, 1 means none, 2 is an error, 3 means only uncertain records (**--band**), and 4 means the run was declined at **-Q** or stopped by **--max-cost** or a spend cap. Interrupt is 130.

A run quoted above **--confirm-above** asks on a terminal and refuses without one. **--max-cost** set high enough to cover that quote is itself the acceptance. Daily and monthly caps refuse before the prompt when the quote would pass them.

**-J** defaults to 4, not to `max`. `jobs = max` in the config is what removes the cap.

# SEE ALSO

[grep](/man/grep)(1), [awk](/man/awk)(1), [sort](/man/sort)(1), [cut](/man/cut)(1), [uniq](/man/uniq)(1)

# RESOURCES

```[Source code](https://github.com/aurorainfra/grev)```

```[Documentation](https://github.com/aurorainfra/grev/tree/main/docs)```

<!-- verified: 2026-09-27 -->
