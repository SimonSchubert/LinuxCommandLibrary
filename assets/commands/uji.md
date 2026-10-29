# TAGLINE

A coding agent you can shape with Lua

# TLDR

Start a **new session** in the current directory

```uji```

**Resume** the latest session here

```uji resume```

Resume a session **by id**

```uji resume --id [session-id]```

**Pick** a session in this directory

```uji list```

Send one prompt **without the screen**

```uji run "[Summarise what changed in the last commit]"```

Print JSON **events** for a headless run

```uji run --json --tools [read_file] "[What does src/main.rs do?]"```

**Add** a plugin from a pack

```uji plugin add [uji-labs/uji-plugins] --name [statusline]```

Print the **version**

```uji --version```

# SYNOPSIS

**uji** [_options_] [_command_]

**uji** **run** [_options_] _prompt_

**uji** **plugin** _list_|_add_|_remove_ [_args_]

# PARAMETERS

**-h**, **--help**
> Print usage and exit.

**-V**, **--version**
> Print `uji` and the version, then exit.

**--config-dir** _DIR_
> Config directory. Wins over the UJI config-dir environment variable and over XDG config home.

**--data-dir** _DIR_
> Data directory. Wins over the UJI data-dir environment variable and over XDG data home.

**--db** _FILE_
> Session database file. Wins over the UJI db environment variable. The default is `uji.db` in the data directory.

# COMMANDS

**new**
> Start a new session. This is the default when no command is given.

**resume**
> Resume the latest session in the current directory, or **--id** _ID_ for that session. Session ids are UUIDs.

**list**
> Open a picker of sessions in the current directory. Enter resumes the chosen one.

**delete** _ID_
> Delete a session by UUID.

**run** _PROMPT_
> Send one prompt without the screen, print the answer, and exit. See **HEADLESS RUN**.

**plugin list**
> List plugins offered by installed packs, each marked on or off.

**plugin add** _NAME_|_PACK_
> Enable a plugin. Pass a module name from an installed pack, a `user/repo` pack, a git URL, or a local directory. **--name** picks the module when a pack offers more than one. **--rev** pins a git pack to a commit. **--force** rewrites an existing plugin file.

**plugin remove** _NAME_
> Remove the plugin file that enables _NAME_.

# HEADLESS RUN

**uji run** reads the same config, plugins, and packs as the screen, saves the conversation as a session, and exits **0** when the model answers or **1** when the turn fails (reason on stderr). The words after the options form the prompt.

**--json**
> Print every event as a line of JSON instead of the answer alone. Event types are `session`, `message`, `progress`, `notice`, and `done`.

**--model** _PROVIDER/ID_
> Use this model instead of the one picked with `/models`. Written as `provider/model`.

**--effort** _LEVEL_
> Reasoning effort: `off`, `minimal`, `low`, `medium`, `high`, `xhigh`, or `max`. uji uses the nearest level the model accepts.

**--tools** _A,B_
> Offer the model only these tools, separated by commas.

**--append-prompt** _TEXT_
> Add the text to the end of the system prompt.

**--title** _TEXT_
> Title the session. The default is the first line of the prompt.

**--parent** _ID_
> Save the session under another one. **uji list** leaves it out; **uji resume --id** opens it.

Nobody can answer an approval question here, so a call your policy would ask about runs without asking. Calls your policy denies stay denied.

# SLASH COMMANDS

Typed on the input line inside the screen.

**/login**
> Add a provider (browser sign-in, device code, or API key).

**/setup**
> Write a starter config, then ask what you want in it. Present only until you have a config.

**/models**
> Pick the model.

**/effort**
> Set reasoning effort from the levels the current model accepts.

**/thinking**
> Show or hide the model's reasoning.

**/compact**
> Summarise earlier messages to free context.

**/list**
> List sessions in this directory. Enter starts uji again in the one you pick.

**/resume** [_ID_]
> Start uji again in the latest session here, or in that id.

**/sync**
> Update installed packs and reload.

**/reload**
> Restart with the current config and files, keeping the conversation and your draft.

**/help**
> List every command, including ones plugins add.

**/jobs**
> Toggle the background jobs list under the input.

**/diagnostics**
> List screen-drawing errors, newest first.

**/quit**
> Quit.

# DESCRIPTION

**uji** is a coding agent for the terminal, configured in Lua. Every view, tool, command, and key can be swapped at runtime, including the core. It is written in Rust with an embedded Lua runtime. The binary name is **uji** (`[[bin]]` in `crates/uji`).

Start it in the directory you want to work on. The first run asks you to sign in to a provider. Anthropic and OpenAI offer a browser subscription or an API key; OpenAI also offers a device-code subscription. Other providers ask for a key (or the environment variable they already read, such as the Anthropic API key). A Custom provider asks for a base URL and model of a server that takes OpenAI chat requests.

On the screen, Enter sends a message. Shift+Enter, Alt+Enter, or Ctrl+J start a new line. Esc clears the input, or stops the turn on an empty line. A line that starts with `!` runs in your shell in the session's directory; the model does not see it. When a tool call needs approval, `y` lets it run; `n` or Esc refuses it.

Built-in tools are read-file, edit-file, write-file, run-command, ask-user, job-output, and stop-job. reload-config is available when uji runs in its config directory. Packs add more; `uji.pack.add` installs a directory or git repository with its own `lua/` and `plugin/` trees, and `/sync` updates them.

# CONFIGURATION

uji reads `~/.config/uji`, or the directory given by **--config-dir**.

**~/.config/uji/init.lua**
> Runs first. Replaces the default config. Start it with `require("uji.builtin.defaults")` to keep the default screen.

**~/.config/uji/plugin/*.lua**
> Plugin files, run after init.lua, sorted by file name. **uji plugin add** writes these.

**~/.config/uji/lua/**
> Extra modules for `require()`.

**~/.local/share/uji/uji.db**
> Session database.

**~/.local/share/uji/auth.toml**
> API keys and subscription sign-ins, readable only by you. Optional system keychain via `uji.auth.configure`.

**~/.config/uji/auth.env**
> Optional dotenv file of provider keys. Overridden by the UJI auth-file environment variable.

**~/.local/share/uji/site/**
> Installed packs.

**~/.config/uji/uji-lock.json**
> Pack versions.

**~/.local/share/uji/diagnostics.log**
> Screen-drawing errors.

A command-line option wins over the matching UJI environment variable, which wins over the matching XDG directory. uji appends `/uji` to XDG directories. The runtime environment variable points at a complete Lua tree (a directory that contains an `uji` folder) instead of the embedded files.

```
UJI_CONFIG_DIR
UJI_DATA_DIR
UJI_DB
UJI_AUTH_FILE
UJI_RUNTIME
XDG_CONFIG_HOME
XDG_DATA_HOME
```

```
require("uji.builtin.defaults")

uji.pack.add({ "uji-labs/uji-plugins" })
require("statusline").setup({})
require("planmode").setup({})

uji.tool.policy({
  run_command = { allow = { "git status", "cargo test*" } },
})

uji.keymap.add("normal", "<C-p>", { command = "models" })
```

# CAVEATS

Linux release builds need glibc 2.34 or newer. On Alpine, other musl systems, and older releases such as Ubuntu 20.04, build with Cargo (`cargo install --git https://github.com/uji-labs/uji --locked uji`). The build needs Rust 1.88 or newer, a C compiler, and `make`.

`$HOME` must be set. Session ids must be UUIDs. **uji run** auto-approves tool calls that the policy would have asked about.

Cloud providers need a sign-in or API key. Token use can be large on big trees. The default command opens a full-screen TUI and needs a capable terminal.

# HISTORY

uji is free software by **dracarys18**, first published in **2026** under the **GNU GPL version 3 or later**. The workspace crate version at documentation time is **0.2.3**. The project homepage is uji.sh.

# SEE ALSO

[claude](/man/claude)(1), [opencode](/man/opencode)(1), [crush](/man/crush)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [llm](/man/llm)(1), [lua](/man/lua)(1)

# RESOURCES

```[Source code](https://github.com/uji-labs/uji)```

```[Homepage](https://uji.sh)```

```[Documentation](https://docs.uji.sh)```

<!-- verified: 2026-10-29 -->
