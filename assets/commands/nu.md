# TAGLINE

nushell, a modern shell with structured data

# TLDR

**Start Nushell**

```nu```

**Execute command**

```nu -c "[command]"```

**Run script**

```nu [script.nu]```

**List files as table**

```ls | where size > 1mb```

**Parse JSON**

```open [file.json] | get [field]```

# SYNOPSIS

**nu** [_options_] [_script_]

# PARAMETERS

_SCRIPT_
> Nushell script (file ending in **.nu**) to execute. Remaining positional arguments are accessible as `$argv`.

**-c**, **--commands** _COMMAND_
> Run the given Nushell command string and exit.

**--config** _FILE_
> Load _FILE_ instead of the default `config.nu`.

**--env-config** _FILE_
> Load _FILE_ as the environment-setup config (`env.nu`).

**--login**, **-l**
> Start as a login shell (sources `login.nu`).

**--interactive**, **-i**
> Force interactive mode even when stdin is not a TTY.

**--no-config-file**, **-n**
> Skip loading any config files.

**--no-std-lib**
> Skip loading the bundled standard library.

**--stdin**
> Read script from stdin.

**--table-mode**, **-m** _MODE_
> Set the table rendering mode (e.g. **rounded**, **heavy**, **light**, **compact**, **none**).

**--log-level** _LEVEL_
> Set the log level (**trace**, **debug**, **info**, **warn**, **error**).

**--ide-check** _N_
> IDE-friendly syntax check of the input.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version.

# CONFIGURATION

**$nu.default-config-dir/config.nu**
> Per-user configuration (typically **~/.config/nushell/config.nu**).

**$nu.default-config-dir/env.nu**
> Per-user environment variable setup, sourced before `config.nu`.

# DESCRIPTION

**nu** is **Nushell**, a cross-platform shell that treats every command's output as **structured data** (tables, records, lists) flowing through a pipeline. Built-ins parse common formats (JSON, YAML, TOML, CSV, SQLite, ODS, XLSX, XML, NDJSON) into the same table type, so commands such as `where`, `sort-by`, `select`, `group-by`, and `histogram` work uniformly across data sources.

Pipelines pass typed values rather than byte streams, which makes data wrangling expressive but means traditional Unix pipes mixing arbitrary byte streams behave differently — wrap external commands with `^cmd` to get raw stdout, or use `into binary` / `into string` for explicit conversions.

# CAVEATS

Not POSIX-compatible — scripts written for **bash**/**zsh** will not run unmodified. Configuration files use Nushell's own language. Plugin protocol and built-in command names still change between minor releases (Nushell is pre-1.0); pin a version when scripting.

# HISTORY

**Nushell** was created in **2019** by **Jonathan Turner**, **Yehuda Katz**, and **Andrés Robalino** to bring PowerShell-style structured pipelines to a Unix-friendly, Rust-implemented shell. It is currently maintained by the **Nushell Project** under the **MIT license**.

# INSTALL

```dnf: sudo dnf install nushell```

```pacman: sudo pacman -S nushell```

```apk: sudo apk add nushell```

```zypper: sudo zypper install nushell```

```brew: brew install nushell```

```nix: nix profile install nixpkgs#nushell```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [pwsh](/man/pwsh)(1)

