# TAGLINE

Turn feeds you follow into a spoken morning show

# TLDR

Start the web service (needs ffmpeg and a Gemini API key)

```aigude serve```

Check user files **without** starting the service

```aigude validate --users-dir [users]```

Use a settings file

```aigude serve --config [aigude.toml]```

Listen on another address

```aigude serve --listen-addr [127.0.0.1:8080]```

# SYNOPSIS

**aigude** **serve** [_settings flags_]

**aigude** **validate** [_settings flags_]

# PARAMETERS

**serve**

> Start the scheduler, the worker, and the web UI. Runs until interrupted. Requires **ffmpeg** on `PATH` and a Gemini API key in the environment. A Firecrawl API key is required for the hosted crawler and optional when `firecrawl_url` points at your own

**validate**

> Read every `.toml` file directly in the users directory. Problems are printed as `file:line:column: message`, and the command fails if there are any. On success it prints how many users were valid

**--config** _file_

> Settings file. When omitted, `aigude.toml` in the working directory is used if it exists

**--listen-addr** _host:port_

> HTTP listen address. The default is `127.0.0.1:8080`

**--users-dir** _dir_

> Directory of per-user TOML files. The default is `users`

# DESCRIPTION

**aigude** is the AI Gude service. A user owns shows. Each show lists RSS subscriptions, how far back to look, and when to produce an episode. The worker fetches new articles, asks Gemini for a script and for speech, and uses **ffmpeg** to write one audio file with chapters. The web UI is how you press "Generate now" and play the result.

There are two commands, **serve** and **validate**. Settings load from built-in defaults, then the settings file, then environment variables, then flags. Each later source wins. An environment variable is the prefix `AIGUDE` plus an underscore plus the upper-case setting name. A flag is that setting with hyphens, such as **--listen-addr**. Unknown keys are an error. The Gemini and Firecrawl API keys are not settings. They come from the environment only. Putting them in `aigude.toml` prevents startup.

AI Gude does not implement its own login. A reverse proxy may pass the user in the `X-Aigude-User` header. Without that header, anyone who can open the port can use every user. That is why the default listen address is loopback.

The usual development start from a checkout is `task serve:hosted` after `mise install`, which is a task wrapper around this binary, not a third subcommand.

# CONFIGURATION

**aigude.toml**

> Optional service settings in the working directory, or the file named by **--config**. The commented example in the repository is `hack/aigude.toml`

**users/** 

> One TOML file per user. The file name is free. The user id is inside the file. Edits apply without a restart. An invalid file keeps the last valid setup for that user. **validate** checks this directory

**firecrawl_url**

> Hosted Firecrawl is the default and needs a Firecrawl API key. Set this to your own Firecrawl address to skip that key

# CAVEATS

**ffmpeg** must be on `PATH` or **serve** exits immediately. One episode is produced at a time. A schedule that was missed while the process was down is made up once per show at startup.

Do not expose the default unauthenticated UI on a shared network. The demo account on the public example site cannot produce or delete episodes. Your own instance can.

**validate** does not crawl feeds or call Gemini. It only parses user files.

# HISTORY

AI Gude ("Ei Gude") is Alex's self-hosted morning podcast generator, written in Go and published at alex0ptr/aigude. Speech and scripts use Gemini. Article text uses Firecrawl. Audio is encoded with ffmpeg.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/alex0ptr/aigude)```

```[Homepage](https://aigude.alexdoes.dev)```

<!-- verified: 2026-11-07 -->
