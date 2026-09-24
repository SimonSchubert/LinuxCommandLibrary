# TAGLINE

Find duplicate and near-duplicate code with tree-sitter

# TLDR

**Find duplicate blocks** in a project (default ruleset, exact match after normalization)

```treepeat detect [path/to/project]```

**Near-duplicates** at an 80 percent threshold

```treepeat detect --similarity [80] [path/to/project]```

**Structural clones**, with identifiers and constants anonymized

```treepeat --ruleset loose detect [path/to/project]```

Compare **raw syntax trees**, without normalization

```treepeat --ruleset none detect [path/to/project]```

Show a **side-by-side diff** of the first two hits in each group

```treepeat detect --diff --min-lines [10] [path/to/project]```

Write **SARIF** for a CI consumer

```treepeat detect --format sarif --output [results.sarif] [path/to/project]```

**Fail the run** when any similar group is found

```treepeat detect --fail [path/to/project]```

**List the rules** in a ruleset, optionally for one language

```treepeat list-ruleset default --language [python]```

See how one file is **normalized**

```treepeat treesitter [path/to/file.py]```

# SYNOPSIS

**treepeat** [**-l** _level_] [**-r** _ruleset_] _command_

**treepeat detect** [**-s** _percent_] [**--min-lines** _n_] [**-f** _format_] [**-o** _file_] [**--diff**] [**--fail**] _path_

**treepeat list-ruleset** [**-l** _language_] _ruleset_

**treepeat treesitter** [**-t**] _file_

# DESCRIPTION

**treepeat** scans source code for duplicate and near-duplicate regions. It parses files with tree-sitter, extracts language-meaningful regions such as functions and classes, normalizes those trees, and groups regions that meet a similarity threshold. It is a code-clone finder, not a line-oriented diff.

Three built-in rulesets control normalization. **none** compares raw syntax trees. **default** (the usual setting) drops whitespace, string contents, and some high-level nodes such as names, so near-copies still match. **loose** also anonymizes identifiers and constants, so the same structure with different names still matches. Pass **--ruleset** before the subcommand.

**detect** walks a file or directory. Matches shorter than **--min-lines** (default 5) are dropped. **--similarity** is a percent from 5 to 100; the default of 100 means the normalized trees must match exactly. Console output lists groups and a summary. **--format sarif** writes a SARIF report instead, which is the form most CI security dashboards ingest.

Paths are skipped when they match **--ignore** globs or a gitignore-style file whose name matches `.*ignore` (including **.gitignore**). **--add-regions** and **--exclude-regions** change which syntax-node types count as a region, per language, using the form `language:node1,node2`.

**list-ruleset** prints the rules in **none**, **default**, or **loose**. **treesitter** prints one file beside the tokens treepeat will compare, or beside the transformed source with **--transformed**.

Supported languages include Astro, Bash, CSS, Go, HTML, Java, JavaScript, JSX, Kotlin, Lua, Markdown, Python, Rust, SQL, TSX, TypeScript, and YAML. JSX is parsed with the JavaScript grammar.

The tool requires **Python 3.11** or newer. Install it with `pip install treepeat`.

# PARAMETERS

**detect** _path_
> Scan a file or directory for similar regions.

**list-ruleset** _ruleset_
> Print rules for **none**, **default**, or **loose**.

**treesitter** _file_
> Show one file next to its normalized tree-sitter view.

**-r** _ruleset_, **--ruleset** _ruleset_
> Normalization profile: **none**, **default**, or **loose**. Default is **default**. Set this on the main command, before the subcommand.

**-l** _level_, **--log-level** _level_
> Log level: DEBUG, INFO, WARNING, ERROR, or CRITICAL. Default is WARNING. On **list-ruleset**, **-l** is the language filter instead.

**-s** _percent_, **--similarity** _percent_
> Minimum similarity, from 5 to 100. Default is 100.

**--min-lines** _n_
> Ignore regions shorter than _n_ lines. Default is 5.

**-f** _format_, **--format** _format_
> **console** (default) or **sarif**.

**-o** _file_, **--output** _file_
> Write the report to _file_. Default is standard output. SARIF uses this path; console output is printed directly.

**--diff**
> In console output, show a side-by-side diff of the first two regions in each group.

**--fail**
> Exit with status 1 when any similar group is reported.

**-i** _globs_, **--ignore** _globs_
> Comma-separated globs to skip, for example `*.test.py,**/node_modules/**`.

**--ignore-files** _globs_
> Comma-separated globs that locate ignore files. Default is `**/.*ignore`.

**--add-regions** _spec_
> Extra region node types, as `language:node1,node2`. Repeatable.

**--exclude-regions** _spec_
> Region labels to drop, as `language:label1,label2`. Repeatable.

**--ignore-node-types** _types_
> Comma-separated AST node types to skip while extracting regions.

**-v**, **--verbose**
> After a console run, print timing and which node types were used.

**-p**, **--progress**
> Progress bars on standard error while a long scan runs.

**-l** _language_, **--language** _language_
> On **list-ruleset** only: show rules that apply to one language.

**-t**, **--transformed**
> On **treesitter**: show rewritten source on the right instead of tokens.

**--version**
> Print the version and exit.

# CAVEATS

The project is a proof of concept. Language coverage is limited, and two files in an unsupported language are simply not compared.

**--ruleset** and **--log-level** belong on the main command (`treepeat --ruleset loose detect …`). **list-ruleset** reuses **-l** for a language name, so a log level has to be set before that subcommand.

**--similarity** rejects values below 5, even though some examples elsewhere say the range starts at 1. **--diff** and **--verbose** affect console output only. **--fail** exits 1 for any reported group, which is easy to trip on a large tree at the default ruleset. If **detect** cannot parse any file, it exits 1 before printing groups.

# HISTORY

**treepeat** was written by **Dane Summers** and first published on PyPI in **November 2025**. It is released under the Apache-2.0 license.

# SEE ALSO

[ast-grep](/man/ast-grep)(1), [semgrep](/man/semgrep)(1), [diff](/man/diff)(1)

# RESOURCES

```[Source code](https://github.com/dsummersl/treepeat)```

```[Documentation](https://github.com/dsummersl/treepeat#usage)```

<!-- verified: 2026-09-24 -->
