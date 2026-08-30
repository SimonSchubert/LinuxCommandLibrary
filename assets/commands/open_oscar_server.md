# TAGLINE

self-hostable AIM and ICQ instant messaging server

# TLDR

**Start** the server using **settings.env** in the current directory

```open_oscar_server```

Start with an explicit **config file**

```open_oscar_server -config [path/to/settings.env]```

Print **version**, commit, and build date

```open_oscar_server -version```

**List** registered users via the management API

```curl http://localhost:8080/user```

**Create** an AIM account (auth enabled)

```curl -d '{"screen_name":"[MyScreenName]", "password":"[thepassword]"}' http://localhost:8080/user```

**Create** an ICQ account (numeric UIN)

```curl -d '{"screen_name":"[100003]", "password":"[thepassw]"}' http://localhost:8080/user```

# SYNOPSIS

**open_oscar_server** [**-config** _file_] [**-help**] [**-version**]

# PARAMETERS

**-config** _file_
> Path to the env-style configuration file. Default: **settings.env** in the current working directory. If the file is missing, the process falls back to already-exported environment variables.

**-help**
> Print flag defaults and exit.

**-version**
> Print **version**, **commit**, and **date** (fields filled by GoReleaser on release builds) and exit.

# DESCRIPTION

**open_oscar_server** is the Linux binary for **Open OSCAR Server**, a Go instant-messaging server compatible with classic AOL Instant Messenger and ICQ clients. It is independently developed and is not affiliated with, endorsed by, or associated with AOL or Yahoo. The process stays in the foreground, binds the configured listeners, and shuts down on SIGINT or SIGTERM.

One process runs several protocol front-ends together:

> **OSCAR** on TCP port **5190** by default (**OSCAR_LISTENERS** / **OSCAR_ADVERTISED_LISTENERS_PLAIN**). Windows AIM 1.x–5.x talk this path. AIM 6.2–7.x need TLS in front (typically nginx) plus Kerberos listeners.

> **TOC1/TOC2** on TCP port **9898** (**TOC_LISTENERS**). Used by Quick Buddy, gaim, TiK, vAIM, Miranda ~0.4, and iEM.

> **Legacy ICQ** (protocol v2–v5, v1 experimental) on UDP port **4000** when **ICQ_LEGACY_ENABLED** is true. Covers Windows ICQ 98x through 5 for presence, profiles, search, and offline messages.

> **Management API** on **127.0.0.1:8080** by default (**API_LISTENER**). User, session, chat-room, directory, and BART (smiley) administration is HTTP JSON, usually driven with **curl**.

> **Web API** on port **8081** only when the environment variable **ENABLE_WEBAPI** is set to **1**.

Accounts and buddy state live in a SQLite file (**DB_PATH**, default **oscar.sqlite**), created automatically on first run. With the shipped default **DISABLE_AUTH=true**, any screen name and password at the AIM sign-in screen creates an account. Production deployments set **DISABLE_AUTH=false** and create users through **POST /user**.

Supported AIM features include away messages, buddy icons (v4/v5 and AIM 6–7), buddy lists, public and private chat, profiles, allow/block privacy, warnings, directory search, LAN Direct Connect / Get File, and Internet Send File. AIM and ICQ users can authorize each other and exchange instant messages.

# CONFIGURATION

Release archives ship **settings.env** next to the binary. **open_oscar_server** loads it with godotenv (exported **KEY=value** lines). A sample **systemd** unit (**ras.service**) sets the same variables in the unit file and runs **ExecStart=/opt/ras/open_oscar_server** from **WorkingDirectory=/opt/ras**.

**OSCAR_LISTENERS**
> Bind addresses for OSCAR, comma-separated **NAME://HOST:PORT**. Default **LOCAL://0.0.0.0:5190**. Names must match advertised listeners.

**OSCAR_ADVERTISED_LISTENERS_PLAIN**
> Hostnames clients actually connect to (not bind addresses). Default **LOCAL://127.0.0.1:5190**. Change the host to a LAN or public address so remote AIM clients can reach the server.

**OSCAR_LISTENERS_SSL** / **OSCAR_ADVERTISED_LISTENERS_SSL**
> Optional plaintext sockets that receive traffic already decrypted by an SSL terminator, and the hostnames advertised on that SSL path. Required for AIM 6.2–7.x.

**KERBEROS_LISTENERS**
> Optional Kerberos authentication listeners (AIM 6.2+). Example **LOCAL://0.0.0.0:1088**.

**TOC_LISTENERS**
> TOC bind addresses as **HOST:PORT** pairs. Default **0.0.0.0:9898**.

**API_LISTENER**
> Management API bind address. Default **127.0.0.1:8080** (localhost only).

**WEBAPI_LISTENERS**
> Web API bind addresses. Default **0.0.0.0:8081**. The listener is started only if **ENABLE_WEBAPI=1**.

**DB_PATH**
> SQLite file path. Default **oscar.sqlite**.

**DISABLE_AUTH**
> When **true** (shipped default), skip password checks and auto-create accounts at login. Set **false** for production.

**LOG_LEVEL**
> **trace**, **debug**, **info**, **warn**, or **error**. Default **info**.

**ICQ_LEGACY_ENABLED**
> Enable UDP ICQ v2–v5. Default **true**. Related knobs: **ICQ_LEGACY_UDP_LISTENER** (**0.0.0.0:4000**), **ICQ_LEGACY_VERSIONS**, **ICQ_LEGACY_AUTO_REGISTRATION**.

# CAVEATS

The project is not affiliated with AOL. Classic AIM/ICQ clients are old Windows binaries; they are typically run under Wine or a VM, not as native Linux GUI apps.

**DISABLE_AUTH=true** is a convenience for local testing. Leave it on a network-exposed host and anyone who can reach port 5190 can create accounts.

AIM 6.2–7.x start the TLS handshake with an SSLv2-format ClientHello. Modern OpenSSL 1.1/3 rejects that hello, so the project's nginx image pins OpenSSL **1.0.2u** for termination. Plain **settings.env** (no SSL) is enough for AIM 1.x–6.1.

If **settings.env** is absent and required variables such as **OSCAR_LISTENERS** are unset, startup fails. The binary is distributed as **open_oscar_server** in a release tarball; it is not usually installed onto **PATH** by a distro package. Older releases named the binary **retro_aim_server**.

The management API is unauthenticated HTTP. Keep **API_LISTENER** on loopback or put it behind a firewall.

# HISTORY

Open OSCAR Server began as **Retro AIM Server**, a Go reimplementation of the OSCAR protocol for vintage AOL Instant Messenger clients, written by **mk6i** and released under the **MIT** license. The repository and product were later renamed **Open OSCAR Server**. In **December 2025** the published Linux binary was renamed from **retro_aim_server** to **open_oscar_server**. Subsequent releases added AIM 6.x/7.x (Kerberos and SSL), TOC1/TOC2, OSCAR-era ICQ 2000–5, and legacy UDP ICQ 98/99. **v0.24.0** was tagged in **June 2026**.

# SEE ALSO

[curl](/man/curl)(1), [nginx](/man/nginx)(8), [openssl](/man/openssl)(1), [systemctl](/man/systemctl)(1), [sqlite3](/man/sqlite3)(1), [finch](/man/finch)(1)

# RESOURCES

```[Source code](https://github.com/mk6i/open-oscar-server)```

```[Documentation](https://github.com/mk6i/open-oscar-server/blob/main/docs/LINUX.md)```

<!-- verified: 2026-08-30 -->
