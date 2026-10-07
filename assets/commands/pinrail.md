# TAGLINE

Submit reviews to the Pinrail desktop app from a shell

# TLDR

Submit a **code review** and wait for the decision

```pinrail submit code-review --title "[Retry failed webhook deliveries]" --data [findings.json] --wait```

**Wait** on an existing review

```pinrail wait [r_01K5R2]```

**List** pending reviews for this git project

```pinrail list```

Print a review as **Markdown**

```pinrail show [r_01K5R2]```

**Withdraw** a pending review

```pinrail withdraw [r_01K5R2] --reason "[no longer needed]"```

List **plugins**

```pinrail plugins```

Scaffold a **new plugin**

```pinrail plugins new [my-plugin]```

Print JSON instead of Markdown

```pinrail --json show [r_01K5R2]```

# SYNOPSIS

**pinrail** [_--json_] [_--pretty_] [_-v_] [_--url_ _URL_] _command_ [_options_]

# DESCRIPTION

**pinrail** is the command agents and scripts use to ask a person through the **Pinrail** desktop app. The CLI keeps no state: it is a small Rust HTTP client that talks to the server the app runs on loopback. Markdown goes to stdout by default (for an agent); **--json** prints the API payload (for a script). Diagnostics go to stderr. Version **0.1.2**. Apache-2.0. The crate is not published on crates.io; the app installs the binary, or build with `cargo install --path cli`.

The app is a Tauri desktop UI (macOS and Linux; Windows planned). First-run setup installs this command, a skill for agents it finds, and the core plugins: **code-review**, **list**, **feedback**, **markdown**, and **image**. Default server URL is **http://127.0.0.1:4747** (override with **--url** / **PINRAIL_URL**, or the address in the running server's `server.json`). **submit** starts the server if it is not running unless **--no-start**.

# COMMANDS

**submit** _plugin_ **--title** _text_ [**--data** _JSON|FILE|-_]
> Create a review. **--wait** blocks until it ends. **--timeout** _secs_ (with **--wait**; **0** waits forever; else **PINRAIL_TIMEOUT**). **--decision-out** _file_ writes `decision.data` as JSON. **--request** is a full JSON body (file, inline, or `-`). **--attach** _path_[=_name_] sends files (`{"$attachment":"<name>"}` in the payload). **--origin** `key=value,...` (`repo`, `ref`, `workflow`, `run_id`, `url`). **--sample** uses the plugin's sample payload. **--dry-run** validates without creating a review (conflicts with **--wait**)

**wait** _id_
> Poll until the review ends. **--timeout**, **--decision-out**. Survives the app restarting once it has answered

**show** _id_
> Print the review (Markdown, or JSON with **--json**)

**rounds** _id_ / **events** _id_
> List rounds (oldest first, no payloads) or the event log

**list**
> Newest first, no payloads. Default: pending reviews of this git project (or every project outside git). **--status**, **--repo**, **--all**

**decide** / **discard** / **withdraw**
> Record a decision, discard (exit **5** for waiters: stop the work), or withdraw (exit **3**). An agent never decides or discards a review it submitted

**plugins**
> List installed plugins. **install** _source_ [**--link**], **remove** _name_, **describe** _name_, **new** _name_, **check** [_dir_], **schema**

**attachments list** _id_ / **attachments get** _id_ _name_
> List or save files on a review. **get -o** _path_|`-`, **--force**

**export** _dir_
> Write every review as JSON files

**serve**
> Start the server if needed and print its URL

**docs** [_path_]
> Print agent briefs (the skill). **--tree** lists them

**open** _id_
> Open `pinrail://reviews/<id>` in the app. **--browser** opens the loopback preview instead

# PARAMETERS

**--json**
> JSON on stdout. **PINRAIL_JSON=1** sets it for the session

**--pretty**
> Indent JSON. Requires **--json**

**-v**, **--verbose**
> Step-by-step messages on stderr. **PINRAIL_VERBOSE**

**--url** _URL_
> Server URL. **PINRAIL_URL**, then `server.json`, then `http://127.0.0.1:4747`

# CAVEATS

The CLI needs the Pinrail app (or its loopback server). Exit codes: **0** decided/ok, **1** error, **2** refused, **3** withdrawn or expired, **4** timeout (still pending), **5** discarded (stop). **submit --wait** keeps waiting through in-app errors until the server answers again.

# HISTORY

**Pinrail** is an Apache-2.0 project by **forgeplane**. CLI **0.1.2**. Early development; expect changes between releases.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [git](/man/git)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/forgeplane/pinrail)```

```[Homepage](https://pinrail.dev)```

```[Documentation](https://pinrail.dev/docs/)```

<!-- verified: 2026-10-07 -->
