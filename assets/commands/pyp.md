# TAGLINE

Easily run Python at the shell for data plumbing

# TLDR

**Double each line** as an integer

```seq 3 | pyp 'int(x)*2'```

**Sum numbers** from stdin

```seq 10 | pyp 'sum(map(int, lines))'```

**Pretty-print JSON** lines

```cat [data.jsonl] | pyp 'json.loads(x)'```

**Run with automatic imports** explained

```pyp -b '...'```

# SYNOPSIS

**pyp** [*options*] *expression*

# DESCRIPTION

**pyp** lets you use short Python expressions as shell filters. Each stdin line is available as **x** (and related helpers), and **lines** exposes all input for reductions. It automatically imports common modules when referenced, aiming to replace many **awk**/**sed** one-liners when Python is a better fit.

Install via **pip install pypyp** (package name **pypyp** on PyPI; command is **pyp**).

# PARAMETERS

*expression*

> Python expression or small script applied to input.

**-b**, **--explain** / magic import related flags

> Explain automatic imports or control behavior (see **pyp --help**).

**-h**, **--help**

> Full option list for your installed version.

# CAVEATS

Python startup cost makes it slower than **awk** for huge streams. Automatic imports can surprise; prefer explicit imports for production scripts. Not a replacement for complex multi-file programs.

# INSTALL

```brew: brew install pyp```

```nix: nix profile install nixpkgs#pyp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[python](/man/python)(1), [awk](/man/awk)(1), [jq](/man/jq)(1), [perl](/man/perl)(1)

# RESOURCES

```[Source code](https://github.com/hauntsaninja/pyp)```

<!-- verified: 2026-07-19 -->
