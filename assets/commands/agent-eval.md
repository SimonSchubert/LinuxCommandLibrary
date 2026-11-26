# TAGLINE

Drive a local browser session without calling a model

# TLDR

Start two sessions and open a **URL**

```agent-eval start-pair [prefix] --url [https://example.com]```

**Read** the page as the v2 engine sees it

```agent-eval perceive [v2-session]```

**Click** an element, then read the page again

```agent-eval act [v2-session] click [element] --auto-perceive```

**Compare** the legacy and v2 sessions

```agent-eval compare [legacy-session] [v2-session]```

Save a **screenshot**

```agent-eval screenshot [v2-session] --out [path/to/page.png]```

**Stop** the sessions and the daemon

```agent-eval stop --daemon```

# SYNOPSIS

**agent-eval** [_options_] _command_ [_arguments_]

# PARAMETERS

**--socket** _path_
> Unix socket for the daemon. The default is under the user runtime directory.

**--json**
> Print raw JSON.

**--idle-timeout** _seconds_
> Shut the daemon down after this many idle seconds. The default is 1800.

**status**
> Report whether the daemon is running.

**scenarios**
> List built-in scenarios.

**sessions**
> List active browser sessions.

**start** _name_
> Start one session. **--mode** is **legacy** or **v2** (default **v2**). **--url** opens a page. **--scenario** loads a built-in scenario. **--headed** shows the window. **--viewport** is width and height.

**start-pair** [_prefix_]
> Start a legacy session and a v2 session, both named from the prefix. The default prefix is **eval**. Accepts **--url**, **--scenario**, **--headed**, and **--viewport**.

**load-scenario** _session_ _scenario_
> Load a built-in scenario into a session that is already running.

**perceive** _session_
> Read the page. **--objective** is a hint. **--force-full** skips the incremental read. **--no-settle** does not wait for the page to settle.

**act** _session_ _verb_ [_arguments_]
> Do one thing in the page. The verb is **goto**, **click**, **type**, **hover**, **scroll**, or **wait**, or a key-press, option, or directional-scroll verb from **agent-eval act --help**. **--id**, **--text**, **--url**, **--key**, **--direction**, **--amount**, and **--wait-ms** supply the details. **--auto-perceive** reads the page after the action.

**compare** _legacy_ _v2_
> Compare two sessions. **--no-refresh** and **--no-settle** skip those steps.

**screenshot** _session_
> Write a PNG. **--out** sets the path. **--full-page** captures more than the viewport.

**report** [_session_...]
> Print telemetry. **--json-out** also writes a JSON file.

**stop** [_session_]
> Close one session. **--all** closes every session and leaves the daemon up. **--daemon** closes them and stops the daemon.

# DESCRIPTION

**agent-eval** is the stateful command-line client for Agent-first-browse. The first invocation starts a local daemon that owns the Chromium sessions. Later invocations talk to that daemon over a Unix socket. No model API key is required: you choose the clicks and the navigation.

**start-pair** opens the same site in the legacy engine and the v2 engine so **compare** can show the difference. **perceive** returns a compact list of elements. **act** uses those element ids.

The daemon exits on its own after the idle timeout, or immediately with **stop --daemon**.

# CAVEATS

Session names created by **start-pair** end in a legacy or v2 suffix. A command that names a session which is not running fails. Headed mode on a machine without a display needs a virtual framebuffer. The package's Chromium build must be installed before the first session starts.

# SEE ALSO

[agent-first-browse](/man/agent-first-browse)(1), [agent-browse-mcp](/man/agent-browse-mcp)(1)

# RESOURCES

```[Source code](https://github.com/SandeepAi369/Agent-first-browse)```

```[Documentation](https://github.com/SandeepAi369/Agent-first-browse/blob/main/README.md)```

<!-- verified: 2026-11-26 -->
