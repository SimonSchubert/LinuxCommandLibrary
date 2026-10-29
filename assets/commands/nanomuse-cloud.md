# TAGLINE

Self-hosted OpenAI-compatible relay for nanoMuse accounts

# TLDR

Run the relay on this machine (codes go to the log until a sender is configured)

```nanomuse-cloud --host 127.0.0.1 --port 8787```

Same process via the module entrypoint

```python3 -m nanomuse_cloud --port 8787```

List the operator **switches** on a running relay

```nanomuse-cloud admin controls list```

Turn the **free allowance** off and record why

```nanomuse-cloud admin controls set free_allowance off --note "[maintenance]"```

Show the last **audit** lines

```nanomuse-cloud admin controls audit --limit 20```

# SYNOPSIS

**nanomuse-cloud** [**serve**] [**--host** _addr_] [**--port** _n_] [**--log-level** _level_]

**nanomuse-cloud admin** [**--base** _url_] [**--token** _token_] [**--actor** _name_] **controls** **list**|**set**|**audit**

# PARAMETERS

**serve**
> Run the relay. This is the default when no subcommand is given. **--host** (default `0.0.0.0`), **--port** (default `8787`), and **--log-level** (default `info`) may be set on **serve** or on the top-level command

**admin controls list**
> Print each operator switch, whether it is on, and who last changed it. Also prints the account count, rule count, and whether notify mail is configured

**admin controls set** _switch_ **on**|**off**
> Flip one switch on the running relay. **--note** is stored in the audit log. The switch id is one of:

```
free_allowance
signups
cloud_service
sync
hub
apps_only
```

**admin controls audit**
> Print recent control changes. **--limit** defaults to 50

**--base** _url_
> Relay URL for **admin**. Default is the **NANOMUSE CLOUD BASE** environment variable, then **PUBLIC BASE**, then `http://127.0.0.1:8787`

**--token** _token_
> Admin token for **admin**. Default is the **CLOUD ADMIN TOKEN** environment variable. The command exits if neither is set

**--actor** _name_
> Name written to the audit log. Default is `cli:` plus the current user name, trimmed to 80 characters

# DESCRIPTION

**nanomuse-cloud** is the nanoMuse Cloud relay: one Python process (FastAPI on uvicorn) over a SQLite database. A person signs up with a phone number or an e-mail address, receives a six-digit code, and gets an `nm_` API key with a starter allowance. The nanoMuse apps then call this process the way they would call any OpenAI-compatible provider (`/v1/models`, `/v1/chat/completions`). A bring-your-own key still works; the relay is the "start now" path.

With no subcommand the process serves. Sign-up, the ledger, profile sync, and the multi-device hub are configured only through environment variables (or a `.env` file you source first). There are no config-file flags.

**admin** talks to a relay that is already running. It does not start one. **controls set** posts to the admin API so in-memory switches change immediately.

The package version in the nanoMuse tree is **0.31.0**. It needs Python **3.11** or newer. From a checkout of the `cloud` directory, `pip install -e .` installs the **nanomuse-cloud** console script. The repository script `scripts/self-host.sh` asks the production questions, writes `.env`, and starts the compose stack.

# CONFIGURATION

Every setting is an environment variable. The names below are the process environment (a single underscore between the words). Development defaults let the relay start on a laptop: codes are printed to the log, the database is `./data/cloud.db`, and chat answers **503** until an upstream key is set. Sign-up still works in that mode.

```
CLOUD_DB=./data/cloud.db
CLOUD_SECRET=[long-random-secret]
CLOUD_ADMIN_TOKEN=[admin-token]
PUBLIC_BASE=http://127.0.0.1:8787
UPSTREAM_BASE=https://dashscope.aliyuncs.com/compatible-mode/v1
UPSTREAM_KEY=[provider-key]
```

**CLOUD SECRET**
> HMAC key for phone numbers and e-mail addresses. Required once the relay sends real codes. Without it, identifiers are hashed with a fixed development key

**CLOUD ADMIN TOKEN**
> Bearer for the operator API and for **nanomuse-cloud admin**

**PUBLIC BASE**
> Base URL the apps should use for this relay, without a trailing `/v1`

**UPSTREAM BASE** / **UPSTREAM KEY**
> OpenAI-compatible provider the relay forwards chat to. The hosted menu is the Qwen model `Qwen/Qwen3.6-27B-FP8`. Image and video generation stay on keys the person configures on the device

**ALLOWANCE CNY**
> Lifetime provider-bill allowance per non-member account, in yuan. Default **10**. **0** means no limit. **INVITE BONUS CNY** (default **5**) is added to both the inviter and the new account after the new account has actually spent

**RECORD TURNS**
> When **1** (the default), the relay stores each chat turn. **0** keeps none of that record

**TRUSTED PROXIES**
> Comma-separated addresses or networks whose `X-Forwarded-For` is believed. Empty means loopback, private, link-local, and shared (`100.64/10`) addresses. A relay reached directly from the internet ignores the header

The full list is `.env.example` in the `cloud` directory. Allowance, invite bonus, and whether sign-up is open can also be changed on the operator page while the relay runs; a value stored there overrides the environment until it is cleared.

# CAVEATS

The CLI default bind is **0.0.0.0:8787**, every interface, not loopback. Pass **--host 127.0.0.1** for a local-only process. **nanomuse serve** is a different program and does bind to loopback by default.

The **apps only** switch defaults to on. Clients whose User-Agent is not a nanoMuse app, the runtime, or a browser get **403**. Member accounts are still answered. The error id is:

```
client_not_supported
```

The Docker image runs as uid **10001** (`relay`), not root. A bind-mounted data directory that root created is not writable, and the process exits with a plain sentence instead of starting. On the host: `sudo chown -R 10001:10001 data`.

Back up `data/cloud.db` together with **CLOUD SECRET**. The hashes are useless without the secret, and the secret is useless without the database.

Chat text, sign-up identifiers, and the ledger sit on the machine that runs the relay. Do not point **PUBLIC BASE** at a relay you do not operate if the account data should stay local.

# SEE ALSO

[nanomuse](/man/nanomuse)(1), [nanomuse-device](/man/nanomuse-device)(1), [nanomuse-browser](/man/nanomuse-browser)(1), [nanomuse-open](/man/nanomuse-open)(1), [uvicorn](/man/uvicorn)(1), [fastapi](/man/fastapi)(1), [sqlite3](/man/sqlite3)(1), [python](/man/python)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/nano-muse/nanoMuse)```

```[Homepage](https://nanomuse.cn)```

```[Documentation](https://github.com/nano-muse/nanoMuse/blob/main/docs/self-hosting.md)```

<!-- verified: 2026-10-29 -->
