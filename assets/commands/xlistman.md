# TAGLINE

one-binary self-hosted mailing list manager

# TLDR

Generate a commented **config** file

```xlistman config init```

Add a **virtual domain**

```xlistman domain add [lists.example.com] ["Example lists"]```

Create a **discussion list** with an owner

```xlistman list create [dev@lists.example.com] --type discussion --owner [you@example.com]```

Start the **daemon** (HTTP, LMTP, pipe socket)

```xlistman serve```

# SYNOPSIS

**xlistman** _command_ [_options_]

# COMMANDS

**config** **init**
> Write `xlistman.yaml` (or the path in **XLISTMAN_CONFIG**).

**serve**
> Run the daemon: HTTP UI (default :8080), LMTP (default :8024), optional Unix pipe socket.

**domain** **add**|_..._
> Manage virtual domains.

**list** **create**|_..._
> Manage lists (`--type discussion|newsletter`, `--owner`).

**owner** / **subscriber** / ...
> CLI parity with the web console for roles, members, and moderation.

# DESCRIPTION

**xlistman** is a Go mailing-list manager: SQLite, embedded SvelteKit UI, no separate database or frontend process. Subscribers sign in with emailed magic links (no passwords). Mail arrives over LMTP from Postfix/exim or a pipe socket; outbound mail uses a retrying SMTP queue with VERP bounce tracking.

List lifecycle includes double opt-in, digests, held-message moderation, archives with FTS5, and CSV import/export. Config is YAML plus **XLISTMAN_*** environment overrides and `${ENV_VAR}` expansion.

Release binaries and the `ghcr.io/barats/xlistman` image embed the web UI. A plain `go build` / `go install` without building `web/` first is CLI and mail only.

# CONFIGURATION

Minimal keys: **http.listen**, **lmtp.listen**, **database.path**, **smtp.host**/**port**/**mode**, **web.base_url** (used in email links), **web.site_name**. **smtp.mode** `sink` writes to **smtp.sink_dir** instead of sending. TLS modes: `none`, `starttls`, `starttls-required`, `implicit`.

# CAVEATS

Pre-1.0: storage and config may change. You still need an MTA for real mail. **web.base_url** must be the public origin or magic links will be wrong. Do not expose LMTP on a public interface.

# HISTORY

MIT, 2026, Barat Semet. Positioned as a smaller alternative to GNU Mailman.

# SEE ALSO

[postfix](/man/postfix)(1), [exim](/man/exim)(8), [sendmail](/man/sendmail)(8)

# RESOURCES

```[Source code](https://github.com/barats/xlistman)```

<!-- verified: 2026-08-26 -->
