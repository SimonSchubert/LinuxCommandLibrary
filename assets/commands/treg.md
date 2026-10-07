# TAGLINE

Call shared API tools without holding their keys

# TLDR

Sign in (browser, or an emailed code)

```treg login```

```treg login --email [you@example.com]```

Search the catalog by the **job**, then read the price

```treg catalog search "[backlinks for a domain]"```

```treg catalog get [tikhub.tiktok.user.profile]```

**Call** a catalog endpoint

```treg call [tikhub.tiktok.user.profile] --query uniqueId=tiktok```

Call one of the team's own HTTP tools

```treg call [stripe] [v1/balance]```

Show **credit left** and recent spend

```treg balance```

Run a vendor CLI with the team's credential injected

```treg cli run stripe -- get /v1/balance```

Run a local program so its HTTPS calls to registered hosts pick up team keys

```treg claude```

Preview what an upload would register, then register it

```treg scan```

```treg upload --all```

Print the **version**

```treg version```

# SYNOPSIS

**treg** [**--version**] [**--org** _slug_] [**--json**] _command_ [_arguments_]

**treg** [**-q**|**--quiet**] _program_ [_arguments_]

# DESCRIPTION

**treg** is the command-line client for **tools-registry** (Treg), a proxy that calls HTTP APIs and vendor CLIs with credentials stored on the registry. Callers send one token. The server injects the upstream key and strips `X-Treg-Token` before the request leaves.

Two pools share that path. The **catalog** is a curated set of external endpoints, priced per call when Treg's own key is used. **Your own tools** are endpoints, vendor CLIs, and skills a teammate registered; those calls are not metered against the prepaid balance.

The hosted registry is `https://treg.to`. `~/.treg/config.json` stores the base URL, token, and active team. **treg config --base-url** points the CLI at another registry. **treg login** stores an identity token (browser, **--email** one-time code, or **--token** for agents and CI). **treg logout** clears it. **treg org use** switches the active team. **--org** runs one command in another team you belong to.

A catalog call is served in this order: the team's own tool for that provider, a secret the team stored for it, a verified public route that needs no key, then Treg's own key billed to the team's balance. An endpoint with no published price is refused. Routed ids under the `treg.` prefix (for example `treg.people.email.find`) let the registry pick a provider and name it on the response.

The Python package name is **tools-registry**. The console script is **treg**. It needs Python **3.12** or **3.13**. The upstream installer is `curl -fsSL https://treg.to/install.sh | sh`. **treg update** re-runs that installer. The registry server is the optional **server** extra; **treg-worker** is its scheduled worker, not this client.

# PARAMETERS

**--version**

> Print the installed version (package metadata of **tools-registry**) and exit. Same information as **treg version**.

**--org** _slug_

> Use this team for one command instead of the active org in `~/.treg/config.json`.

**--json**

> For table-style commands, print raw JSON. For **call**, print one JSON object on stdout (`result` and `_treg`) and nothing on stderr.

**-h**, **--help**

> Show grouped help, or **treg** _command_ **-h** for that command.

**-q**, **--quiet**

> Accepted in front of a program name in the bare form **treg** _program_. They belong to **with**.

# COMMANDS

**login** / **logout** / **config** / **onboard** / **update** / **version**

> Identity and this machine's settings. **onboard** walks a first run (**--path** `catalog`, `setup`, `access`, or `demo`). **config** prints the endpoint or sets it with **--base-url**.

**catalog**

> **search** _text_ finds endpoints by what they do. **get** _id_ shows parameters and price. **request** files a gap.

**call** _target_ [_path_]

> Proxy one HTTP call. _target_ is a tool name, a catalog id, or a full upstream URL. **--method**, **--query** _K=V_ (**-p**), **--data**, **--file**, **--header**, and **--upload** _NAME=@FILE_ shape the request. **--await** polls an async catalog task (default **--timeout** 900 seconds).

**balance** / **topup**

> Prepaid credit, in-flight calls, and recent spend. Only calls on Treg's key draw the balance. **balance --json** reports micro-USD integers.

**host** _file_

> Upload a reference image, audio, or video and print a public URL a vendor can fetch.

**cli run** _tool_ **--** _arguments_

> Run a vendor CLI with the org credential injected. **--local** (default) runs on this machine. **--server** runs on the registry. **treg run** is the older spelling of **treg cli run**.

**cli shell** / **cli setup**

> **shell start** opens a subshell where registered CLIs receive the credential. **shell start --proxy** also sends HTTPS calls to registered hosts through the registry. **sudo treg cli setup** installs the isolated `treg-run` user on Linux. **treg shell** and **treg setup-local-run** are older spellings.

**with** _program_ / **treg** _program_

> Run a program so HTTPS calls to **registered** hosts go through the registry. If the first word is not a **treg** command and it exists on `PATH`, **treg claude** is **treg with claude**. **treg with --** is the explicit form. The local proxy needs the **proxy** extra (`cryptography`). **serve start** keeps that proxy in the background; **serve env** prints the `eval` line for the current shell.

**scan** / **upload**

> **scan** lists `.env` keys, skills, and installed catalog CLIs and sends nothing. **upload** registers them. **--all** or **--select** is required when there is no prompt. **--replace** updates an existing registration. Modes: **env**, **skills**, **clis**.

**tool** / **secret** / **skill** / **connections** / **hub**

> Register endpoints (**tool add** _name_ **--base-url**), write-only credentials (**secret add**), skill bundles (**skill install**, **skill add**), connected accounts, and hub tools other people can call.

**org** / **invites** / **accept**

> Teams. **org ls**, **org create**, **org use**, **org invite** _email_ (**--role** `viewer`, `member`, or `admin`). **accept** _slug_ joins an invite sent to your email.

**audit**

> One log of proxy calls and CLI runs. **--calls** or **--runs** restricts it. **--limit** defaults to 50.

**mcp install** / **agents ls**

> Register Treg as an MCP server in detected coding agents, and list the agents **skill install** knows about.

**review** / **feedback**

> Rate a catalog call, or send a problem report. **feedback submit** takes a category and a message.

# CONFIGURATION

`~/.treg/config.json` holds the registry base URL, token, and active org. **treg org use** rewrites the active org. A per-org token from **treg login --token** is sent as itself.

**TREG_TOKEN**, when set, is the token for this process. **TREG_LLM_TOKEN** is the token for **upload --llm**, which asks an OpenAI-compatible model to name unknown `.env` keys.

**treg serve** writes `~/.treg/proxy/proxy.json` (mode `0600`) so other shells can find the background proxy. That file holds the proxy token, not a vendor key. **treg shell start --proxy** keeps its token in the subshell environment instead.

# CAVEATS

Catalog calls on Treg's key spend the team's balance. Out of credit is HTTP **402** with `balance_micro`, `estimated_cost_micro`, and `topup_url`. If Treg's own provider account is exhausted, a metered call can fail with HTTP **503** `provider_capacity_unavailable` before anything is reserved. A team key for that provider is unaffected.

**treg** _program_ and **serve** intercept only hosts that are registered tools. Other traffic, including calls to model APIs, is not read. Node's built-in `fetch` ignores proxy environment variables before **Node 24**. A client that pins certificates will refuse the local intercept; use **call** or **cli run** for that host.

**cli run --local** can place a shared credential on this machine. On Linux, **sudo treg cli setup** runs those CLIs as the `treg-run` user. On macOS the same run is best-effort as the member. **--server** keeps the key on the registry.

The license is Apache-2.0 plus extra terms. Running a registry for your own team is allowed. Offering this software as a hosted service to third parties needs written permission from the licensor.

Secrets are write-only. **secret ls** does not print stored values.

# HISTORY

**treg** is published by **Superdesign** (superdesign.dev). Copyright **2026**. The command is the **tools-registry** package; version **0.22.0** is the version in the repository's `pyproject.toml`. The license is Apache-2.0 with additional hosted-service terms.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [gh](/man/gh)(1), [stripe](/man/stripe)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [jq](/man/jq)(1), [python](/man/python)(1), [uv](/man/uv)(1), [pip](/man/pip)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/superdesigndev/treg)```

```[Homepage](https://treg.to)```

```[Documentation](https://github.com/superdesigndev/treg/blob/main/USAGE.md)```

<!-- verified: 2026-10-07 -->
