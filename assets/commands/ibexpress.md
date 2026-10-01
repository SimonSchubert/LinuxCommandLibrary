# TAGLINE

Goal-driven browser agent for the terminal

# TLDR

**Run a goal** from a start page

```ibexpress run --url [https://example.com] --goal "[Open the settings page]"```

**Replay a saved scenario**

```ibexpress run --scenario [name] --password password=env:ESHOP_PW```

**Ignore the recording** and decide every step again

```ibexpress run --scenario [name] --explore```

**Save this prompt** as a scenario, then run it

```ibexpress run --url [https://example.com] --goal "[Check out]" --save-as [checkout]```

**Show the browser window** (required to take over a login or CAPTCHA)

```ibexpress run --scenario [name] --headed```

**Print the result as JSON**

```ibexpress run --scenario [name] --json```

**Serve the web UI**

```ibexpress ui --port [16000]```

**List saved scenarios** and how many recordings each has

```ibexpress scenarios list```

**Drop a scenario's cache** so the next run explores

```ibexpress scenarios clear-cache [name]```

**List saved browser profiles**

```ibexpress profiles list```

# SYNOPSIS

**ibexpress** **run** [_options_]

**ibexpress** **ui** [_options_]

**ibexpress** **scenarios** _list_|_show_|_delete_|_clear-cache_ [_name_]

**ibexpress** **profiles** _list_|_delete_ [_name_]

# DESCRIPTION

**ibexpress** is IronBee Express, a goal-driven browser agent. You name a start page and a goal in one sentence. Each step, TypeSafe Jev picks one operation and one control from the snapshot IronBee DevTools returns. That choice is never turned into a selector, a coordinate, or a script. When the run ends, the tool reviews the final page, API responses, failed requests, and console errors, then prints **PASSED** or **FAILED**.

A passing run of a saved scenario is cached under **.ibexpress/cache** and later replayed with no engine decisions. If a recorded step no longer matches the page, the engine continues from there and updates the recording, unless **--no-heal** is set.

The command needs Node.js 22 or newer, Google Chrome, and a TypeSafe key in **TYPESAFE_API_KEY** or **JEV_API_KEY**. It reads a **.env** file from the working directory and does not override variables that are already set. Flags override the environment for that one invocation.

From a git checkout the same subcommands run as **npm run dev --** _command_. After **npm run build**, **dist/cli/main.js** is the **ibexpress** program named in the package bin field.

**run** exits **0** when the review verdict is PASSED. If the run was not reviewed, it exits **0** only when the run ended DONE. Every other outcome exits **1**.

# PARAMETERS

**run**
> Carry out one goal in the terminal. Requires **--goal** or **--scenario**.

**ui**
> Serve the web UI with a live view of each run. Default address is **127.0.0.1:15986**.

**scenarios list**
> List saved scenarios and how many recordings each has cached.

**scenarios show** _name_
> Print one scenario. Secret values are never stored in it.

**scenarios delete** _name_
> Delete a scenario and its cached recordings. Exits **1** when the name is unknown.

**scenarios clear-cache** [_name_]
> Drop cached recordings so the next run explores. **--all** clears every scenario.

**profiles list**
> List saved browser profiles.

**profiles delete** _name_
> Delete a profile, including its cookies, storage, and logins.

**--goal** _text_
> What the run should accomplish. Optional when **--scenario** is set.

**--url** _url_
> Start page. The default is the session's current page.

**--scenario** _name_
> Replay a saved scenario. The engine takes over if the recording diverges.

**--save-as** _name_
> Save this prompt as a scenario of that name, then run it.

**--explore**
> Ignore the cached recording and let the engine decide every step.

**--no-heal**
> Do not let the engine take over when a replay diverges.

**--value** _name=text_
> A value the agent may type. Visible to the engine. Repeatable. _text_ may be **env:**_VAR_.

**--secret** _name=text_
> A value that is typed but never shown to a model. Repeatable. _text_ may be **env:**_VAR_.

**--password** _name=text_
> A login-password secret. Typed only into password fields on the start site. Repeatable.

**--value-desc** _name=text_
> What a **--value** or **--secret** is for, so it is matched to the right field.

**--text-model** _provider/model_
> Text model used when none of the offered values fits, or **none**. Providers include **anthropic**, **openai**, **openrouter**, **claude-code**, and **codex**.

**--profile** _name_
> Run inside a saved browser profile so cookies and logins persist. **none** forces a fresh browser. A profile is created the first time a run uses it.

**--headed**
> Show the Chrome window. A terminal hand-off ("your turn") works only with this flag.

**--record**
> Record a video of the run.

**--json**
> Print the result as JSON on stdout. Warnings go to stderr.

**--keep-open**
> Leave the browser session and the DevTools daemon running after the run.

**--show-logs**
> Print every log record from the run's IronBee trace.

**--port** _n_
> Port for a daemon this command starts. Not used with **--profile**, which gets its own port. On **ui**, this is the UI port instead.

**--host** _host_
> Address the web UI binds. Default **127.0.0.1**. **ui** only.

**--daemon-url** _url_
> Use an IronBee DevTools daemon that is already running. Disables browser profiles, and the web UI has no live view.

**--daemon-script** _path_
> **daemon-server.js** to start, instead of the installed **@ironbee-ai/devtools** package.

# CONFIGURATION

Settings come from the environment. A **.env** file in the working directory is loaded first and does not override variables that are already set.

**TYPESAFE_API_KEY** or **JEV_API_KEY**
> Key for the Jev engine. Required for a run.

**IBEXPRESS_TEXT_MODEL**
> Default text model, as _provider/model_.

**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **OPENROUTER_API_KEY**
> Each key makes that text-model provider available.

**CLAUDE_CODE_CLI**, **CODEX_CLI**
> Path of the Claude Code or Codex CLI when it is not on **PATH**.

**IRONBEE_API_KEY** or **IRONBEE_OAUTH_TOKEN**
> IronBee credential. Setting one turns run reporting on. **IBEXPRESS_IRONBEE_REPORT=off** keeps the credential but reports nothing.

**IBEXPRESS_HEADLESS**
> **true** by default. **--headed** overrides it for one invocation.

**IBEXPRESS_IFRAMES**
> **false** by default. When enabled, controls inside iframes (an embedded payment form, for example) are offered to the engine.

**IBEXPRESS_DAEMON_PORT**
> Port of the DevTools daemon a CLI run starts. Default **2071**.

**IBEXPRESS_UI_HOST**, **IBEXPRESS_UI_PORT**
> Web UI bind address and port. Defaults **127.0.0.1** and **15986**.

**IBEXPRESS_SCENARIO_DIR**
> Where saved scenarios are kept. Default is the package's **examples/scenarios**.

**IBEXPRESS_CACHE_DIR**
> Recording cache. Default **./.ibexpress/cache**.

**IBEXPRESS_PROFILE_DIR**
> Browser profiles. Default **./.ibexpress/profiles**.

**IBEXPRESS_MAX_ACTIONS**
> Most actions one run may take. Default **60**.

# CAVEAT

The browser starts headless. A step that needs a person (social login, CAPTCHA, SMS code) pauses only when someone can act: always in the web UI, and in the terminal only with **--headed**. Without that, the run ends blocked.

**--value** text is visible to the engine. **--secret** and **--password** are typed by reference and masked in anything a model sees. A password is offered only to password fields on the start site.

Profiles store live cookies and sessions on disk. Runs that share a profile affect each other (an open login, a cart). **--daemon-url** cannot use a profile.

A recording is saved only after that scenario's run passes review. Editing the goal or the start URL makes the next run explore again.

# SEE ALSO

[playwright](/man/playwright)(1), [google-chrome](/man/google-chrome)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/ironbee-ai/ironbee-express)```

```[Documentation](https://github.com/ironbee-ai/ironbee-express/blob/main/docs/README.md)```

<!-- verified: 2026-10-01 -->
