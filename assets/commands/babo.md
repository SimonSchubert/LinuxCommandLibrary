# TAGLINE

Run plain-language `.babo` scripts compiled by Claude Code

# TLDR

**Run** a Babo script (builds on first use, uses cache afterward)

```babo hello.babo```

**Force a rebuild** after editing the source description

```babo build hello.babo```

**Check** whether the cached build is still current

```babo check hello.babo```

**Show** cache metadata for a script

```babo info hello.babo```

**Remove** all cached builds

```babo clean```

# SYNOPSIS

**babo** [_run_] _file.babo_ [_args_...]

**babo** _check_|_build_|_info_|_clean_ _file.babo_

# DESCRIPTION

**babo** is a Python CLI that turns `.babo` files — short natural-language program descriptions — into runnable Python programs. On first run it sends the description to **Claude Code** (`claude -p`), which generates an entry point, optional `requirements.txt`, and an isolated virtual environment under `.baboc/<name>.baboc/` next to the source file (similar in spirit to Python's `__pycache__`).

Subsequent runs skip the build when the `.babo` file is older than its cache directory. Arguments after the script path are forwarded to the generated program. A shebang `#!/usr/bin/env babo` lets `.babo` files execute directly once **babo** is on **PATH**.

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

> Delete every `.baboc/` cache directory under the current tree.

# CAVEATS

Requires **Python** 3.10+, the **claude** CLI installed and authenticated, and network access during builds. Builds are not offline. The tool is experimental and depends on Claude Code API availability.

# CONFIGURATION

No global config file. Each `.babo` file owns a `.baboc/<stem>.baboc/` cache with `venv/`, `requirements.txt`, `metadata.json`, and the generated `babo` executable entry point.

# SEE ALSO

[claude](/man/claude)(1), [python3](/man/python3)(1), [pip](/man/pip)(1)