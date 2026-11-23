# TAGLINE

Agent-first web browser driven from the command line

# TLDR

**Download** the latest Rotunda browser build

```uvx rotunda fetch```

Create a **named browser profile**

```uvx rotunda agent new-profile --name [agent-demo]```

Open a new **context** inside an existing profile

```uvx rotunda agent new-context [agent-demo]```

**Navigate** a page (index printed by previous commands) to a URL

```uvx rotunda agent navigate [3] [https://example.com]```

**Describe** the current page to get element references

```uvx rotunda agent describe [3]```

**Click** an element, or **fill** an input, by reference

```uvx rotunda agent click [ref]```

```uvx rotunda agent fill [ref] "[text]" --submit```

**Extract** the page as markdown

```uvx rotunda agent extract [3] --format markdown```

Save a **full-page screenshot**

```uvx rotunda agent screenshot [3] [page.png] --full-page```

**Stop** the profile daemon

```uvx rotunda agent stop [1]```

# SYNOPSIS

**rotunda** **fetch** | **sync** | **list** | **set** | **remove** | **test** | **server** | **gui**

**rotunda agent** _subcommand_ [_page_] [_ref_] [_options_]

# DESCRIPTION

**Rotunda** is a browser purpose-built for AI agents. It is a patched **Firefox** build driven through Playwright's Juggler protocol (building on the camoufox project), designed to avoid automation signatures and humanize mouse and keyboard input rather than spoof the browser fingerprint. The **agent** subcommands persist profiles, daemon sessions, and short resource indexes under **~/.rotunda** so that later **uvx rotunda** calls can attach to the same profile.

The agent CLI is grouped into families of subcommands: profile and session management (**new-profile**, **new-context**, **new-page**, **pages**, **close-page**, **resources**, **stop**), navigation (**navigate**, **back**, **forward**, **reload**, **wait**), inspection (**describe**, **info**, **screenshot**, **extract**), interaction (**click**, **hover**, **fill**, **type**, **select**, **check**, **uncheck**, **press**, **scroll**, **drag**, **upload**, **dialog**) and downloads (**downloads**, **save-download**). Page-level commands take a numeric page index; element commands take a ref returned by **describe**, and the page index is optional once a ref is known. After each action the CLI reports whether the page fully refreshed or prints a compact element delta.

Rotunda is also importable as a Python library (**NewBrowser**, **NewContext**) on top of **Playwright**.

# PARAMETERS

**fetch** [_version_]
> Download and install the latest (or given) browser build for the active channel.

**list** [**installed**|**all**], **set**, **remove**
> Manage installed browser builds and the active channel.

**new-profile** [**--name** _name_] [**--headless**]
> Create a persistent browser profile, optionally headless.

**new-context** _profile_
> Open a fresh browser context in the named profile and print the page index.

**navigate** _page_ _url_ [**--wait-until** _state_]
> Load _url_; state is commit, domcontentloaded (default), load or networkidle.

**describe** _page_ [**--max-items** _n_]
> Print page structure and element refs that other commands consume.

**info** _ref_
> Print full attributes, state, bounds and select options for one element.

**click** _ref_, **hover** _ref_, **check** _ref_, **uncheck** _ref_
> Mouse interaction with a referenced element.

**fill** _ref_ _text_ [**--submit**]
> Replace the value of an input field, optionally pressing Enter.

**type** _ref_ _text_ [**--submit**]
> Append text at the focused cursor position.

**select** _ref_ _value_ [**--by** _value|label|index_]
> Choose dropdown options.

**press** [_ref_] _key_, **scroll** [_ref_] _direction_ [**--amount** _px_], **drag** _from-ref_ _to-ref_
> Keyboard, scroll and drag interaction.

**extract** _page_ [**--format** _text|html|markdown|links|forms_] [**--output** _file_]
> Pull content out of the page.

**screenshot** _page_ [_path_] [**--full-page**] [**--element** _ref_]
> Capture the viewport, full page or one element; without a path a temp PNG is written and its path printed.

**wait** _page_ [_value_] [**--for** _load|domcontentloaded|networkidle|selector|text|url|timeout_] [**--timeout-ms** _ms_]
> Block until a page condition is met.

**upload** _ref_ _file_ ...
> Attach files to a file-input element.

**dialog** _page_ _list|accept|dismiss|fill_ [_text_]
> Arm how the next browser dialog is handled; unarmed dialogs are dismissed.

**downloads**, **save-download** _download_ _path_
> List and save downloaded files.

**back**, **forward**, **reload**, **close-page** _page_
> Standard navigation primitives.

**stop** [_profile_]
> Shut down the profile daemon.

# CONFIGURATION

**~/.rotunda/**
> Persistent profiles, daemon state, and short resource indexes shared between **uvx rotunda** invocations.

**ROTUNDA_DEBUG_DUMP_DIR**, **ROTUNDA_DEBUG_DUMP**
> Enable fingerprint debugging dumps (VM calls, network, console) for diagnosing bot detection.

# CAVEATS

Requires **uv / uvx** (or a Python project with **rotunda** installed). Page indexes and refs are only valid for the lifetime of the daemon; calling **stop** invalidates them. Bot-detection avoidance is best-effort and the browser is intended for delegated agent tasks, not bulk crawling.

# HISTORY

**Rotunda** was published by **MonkeySee AI** (Pierce Freeman) in **2026**, building on daijro's camoufox Firefox patching work, as an agent-friendly browser layer between raw Playwright scripting and commercial browser-automation services.

# SEE ALSO

[playwright](/man/playwright)(1), [firefox](/man/firefox)(1), [puppeteer](/man/puppeteer)(1), [uv](/man/uv)(1), [uvx](/man/uvx)(1)

# RESOURCES

```[Source code](https://github.com/MonkeySee-AI/rotunda)```

```[Homepage](https://rotunda.sh)```

<!-- verified: 2026-11-23 -->
