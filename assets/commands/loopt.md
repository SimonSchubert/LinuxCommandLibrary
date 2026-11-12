# TAGLINE

Author GitHub Actions workflows in code and generate YAML

# TLDR

**Start** a project with a TypeScript starter

```loopt init```

Init with **Python** source and a Node template

```loopt init --language python --name build --template node```

**Import** existing workflow YAML into `.loopt/workflows`

```loopt import --language typescript```

**Generate** `.github/workflows` from the source

```loopt gen```

Fail if generated YAML is **out of date**

```loopt gen --check```

**Lint** generated workflows

```loopt lint```

Lint with **shellcheck** on `run:` scripts

```loopt lint --shellcheck on```

# SYNOPSIS

**loopt** [_--root_ _dir_] _command_ [_options_]

# PARAMETERS

**--root** _dir_
> Repository root (default: current directory). Global.

**init** [_--language typescript|python|go|rust_] [_--name ci_] [_--template auto|generic|node|rust|go|python_]
> Write a starter under `.loopt/workflows` and generate YAML. Never overwrites an existing workflow.

**import** [_paths..._] [_--language_] [_--force_] [_--plugin_ _exe_]
> Convert workflow YAML into authoring source. Leaves the original YAML untouched. Defaults to every direct child of `.github/workflows`.

**gen** [_sources..._] [_--force_] [_--no-lint_] [_--check_]
> Run authoring source and write standard workflow YAML. **--check** verifies without writing and exits non-zero if anything would change.

**lint** [_paths..._] [_--json_] [_--persona regular|pedantic|auditor_] [_--context_ _file_] [_--shellcheck auto|on|off_] [_--online_]
> Native correctness and security checks. **--online** uses authenticated **gh** for remote audits.

**actions**
> Add, update, list, remove, or verify pinned action bindings.

**secrets**
> Synchronize a names-only secret inventory from GitHub.

**lock** [_--verify_]
> Generate or verify `.github/workflows/actions.lock` and reusable.lock pins.

# DESCRIPTION

**loopt** lets you write GitHub Actions workflows in TypeScript, Python, Go, or Rust (custom languages via a plugin protocol). It generates standard `.github/workflows/*.yml` from `.loopt/workflows` source. Generated files start with a comment that they come from loopt; edit the source, then run **loopt gen**.

**init** picks a starter from project files (`package.json`, `Cargo.toml`, `go.mod`, Python project files) unless **--template** is set. Starters use `contents: read`, pin `actions/checkout` to a commit without persisting credentials, cancel superseded runs, and lint clean.

**gen** refuses to overwrite a workflow edited outside loopt unless **--force**. **gen** runs the same review as **lint** unless **--no-lint**. Composite actions (`action.yml` outside `.github/workflows/`) import as action metadata.

# CAVEATS

Prebuilt binaries are published for macOS arm64 and Linux x86_64. The authoring language must be installed when generating (Node.js 26+, Python 3, Go, or Cargo/Rust). **--online** lint needs an authenticated **gh**. Hidden **plugin** is the stdin/stdout protocol for custom languages, not a user command.

# SEE ALSO

[act](/man/act)(1), [gh](/man/gh)(1), [shellcheck](/man/shellcheck)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/preloopdev/loopt)```

<!-- verified: 2026-11-12 -->
