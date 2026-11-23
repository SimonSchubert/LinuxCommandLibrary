# TAGLINE

Run plain-language `.babo` scripts compiled by Claude Code

# TLDR

**Run** a Babo script (builds on first use, uses cache afterward)

```babo hello.babo```

**Pass arguments** to the generated program

```babo [greet.babo] [Alice] [--loud]```

**Run a script directly** via its `#!/usr/bin/env babo` shebang

```chmod +x [hello.babo] && ./[hello.babo]```

**Force a rebuild** after editing the source description

```babo build hello.babo```

**Check** whether the cached build is still current

```babo check hello.babo```

**Show** cache metadata for a script

```babo info hello.babo```

**Remove** all cached builds

```babo clean```

# SYNOPSIS

**babo** [**run**] _file.babo_ [_args_...]

**babo** **check**|**build**|**info** _file.babo_

**babo** **clean**

# DESCRIPTION

**babo** is a Python CLI that turns `.babo` files, short natural-language program descriptions, into runnable Python programs. On first run it sends the description to **Claude Code** (`claude -p`), which generates an entry point and an optional `requirements.txt`; babo then creates an isolated virtual environment, installs the packages under `.baboc/<name>.baboc/` next to the source file (similar in spirit to Python's `__pycache__`).

Subsequent runs skip the build when the `.babo` file is older than its cache directory; editing the source makes the cache stale and triggers an automatic rebuild. Arguments after the script path are forwarded to the generated program. A shebang `#!/usr/bin/env babo` lets `.babo` files execute directly once **babo** is on **PATH**.

Babo scripts can call other `.babo` modules via a generated `runtime.call_babo()` helper, each module keeping its own venv so dependencies do not collide.

# PARAMETERS

**run**

> Explicit run (default when the first argument is a `.babo` file).

**build**

> Force regeneration from the `.babo` source, ignoring a fresh cache.

**check**

> Print whether the cache is **FRESH** or **STALE**.

**info**

> Show build metadata (paths, timestamps, package list).

**clean**

> Recursively delete every `.baboc/` cache directory below the current working directory.

**-h**, **--help**

> Show usage.

# CAVEATS

Requires **Python** 3.10+, the **claude** CLI installed, authenticated and on **PATH**, and network access during builds. Builds are not offline and consume Claude usage. Generated code is not reviewed before it runs, so only build descriptions you trust, and the same `.babo` file can yield different programs on each rebuild. Not published on PyPI; install from the repository with `pip install -e .`.

# CONFIGURATION

No global config file. Each `.babo` file owns a `.baboc/<stem>.baboc/` cache with `venv/`, `requirements.txt`, `packages.txt`, `metadata.json`, the `runtime` helper module, and the generated `babo` executable entry point.

# HISTORY

**babo** ("fool" in Korean, also a recursive acronym for "Babo Always Builds Output") was published by **armbox** in 2026 under the MIT license. It revives a failed 1997 student project idea of a universal plain-language programming language. The repository includes **babo.babo**, a description from which babo can rebuild itself.

# SEE ALSO

[claude](/man/claude)(1), [python3](/man/python3)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/armbox/babo)```

<!-- verified: 2026-11-23 -->
