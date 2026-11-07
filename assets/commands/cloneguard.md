# TAGLINE

Scan a project for common malware tricks before you run it

# TLDR

Clone a repository and scan it

```cloneguard clone [https://github.com/someone/demo-app]```

Scan a directory (or the current directory, if you omit the path)

```cloneguard scan [./some-folder]```

Shorthand for a scan

```cloneguard [./some-folder]```

Print **JSON**

```cloneguard scan --json [./some-folder]```

Also scan **dependencies** (skipped by default)

```cloneguard scan --include-deps [./some-folder]```

# SYNOPSIS

**cloneguard** [**scan**] [_options_] [_path_]

**cloneguard** **clone** [_options_] _url_ [_dir_]

**cloneguard** **help** | **version**

# PARAMETERS

**scan** [_path_]

> Read _path_, or the current directory. A bare path with no subcommand is also a scan

**clone** _url_ [_dir_]

> `git clone` the URL (download only; the clone does not run project code), then scan it. The directory defaults to the repository name

**--json**

> Print a JSON object (root, files scanned, files skipped, findings, and verdict) instead of the text report

**--include-deps**

> Also walk `node_modules`. By default the walk skips `.git`, Python bytecode caches, `.venv`, and `venv`

**--max-size-mb** _N_

> Skip files larger than _N_ megabytes. The default is 2

**--no-color**

> Plain text. Also honored: the `NO_COLOR` environment variable and `TERM=dumb`

**help**

> Print command help

**version**

> Print the version

# DESCRIPTION

**cloneguard** is a dependency-free Go program that reads a tree and reports patterns associated with hostile "take-home" and demo repositories: reads of SSH keys, cloud credentials, shell history, browser data, or wallets; calls to raw IP addresses, paste sites, and tunnels; download-and-execute; npm install hooks; editor tasks that run when a folder opens; risky `setup.py`; obfuscation; and checked-in binaries. It never runs, installs, or imports the project it scans.

Flags go before the path. Findings name the file, line, a snippet, and a short reason. A file that both touches secrets and talks to a suspicious server is raised to critical.

Exit status is the verdict:

- 0 clean, no red flags
- 1 caution, only medium findings
- 2 suspicious, at least one high finding
- 3 dangerous, at least one critical finding
- 10 error (bad usage, unreadable path, or `git clone` failed)

Build with Go 1.24 or newer: `go build -o cloneguard ./cmd/cloneguard`.

# CAVEATS

A clean result is not proof the tree is safe. The scanner is a set of regular expressions and file checks. A determined author can evade it, and legitimate tools (a password manager, an SSH helper) can trip it. For code from a stranger, still use a disposable machine.

**--include-deps** is slow. **clone** only downloads. Review the report before `npm install`, opening the folder in an editor, or running anything inside it.

# HISTORY

**cloneguard** was written by tharun208 after a fake recruiting assignment tried to steal SSH and cloud keys. It is MIT-licensed. The repository includes a `demo/` tree that is deliberately hostile, for trying the scanner.

# SEE ALSO

[git](/man/git)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/tharun208/cloneguard)```

<!-- verified: 2026-11-07 -->
