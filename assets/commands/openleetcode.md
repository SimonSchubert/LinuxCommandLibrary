# TAGLINE

Local LeetCode runner with open test suites

# TLDR

**Submit** a Python solution by problem id

```openleetcode submit ./solution.py --id 1```

**Submit** a C++ solution by title substring

```openleetcode submit ./solution.cpp --title two-sum```

**Override** language detection when the extension is ambiguous

```openleetcode submit ./main.abc --id 1 --lang python3```

**Download** tests and runtime templates into the data directory

```openleetcode download all```

**Download** only the test manifests

```openleetcode download tests```

**List** backend type, URL, and config file path

```openleetcode config list```

**Point** the CLI at a Piston backend

```openleetcode config set backend.url http://localhost:2000```

**Re-run** the official installer to update the CLI

```openleetcode update```

# SYNOPSIS

**openleetcode** [**--plain**] [**--no-color**] [**--version**] _command_ [_args_]

**openleetcode submit** _PATH_ {**--id** _INT_ | **--title** _STR_} [**--lang** _LANG_]

**openleetcode download** {**all** | **runtimes** | **tests**}

**openleetcode config list**

**openleetcode config set** _KEY_ _VALUE_

**openleetcode update**

# PARAMETERS

**--plain**
> Disable animations and colors. Output is line-oriented (`scope: message`).

**--no-color**
> Disable ANSI colors. `NO_COLOR` in the environment has the same effect.

**--version**
> Print `openleetcode <version>` and exit.

**submit** _PATH_
> Run the solution file against a local test suite. Either **--id** or **--title** is required.

**--id** _INT_
> Problem id (for example `1` for Two Sum). Takes precedence over **--title** when both are given.

**--title** _STR_
> Substring matched against problem directory names under the downloaded tests tree. The first match is used.

**--lang** _LANG_
> Override language detection from the file extension. Supported values include `cpp`, `rust`, `python3`, `python2`, `ruby`, `java`, `csharp`, `kotlin`, `go`, `dart`, `swift`, and `typescript`.

**download** {**all** | **runtimes** | **tests**}
> Fetch the upstream repository archive and unpack runtime templates, test manifests, or both into the data directory.

**config list**
> Print `backend.type`, `backend.url`, and the config file path.

**config set** _KEY_ _VALUE_
> Write a config key. Allowed keys: `backend.type` (currently only `piston`) and `backend.url`.

**update**
> Download the official installer and run it (`bash` on Unix, PowerShell on Windows).

# DESCRIPTION

**openleetcode** is a Haskell CLI that judges LeetCode-style solutions on your machine. It reads a normal solution file, finds the matching problem manifest in a downloaded open test suite, wraps the code in a language-specific harness, sends the batch to a pluggable execution backend, and reports LeetCode-like verdicts locally.

The CLI is the glue. Tests live as per-problem directories (`manifest.yaml` plus reference solutions). Runtime templates (entry `main` plus utilities for arrays, linked lists, trees, and similar LeetCode types) live next to them. Neither is bundled inside the binary: first interactive start creates the XDG config directory and offers to download both. Non-interactive starts skip that prompt; run **openleetcode download all** yourself.

**submit** requires a selector. **--id** looks under `tests/<range>/` for a directory whose name starts with `<id>.`. **--title** does a substring search of directory names and takes the first hit. Language comes from the file extension unless **--lang** is set. The runner talks to the configured backend (default Piston at `http://localhost:2000`); a 20-second batch timeout applies. Verdicts include accepted, wrong answer, time limit exceeded, and runtime error. The project is not affiliated with LeetCode; it aims to keep imports and environments close to the official language setups.

# CONFIGURATION

**$XDG_CONFIG_HOME/openleetcode/** (default **~/.config/openleetcode/**)
> Data directory created on first run. Holds `config.yml`, unpacked `runtimes/`, and unpacked `tests/`.

**config.yml**
> YAML with `backendType` and `backendUrl`. Created automatically with defaults if missing. A parse error falls back to defaults and prints a warning.

**backend.type** / **backend.url**
> CLI keys for **config set**. The only allowed type is `piston`. Default URL is `http://localhost:2000`.

**OPENLEETCODE_BACKEND_URL**
> Used as the default backend URL when a new config is created. It does not override an existing `config.yml`.

The default Piston backend is started from the repo with `docker compose -f backends/piston/docker-compose.yml up -d`. Linux and macOS installers try to start that compose file; Windows installs only the CLI.

# CAVEATS

Judging requires a reachable backend. If Piston is down, **submit** exits with an infrastructure error and suggests **config list**. Tests and runtimes must already be downloaded; a missing suite prints "test suite not found". **--title** is an unanchored substring and uses the first match, so short titles can hit the wrong problem. Manifests are community-maintained and vary in quality. **update** re-runs a remote installer script. Exit codes are **0** (success / accepted), **1** (bad input: missing selector, unknown extension, missing suite), **2** (infrastructure: backend, download, config write), and **3** (solution verdict failure).

# HISTORY

Written in **Haskell** (Cabal) by **therepanic**. The repository was published in **January 2026**. Licensed under the **Unlicense**. The executable name is **openleetcode**.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [cabal](/man/cabal)(1), [python](/man/python)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/therepanic/openleetcode)```

<!-- verified: 2026-08-18 -->
